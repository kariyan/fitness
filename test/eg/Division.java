package eg;

import fit.ColumnFixture;

public class Division extends ColumnFixture {
	
	public float numerator;
	public float denominator;
	
	public float quotient() {
		return numerator / denominator;
	}
}
