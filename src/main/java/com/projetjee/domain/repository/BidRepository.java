package com.projetjee.domain.repository;

import com.projetjee.domain.model.Bid;

public interface BidRepository {
    Bid createNewBid(Bid bid);
    Bid deleteBid(long id);
    Bid getBid(long id);
}
