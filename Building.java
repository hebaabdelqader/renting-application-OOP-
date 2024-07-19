package traning;

public abstract class Building {
	private String name;
	private int size;
	private String address;
	public Building (String name,int size,String address) {
		this.name=name;
		this.address=address;
		this.size=size;
	}
	public int getSize() {
		return size;
	}
	
	public String getAdress() {
		return address;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void displayDetails();
	
	
	
	
}
