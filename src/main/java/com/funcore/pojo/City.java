package com.funcore.pojo;

import java.math.BigInteger;

public class City {
    private BigInteger id;
    private String title;

    public City() {}

    public City(BigInteger id, String title) {
        this.id = id;
        this.title = title;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
