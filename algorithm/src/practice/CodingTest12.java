package practice;

import java.util.*;

public class CodingTest12 {
	
	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		int[] results = solution(prices);
		for(int result : results) {
			System.out.println(result);
		}
	}
	
	public static int[] solution(int[] prices) {
        Queue<Integer> resultQueue = new LinkedList<Integer>();
        
        Queue<Integer> arrListPrices = new LinkedList<Integer>();
        for(int price: prices) {
        	arrListPrices.add(price);
        }
        
        while(!arrListPrices.isEmpty()) {
        	int standardPrice = arrListPrices.poll();
        	int overCnt = 0;
        	for(int price: arrListPrices) {
        		overCnt++;
        		if(standardPrice > price) {
        			break;
        		}
        	}
        	resultQueue.add(overCnt);
        }
        
        int[] answer = new int[resultQueue.size()];
        int size = 0;
        for(int result: resultQueue) {
        	answer[size++] = result;
        }
        
        return answer;
    }
	

	
}