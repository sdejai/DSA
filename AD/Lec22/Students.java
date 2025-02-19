package LinkedList;

public class Students {
	private int rollNum;
	private String name;
	
	public Students(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
	}
	public static void main(String[] args) {
		Students obj = new Students(1,"ABHAY");
		System.out.println(obj);
	}
	@Override
	public String toString() {
		return rollNum+"  "+ name;
	}
	
}
