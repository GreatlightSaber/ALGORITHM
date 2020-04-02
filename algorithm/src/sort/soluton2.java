package sort;

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
public class soluton2 {
	@Test
	public void test() {
		int[] numbers = {6,10,2};
		//int[] numbers = {3, 30, 34, 5, 9};
		// solution(numbers);
		String temp = "12345";
		System.out.println(temp.substring(1,2));
	}
	public String solution(int[] numbers) {
        String answer = "";
        // 문자열로 변경
        String[] arrStrNumbers = new String[numbers.length];
        for(int i = 0; i < numbers.length ; i++) {
        	arrStrNumbers[i] = Integer.toString(numbers[i]);
        }
        
        // 정렬(선택정렬)
        for(int num1 = 0 ; num1 < arrStrNumbers.length;num1++) {
        	int iMax = num1;
        	for(int num2 = num1 ; num2 < numbers.length ; num2++) {
        		// 앞자리 비교
        		String strNumber = arrStrNumbers[num2];
        		String strMaxNumber = arrStrNumbers[iMax];
        		int strLength = strNumber.length() < strMaxNumber.length() ? strNumber.length() : strMaxNumber.length();
        		for(int num3 = 0 ; num3 < strLength ; num3++) {
        			if(strNumber.substring(beginIndex))
        		}
        		
        	}
        	if(iMax != num1) {
				int temp = numbers[num1];
				numbers[num1] = numbers[iMax];
				numbers[iMax] = temp;
			}
        }
        // 자릿수마다 일일히 비교
        
        
        
        
        
        
        
        
        // 모든 numbers의 첫째 자리 수만 비교하여 내림차순 정렬
        
        // 정렬(버블정렬)
//        for(int num1 = 0; num1 < numbers.length-1 ; num1++) {
//        	for(int num2 = 0; num2 < numbers.length-1 ; num2++) {
//        		double number1 = numbers[num2];
//        		double number2 = numbers[num2+1];
//	          	number1 = number1 / 10 < 1 ? number1 : number1 / 10;
//	          	number2 =number2 / 10 < 1 ? number2 : number2 / 10;
//	          	if(number1 == number2) {
//	          		if(numbers[num2] >= 10 && numbers[num2+1] < 10) {
//	          			int temp = numbers[num2];
//		          		numbers[num2] = numbers[num2+1];
//		          		numbers[num2+1] = temp;
//	          		}
//	          	} else if(number1 < number2) {
//	          		int temp = numbers[num2];
//	          		numbers[num2] = numbers[num2+1];
//	          		numbers[num2+1] = temp;
//	          	}
//        	}
//        }
        // 정렬(선택 정렬)
//        for(int num1 = 0 ; num1 < numbers.length;num1++) {
//        	int iMax = num1;
//        	for(int num2 = num1 ; num2 < numbers.length ; num2++) {
//        		double number1 = numbers[num2];
//        		double number2 = numbers[iMax];
//	          	number1 = number1 / 10 < 1 ? number1 : number1 / 10;
//	          	number2 =number2 / 10 < 1 ? number2 : number2 / 10;
//	          	if(number1 == number2) {
//	          		if(numbers[num2] < 10 && numbers[iMax] >= 10) {
//	          			iMax = num2;
//	          		}
//	          	} else if(number1 > number2) {
//	          		iMax = num2;
//	          	}
//        	}
//        	if(iMax != num1) {
//				int temp = numbers[num1];
//				numbers[num1] = numbers[iMax];
//				numbers[iMax] = temp;
//			}
//        }
        
        // 문자열 변경
//        for(int number : numbers) {
//        	answer += Integer.toString(number);
//        }
        return answer;
    }
}
