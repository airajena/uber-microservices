package com.uber.auth.dto;

import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerSignupRequestDto {
    private String email;
    private String password;
    private String phoneNumber;
    private String name;
}
