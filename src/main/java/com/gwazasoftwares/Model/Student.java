package com.gwazasoftwares.Model;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

/**
 * Created by gwaza on 5/11/2018.
 */

@Entity
public class Student {
    private String name;

    @Id
    private String email;
    private String location;

    public Student() {
    }

    public Student(String name, String email, String location) {

        this.name = name;

        this.email = email;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
