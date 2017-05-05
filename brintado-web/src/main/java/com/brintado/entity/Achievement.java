package com.brintado.entity;

public class Achievement {

    private int id;
    private int user_id;
    private int name_id;

    public Achievement(int id, int user_id, int name_id) {
        this.id = id;
        this.user_id = user_id;
        this.name_id = name_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getName_id() {
        return name_id;
    }

    public void setName_id(int name_id) {
        this.name_id = name_id;
    }
}
