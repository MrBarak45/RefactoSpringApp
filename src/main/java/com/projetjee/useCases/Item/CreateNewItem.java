
package com.projetjee.useCases.Item;

import com.projetjee.domain.model.Item;
import com.projetjee.domain.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateNewItem {
    private final ItemRepository itemRepository;

    public CreateNewItem(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item CreateNewItem(Item item)
    {
        return itemRepository.createNewItem(item);
    }
}