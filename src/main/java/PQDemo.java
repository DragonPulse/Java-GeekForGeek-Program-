import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQDemo {
	static IdComparator idComparator= new IdComparator();
	
	static Queue<Customer> q = new PriorityQueue<Customer>(5,idComparator);
	
	public static void main(String args[]) {
		
		for(int i =0;i<5;i++) {
			q.add(new Customer(i, "Vijay"+i));
		}
		
		
		
		display();
		
	}
	
	public static void display() {
		for (Customer customer : q) {
			System.out.println(customer);
		}
	}
	
	
	
	static class Customer {
		
		public Customer(Integer id, String name) {
			this.id = id;
			this.name = name;
		}
		private Integer id;
		private String name;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + "]";
		}
		
		
	}
	
	static class IdComparator implements Comparator<Customer>{

		@Override
		public int compare(Customer o1, Customer o2) {
			// TODO Auto-generated method stub
			return o1.getId().compareTo(o2.getId());
		}
		
	}
}
