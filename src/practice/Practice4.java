package practice;

public class Practice4 {
	public static void main(String[] args) {
		int x[] = new int[20];
		String str = "";
		x[0] = 0;
		for (int i = 1; i < 20; i++) {
		x[i] = x[i - 1] + 5;
		}
		System.out.print("\n奇数 : ");
		for (int i = 0; i < 11; i++) {
		if (x[i] % 2 != 0) {
		str += String.valueOf(x[i]) + ",";
		}
		}
		System.out.print(str.substring(0, str.length() - 1));
		System.out.print("\n偶数 : ");
		str = "";
		for (int i = 11; i < 20; i++) {
		if (x[i] % 2 == 0) {
		str += String.valueOf(x[i]) + ",";
		}
		}
		System.out.print(str.substring(0, str.length() - 1));
		System.out.print("\n");
		}

}
