package com.projetjee.useCases.Bid;

import com.projetjee.domain.model.Bid;

import com.projetjee.domain.repository.BidRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateBid {
    private final BidRepository bidRepository;

    public CreateBid(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    public void createNewBid(Bid bid){
        bidRepository.createNewBid(bid);
    }

}
