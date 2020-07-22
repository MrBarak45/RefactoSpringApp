

package com.projetjee.useCases.Item;

import com.projetjee.domain.model.Bid;
import com.projetjee.domain.model.User;
import com.projetjee.domain.repository.BidRepository;
import com.projetjee.domain.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class GetHighestBidderForItem {
    private final ItemRepository itemRepository;

    public GetHighestBidderForItem(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public User GetHighestBidderForItem(long id)
    {
        return itemRepository.getHighestBidderForItem(id);
    }
}



