package com.laioffer.onlineorder.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("menu_items")
public record MenuItemEntity(
        @Id Long id,
        Long restaurantId,
        String name,
        String description,
        Double price,
        String imageUrl
) {
}
