
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 -> 0
		// 30 -> 10
		// 155 -> 100
		// 154680 -> 10000
		
		// 1, 10, 100, 1000 이렇게 나누기를 계속 해본다
		
		solution(10);
		solution(125);
		solution(1);
		
		

	}
	
	/**
	 * @param N
	 * @return
	 */
	public static int solution(int N) {
		
		int result = 0;
		int iTerm = 1;
		
		
		while(true) {
			if(N/iTerm <= 1) {
				break;
			}else {
				iTerm *= 10;
				result = iTerm;
			}
		}
		
		System.out.println(result);
		
		return result;
	}

}
