package com.laioffer.onlineorder.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public record AddToCartBody(
        Long menuId
) {
}
