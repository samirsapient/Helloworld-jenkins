package com.sapient.asde.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
private Person person;
    @BeforeEach
    void setUp() {
        person= new Person(12345678531L,"Samir Kumar", LocalDate.of(1999,10,10),"Bihar",9199121212L);
    }

    @AfterEach
    void tearDown() {
        person=null;
    }

    @Test
    void getAdharCardForValidData() {
        assertEquals(12345678531L,person.getAdharCard());
    }
    @Test
    void getAdharCardForUnvalidData() {
        assertEquals(12345678531L,person.getAdharCard());
    }

    @Test
    void setAdharCard() {
        //assertEquals();
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getBirthdate() {
    }

    @Test
    void setBirthdate() {
    }

    @Test
    void getAddress() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void getMobile() {
    }

    @Test
    void setMobile() {
    }


}