package me.mehadih.retrofitlivedatamvvmrecyclerviewdatabinding.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created By - Mehadi
 * Created On - 2/6/2020 : 1:12 PM
 * Email - hi@mehadih.me
 * Website - www.mehadih.me
 */


public class User implements Serializable {

    @SerializedName("total_students")
    private int id;
    @SerializedName("school_name")
    private String name;

    @SerializedName("city")
    private String username;

    @SerializedName("school_email")
    private String email;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
