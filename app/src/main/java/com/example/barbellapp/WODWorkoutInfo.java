package com.example.barbellapp;

public class WODWorkoutInfo {

    String title, description, scoreType, date;

    public WODWorkoutInfo() {
        this.title = "";
        this.description = "";
        this.scoreType = "";
        this.date = "";
    }

    public WODWorkoutInfo(String title, String description, String scoreType, String date) {
        this.title = title;
        this.description = description;
        this.scoreType = scoreType;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
