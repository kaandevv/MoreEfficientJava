package com.hibernate.model.onetomany;

import javax.persistence.*;

@Entity
@Table
public class Address1 {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;

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
}
