package com.epam.NewYearGift;



public class Sweets extends Chocolate{
	  protected int price;
	  protected int quantity;
	  protected String name;
	 
	  public Sweets(String name,int quantity,int price)
	  { super(name,price);
		  
		  this.quantity=quantity;
	  }
	    protected int weight(Sweets sweets[])
	  {
		  int wt=0;
		  for(int i=0;i<sweets.length;i++)
		  {
			  wt+=sweets[i].price;
		  }
		  return wt;
	  }
	}