package codingTest;

import java.util.*;

public class CodingTest24 {

	public static void main(String[] args) {
		int[][] game_board = {
					 {1,1,0,0,1,0}
					,{0,0,1,0,1,0}
					,{0,1,1,0,0,1}
					,{1,1,0,1,1,1}
					,{1,0,0,0,1,0}
					,{0,1,1,1,0,0}};
		int[][] table = {
				 {1,0,0,1,1,0}
				,{1,0,1,0,1,0}
				,{0,1,1,0,1,1}
				,{0,0,1,0,0,0}
				,{1,1,0,1,1,0}
				,{0,1,0,0,0,0}};
		int results = solution(game_board, table);
		System.out.println(results);
		// System.out.println(number.substring(0,1) + number.substring(2,number.length()));
	}
	
	public static int solution(int[][] game_board, int[][] table) {
        int answer = -1;
        return answer;
    }
	
}