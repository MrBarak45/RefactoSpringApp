package com.projetjee.infrastructure.dao.Item;

import com.projetjee.domain.model.Bid;
import com.projetjee.domain.model.Item;
import com.projetjee.domain.model.User;
import com.projetjee.domain.repository.BidRepository;
import com.projetjee.domain.repository.ItemRepository;
import com.projetjee.infrastructure.dao.Bid.BidAdapter;
import com.projetjee.infrastructure.dao.Bid.MongoBid;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

public class MongoItemRepo implements ItemRepository {
    @Override
    public Item createNewItem(Item item) {
        return null;        //implem for mongodb access to database

    }

    @Override
    public void updateItem(Item item) {
        //implem for mongodb access to database

    }

    @Override
    public Item deleteItem(long id) {
        return null;        //implem for mongodb access to database

    }

    @Override
    public Item getItem(long id) {
        return null;        //implem for mongodb access to database

    }

    @Override
    public Bid[] getBiddingHistoryOfItem(long itemId) {
        return new Bid[0];        //implem for mongodb access to database

    }

    @Override
    public void expandExpiryDateForItem(long itemId, Date newExpiryDate) {
        //implem for mongodb access to database

    }

    @Override
    public User getHighestBidderForItem(long itemId) {
        return null;        //implem for mongodb access to database

    }
}


