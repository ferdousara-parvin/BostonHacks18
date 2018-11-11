package com.bostonHacks.DontTrashMyHouse.mdbModels;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="rentals")
public class MdbRental {

    @Id
    private String id;
    private ObjectId house;
    private ObjectId renter;
    private Date startDate;
    private Date endDate;
    private String imageurl;

    public MdbRental() {
    }

    public MdbRental(String id, ObjectId house,ObjectId renter, Date startDate, Date endDate, String imageurl) {
        this.id = id;
        this.house = house;
        this.renter = renter;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imageurl = imageurl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ObjectId getHouse() {
        return house;
    }

    public void setHouse(ObjectId house) {
        this.house = house;
    }

    public ObjectId getRenter() {
        return renter;
    }

    public void setRenter(ObjectId renter) {
        this.renter = renter;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
