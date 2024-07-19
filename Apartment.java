package traning;

public class Apartment extends Building{
	 private int floorNumber;
	public Apartment(String name,int size,String address,int floorNumber) {
	super(name,size,address);
	this.floorNumber=floorNumber;
	}
	 public void displayDetails() {
		 System.out.println("Apartment Details:" + this.getName() + ", Address: " + this.getAdress() + ", Size: " + this.getSize() + " Floor Number: " + floorNumber);	 
		 }
	 public int getFloorNumber() {
		 return floorNumber;
	 }

}
