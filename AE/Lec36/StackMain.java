package Stack;

public class StackMain {

	public static void main(String[] args) throws Exception {
		Stack st = new Stack();
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(11);
		st.push(12);
//		st.push(13);
//		st.push(14);
//		st.push(15);
//		System.out.println(st.isEmpty());
//	    st.display();
//	    System.out.println(st.pop());
//	    st.display();
//	    System.out.println(st.pop());
//	    System.out.println(st.pop());
//	    System.out.println(st.pop());
		System.out.println(st.isFull());
		System.out.println(st.peek());
	}

}
