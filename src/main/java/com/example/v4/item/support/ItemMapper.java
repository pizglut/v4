package com.example.v4.item.support;

import com.example.v4.item.api.request.ItemRequest;
import com.example.v4.item.api.request.UpdateItemRequest;
import com.example.v4.item.api.response.ItemResponse;
import com.example.v4.item.domain.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public Item toItem(ItemRequest itemRequest) {
        return new Item(itemRequest.getName());
    }

    public Item toItem(Item item, UpdateItemRequest itemRequest) {
        item.setName(itemRequest.getName());
        return item;
    }

    public ItemResponse toItemResponse(Item item) {
        return new ItemResponse(item.getId(), item.getName());
    }
}
