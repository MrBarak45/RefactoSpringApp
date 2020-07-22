package com.projetjee.useCases.Bid;


import com.projetjee.domain.model.Bid;

import com.projetjee.domain.repository.BidRepository;
import org.springframework.stereotype.Service;

@Service
public class GetBid {
    private final BidRepository bidRepository;

    public GetBid(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    public void GetBid(long bidId){
        bidRepository.getBid(bidId);
    }

}

