package com.projetjee.useCases.Item;

import com.projetjee.domain.model.Bid;
import com.projetjee.domain.repository.BidRepository;
import com.projetjee.domain.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ExpandExipryDateForItem {
    private final ItemRepository itemRepository;

    public ExpandExipryDateForItem(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void expandExpiryDateForItem(long id, Date date)
    {
        itemRepository.expandExpiryDateForItem(id, date);
    }
}

