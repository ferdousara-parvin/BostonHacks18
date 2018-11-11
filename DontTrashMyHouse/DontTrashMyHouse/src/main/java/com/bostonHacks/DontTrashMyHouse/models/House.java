package com.bostonHacks.DontTrashMyHouse.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "houses")
public class House {

    @Id
    private String id;
    private String address;
    private String latitude;
    private String longitude;
    private int appNumber;
    private User owner;
    private boolean used;
    private int rating;
    private int code;
    private String imageurl;

    public House() {
    }

    public House(String id, String address, String latitude, String longitude, int appNumber, User owner, boolean used, int rating, int code, String imageurl) {
        this.id = id;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.appNumber = appNumber;
        this.owner = owner;
        this.used = used;
        this.rating = rating;
        this.code = code;
        this.imageurl = imageurl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(int appNumber) {
        this.appNumber = appNumber;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

}
