package com.moviewheel.artifact.mapper;

import com.moviewheel.artifact.entity.Ticket;
import com.moviewheel.artifact.entity.User;
import com.moviewheel.artifact.payload.dto.TicketDto;
import com.moviewheel.artifact.payload.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface TicketMapper {
    @Mapping(target = "id", ignore = true)
    Ticket fromDto(TicketDto ticketDto);

    Ticket toDto(Ticket Ticket);

    @Mapping(target = "id", ignore = true)
    void updateTicket(@MappingTarget Ticket Ticket, TicketDto ticketDto);
}
