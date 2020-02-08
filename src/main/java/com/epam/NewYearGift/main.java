package com.epam.NewYearGift;

import java.util.*;


import com.epam.NewYearGift.Chocolate;
import com.epam.NewYearGift.Sweets;
public class main{
    public static void main(String[] args ){
    	int sweets, chocolates ;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Input total sweets to be provide in the gift");
    	sweets=sc.nextInt();
    	Sweets s[]=new Sweets[sweets];
    	for(int i=0;i<sweets;i++){
    		System.out.println("Enter details of provided sweet "+(i+1)+":");
    		System.out.println("Sweet\'s Name:");
    		String sname=sc.next();
    		System.out.println("Sweet\'s Quantity:");
    		int squantity=sc.nextInt();
    		System.out.println("Price:");
    		int sprice=sc.nextInt();
    		s[i]=new Sweets(sname,squantity,sprice);
    	}
    	System.out.println("Input total chocolates to be provide in the gift:");
    	chocolates=sc.nextInt();
    	Chocolate c[]=new Chocolate[chocolates];
    	for(int i=0;i<chocolates;i++)
    	{
    		System.out.println("Enter details of provided Chocolate "+(i+1)+":");
    		System.out.print("Chocolate\'s Name:");
    		String cname=sc.next();
    		System.out.print("Chocolate\'s Price:");
    		int cprice=sc.nextInt();
    		c[i]=new Chocolate(cname,cprice);
    	}
    	//Object of Gift
    	GiftDriver gift=new GiftDriver(s,c);
    	gift.findWeight();
    	
    	gift.findCandies();
    	gift.sortChocolates();
    }
}