
public class test4 {

	public static void main(String[] args) {
		int[][] param1 = {{1,2},{2,3}};
		int[][] param2 = {{3,4},{5,6}};
		int[][] result = solution(param1,param2);
		
		System.out.println(result);
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1.length];
        // 무조건 길이가 같은 2개의 행렬을 입력 받음
        for(int i1 = 0 ; i1 < arr1.length; i1++) {
        	for(int i2 = 0; i2 < arr1[i1].length; i2++) {
        		int value1 = arr1[i1][i2];
        		int value2 = arr2[i1][i2];
        		answer[i1][i2] = value1 + value2;
        	}
        }
        
        
        return answer;
    }

}
