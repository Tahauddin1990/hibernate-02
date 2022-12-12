package com.tahauddin.syed.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "Persons")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persons implements Serializable {
    private static final long serialVersionUID = 8112764537650157020L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String lastName;
    private String firstName;
    private String address;
    private String city;
}
