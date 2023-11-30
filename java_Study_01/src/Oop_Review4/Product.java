package Oop_Review4;

public interface Product {
	// 인터페이스에 블록을 만들지 말고 굳이 만들 것 이면 디폴트를 만들어 줘야한다
	double getPrice(double discountPercet);

	void applyDiscount(double discountPercent);

}
