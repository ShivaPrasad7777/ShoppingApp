package com.Shopping.dao;

import java.util.List;

import com.Shopping.controller.ShoppingItems;
import com.Shopping.entity.BShopping;
import com.Shopping.entity.SShopping;

public interface ShoppingDaoInterface {

	int createBAccount(BShopping s);

	int BloginDao(BShopping s);


	int createSAccountDao(SShopping s);

	int SloginDao(SShopping s);

	int addItemApp(ShoppingItems si);

	int upNameItem(ShoppingItems s);

	int upPrizeItem(ShoppingItems s1);

	int upCat(ShoppingItems s1);

	List viewAllItems();

	int irating(ShoppingItems si);

	List<ShoppingItems> sortP();

}
