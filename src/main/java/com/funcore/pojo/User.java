package com.funcore.pojo;

import java.math.BigInteger;

public class User {
    private BigInteger id;
    private String firstName;
    private String lastName;
    private Byte sex;
    private City city;
    private String photoUrl;

    public User() {}

    public User(BigInteger id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(BigInteger id, String firstName, String lastName, Byte sex, City city, String photoUrl) {
        this(id,firstName,lastName);
        this.sex = sex;
        this.city = city;
        this.photoUrl = photoUrl;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
