import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> conjA = new HashSet<String>();
		conjA.add("aaa");
		conjA.add("bbb");
		conjA.add("aaa");
		conjA.add("ccc");
		conjA.add("ddd");
		
		//el iterator para mostrar los elementos se crea antes del while
		Iterator<String> iter = conjA.iterator();
		System.out.println("Elementos del conjunto A");
		while (iter.hasNext())
			System.out.println(iter.next());
		
		Set<String> conjB = new HashSet<String>();
		conjB.add("aaa");
		conjB.add("bbb");
		conjB.add("bbb");
		conjB.add("xxx");
		conjB.add("yyy");
		
		Iterator<String> iterB = conjB.iterator();
		System.out.println("Elementos del conjunto B");
		while(iterB.hasNext())
			System.out.println(iterB.next());
		
		// hallar conjB interseccion conjA
		Set<String> conjC = new HashSet<String>();
		conjC.addAll(conjA);
		
		Iterator<String> iterC = conjC.iterator();
		System.out.println("Elementos del conjunto C");
		while(iterC.hasNext())
			System.out.println(iterC.next());
		
		// para intersectar A y B
		// hacemos C=A-B y luego A-C
		conjC.removeAll(conjB);
		iterC = conjC.iterator();
		System.out.println("Elementos del conjunto C quitando los que existen en B");
		while(iterC.hasNext())
			System.out.println(iterC.next());
		
		conjA.removeAll(conjC);
		System.out.println("interseccion de elementos de los dos conjuntos");
		// listar
		iter = conjA.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());

	}

}
