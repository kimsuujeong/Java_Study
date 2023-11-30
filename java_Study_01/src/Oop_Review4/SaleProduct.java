package Oop_Review4;

public class SaleProduct implements Product, Discounttable {
	
	private String name;
	private double price;
	private double discountedPrcice;
	@Override
	public void applyDiscount(double discountPercent) {
		// TODO Auto-generated method stub
		double discountAmount = price * (discountPercent / 100);
		discountedPrcice = price - discountAmount;
		
	}
	@Override
	public double getPrice(double discountPercet) {
		// TODO Auto-generated method stub
		return 0;
	}

}
