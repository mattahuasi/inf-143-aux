import java.util.LinkedList;
import java.util.Queue;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> c = new LinkedList<Integer>();
		c.add(1);
		c.add(5);
		c.add(6);
		System.out.println("Primer elemento: "+c.peek());
		
		System.out.println("tamanio: "+c.size());
		while(!c.isEmpty())
			System.out.println(c.poll());
		

	}

}
