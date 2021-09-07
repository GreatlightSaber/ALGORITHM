package practice;

import java.util.*;

public class CodingTest27 {

	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		 int results = solution(numbers, target);
		 System.out.println(results);
		
	}
	
	public static int solution(int[] numbers, int target) {
        int answer = 0;
        
        answer = dfs(numbers, target, 0, 0);
        
        return answer;
    }
	
	public static int dfs(int[] numbers, int target, int depth, int number) {
		int result = 0;
		if(depth == numbers.length) {
			if(number == target) {
				return 1;
			} else {
				return 0;
			}
		}
		
		result += dfs(numbers, target, depth +1, number + numbers[depth]);
		result += dfs(numbers, target, depth +1, number - numbers[depth]);
		
		return result;
	}
	
}