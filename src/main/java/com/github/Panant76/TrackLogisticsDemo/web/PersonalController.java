package com.github.Panant76.TrackLogisticsDemo.web;


import com.github.Panant76.TrackLogisticsDemo.model.dto.PersonalDto;
import com.github.Panant76.TrackLogisticsDemo.service.PersonalService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Операции пользователя", description = "API операций с персоналом")
@RestController
@RequestMapping("/pers")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class PersonalController {
    PersonalService personalService;

    @PostMapping("/create")
    public ResponseEntity<PersonalDto> createPers(@RequestBody PersonalDto personalDto) {
        return ResponseEntity.ok(personalService.createPers(personalDto));
    }
}
