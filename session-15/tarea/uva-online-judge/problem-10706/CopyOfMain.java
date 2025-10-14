package Problem10706;

public class CopyOfMain {
	public static void main(String[] args) {
		// long i = 546454;
		// StringBuffer s = new StringBuffer();
		// long n = 0, c = 0, ct = 0;
		// while (ct < i) {
		// if (n < c) {
		// n += 1;
		// } else {
		// c += 1;
		// n = 1;
		// }
		// ct = (long) (ct + (Math.log10(n) + 1));
		// s.append(n);
		// }
		// System.out.println(ct);
		// System.out.println(s.charAt((int) i - 1));

		// long n = 8;
		// StringBuffer s = new StringBuffer();
		//
		// for (int i = 1; i <= n; i++) {
		// for (int j = 1; j <= i; j++) {
		// s.append(j);
		// }
		// }
		int i = 8;
		System.out.println(Formula(1, 1, -(2 * (i))));
	}

	public static long Formula(long a, long b, long c) {
		long x1 = 0, x2 = 0;
		long raiz = (long) Math.sqrt((Math.pow(b, 2) - (4 * a * c)));
		System.out.println(raiz);
		x1 = (-(b) + raiz) / 2 * a;
		x2 = (-(b) - raiz) / 2 * a;
		System.out.println(x1);
		System.out.println(x2);
		if (x1 >= 0)
			return (int) x1;
		else
			return (int) x2;
	}
}
