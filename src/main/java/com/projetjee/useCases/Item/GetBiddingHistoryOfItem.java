package com.projetjee.useCases.Item;

import com.projetjee.domain.model.Bid;
import com.projetjee.domain.repository.BidRepository;
import com.projetjee.domain.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class GetBiddingHistoryOfItem {
    private final ItemRepository itemRepository;

    public GetBiddingHistoryOfItem(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    public Bid[] getBiddingHistoryOfItem(long id)
    {
        return itemRepository.getBiddingHistoryOfItem(id);
    }
}

