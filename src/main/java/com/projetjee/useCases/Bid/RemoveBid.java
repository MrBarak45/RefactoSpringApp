package com.projetjee.useCases.Bid;

import com.projetjee.domain.model.Bid;

import com.projetjee.domain.repository.BidRepository;
import org.springframework.stereotype.Service;

@Service
public class RemoveBid {
    private final BidRepository bidRepository;

    public RemoveBid(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    public void RemoveBid(long bidId){
        bidRepository.deleteBid(bidId);
    }

}
