package com.meuprojeto.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class Users implements Serializable {

    private Long Id;
    private String Name;
    private String Email;
    private String phone;
    private String password;

    public Users (){

    }

    public Users(Long Id, String Name, String Email, String phone, String password) {
        this.Id = Id;
        this.Name = Name;
        this.Email = Email;
        this.phone = phone;
        this.password = password;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(Id, users.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}
