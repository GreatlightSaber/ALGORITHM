package practice;

import org.junit.jupiter.api.Test;

public class CodingTest4 {
	@Test
	public void test() {
		int[] numbers = {10, 40, 30, 20};
		int K = 20;
		System.out.println(solution(numbers,K));
	}
	 public int solution(int[] numbers, int K) {
        int answer = 0;
/*        boolean result = false;
        while(!result) {
        	for(int i = 0 ; i < numbers.length-1 ; i++) {
        		if(Math.abs(numbers[i] - numbers[i+1]) > K) {
        			for(int j = 1; j < numbers.length-1; j++) {
        				if(Math.abs(numbers[i] - numbers[j-1]) <= K && Math.abs(numbers[i] - numbers[j+1]) <= K && (j != i+1 || j != i-1)) {
        					int iTemp = numbers[i];
        					numbers[i] = numbers[j];
        					numbers[j] = iTemp;
        					answer++;
        					break;
        				}
        			}
        		}else {
        			result = true;
        		}
        		if(i == numbers.length-2 && answer == 0) {
        			return -1;
        		}
	        }
        }*/
        
//        boolean result = false;
//        while(!result) {
//        	for(int i =1; i<numbers.length-1; i++) {
//        		if(Math.abs(numbers[i-1] - numbers[i]) > K || numbers[i] - numbers[i+1] > K) {
//        			for(int j = 0; k<numbers.length-1; j++) {
//        				if(j != i-1 && j != i && j != i+1) {
//        					
//        				}
//        			}
//        		}
//        	}
//        }
        
        return answer;
    }
}
