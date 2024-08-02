package com.laioffer.onlineorder.model;


public record RegisterBody(
        String email,
        String password,
        String firstName,
        String lastName
) {
}

