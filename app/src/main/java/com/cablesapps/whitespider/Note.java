package com.cablesapps.whitespider;

import com.google.firebase.firestore.Exclude;

public class Note {
    private String title;
    private String description;
    private String image;
    private int priority;
    private String imageStoragePath;

    public Note(){
        // empty constructor needed for firebase
    }

    public Note(String title, String description, int priority, String image, String imageStoragePath){
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.image = image;
        this.imageStoragePath = imageStoragePath;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getImage(){
        return image;
    }

    public String getImageStoragePath(){
        return imageStoragePath;
    }

}
