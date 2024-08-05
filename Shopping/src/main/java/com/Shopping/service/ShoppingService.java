package com.Shopping.service;

import java.util.List;

import com.Shopping.controller.ShoppingItems;
import com.Shopping.dao.ShoppingDao;
import com.Shopping.dao.ShoppingDaoInterface;
import com.Shopping.entity.BShopping;
import com.Shopping.entity.SShopping;

public class ShoppingService implements ShoppingServiceInterface {

	public int createBAccount(BShopping s) {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		int i=sdi.createBAccount(s);
		return i;
	}

	@Override
	public int loginAccout(BShopping s) {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		int i=sdi.BloginDao(s);
		return i;
	}

	public int createSAccount(SShopping s) {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		int i=sdi.createSAccountDao(s);
		return i;
	}

	@Override
	public int loginSAccout(SShopping s) {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		int i=sdi.SloginDao(s);
		return i;
	}

	@Override
	public int addItemApp(ShoppingItems si) {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		int i=sdi.addItemApp(si);
		return i;
	}

	@Override
	public int upNameItem(ShoppingItems s) {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		int i=sdi.upNameItem(s);
		return i;
	}

	@Override
	public int upPrizeItem(ShoppingItems s1) {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		int i=sdi.upPrizeItem(s1);
		return i;
	}

	@Override
	public int upCat(ShoppingItems s1) {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		int i=sdi.upCat(s1);
		return i;
	}

	@Override
	public List viewAllItems() {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		List i=sdi.viewAllItems();
		return i;
	}

	@Override
	public int irating(ShoppingItems si) {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		int i=sdi.irating(si);
		return i;	
		}

	@Override
	public List<ShoppingItems> sortP() {
		// TODO Auto-generated method stub
		ShoppingDaoInterface sdi=new ShoppingDao();
		List i=sdi.sortP();
		return i;
	}
	

}
