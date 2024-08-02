package com.laioffer.onlineorder.hello;


public record Person(
        String name,
        String company,
        Address homeAddress,
        Book favoriteBook
) {
}
