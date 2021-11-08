package com.example.progreseauexemplecomplet;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Person
{

    //Attributs + Getters
    @Getter
    private final Long id;

    @Getter
    private final String firstName;

    @Getter
    private final String lastName;

    @Getter
    private final int age;

}
