package com.foodapp;

public class Menu {
	private int id;
	private String  vegDishes;
	private int vegDishesPrice;
	private String nonVegDishes;
	private int nonVegDishesPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVegDishes() {
		return vegDishes;
	}
	public void setVegDishes(String vegDishes) {
		this.vegDishes = vegDishes;
	}
	public int getVegDishesPrice() {
		return vegDishesPrice;
	}
	public void setVegDishesPrice(int vegDishesPrice) {
		this.vegDishesPrice = vegDishesPrice;
	}
	public String getNonVegDishes() {
		return nonVegDishes;
	}
	public void setNonVegDishes(String nonVegDishes) {
		this.nonVegDishes = nonVegDishes;
	}
	public int getNonVegDishesPrice() {
		return nonVegDishesPrice;
	}
	public void setNonVegDishesPrice(int nonVegDishesPrice) {
		this.nonVegDishesPrice = nonVegDishesPrice;
	}
	@Override
	public String toString() {
		return  id + "\t\t" + vegDishes +"\t\t\t"+ vegDishesPrice + "\t\t\t"
				+ nonVegDishes + "\t\t\t"+ nonVegDishesPrice ;
	}
	
	public String vegDish(int id,String vegDish,int vegDishPrice) {
		return id + "\t\t" + vegDishes +"\t\t\t"+ vegDishesPrice;
		
	}
}
