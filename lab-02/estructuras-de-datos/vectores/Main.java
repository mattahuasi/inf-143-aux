import java.util.Vector;

public class Main {
	private static final String letras[] = { "a", "b", "c", "d","e", "f" };
	public static void main(String args[]) {
		Vector<String> vector = new Vector<String>();
		System.out.println(vector);
		System.out.printf("\nTamanio: %d\nCapacidad: %d\n",vector.size(), vector.capacity());
		for (String s : letras) vector.add(s);
		
		System.out.println(vector);
		System.out.printf("\nTamanio: %d\nCapacidad: %d\n",vector.size(), vector.capacity());
		
		for (String s : letras) vector.add(s);
		
		System.out.println(vector);
		System.out.printf("\nTamanio: %d\nCapacidad: %d\n",vector.size(), vector.capacity());
		
		
		vector.add(2, "HOLA");
		System.out.println(vector);
		if(vector.contains("OLA"))System.out.println("SI");
		else System.out.println("NO");
		
        System.out.println("----------------");	
		vector.set(0, "CARLOS");
		vector.remove(0);
		for(int i = 0; i < vector.size(); i++)
			System.out.println(vector.get(i));
		
	}
}
