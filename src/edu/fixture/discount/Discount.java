package edu.fixture.discount;

public class Discount {

	public double getDiscount(double amount) {
		
		if (amount < 0) {
			throw new RuntimeException("Can't be a negative amount.");
		}
		
		if (amount < 1000) {
			return amount;
			
		} else {
			return amount * 0.99;
		}
	}
}
