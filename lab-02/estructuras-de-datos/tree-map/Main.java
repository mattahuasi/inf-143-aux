import java.util.Map;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
//		tm.put(10, "diez");
//		tm.put(4, "cuatro");
//		tm.put(10, "hola");
//		tm.put(0, "hola");
//		
//		for (Map.Entry<Integer, String> datos : tm.entrySet()) {
//			Integer clave = datos.getKey();
//			String valor = datos.getValue();
//			System.out.println("Llave=" + clave + ", valor=" + valor);
//		}
//		if(tm.containsKey(11))System.out.println("SI");
//		else System.out.println("NO");
//		
//		
		Map<Integer,Integer> m = new TreeMap<Integer, Integer>();
		int v[] ={1,3,5,5,3,6,4,5,2,3};
		for(int i = 0; i < v.length; i++){
			if(m.containsKey(v[i])){
				int c = m.get(v[i]);
				c++;
				m.put(v[i],c);
			}else{
				m.put(v[i], 1);
			}	
		}
		for (Map.Entry<Integer, Integer> datos : m.entrySet()) {
			Integer clave = datos.getKey();
			Integer valor = datos.getValue();
			System.out.println("Llave=" + clave + ", valor=" + valor);
		}
	}

}
