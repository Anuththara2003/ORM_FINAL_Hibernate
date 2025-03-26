package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private String user_id;
    private String username;
    private String password;
    private String role;
}
