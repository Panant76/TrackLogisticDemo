package com.github.Panant76.TrackLogisticsDemo.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contacts {
    private static final String SEQ_NAME = "contacts_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    Long id;
    @ManyToOne
    Personal pers;

    String address;

    @Column(nullable = false)
    String phoneMain;

    @ElementCollection
    List<String> phone;

    @ElementCollection
    List<String> email;
}