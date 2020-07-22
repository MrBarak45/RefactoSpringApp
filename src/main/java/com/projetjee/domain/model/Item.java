package com.projetjee.domain.model;

import java.net.URL;
import java.sql.Date;

public class Item {
    private Long id;
    private String name;
    private URL itemPicUrl;
    private Date creationDate;

    private User seller;
    private Bid[] placedBids;
    private Bid highestCurrentBid;

    public Item(Long id, String name, URL itemPicUrl, Date creationDate, User seller, Bid[] placedBids, Bid highestCurrentBid) {
        this.id = id;
        this.name = name;
        this.itemPicUrl = itemPicUrl;
        this.creationDate = creationDate;
        this.seller = seller;
        this.placedBids = placedBids;
        this.highestCurrentBid = highestCurrentBid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getItemPicUrl() {
        return itemPicUrl;
    }

    public void setItemPicUrl(URL itemPicUrl) {
        this.itemPicUrl = itemPicUrl;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Bid[] getPlacedBids() {
        return placedBids;
    }

    public void setPlacedBids(Bid[] placedBids) {
        this.placedBids = placedBids;
    }

    public Bid getHighestCurrentBid() {
        return highestCurrentBid;
    }

    public void setHighestCurrentBid(Bid highestCurrentBid) {
        this.highestCurrentBid = highestCurrentBid;
    }
}
