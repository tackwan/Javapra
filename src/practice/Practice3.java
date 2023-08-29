package practice;

public class Practice3 {
	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
				if (number[i] != 10)
			System.out.print(",");
		}
	}

}
