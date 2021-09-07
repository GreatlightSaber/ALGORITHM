package Thread;

public abstract class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(3,2));
	}

	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big;
        int small;
        
        if(n < m) {
        	big = m;
        	small = n;
        } else {
        	big = n;
        	small = m;
        }
        
        int temp = 1;
        while(big % small != 0) {
        	temp = big % small;
        	big = small;
        	small = temp;
        }
        
        answer[0] = small;
        answer[1] = (n*m)/big;
        return answer;
    }
	
}
