package codingTest;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CodingTest2 {
	@Test
	public void test() {
		String p = "82195";
		String s = "64723";
		System.out.println(solution(p,s)); 
	}
	public int solution(String p, String s) {
		int answer = 0;
		
		for(int i = 0 ; i < p.length() ; i++) {
			int iTemp1 = Integer.parseInt(p.substring(i,i+1));
			int iTemp2 = Integer.parseInt(s.substring(i,i+1));
			
			int iResult = Math.abs(iTemp1 - iTemp2);
			if(iResult > 5) {
				if(iTemp1 > iTemp2) {
					iTemp2 += 10;
					iResult = iTemp2 - iTemp1;
				}else {
					iTemp1 += 10;
					iResult = iTemp1 - iTemp2;
				}
				answer += iResult;
			}else {
				answer += iResult;
			}
		}
		
		return answer;
	}
}
