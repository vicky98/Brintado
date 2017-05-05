package com.brintado.entity;

public class Game {

    private int id;
    private int user_id;
    private int num_participants;
    private int num_checkpoints;

    public Game(int id, int user_id, int num_participants, int num_checkpoints) {
        this.id = id;
        this.user_id = user_id;
        this.num_participants = num_participants;
        this.num_checkpoints = num_checkpoints;
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

    public int getNum_participants() {
        return num_participants;
    }

    public void setNum_participants(int num_participants) {
        this.num_participants = num_participants;
    }

    public int getNum_checkpoints() {
        return num_checkpoints;
    }

    public void setNum_checkpoints(int num_checkpoints) {
        this.num_checkpoints = num_checkpoints;
    }
}
