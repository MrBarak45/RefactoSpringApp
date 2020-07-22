package com.projetjee.infrastructure.controller.Item;

import com.projetjee.domain.model.Bid;
import com.projetjee.domain.model.User;

import java.net.URL;
import java.sql.Date;

public class ItemDto {
    private final Long id;
    private final String name;
    private final URL itemPicUrl;
    private final Date creationDate;

    private final User seller;
    private final Bid[] placedBids;
    private final Bid highestCurrentBid;

    public ItemDto(Long id, String name, URL itemPicUrl, Date creationDate, User seller, Bid[] placedBids, Bid highestCurrentBid) {
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

    public String getName() {
        return name;
    }

    public URL getItemPicUrl() {
        return itemPicUrl;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public User getSeller() {
        return seller;
    }

    public Bid[] getPlacedBids() {
        return placedBids;
    }

    public Bid getHighestCurrentBid() {
        return highestCurrentBid;
    }
}
