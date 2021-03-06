package com.springORM.One_UsingXml.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SpringORMStudent {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private String city;

    public SpringORMStudent(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public SpringORMStudent() {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SpringORMStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
