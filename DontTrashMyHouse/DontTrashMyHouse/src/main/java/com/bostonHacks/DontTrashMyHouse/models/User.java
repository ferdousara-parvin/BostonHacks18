/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Etienne
 */
@Document(collection="users")
public class User {
    
    @Id
    private String id;
    private String name;
    private int age;
    private String credit_num;
    private String exp;
    private int ccv;

    public User() {
    }

    public User(String id, String name, int age, String credit_num, String exp, int ccv) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.credit_num = credit_num;
        this.exp = exp;
        this.ccv = ccv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getCredit_num() {
        return credit_num;
    }

    public void setCredit_num(String credit_num) {
        this.credit_num = credit_num;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }


    public User getUser(){return this;}
}
