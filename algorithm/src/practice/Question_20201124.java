package practice;

import java.util.ArrayList;

public class Question_20201124 {
	// 무작위 알파벳을 입력 받으면 같은 쌍끼리 대칭으로 배열 생성
	// 	1) 쌍이 없는값은 버린다
	
	public static void main (String[] args) {
		String[] input = {"G","M","Q","D","M","A","J","D","O","J","A","U","E","J","E","B",};
		solution(input);
	}
	
	public static void solution(String[] input) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		// ArrayList 생성
		ArrayList<String> arrayList = new ArrayList<String>();
		for(int i = 0 ; i < input.length ; i++) {
			arrayList.add(input[i]);
		}
		
		while(arrayList.size() > 0) {
			String temp1 = arrayList.get(0);
			int index = arrayList.lastIndexOf(temp1);
			if(index != 0) {
				// 값 저장(대칭으로 담을 수 있는 로직 구현 필요)
				result.add(0,arrayList.get(0));
				result.add(result.size(), arrayList.get(index));
				
				// 값을 저장 했으면 해당 값 삭제
				arrayList.remove(index);
				arrayList.remove(0);
			}else {
				// 쌍이 없는 값은 remove
				arrayList.remove(0);
			}
		}
		System.out.println(result.toString());
	}
	
}
