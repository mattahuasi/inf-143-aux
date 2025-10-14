import java.util.ArrayList;
public class Main {
	public static void main(String args[]) {
		ArrayList<Integer> v = new ArrayList<Integer>(5);
		for (int i = 0; i < 10; i++) {
			v.add(i*10);
		}
		if(v.contains(88))System.out.println("SI");
		else System.out.println("NO");
		// imprimir los elementos
		System.out.println(v);
		// imprimir el elemento 5
		System.out.println(v.get(5));
		// cambiar el elmento 3 por 100
		v.set(3, 100);
		// Eliminar el elmento 5
		v.remove(5);
		v.add(2, 99);
		// imprimir el tama~no
		System.out.println(v.size());
		// recorrer la lista
		for (int i = 0; i < v.size(); i++) {
			System.out.println("Elemento " + i + "=" + v.get(i) + " ");
		}
	}
}