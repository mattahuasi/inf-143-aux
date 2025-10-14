import java.util.Comparator;
import java.util.PriorityQueue;
public class Main {

	public static void main(String[] args) {
//		Comparator<Integer> desc = new Comparator<Integer>() {
//			/*
//			 a < b return  -1
//			 a = b return 0
//			 a > b return 1
//			 */
//				@Override
//				public int compare(Integer a, Integer b) {
//					if(a > b){
//						return -1;
//					} else if(a == b){
//						return 0;
//					} else {
//						return 1;
//					}
//				}
//		};
		//PriorityQueue<Integer> cp = new PriorityQueue<Integer>(1, desc);
		PriorityQueue<Integer> cp = new PriorityQueue<Integer>();
		cp.add(11);
		cp.add(17);
		cp.add(25);
		cp.add(8);
		System.out.println("Sacando elementos de menor a mayor");
		while (!cp.isEmpty()) {
			System.out.println(cp.poll());
		}
		cp.add(11*-1);
		cp.add(17*-1);
		cp.add(25*-1);
		cp.add(8*-1);
		System.out.println("Sacando elementos de  mayor a menor");
		while (!cp.isEmpty()) {
			System.out.println(cp.poll()*-1);
		}

	}
}