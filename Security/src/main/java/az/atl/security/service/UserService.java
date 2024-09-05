package az.atl.security.service;

import az.atl.security.dao.entity.UserEntity;
import az.atl.security.model.enums.UserRole;
import az.atl.security.model.request.UserRequest;

public interface UserService {
    void createUser(UserRequest userRequest);
    UserEntity findByUserName(String username);
}
