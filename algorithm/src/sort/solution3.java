package sort;

import org.junit.jupiter.api.Test;

/**
 * k번째지수
 * 
 * - 문제설명
 * H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를
 * 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
 * 
 * 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용
 * 되었다면 h의 최댓값이 이 과학자의 H-Index입니다. 
 *  
 *  어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index
 *  를 return 하도록 solution 함수를 작성해주세요.
 *  
 * - 제한사항
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * commands의 길이는 1 이상 50 이하입니다. 
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 * 
 * */
public class solution3 {
	@Test
	public void test() {
		// int[] citations = {3, 0, 6, 1, 5};
		int[] citations = {0, 0, 0, 0, 0};
		int result = solution(citations);
		System.out.println(Integer.toString(result));
	}
	 public int solution(int[] citations) {
		 int[] count = new int[citations.length];

	        for(int i=0; i<citations.length ; i++) {
	            for(int j=0 ; j<citations.length ; j++) {
	                if(citations[i] <= citations[j]) {
	                    count[i]++;
	                }
	            }
	        }

	        int max = 0;
	        for(int i=0 ; i<citations.length ; i++) {
	            if(count[i] <= citations[i]) {
	            	if(max <= count[i]) {
	            		max = count[i];
	            	}
	            }
	        }
	        return max;
	    }
}
