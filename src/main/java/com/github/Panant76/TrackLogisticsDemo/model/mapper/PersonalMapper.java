package com.github.Panant76.TrackLogisticsDemo.model.mapper;


import com.github.Panant76.TrackLogisticsDemo.model.dto.PersonalDto;
import com.github.Panant76.TrackLogisticsDemo.model.entity.Personal;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonalMapper {
    Personal toEntity(PersonalDto dto);

    PersonalDto toDto(Personal personal);
}
