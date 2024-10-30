package com.server.user.domain.enums.converter;

import java.util.stream.Stream;

import com.server.user.domain.enums.Role;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RoleConverter implements AttributeConverter<Role, String> {
    public String convertToDatabaseColumn(Role role) {
        return role == null ? null : role.getValue();
    }

    public Role convertToEntityAttribute(String role) {
        return role == null ? null : 
        Stream.of(Role.values())
        .filter(r -> r.getValue().equals(role))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Tipo de acesso inválido"));    
    }
}
