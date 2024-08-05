package com.Shopping.service;

import java.util.List;

import com.Shopping.controller.ShoppingItems;
import com.Shopping.entity.BShopping;
import com.Shopping.entity.SShopping;

public interface ShoppingServiceInterface {

	int createBAccount(BShopping s);

	int loginAccout(BShopping s);

	int createSAccount(SShopping s);

	int loginSAccout(SShopping s);


	int addItemApp(ShoppingItems si);

	int upNameItem(ShoppingItems s);

	int upPrizeItem(ShoppingItems s1);

	int upCat(ShoppingItems s1);

	List viewAllItems();

	int irating(ShoppingItems si);

	List<ShoppingItems> sortP();

}
