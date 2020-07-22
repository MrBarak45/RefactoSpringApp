package com.projetjee.domain.model;

import java.sql.Time;

public class Bid {
    private Long id;
    private Time EndTime;
    private int newPrice;
    private Item item;
    private User bidder;

    public Bid(Long id, Time endTime, int newPrice, Item item, User bidder) {
        this.id = id;
        EndTime = endTime;
        this.newPrice = newPrice;
        this.item = item;
        this.bidder = bidder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getEndTime() {
        return EndTime;
    }

    public void setEndTime(Time endTime) {
        EndTime = endTime;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getBidder() {
        return bidder;
    }

    public void setBidder(User bidder) {
        this.bidder = bidder;
    }
}
