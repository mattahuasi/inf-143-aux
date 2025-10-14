package Problem11503;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static int padre[] = new int[200500];
	public static int numVer[] = new int[200500];

	public static void inic(int n) {
		for (int i = 0; i < n; i++) {
			padre[i] = i;
		}
	}

	public static int find(int x) {
		if (padre[x] == x)
			return x;
		else
			return padre[x] = find(padre[x]);
	}

	public static void uNion(int x, int y) {
		int xRooth = find(x);
		int yRooth = find(y);
		padre[xRooth] = yRooth;
	}

	public static boolean sameSet(int x, int y) {
		if (find(x) == find(y))
			return true;
		else
			return false;
	}

	public static int contVer(int x, int y) {
		int xRooth = find(x);
		int yRooth = find(y);
		int nvx = numVer[xRooth];
		numVer[yRooth] += nvx;
		return numVer[yRooth];
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(), n, nod;
		String u, v;
		TreeMap<String, Integer> map = new TreeMap<>();
		String lista[][] = new String[2][100500];
		while (t-- > 0) {
			n = in.nextInt();
			map.clear();
			nod = 0;
			for (int i = 0; i < n; i++) {
				u = in.next();
				v = in.next();
				lista[0][i] = u;
				lista[1][i] = v;
				if (!map.containsKey(u)) {
					map.put(u, nod++);
				}
				if (!map.containsKey(v)) {
					map.put(v, nod++);
				}
			}
			inic(map.size());
			int sol;
			for (int i = 0; i < map.size(); i++)
				numVer[i] = 1;
			for (int i = 0; i < n; i++) {
				u = lista[0][i];
				v = lista[1][i];
				if (!sameSet(map.get(u), map.get(v))) {
					sol = contVer(map.get(u), map.get(v));
				} else {
					int ry = find(map.get(u));
					sol = numVer[ry];
				}
				System.out.println(sol);
			}
		}
	}
}
