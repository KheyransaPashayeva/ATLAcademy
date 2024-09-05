package az.atl.springcustomer.model.dto;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
public class ErrorDto {
    int errorCode;
    String message;
    LocalDateTime localDateTime;
}
