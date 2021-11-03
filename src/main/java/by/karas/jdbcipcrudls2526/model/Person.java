package by.karas.jdbcipcrudls2526.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    //private static int PEOPLE_COUNT = 5;

    private int id;

    @NotEmpty(message = "Name can not be empty!")
    @Size(min = 2, max = 30, message = "The name has to have from 2 to 30 characters!")
    private String name;

    @Min(value=0, message = "The age must be greater than 0!")
    private int age;

    @NotEmpty(message = "Email can not be empty!")
    @Email(message = "Email should be valid!")
    private String email;

    public Person() {}

    public Person(String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
