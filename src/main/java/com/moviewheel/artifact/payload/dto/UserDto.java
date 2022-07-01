package com.moviewheel.artifact.payload.dto;

import com.moviewheel.artifact.entity.*;
import lombok.*;

import javax.validation.constraints.*;

@Data
public class UserDto {

    @NotNull
    @NotEmpty
    private String username;
    @NotNull
    @NotEmpty
    private String userPassword;
    @NotNull
    @NotEmpty
    private String firstName;
    @NotNull
    @NotEmpty
    private String lastName;
    @NotNull
    @NotEmpty
    @Email
    private String email;
    private Role role;
}
