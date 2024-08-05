package com.Shopping.view;

import java.util.Scanner;

import com.Shopping.controller.ShoppingConntroller;
import com.Shopping.controller.ShoppingControllerInterface;

public class ShoopingView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to shopping");
		System.out.println("Are you a buyer or seller");
		System.out.println("Select 1 for buyer and 2 for seller");
		int opt=scan.nextInt();
		ShoppingControllerInterface sci=new ShoppingConntroller();
		if(opt==1) {
			System.out.println("Type 1 to create buyer account");
			System.out.println("Type 2 to login buyer account");
			int bopt=scan.nextInt();
			if(bopt==1) {
				sci.createBAccount();
			}
			else if(bopt==2) {
				sci.loginBAccount();
				
			}
		}
		else if(opt==2) {
			System.out.println("Type 1 to create seller account");
			System.out.println("Type 2 to login seller account");
			int sopt=scan.nextInt();
			if(sopt==1) {
				sci.createSAccount();
			}
			else if(sopt==2) {
				sci.loginSellerAccount();
			}
		}
	

	}

}
