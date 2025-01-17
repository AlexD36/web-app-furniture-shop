package com.dn.shop.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category extends BaseEntity {
    
    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 500)
    private String description;
} 