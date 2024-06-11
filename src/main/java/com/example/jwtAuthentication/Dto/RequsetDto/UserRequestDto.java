package com.example.jwtAuthentication.Dto.RequsetDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {

    private String email;
    private String password;
    private String phoneNo;
    //we can add other field as we want
}
