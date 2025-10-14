import java.util.*;
public class Main {
	static class Pair implements Comparable<Pair> {
		int first, second;
		Pair(int d, int p) {
			this.first = d;
			this.second = p;
		}
		public int compareTo(Pair other) {
			if (first > other.first)
				return 1;
			if (first == other.first){
				if(second > other.second)return 1;
				if(second == other.second)return 0;
				return -1;
			}
			return -1;
		}
	};
	public static void main(String[] args) {
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		ts.add(11);
//		ts.add(9);
//		ts.add(10);
//		ts.add(1);
//		if(ts.contains(11))System.out.println("SI");
//		else System.out.println("No");
//		ts.remove(1);
//		Iterator<Integer> iter = ts.iterator();
//		while (iter.hasNext())
//			System.out.println(iter.next());
		
		
		
		TreeSet<Pair> ts = new TreeSet<Pair>();
		ts.add(new Pair(1,2));
		ts.add(new Pair(2,2));
		ts.add(new Pair(1,3));
		ts.add(new Pair(3,2));
		
		Iterator<Pair> iter = ts.iterator();
		while (iter.hasNext()){
			Pair ii = iter.next();
			System.out.println(ii.first+ " " +ii.second);
		}
		
	}
}
