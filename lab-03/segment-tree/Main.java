import java.util.Scanner;
public class Main {
	static int MAXI = 10000;
	static int A[] = new int[MAXI];
	static int Tree[] = new int[MAXI*4];
	
	static int ope(int a, int b){
		return Math.min(a,b);
	} 
	static int neutro(){return 999999;}
	public static void Build(int pos, int low, int high){
		if(low == high){
			Tree[pos] = A[low];
			return;
		}
		int mid = (low+high)/2;
		Build((pos*2)+1, low, mid);
		Build((pos*2)+2, mid+1, high);
		Tree[pos] = ope(Tree[(pos*2)+1], Tree[(pos*2)+2]);
	}
	public static int Query(int pos, int low, int high, int l, int r){
		if(l > high ||  r < low)return neutro();
		if(low >= l && high <= r)return Tree[pos];
		int mid = (low+high)/2;
		int q1 = Query((pos*2)+1,low,mid,l,r);
		int q2 = Query((pos*2)+2,mid+1,high,l,r);
		return ope(q1,q2);
	}
	public static void Update(int pos, int low, int high, int index, int valor){
		if(index < low || index > high)return;
		if(low==high){
			Tree[pos] = A[low] = valor;
			return;
		}
		int mid = (low+high)/2;
		Update((pos*2)+1, low, mid, index, valor);
		Update((pos*2)+2, mid+1, high, index, valor);
		Tree[pos] = ope(Tree[(pos*2)+1], Tree[(pos*2)+2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 4;
		A[0] = -1; A[1] = 2; A[2] = 4; A[3] = 0;
		System.out.println("VectorA: ");
		for(int i = 0; i < n; i++)System.out.print(A[i]+" "); System.out.println();
		Build(0, 0, n-1);
		System.out.println("Tree: ");
		for(int i = 0; i < 7;i++)System.out.print(Tree[i]+" ");System.out.println();
		
		int q = Query(0,0,n-1,1,3);
		System.out.println("Query [1,3]: "+q);
		Update(0, 0, n-1, 0, -10);
		q = Query(0, 0, n-1, 0, 3);
		System.out.println("Query [0,3]: "+q);
	}

}
