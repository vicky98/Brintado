package com.brintado.entity;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/

public class User {


    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int currentGames;
    private int monthGames;
    private int allGames;

    public User(int id, String username, String password, String firstName, String lastName,
                String email, String phoneNumber, int currentGames, int monthGames, int allGames) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.currentGames = currentGames;
        this.monthGames = monthGames;
        this.allGames = allGames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCurrentGames() {
        return currentGames;
    }

    public void setCurrentGames(int currentGames) {
        this.currentGames = currentGames;
    }

    public int getMonthGames() {
        return monthGames;
    }

    public void setMonthGames(int monthGames) {
        this.monthGames = monthGames;
    }

    public int getAllGames() {
        return allGames;
    }

    public void setAllGames(int allGames) {
        this.allGames = allGames;
    }
}
