package com.sapient.asde.service;

import java.time.LocalDate;
import java.util.Objects;

/*
       Create tester class for Person testing getter, setter and constructor methods
       Code coverage:  >90%
*/
public class Person {
    private Long adharCard;
    private String name;
    private LocalDate birthdate;
    private String address;
    private Long mobile;

    public Person() {
    }

    public Person(Long adharCard, String name, LocalDate birthdate, String address, Long mobile) {
        this.adharCard = adharCard;
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.mobile = mobile;
    }

    public Long getAdharCard() {
        return adharCard;
    }

    public void setAdharCard(Long adharCard) {
        this.adharCard = adharCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(adharCard, person.adharCard) && Objects.equals(name, person.name) && Objects.equals(birthdate, person.birthdate) && Objects.equals(address, person.address) && Objects.equals(mobile, person.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adharCard, name, birthdate, address, mobile);
    }

    @Override
    public String toString() {
        return "Person{" +
                "adharCard=" + adharCard +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}

