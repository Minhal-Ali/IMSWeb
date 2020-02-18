package com.workplace.ims.model;

import javax.persistence.*;

@Entity
@Table(name = "MerchandInfo")
public class User {

    public User(){

    }

    public User(String name,String password,String merchandiserEmail){
        this.name=name;
        this.password=password;
        this.merchandiserEmail=merchandiserEmail;
    }

    @Column(name = "MerchandiserID", nullable = false)
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    @Column(name = "Name", nullable = false)
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Column(name = "Password", nullable = false)
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    @Column(name = "MerchandiserEmail", nullable = false)
    public String getMerchandiserEmail(){
        return merchandiserEmail;
    }

    public void setMerchandiserEmail(String merchandiserEmail){
        this.merchandiserEmail=merchandiserEmail;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", password=" + password + ", merchandiserEmail=" + merchandiserEmail
                + "]";
    }

    private long id;
    private String name;
    private String password;
    private String merchandiserEmail;
}
