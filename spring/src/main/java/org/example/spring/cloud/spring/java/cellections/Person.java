package org.example.spring.cloud.spring.java.cellections;

import lombok.Builder;

public class Person {
    private String  name;
    private String  surname;
    private Integer age;


    @Builder(setterPrefix = "with")
    public Person(final String name,
                  final String surname,
                  final Integer age) {
        this.name    = name;
        this.surname = surname;
        this.age     = age;
    }

    public Person() {
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        final Person other = (Person) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object this$name  = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        final Object this$surname  = this.getSurname();
        final Object other$surname = other.getSurname();
        if (this$surname == null ? other$surname != null : !this$surname.equals(other$surname)) {
            return false;
        }
        final Object this$age  = this.getAge();
        final Object other$age = other.getAge();
        if (this$age == null ? other$age != null : !this$age.equals(other$age)) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Person;
    }

    public int hashCode() {
        final int    PRIME  = 59;
        int          result = 1;
        final Object $name  = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $surname = this.getSurname();
        result = result * PRIME + ($surname == null ? 43 : $surname.hashCode());
        final Object $age = this.getAge();
        result = result * PRIME + ($age == null ? 43 : $age.hashCode());
        return result;
    }

    public String toString() {
        return "Person(name=" + this.getName() + ", surname=" + this.getSurname() + ", age=" + this.getAge() + ")";
    }
}
