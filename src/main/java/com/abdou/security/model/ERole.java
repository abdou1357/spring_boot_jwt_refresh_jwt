package com.abdou.security.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
public enum ERole {
    ROLE_USER,
    ROLE_ADMIN,
    ROLE_MANAGER,
    ROLE_SUPER_ADMIN
}
