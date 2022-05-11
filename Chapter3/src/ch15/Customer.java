package ch15;

public class Customer implements Buy,Sell {

	@Override
	public void sell() {
		System.out.println("Customer Sell");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer Buy");
		
	}

	@Override
	public void order() {
		System.out.println("Customer order");
	}

	public void hello() {
		System.out.println("Customer Hello");
	}
	
}
