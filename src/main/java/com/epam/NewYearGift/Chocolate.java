package com.epam.NewYearGift;



public class Chocolate{
	  public String name ;
	  public int price;
	  
	  public Chocolate(String name,int price)
	  {
		  this.name=name;
		  this.price=price;
	  }
	   protected int weight(Chocolate chocolates[])
	  {
		  int wt=0;
		  int n = chocolates.length;
		  for(int i=0;i<n;i++)
		  {
			  wt+=(chocolates[i].price);
		  }
		  return wt;
	  }
	}