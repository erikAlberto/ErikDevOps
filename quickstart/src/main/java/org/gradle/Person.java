package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;
    private final int age;
    private final String ci;
    private final String genero;
    private final String country;

    public Person(String name, int age, String ci, String genero, String country) {
        this.name = name;
        this.age = age;
        this.ci = ci;
        this.genero = genero;
        this.country = country;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public 	String getCi() {
        return ci;
    }
    public String getGenero() {
        return genero;
    }
    public String getCountry() {
        return country;
    }
}
