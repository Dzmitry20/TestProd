package com.company;

public  class Person {
    private final String firstName ;
    private final String lastName ;
    private final Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }



    @Override
    public int hashCode() {
        return  12 * firstName.hashCode() + 13 * lastName.hashCode() + 7 * gender.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;}
        if (hashCode() != obj.hashCode()) {
            return  false;}
        if (!( obj instanceof  Person)) {
            return  false;}
        Person person = (Person)obj;
        return  firstName.equals(person.firstName)  && lastName.equals(person.lastName) && gender.equals(person.gender);

    }
}

