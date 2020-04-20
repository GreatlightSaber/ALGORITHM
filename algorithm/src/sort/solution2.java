package sort;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

/**
 * k번째지수
 * 
 * - 문제설명
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수 를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 *  
 * - 제한사항
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * commands의 길이는 1 이상 50 이하입니다. 
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 * 
 * */
public class solution2 {
	@Test
	public void test() {
		//int[] numbers = {6,10,2};
		int[] numbers = {3, 30, 34, 5, 9};
		solution(numbers);
	}
	public String solution(int[] numbers) {
        String answer = "";
        
        // 정렬(버블정렬)
//        for(int num1 = numbers.length-1; num1 > 0 ; num1--) {
//        	for(int num2 = 0; num2 < num1 ; num2++) {
//        		String strNumber1 = Integer.toString(numbers[num2]);
//        		String strNumber2 = Integer.toString(numbers[num2+1]);
//        		if((strNumber1 + strNumber2).compareTo(strNumber2 + strNumber1) < 0) {
//        			int temp = numbers[num2];
//        			numbers[num2] = numbers[num2+1];
//        			numbers[num2+1] = temp;
//        		}
//        	}
//        }
        Integer[] arrays = new Integer[numbers.length];
        for(int i = 0; i< numbers.length ; i++) {
        	arrays[i] = numbers[i];
        }
        
        Arrays.sort(arrays, new Comparator<Integer>() {
        	@Override
        	public int compare(Integer o1, Integer o2) {
        		 String tmp1 = o1.toString();
                 String tmp2 = o2.toString();
                 return ((tmp2+tmp1)).compareTo(tmp1+tmp2);
        	}
		});
        
        // 문자열 변경
        for(Integer number : arrays) {
        	answer += Integer.toString(number);
        }
        if("0".equals(answer.substring(0, 1)))
            return "0";
        
        
        return answer;
    }
}
