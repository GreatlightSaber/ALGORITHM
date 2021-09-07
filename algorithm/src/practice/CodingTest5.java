package practice;

import org.junit.jupiter.api.Test;

public class CodingTest5 {
	
	public static void main(String[] args) {
		int rows = 6;
		int columns = 6;
		int [][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		solution(rows, columns, queries);
	}
	
	
	public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] table = new int[rows][columns];
        
        // 1.숫자가 채워진 정사각형 생성
        int index = 1;
        for(int i1 = 0 ; i1 < rows ; i1++) {
        	for(int i2 = 0 ; i2 < columns ; i2++) {
        		table[i1][i2] = index; 
        		index++;
        	}
        }
        
        // 2.직사각형 범위 지정
        
        int resultIndex = 0;
        for(int[] query : queries) {
        	int minVal = rows * columns;
        	int row =  query[2] - query[0];
        	int column = query[3] - query[1];
        	int temp1 = 0;
        	int temp2 = 0;
        	
        	// 2.1 위 가로 ->
        	temp1 = table[query[0] - 1][query[1] - 1];
        	for(int i = 0; i < column ; i++) {
        		if(minVal > temp1){
        			minVal = temp1;
        		}
        		temp2 = table[query[0]-1][query[1] + (i)];
        		table[query[0]-1][query[1] + (i)] = temp1;
        		temp1 = temp2;
        	}
        	
        	// 2.2 오른쪽 세로(밑)
        	for(int i = 0; i < row; i++) {
        		if(minVal > temp1){
        			minVal = temp1;
        		}
        		temp2 = table[query[0] + (i)][query[3] - 1];
        		table[query[0] + (i)][query[3] - 1] = temp1;
        		temp1 = temp2;
        	}
        	
        	// 2.3 아래 가로 <-
        	for(int i = 0; i < column ; i++) {
        		if(minVal > temp1){
        			minVal = temp1;
        		}
        		temp2 = table[query[2]-1][query[3] - (i + 2)];
        		table[query[2]-1][query[3] - (i + 2)] = temp1;
        		temp1 = temp2;
        	}
        	
        	// 2.4 외쪽 세로(위)
        	for(int i = 0; i < row ; i++) {
        		if(minVal > temp1){
        			minVal = temp1;
        		}
        		temp2 = table[query[2] - (i + 2)][query[1] - 1];
        		table[query[2] - (i + 2)][query[1] - 1] = temp1;
        		temp1 = temp2;
        	}
    		if(minVal > temp1){
    			minVal = temp1;
    		}
    		answer[resultIndex] = minVal;
    		resultIndex++;
        }
        
        return answer;
    }
	
}
