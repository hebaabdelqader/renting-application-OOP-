package traning;

public class Contracts {
    private Customer customer;
    private Building building;
    private String rentalPeriod;
    private double price;
    public Contracts(Customer customer, Building building, String rentalPeriod, double price) {
        this.customer = customer;
        this.building = building;
        this.rentalPeriod = rentalPeriod;
        this.price = price;
    }
    public void displayContractDetails() {
        System.out.println("Contract Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Building: " + building.getName() + ", Address: " + building.getAdress());
        System.out.println("Rental Period: " + rentalPeriod);
        System.out.println("Price: " + price);
    }
}
