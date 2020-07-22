package com.projetjee.infrastructure.controller.Bid;

import com.projetjee.domain.model.Bid;
import com.projetjee.useCases.Bid.CreateBid;
import com.projetjee.useCases.Bid.GetBid;
import com.projetjee.useCases.Bid.RemoveBid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;

@RestController
public class BidController {

    private final CreateBid createBid;
    private final GetBid getBid;
    private final RemoveBid removeBid;

    public BidController(CreateBid createBid, GetBid getBid, RemoveBid removeBid) {
        this.createBid = createBid;
        this.getBid = getBid;
        this.removeBid = removeBid;
    }


    @PostMapping("/bid/create")
    public ResponseEntity<String> BidOnItem(@RequestBody BidDto bidDto) {
        createBid.createNewBid(new Bid(null, new Time(12, 3, 4), 12000, bidDto.getItem(), bidDto.getBidder()));
        return new ResponseEntity<>("Bid on item created", HttpStatus.CREATED);
    }

    @DeleteMapping("/bid/delete")
    public ResponseEntity<String> deleteBid(long id) {
        removeBid.RemoveBid(id);
        return new ResponseEntity<>("Bid removed", HttpStatus.CREATED);
    }
}