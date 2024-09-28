package ru.flynt3650.project.first_spring_security_app.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters!")
    @Column(name = "username")
    private String username;

    @Min(value = 1900, message = "Year of birth must be greater than 1900!")
    @Column(name = "year_of_birth")
    private int yearOfBirth;

    @Column(name = "password")
    private String password;

    public Person() {
    }

    public Person(String username, int yearOfBirth) {
        this.username = username;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotEmpty @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters!") String getUsername() {
        return username;
    }

    public void setUsername(@NotEmpty @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters!") String username) {
        this.username = username;
    }

    @Min(value = 1900, message = "Year of birth must be greater than 1900!")
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(@Min(value = 1900, message = "Year of birth must be greater than 1900!") int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", password='" + password + '\'' +
                '}';
    }
}
