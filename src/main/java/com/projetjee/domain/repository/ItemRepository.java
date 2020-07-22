package com.projetjee.domain.repository;

import com.projetjee.domain.model.Bid;
import com.projetjee.domain.model.Item;
import com.projetjee.domain.model.User;

import java.util.Date;

public interface ItemRepository {
    Item createNewItem(Item item);
    void updateItem(Item item);
    Item deleteItem(long id);
    Item getItem(long id);
    Bid[] getBiddingHistoryOfItem(long itemId);
    void expandExpiryDateForItem(long itemId, Date newExpiryDate);
    User getHighestBidderForItem(long itemId);
}
