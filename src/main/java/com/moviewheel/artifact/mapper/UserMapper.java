package com.moviewheel.artifact.mapper;

import com.moviewheel.artifact.entity.User;
import com.moviewheel.artifact.payload.dto.UserDto;
import org.mapstruct.*;

@Mapper
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User fromDto(UserDto userDto);

    UserDto toDto(User User);

    @Mapping(target = "id", ignore = true)
    void updateUser(@MappingTarget User User, UserDto userDto);
}
