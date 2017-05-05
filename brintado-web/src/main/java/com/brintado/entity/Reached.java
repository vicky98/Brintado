package com.brintado.entity;

public class Reached {

    private int id;
    private int user_id;
    private int reached_cp;
    private int current_points;
    private int max_points;

    public Reached(int id, int user_id, int reached_cp, int current_points, int max_points) {
        this.id = id;
        this.user_id = user_id;
        this.reached_cp = reached_cp;
        this.current_points = current_points;
        this.max_points = max_points;
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

    public int getReached_cp() {
        return reached_cp;
    }

    public void setReached_cp(int reached_cp) {
        this.reached_cp = reached_cp;
    }

    public int getCurrent_points() {
        return current_points;
    }

    public void setCurrent_points(int current_points) {
        this.current_points = current_points;
    }

    public int getMax_points() {
        return max_points;
    }

    public void setMax_points(int max_points) {
        this.max_points = max_points;
    }
}
