package com.projetjee.infrastructure.dao.Bid;
import com.projetjee.domain.model.Item;
import com.projetjee.domain.model.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;

@Document(collection = "Bids")
public class MongoBid {
    @Id
    private Long id;
    private Time EndTime;
    private int newPrice;
    private Item item;
    private User bidder;

    public MongoBid(Long id, Time endTime, int newPrice, Item item, User bidder) {
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
