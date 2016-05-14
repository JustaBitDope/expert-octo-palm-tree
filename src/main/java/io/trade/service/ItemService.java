package io.trade.service;

import java.util.List;

import io.trade.model.Auction;
import io.trade.model.Item;
import io.trade.model.Users;

public interface ItemService {

	List<Item> findAll();

	List<Item> findByUser(Users user);

	void add(Item item);

	List<Item> findBySearch(String search);

}
