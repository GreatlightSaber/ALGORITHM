package practice;

import java.util.*;

public class CodingTest13 {
	
	public static void main(String[] args) {
		int[] scoville = {1,1,1,1,1};
		int K = 7;
		
		int result = solution(scoville, K);
		System.out.println(result);
	}
	
	public static int solution(int[] scovilles, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> qScoville = new PriorityQueue<Integer>();
        for(int scoville : scovilles) {
        	qScoville.add(scoville);
        }
        
        while(qScoville.size() > 2) {
        	int standardScoville1 = qScoville.poll();
            int standardScoville2 = qScoville.poll();
        	if(standardScoville1 >= K) {
        		break;
        	} else {
        		qScoville.add(standardScoville1 + (standardScoville2 *2));
        		answer++;
        	}
        }
        
        int tempAnswer = answer;
        for(int scoville : qScoville) {
        	answer = -1;
        	if(scoville >= K) {
        		answer = tempAnswer;
        		break;
        	} 
        }
        
        return answer;
    }
	

	
}