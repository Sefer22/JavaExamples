package com.example.myfirstspringapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    public StudentEntity() {

    }

    public StudentEntity(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
