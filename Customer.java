package traning;
import java.util.*;
public class Customer {
	
	private String name;
	private List<Contracts> contracts;
	public Customer(String name) {
		this.name=name;
		this.contracts=new ArrayList<>();
	}
	public String getName() {
	        return name;
	    }
	public List<Contracts> getContracts() {
	        return contracts;
	    }
	public void addContract(Contracts contract) {
	        contracts.add(contract);
	    }

}
