package com.project.base_v1.dto.response.user;

import com.project.base_v1.enums.UserRole;

import java.util.UUID;

public record UserResponse(

        UUID id,
        String username,
        String email,
        String name,
        String img,
        Boolean enabled,
        UserRole role
) {
}
