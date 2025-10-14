import java.util.Stack;
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
		// TODO Auto-generated method stub
		// definir una pila de alumnos

//		Stack<Alumno> pila = new Stack<Alumno>();
//		//  crear y almacenar los alumnos
//		Alumno alm = new Alumno("carlos", 21);
//		pila.push(alm);
//		alm = new Alumno("adrian", 24);
//		pila.push(alm);
//		
//		// Recuperar el elemento de encima
//		System.out.println("ultimo elemento de la pila--> "+pila.peek().verCodigo());
//		
//		// Imprimir la pila al imprimir se queda vacia la pila
//		while (!pila.isEmpty())
//			System.out.println(pila.pop().verNombre());
//		
//		if(pila.isEmpty()){
//			System.out.println("pila vacia");
//		}else{
//			System.out.println("Pila llena");
//		}
//		
		
		Stack<Integer> p = new Stack<Integer>();
		p.push(1);
		p.push(5);
		p.push(0);
		p.push(9);
		System.out.println("Elemento del tope: "+p.pop());
		while (!p.isEmpty())
			System.out.println(p.pop());
		
		
		
		
		
		
		
		
		
		

	}

}
