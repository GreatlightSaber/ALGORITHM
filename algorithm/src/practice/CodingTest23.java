package codingTest;

import java.util.*;

public class CodingTest23 {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		long results = solution(price, money, count);
		System.out.println(results);
		// System.out.println(number.substring(0,1) + number.substring(2,number.length()));
	}
	
	public static long solution(int price, int money, int count) {
        long sum = 0;
        for(int i = 1; i <= count ; i++) {
        	sum += price * i;
        }
        return sum - money > 0 ? sum - money : 0;
    }
	
}