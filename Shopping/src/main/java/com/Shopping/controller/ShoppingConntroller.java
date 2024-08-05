package com.Shopping.controller;

import java.util.List;
import java.util.Scanner;

import com.Shopping.entity.BShopping;
import com.Shopping.entity.SShopping;
import com.Shopping.service.ShoppingService;
import com.Shopping.service.ShoppingServiceInterface;

public class ShoppingConntroller implements ShoppingControllerInterface {
	Scanner scan=new Scanner(System.in);

	public void createBAccount() {
		// TODO Auto-generated method stub
		System.out.println("Enter buyer's Name");
		String bname=scan.next();
		System.out.println("Enter buyer's mail");
		String bmail=scan.next();
		System.out.println("Enter buyer's mail password");
		String bpwd=scan.next();
		System.out.println("Enter buyer mobile number");
		int bmnum=scan.nextInt();
		
		BShopping s=new BShopping();
		
		s.setBname(bname);
		s.setBmail(bmail);
		s.setBpwd(bpwd);
		s.setBmnum(bmnum);
		
		ShoppingServiceInterface ssi=new ShoppingService();
		int i=ssi.createBAccount(s);
		
		if(i==1) {
			System.out.println("Account created");
		}
		else {
			System.out.println("Not created");
		}
		
		
		
		
		

	}

	public void loginBAccount() {
		// TODO Auto-generated method stub
		System.out.println("Enter mail to login");
		String bmail=scan.next();
		System.out.println("Enter password");
		String pwd=scan.next();
		
		BShopping s=new BShopping();
		s.setBmail(bmail);
		s.setBpwd(pwd);
		ShoppingItems si=new ShoppingItems();

		ShoppingServiceInterface ssi=new ShoppingService();
		int i=ssi.loginAccout(s);
		if(i==1) {
			System.out.println("buyer login succesfull");
			System.out.println("What function you want to perform");
			System.out.println("Select 1 to view all items");
			System.out.println("Select 2 set ratings to item");
			System.out.println("Select 3 to sort items");
			int blo=scan.nextInt();
			switch(blo) {
			case 1:
				List<ShoppingItems> ll=ssi.viewAllItems();
				for(ShoppingItems li:ll) {
					System.out.println(li);
					
				}
				break;
			case 2:
				System.out.println("Enter the name of the item you want to rate");
				String in=scan.next();
				System.out.println("How much do you want to rate");
				float ra=scan.nextFloat();
				si.setIname(in);
				si.setRating(ra);
				int i1=ssi.irating(si);
				
				if(i==1) {
					System.out.println("Thanks for your rating");
				}
				else if(i==0) {
					System.out.println("Failed to give rating");
				}
				
				
				
				break;
			case 3:
				
					List<ShoppingItems> li=ssi.sortP();
					for(ShoppingItems l:li) {
						System.out.println(l);
						
					}
				
				
				break;
			default:System.out.println("Invalid login  selection option");
			}
		}
			
		else if(i==0) {
			System.out.println("Incorrect mail and password");
		}

	}

	public void createSAccount() {
		// TODO Auto-generated method stub
		System.out.println("Enter seller's Name");
		String bname=scan.next();
		System.out.println("Enter seller's mail");
		String bmail=scan.next();
		System.out.println("Enter seller's mail password");
		String bpwd=scan.next();
		System.out.println("Enter seller's mobile number");
		int bmnum=scan.nextInt();
		
		SShopping s=new SShopping();
		s.setSname(bname);
		s.setSmail(bmail);
		s.setSpwd(bpwd);
		s.setSmnum(bmnum);
		
		ShoppingServiceInterface ssi=new ShoppingService();
		int i=ssi.createSAccount(s);
		
		if(i==1) {
			System.out.println("Account created");
		}
		else {
			System.out.println("Not created");
		}
		
		

	}

	public void loginSellerAccount() {
		// TODO Auto-generated method stub
		System.out.println("Enter mail to login");
		String bmail=scan.next();
		System.out.println("Enter password");
		String pwd=scan.next();
		
		SShopping s=new SShopping();
		s.setSmail(bmail);
		s.setSpwd(pwd);
		
		ShoppingServiceInterface ssi=new ShoppingService();
		int i=ssi.loginSAccout(s);
		if(i==1) {
			System.out.println("Seller login succesfull");
			System.out.println("What function you want to perform");
			System.out.println("Select 1 to add items into app");
			System.out.println("Select 2 to update item info in app");
			int opt=scan.nextInt();
			ShoppingItems si=new ShoppingItems();
			switch(opt) {
			case 1:
				System.out.println("Enter the item name you want to add in app");
				String iname=scan.next();
				System.out.println("Enter the prize of your item");
				int prize=scan.nextInt();
				System.out.println("Enter the category of item");
				String cat=scan.next();
				
				si.setIname(iname);
				si.setIprize(prize);
				si.setIcat(cat);
				
				int i1=ssi.addItemApp(si);
				if(i==1) {
					
					System.out.println("Item added succesfully");
				}
				else {
					System.out.println("Item not added");
				}
				break;
			case 2:
				System.out.println("Enter name of the item you want to update");
				String i1name=scan.next();
				ShoppingItems s1=new ShoppingItems();
				s1.setIname(i1name);
				System.out.println("What column you want to update");
				System.out.println("Type 1 to update name");
				System.out.println("Type 2 to update price");
				System.out.println("Type 3 to update category");
				int lsuo=scan.nextInt();
				
				switch(lsuo) {
				case 1:
					System.out.println("Enter updated name");
					String upname=scan.next();
					
					s1.setUpName(upname);
					int upn=ssi.upNameItem(s1);
					if(upn==1) {
						System.out.println("Successfully updated");
					}
					else {
						System.out.println("failed to update");
					}
					break;
				case 2:
					System.out.println("Enter updated prize");
					int upp=scan.nextInt();
					s1.setUpPrize(upp);
					int i11=ssi.upPrizeItem(s1);
					if(i11==1) {
						System.out.println("Successfully updated");
					}
					else {
						System.out.println("failed to update");
					}
					break;
				case 3:
					System.out.println("Enter updated category for your product");
					String uppr=scan.next();
					s1.setUpCat(uppr);
					int upc=ssi.upCat(s1);
					if(upc==1) {
						System.out.println("Successfully updated");
					}
					else {
						System.out.println("failed to update category");
					}
					
					default:System.out.println("Invalid seller update option");
				}
				
			}
			
		}
		else if(i==0) {
			System.out.println("Incorrect mail and password");
		}

	}

}
