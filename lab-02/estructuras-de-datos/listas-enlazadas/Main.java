import java.util.*;
public class Main {
	static class Alumno {
		String nombre;
		int codigo;
		public Alumno(String nombre, int codigo) {
			this.nombre = nombre;
			this.codigo = codigo;
		}
		public String verNombre() {
			return nombre;
		}
		public int verCodigo() {
			return codigo;
		}
	}
	public static void main(String[] args) {
		Alumno alm;
		LinkedList<Alumno> uno = new LinkedList<Alumno>();
		uno.add(new Alumno("Juan", 11));
		uno.add(new Alumno("Maria", 17));
		
		//creacion de in iterator para vicitar los elementos de la lista
		ListIterator<Alumno> aIter = uno.listIterator();
		// desplegar la lista uno
		System.out.println("Lista UNO");
		while (aIter.hasNext()) {
			alm = aIter.next();
			System.out.println(alm.verNombre());
		}
		
		List<Alumno> dos = new LinkedList<Alumno>();
		dos.add(new Alumno("Jose", 25));
		dos.add(new Alumno("Laura", 8));
		ListIterator<Alumno> bIter = dos.listIterator();
		//desplegar la lista dos
		System.out.println("Lista DOS");
		while(bIter.hasNext()){
			alm = bIter.next();
			System.out.println(alm.verNombre());
		}
		// reiniciamos el iterator y agregar los alumnos de lista dos a la lista uno
		bIter = dos.listIterator();
		while (bIter.hasNext()) {
			uno.add(bIter.next());
		}
		// Reiniciar el iterador y listar la lista uno
		System.out.println("Lista Uno Despues de agregar la lista DOS");
		aIter = uno.listIterator();
		while (aIter.hasNext()) {
			alm = aIter.next();
			System.out.println(alm.verNombre());
		}
		// quitar los elementos de la lista dos de uno
		uno.removeAll(dos);
		System.out.println("Listar despues de quitar la lista DOS");
		// Reiniciar el iterador y listar la lista uno
		aIter = uno.listIterator();
		while (aIter.hasNext()) {
			System.out.println(aIter.next().verNombre());
		}
	}
}