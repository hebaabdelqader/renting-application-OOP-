package traning;

public class teat {

	public static void main(String[] args) {
		Building aprtment1 = new Apartment("ali appartment",4,"Tulkerm",1);
		aprtment1.displayDetails();
		
		Customer ali = new Customer("ali");
		
		Contracts contracts1 = new Contracts(ali,aprtment1,"2 months",400);
		contracts1.displayContractDetails();
		
		
		Payment paypal = new PayPalPayment("ali palpay");
		paypal.pay(400);
		
		
		ali.addContract(contracts1);
	}

}
