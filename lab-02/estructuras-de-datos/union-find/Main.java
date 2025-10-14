import java.util.Scanner;
public class Main {
	public static int padre[] = new int[1000];
	public static int root[] = new int[1000];//guarda las raices de las componentes conexas luego de aplicar el metodo
	public static int numVer[] = new int[1000];//almacena el numero de vertices para la nesima raiz
	public static void inic(int n){
		for(int i = 0 ; i <= n ; i++){
			padre[i] = i;  // inicialmente el padre de cada vertice
		}
	}
	//encotrar la raiz del vertice actual x
	public static int find(int x){
		if(padre[x] == x) return x;//Si estoy en la raiz la retorno 
		else return padre[x] = find(padre[x]);//comprencion de caminos
	}
	//para saber si estan o no esta en la misma componente
	public static boolean sameComp(int x, int y){
		if(find(x) == find(y)) return true;//si tienen la misma raiz
		return false;
	}
	//unir dos componentes conexas
	public static void uNion(int x, int y){
		int xRoot = find(x);//obtengo raiz de x
		int yRoot = find(y);//obtengo raiza de y
		padre[xRoot] = yRoot;//mezclo los conjuntos actualizo padre
	}
	//obtener el numero de componentes conexas luego de realizar las conexciones requeridas
	public static int nComp(int n){
		int contComp = 0;
		for(int i = 0; i < n; i++){
			if(padre[i] == i){//si el padre del vertice i el mismo vertice entonces es raiz 
				root[contComp++] = i;
			}
		}
		return contComp;
	}
	//obtener  el numero de vertices en cada componente conexa
	//sera necesario primero tener la cantidad de componentes conxas
	public static void nVertices(int n, int nComp){
		for(int i = 0; i < numVer.length; i++)numVer[i] = 0;
		for(int i = 0; i < n; i++){
			numVer[find(i)]++;//incremento la raiza del vertice i
		}
		for(int i = 0; i < nComp; i++){
			System.out.printf("Componente %d: Raiz = %d , Nro nodos = %d\n" , i + 1 , root[ i ] , numVer[ root[ i ] ] );
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		inic(10);
		uNion(9, 1);
		int bus = 9;
		int v = find(bus);
		System.out.println("EL num: "+bus+" Pertence: "+v);
//		if(sameComp(9, 5))System.out.println("SI");
//		else System.out.println("No");
		
		int ncom = nComp(10);
		System.out.println(ncom);
		nVertices(10, ncom);
	}

}
