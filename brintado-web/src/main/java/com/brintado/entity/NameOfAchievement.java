package com.brintado.entity;

public class NameOfAchievement {

    private int id;
    private String name;
    private int requirement;

    public NameOfAchievement(int id, String name, int requirement) {
        this.id = id;
        this.name = name;
        this.requirement = requirement;
    }

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

    public int getRequirement() {
        return requirement;
    }

    public void setRequirement(int requirement) {
        this.requirement = requirement;
    }
}
