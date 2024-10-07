
public class Waiter {
	String id_number;
	String name;
	Table table;
	Customer customer;
	
	public Waiter(String id,String Name,Table table1) {
		id_number=id;
		name=Name;
		table=table1;
	}
	
	public int deals() {
		return table.Number;
	}
    public String Has() {
    	return customer.id;
    }
}
