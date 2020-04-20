package sort;

import org.junit.jupiter.api.Test;

/**
 * k번째지수
 * 
 * - 문제설명
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 * 	1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다. 
 * 	2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다. 
 * 	3. 2에서 나온 배열의 3번째 숫자는 5입니다.
 * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *  
 * - 제한사항
 * array의 길이는 1 이상 100 이하입니다.
 * array의 각 원소는 1 이상 100 이하입니다. 
 * commands의 길이는 1 이상 50 이하입니다. 
 * commands의 각 원소는 길이가 3입니다. 
 * 
 * */
public class solution1 {
	@Test
	public void test() {
//		int[] array = {1,5,2,6,3,7,4};
//		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] array = {5,6,13,5,7,9,4,5,15};
		int[][] commands = {{3,6,2},{1,7,5},{4,6,1},{5,9,2}};
		solution(array, commands);
	}
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // commands 만큼반복문 시작
        for(int num1 = 0 ; num1 < commands.length ; num1++) {
        	int[] command = commands[num1];
        	int i = command[0] - 1;
        	int j = command[1] - 1;
        	int k = command[2] - 1;
        	int[] arrTemp = new int[j - i + 1];
            // 배열 자르기
        	for(int num2 = 0 ; i <= j ; num2++) {
        		arrTemp[num2] = array[i];
        		i++;
        	}
        	// 정렬 (선택정렬)
        	for(int num3 = 0 ; num3 < arrTemp.length ; num3++) {
        		int iMin = num3;
        		for(int num4 = num3; num4 < arrTemp.length ; num4++) {
        			if(arrTemp[num4] < arrTemp[iMin]) {
        				iMin = num4;
        			}
        		}
        		if(iMin != num3) {
    				int temp = arrTemp[num3];
    				arrTemp[num3] = arrTemp[iMin];
    				arrTemp[iMin] = temp;
    			}
        	}
        	
            // 툭정 순서의 배열 요소 가져오기
        	answer[num1] = arrTemp[k];
        }
        System.out.println(answer);
        return answer;
        
    }
}
