package com.sau.jwt.Enums;

public enum EnumRole {
    USER,
    STUDENT,
    ADMIN;

    public String getRole() {
        return this.name();
    }
}
