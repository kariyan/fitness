package edu.fixture.buyaction;

import fit.ActionFixture;

public class BuyActions extends ActionFixture {

	public int sum;
	public int itemPrice;
	
	public int total() {
		return sum;
	}
	
	public void price(int value) {
		itemPrice = value;
	}
	
	public void buy() {
		sum += itemPrice;
		itemPrice = 0;
	}
}
