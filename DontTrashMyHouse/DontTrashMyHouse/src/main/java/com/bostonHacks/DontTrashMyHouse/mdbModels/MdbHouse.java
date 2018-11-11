package com.bostonHacks.DontTrashMyHouse.mdbModels;

import com.bostonHacks.DontTrashMyHouse.models.Lock;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "houses")
public class MdbHouse {

    @Id
    private String id;
    private String address;
    private String latitude;
    private String longitude;
    private int appNumber;
    private ObjectId owner;
    private boolean used;
    private int rating;
    private int code;
    private String imageurl;
    private Lock lock;

    public MdbHouse() {
    }

    public MdbHouse(String id, String address, String latitude, String longitude, int appNumber, ObjectId owner, boolean used, int rating, int code, String imageurl, Lock lock) {
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
        this.lock = lock;
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

    public ObjectId getOwner() {
        return owner;
    }

    public void setOwner(ObjectId owner) {
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

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }
}
