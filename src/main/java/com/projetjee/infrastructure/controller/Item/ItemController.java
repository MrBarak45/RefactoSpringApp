package com.projetjee.infrastructure.controller.Item;

import com.projetjee.domain.model.Item;
import com.projetjee.domain.model.User;
import com.projetjee.useCases.Item.CreateNewItem;
import com.projetjee.useCases.Item.ExpandExipryDateForItem;
import com.projetjee.useCases.Item.GetBiddingHistoryOfItem;
import com.projetjee.useCases.Item.GetHighestBidderForItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    private final CreateNewItem createNewItem;
    private final ExpandExipryDateForItem expandExipryDateForItem;
    private final GetBiddingHistoryOfItem getBiddingHistoryOfItem;
    private final GetHighestBidderForItem getHighestBidderForItem;

    public ItemController(CreateNewItem createNewItem, ExpandExipryDateForItem expandExipryDateForItem, GetBiddingHistoryOfItem getBiddingHistoryOfItem, GetHighestBidderForItem getHighestBidderForItem) {
        this.createNewItem = createNewItem;
        this.expandExipryDateForItem = expandExipryDateForItem;
        this.getBiddingHistoryOfItem = getBiddingHistoryOfItem;
        this.getHighestBidderForItem = getHighestBidderForItem;
    }

    @PostMapping("/item/add")
    public ResponseEntity<String> addItem(@RequestBody ItemDto itemDto) {
        createNewItem.CreateNewItem(new Item(itemDto.getId(), itemDto.getName(), itemDto.getItemPicUrl(), itemDto.getCreationDate(), itemDto.getSeller(), itemDto.getPlacedBids(), itemDto.getHighestCurrentBid()));
        return new ResponseEntity<>("Item created", HttpStatus.CREATED);
    }

    @GetMapping("/item/getHighestBidder/{id}")
    public ResponseEntity<String> getHighestBidderForItem(@RequestBody Item itemDto) {
        User a = getHighestBidderForItem.GetHighestBidderForItem(itemDto.getId());
        return new ResponseEntity<>("Highest bidder" + a.toString(), HttpStatus.OK);
    }

}
