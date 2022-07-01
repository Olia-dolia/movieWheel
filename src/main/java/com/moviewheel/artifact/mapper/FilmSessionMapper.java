package com.moviewheel.artifact.mapper;

import com.moviewheel.artifact.entity.FilmSession;
import com.moviewheel.artifact.entity.User;
import com.moviewheel.artifact.payload.dto.FilmSessionDto;
import com.moviewheel.artifact.payload.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface FilmSessionMapper {
    @Mapping(target = "id", ignore = true)
    FilmSession fromDto(FilmSessionDto filmSessionDto);

    FilmSessionDto toDto(FilmSession filmSession);

    @Mapping(target = "id", ignore = true)
    void updateFilm(@MappingTarget FilmSession FilmSession, FilmSessionDto filmSessionDto);
}
