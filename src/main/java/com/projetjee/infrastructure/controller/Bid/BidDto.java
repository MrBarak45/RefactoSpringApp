package com.projetjee.infrastructure.controller.Bid;

import com.projetjee.domain.model.Item;
import com.projetjee.domain.model.User;

import java.sql.Time;

public class BidDto {
    private final Time EndTime;
    private final int newPrice;
    private final Item item;
    private final User bidder;

    public BidDto(Time endTime, int newPrice, Item item, User bidder) {
        EndTime = endTime;
        this.newPrice = newPrice;
        this.item = item;
        this.bidder = bidder;
    }

    public Time getEndTime() {
        return EndTime;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public Item getItem() {
        return item;
    }

    public User getBidder() {
        return bidder;
    }
}

