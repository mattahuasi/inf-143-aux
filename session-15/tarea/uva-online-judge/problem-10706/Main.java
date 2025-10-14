package Problem10706;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		if (1 <= t && t <= 25) {
			while (t-- > 0) {
				long i = in.nextLong();
				if (1 <= i && i <= 2147483647) {
					long s = 0, c = 0, ct = 1;
					while (i >= ct) {
						if (s < c) {
							s += 1;
						} else {
							c += 1;
							s = 1;
						}
						if (s <= 9)
							ct += 1;
						else
							ct = ct + s + "".length();
					}
					System.out.println(s % 10);
				}
			}
		}
	}
}
