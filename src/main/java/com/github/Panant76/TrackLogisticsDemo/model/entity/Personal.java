package com.github.Panant76.TrackLogisticsDemo.model.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "personal")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Personal {
    private static final String SEQ_NAME = "personal_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    Long id;

    @Column(nullable = false)
    String surname;

    @Column(nullable = false)
    String name;


    String patronymic;

    String fullName;//Сделать заполнение программно

    String nameLat;

    LocalDate birthday;


}
