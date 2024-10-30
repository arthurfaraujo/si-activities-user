package com.server.user.domain.enums;

public enum Role {
    ADMIN("admin"), USER("user");

    private String value;

    private Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
