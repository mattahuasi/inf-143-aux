import java.util.*;
public class Main {
	public static void main(String[] args) {
		Map<String, String> preferencias = new HashMap<String, String>();
		preferencias.put("color", "rojo");
		preferencias.put("ancho", "640");
		preferencias.put("alto", "480");

		// listar todoe el mapa con key and value
		System.out.println(preferencias);
		
		// Quitar color por medio de la llave color
		preferencias.remove("color");
		System.out.println(preferencias);
		
		// cambiar una entrada por la llave ancho
		preferencias.put("ancho", "1024");
		System.out.println(preferencias);
		
		// recuperar un valor
		System.out.println("Alto = " + preferencias.get("alto"));
		
		// iterar por todos los elementos
		System.out.println("iterar por todos los elementos");
		for (Map.Entry<String, String> datos : preferencias.entrySet()) {
			String clave = datos.getKey();
			String valor = datos.getValue();
			System.out.println("clave=" + clave + ", valor=" + valor);
		}
		//mostrar datos por clave
		System.out.println("Datos por clave");
		Iterator<String> iter = preferencias.keySet().iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	
		// mostrar datos por llave
		System.out.println("Datos por llave");
		Iterator<String> iter2 = preferencias.values().iterator();
		while (iter2.hasNext())
			System.out.println(iter2.next());		
		
		//mostrar datos por llave modo 2
		
		System.out.println("datos por llave modo 2");
		for(String x : preferencias.keySet())
			System.out.println(preferencias.get(x));
		
	}
}