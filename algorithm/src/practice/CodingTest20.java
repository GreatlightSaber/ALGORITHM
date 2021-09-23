package codingTest;

import java.util.*;

public class CodingTest20 {
	
	public static void main(String[] args) {
		String number = "0000";
		int k = 2;
		String results = solution(number, k);
		System.out.println(results);
		// System.out.println(number.substring(0,1) + number.substring(2,number.length()));
	}
	
	public static String solution(String number, int k) {
        String answer = "";
        int resultLength = number.length() - k;
        
        	for(int i = 9; i >= 0; i--) {
            	if(number.contains(Integer.toString(i))) {
            		int maxNumberIndex = number.indexOf(Integer.toString(i)) ;
            		if(k >= maxNumberIndex) {
            			number = number.substring(maxNumberIndex + 1,number.length() );
            			k -= maxNumberIndex;
            			answer += Integer.toString(i);
            			i = 10;
            		} else {
            			continue;
            		}
            		if(answer.length() >= resultLength) {
            			break;
            		}
            		if(k <= 0) {
            			answer += number;
            			break;
            		}
            	} else {
            		continue;
            	}
            }
        
        return answer;
    }

	
}