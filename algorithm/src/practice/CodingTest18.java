package practice;

import java.util.*;

public class CodingTest18 {
	
	public static void main(String[] args) {
		int brown = 8;
		int yellow = 1;
		int[] results = solution(brown, yellow);
		for(int item : results) {
			System.out.println(item);
		}
	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        PriorityQueue<Integer> temp = new PriorityQueue<Integer>();
        
        int iTotalBlock = brown + yellow;
        for(int i = 1; i < iTotalBlock/2; i++) {
        	if(iTotalBlock % i == 0) {
        		if(i - 2 > 0 && (i-2) * ((iTotalBlock/i) -2) == yellow){
        			answer[0] = iTotalBlock/i;
        			answer[1] = i;
        			break;
        		}
        	}
        }
        
        return answer;
    }

	
}