package com.brintado.entity;

public class Checkpoint {

    private int id;
    private int game_id;
    private String location;
    private String name_of_cp;

    public Checkpoint(int id, int game_id, String location, String name_of_cp) {
        this.id = id;
        this.game_id = game_id;
        this.location = location;
        this.name_of_cp = name_of_cp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName_of_cp() {
        return name_of_cp;
    }

    public void setName_of_cp(String name_of_cp) {
        this.name_of_cp = name_of_cp;
    }
}
