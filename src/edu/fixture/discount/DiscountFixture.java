package edu.fixture.discount;

import fit.ColumnFixture;

public class DiscountFixture extends ColumnFixture {
	public double amount;
	public String desc;
	public Discount application;

	public DiscountFixture() {
		this.application = new Discount();
	}
	
	public double discount() {
		
		double result = application.getDiscount(amount);
		System.out.println("result : " + result);
		return result;
	}
}
