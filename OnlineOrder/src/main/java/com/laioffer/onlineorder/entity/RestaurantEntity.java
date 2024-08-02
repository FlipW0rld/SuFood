package com.laioffer.onlineorder.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("restaurants")
public record RestaurantEntity(
        @Id Long id,
        String name,
        String address,
        String phone,
        String imageUrl
) {
}
