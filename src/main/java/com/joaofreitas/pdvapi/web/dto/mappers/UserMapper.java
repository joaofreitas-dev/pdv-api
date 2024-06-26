package com.joaofreitas.pdvapi.web.dto.mappers;

import com.joaofreitas.pdvapi.entities.User;
import com.joaofreitas.pdvapi.web.dto.user.UserCreateDto;
import com.joaofreitas.pdvapi.web.dto.user.UserResponseDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public static User toUser(UserCreateDto createDto) {
        return new ModelMapper().map(createDto, User.class);
    }

    public static UserResponseDto toDto(User user) {
        String role = user.getRole().name().substring("ROLE_".length());
        PropertyMap<User, UserResponseDto> propertyMap = new PropertyMap<User, UserResponseDto>() {
            @Override
            protected void configure() {
                map().setRole(role);
            }
        };
        ModelMapper mapper = new ModelMapper();
        mapper.addMappings(propertyMap);
        return mapper.map(user, UserResponseDto.class);
    }

    public static List<UserResponseDto> toListDto (List<User> userList) {
        return userList.stream().map(user -> toDto(user)).collect(Collectors.toList());
    }
}
