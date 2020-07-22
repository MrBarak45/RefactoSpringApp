package com.projetjee.infrastructure.dao.Bid;

import com.projetjee.domain.model.Bid;

public class BidAdapter {
    public static Bid convertToBid(MongoBid mongoBid) {
        return new Bid(mongoBid.getId(), mongoBid.getEndTime(), mongoBid.getNewPrice(), mongoBid.getItem(), mongoBid.getBidder());
    }

    public static MongoBid convertToBidModel(Bid bid) {
        return new MongoBid(bid.getId(), bid.getEndTime(), bid.getNewPrice(), bid.getItem(), bid.getBidder());
    }

}
