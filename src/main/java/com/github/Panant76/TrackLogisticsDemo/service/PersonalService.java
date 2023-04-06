package com.github.Panant76.TrackLogisticsDemo.service;


import com.github.Panant76.TrackLogisticsDemo.model.dto.PersonalDto;
import com.github.Panant76.TrackLogisticsDemo.model.entity.Personal;
import com.github.Panant76.TrackLogisticsDemo.model.mapper.PersonalMapper;
import com.github.Panant76.TrackLogisticsDemo.repository.PersonalRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class PersonalService {
    PersonalMapper personalMapper;
    PersonalRepository personalRepository;
    @Transactional
    public PersonalDto createPers(PersonalDto personalDto){
        Personal personal = personalMapper.toEntity(personalDto);
        log.debug("Входящий запрос на создание объекта персона: {}", personalDto);
        personalRepository.save(personal);
        return personalMapper.toDto(personal);
    }
}
