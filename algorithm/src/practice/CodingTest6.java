package practice;

import org.junit.jupiter.api.Test;

public class CodingTest6 {
	
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
	}
	
	@Test
	public void test() {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		System.out.println(solution(lottos, win_nums));
	}
	
	public int[] solution(int[] lottos, int[] win_nums) {
		int[][] temp = new int[1][2];
        int[] answer = new int[2];
        
        
        
        int count = 0;
        int zeroCount = 0;
        for(int item1 : lottos) {
        	if(item1 == 0 ) {
        		zeroCount++;
        		continue;
        	}
        	for(int item2 : win_nums) {
        		if(item1 == item2) {
        			count++;
        			break;
        		}
        	}
        }
        
        answer[0] = temp(count + zeroCount);
        answer[1] = temp(count);
        
        return answer;
    }
	
	public int temp(int count) {
		 switch(count) {
	        case 6:
	        	return 1;
	        case 5:
	        	return 2;
	        case 4:
	        	return 3;
	        case 3:
	        	return 4;
	        case 2:
	        	return 5;
        	default:
        		return 6;
	        }
	}
	
}
