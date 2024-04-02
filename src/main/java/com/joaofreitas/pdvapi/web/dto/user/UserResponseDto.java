package com.joaofreitas.pdvapi.web.dto.user;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserResponseDto {
    private UUID id;
    private String username;
    private String role;
}