package practice;

import java.util.ArrayList;

public class Question_20201124 {
	// 무작위 알파벳을 입력 받으면 같은 쌍끼리 대칭으로 배열 생성
	// 	1) 쌍이 없는값은 버린다
	
	public static void main (String[] args) {
		
	}
	
	public static void solution(String[] input) {
		
		// ArrayList 생성
		ArrayList<String> arrayList = new ArrayList<String>();
		for(int i = 0 ; i < input.length ; i++) {
			arrayList.add(input[i]);
		}
		
		for(int i1 = 0; i1< input.length ; i1++) {
			String temp1 = arrayList.get(i1);
			if(arrayList.lastIndexOf(temp1) != i1) {
				
			}else {
				arrayList.remove(i1);
			}
		}
		
	}
	
}
