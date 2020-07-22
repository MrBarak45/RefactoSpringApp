package com.projetjee.infrastructure.dao.Bid;

import com.projetjee.domain.model.Bid;
import com.projetjee.domain.repository.BidRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MongoBidRepo implements BidRepository {
    private final MongoTemplate mongoTemplate;

    public MongoBidRepo(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public Bid createNewBid(Bid bid) {
        final MongoBid mongoBid = BidAdapter.convertToBidModel(bid);
        final MongoBid savedMongoBid = mongoTemplate.save(mongoBid);
        return BidAdapter.convertToBid(savedMongoBid);
    }

    @Override
    public Bid deleteBid(long id) {
        return null;        //implem for mongodb access to database

    }

    @Override
    public Bid getBid(long id) {
        return null;        //implem for mongodb access to database

    }
}
