package com.tahauddin.syed.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Author")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author implements Serializable {

    private static final long serialVersionUID = -1333494635452963346L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(updatable = false, nullable = false, columnDefinition = "binary(16)")
    private UUID id;
    private String authorName;
    private String country;
}
