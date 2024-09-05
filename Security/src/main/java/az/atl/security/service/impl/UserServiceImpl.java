package az.atl.security.service.impl;

import az.atl.security.UserNotFoundException;
import az.atl.security.dao.entity.UserEntity;
import az.atl.security.dao.repository.UserRepository;
import az.atl.security.model.enums.UserRole;
import az.atl.security.model.request.UserRequest;
import az.atl.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private  final BCryptPasswordEncoder encoder;
    private  final UserRepository userRepository;

    @Override
    public void createUser(UserRequest userRequest) {
        UserEntity userEntity = UserEntity
                .builder()
                .name(userRequest.getName())
                .surname(userRequest.getSurname())
                .username(userRequest.getUsername())
                .password(encoder.encode(userRequest.getPassword()))
                .age(userRequest.getAge())
                .userRole(UserRole.USER)
                .build();
        userRepository.save(userEntity);


    }

    @Override
    public UserEntity findByUserName(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(()->new UserNotFoundException("user not found"));
    }
}
