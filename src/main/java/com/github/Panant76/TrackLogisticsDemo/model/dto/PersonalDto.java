package com.github.Panant76.TrackLogisticsDemo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonalDto {
    String surname;
    String name;

    String patronymic;

    String fullName;
    String nameLat;

    LocalDate birthday;
}
