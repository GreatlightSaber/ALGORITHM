
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println(solution(8,0));
		System.out.println(solution(18,2));
		// System.out.println(solution(10,10));

	}
	
	/**
	 * @param N
	 * @return
	 */
	public static int solution(int N, int K) {

		int count = 0;
		int allinCount = 0;
		
		int chip = N;
		while(chip > 1) {
			if(chip%2 == 0) {
				if(allinCount < K) {
					// 또 나누기(올인)
					allinCount++;
					chip = chip/2;
				}else {
					// -1 (한개 배팅)
					chip -= 1;
				}
				count++;
			}else {
				// -1 (한개 배팅)
				chip -= 1;
				count++;
			}
		}
		
		return count;
	}

}
