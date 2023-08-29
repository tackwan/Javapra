package practice;

public class Practice2 {
	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
				cnt++;
				
			}
		}
		System.out.println("1～10までの偶数は" + sum);
		System.out.println("1～10までの偶数の個数は" + cnt);
	}

}
