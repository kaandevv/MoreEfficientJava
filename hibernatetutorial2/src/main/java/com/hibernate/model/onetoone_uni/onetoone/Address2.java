package com.hibernate.model.onetoone_uni.onetoone;

import javax.persistence.*;

@Entity
@Table
public class Address2 {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users2 users2;

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

    public Users2 getUsers2() {
        return users2;
    }

    public void setUsers2(Users2 users2) {
        this.users2 = users2;
    }
}
