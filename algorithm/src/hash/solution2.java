package hash;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * 전화번호 목록
 * 
 * - 문제설명
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 *  * 구조대 : 119
 *  * 박준영 : 97 674 223
 *  * 지영석 : 11 9552 4421
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호
 * 가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성
 * 해주세요.
 * 
 * - 제한사항
 * phone_book의 길이는 1 이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 이하입니다.
 * 
 * */
public class solution2 {
	@Test
	public void test() {
		String[] phone_book = {"11","123","567","5678"};
		System.out.println(solution(phone_book));
	}
	 public boolean solution(String[] phone_book) {
		 boolean answer = true;
        for(int i = 0 ; i < phone_book.length ; i++) {
        	String prefix = phone_book[i];
        	for(int j = 0 ; j < phone_book.length ; j++) {
	        	if(i != j && phone_book[j].toString().indexOf(prefix) == 0) {
    	            answer = false;
    	            break;
    	        }
        	}
        	if(!answer) {
        		break;
        	}
    	}
        return answer;
    }
}
