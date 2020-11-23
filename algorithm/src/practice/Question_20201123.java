package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_20201123 {
	
	public static void main(String[] args) {
		
		int[] input = {-1,0,1,2,5,6,-4,-2,3,-8,10,4,7};
		// [-1,0,1],[6,-4,-2],[5,3,-8]
		solution(input);
		reverseSolution(input);
	}
	
	// 정방향
	public static void solution(int[] input) {
		
		ArrayList<String> result = new ArrayList<>();
		
		// ArrayList로 변형
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i = 0 ; i < input.length ; i++) {
			arrayList.add(input[i]);
		}
		
		// 첫번째 값
		for(int i1 = 0; i1+2 < arrayList.size(); i1++) {
			for(int i2 = i1+1; i2+1 < arrayList.size(); i2++) {
				for(int i3 = i2+1 ; i3 < arrayList.size(); i3++) {
					if(arrayList.get(i1)+arrayList.get(i2)+arrayList.get(i3) == 0) {
						int[] temp = {arrayList.get(i1),arrayList.get(i2),arrayList.get(i3)};
						result.add(Arrays.toString(temp));
						arrayList.remove(i3);
						arrayList.remove(i2);
						arrayList.remove(i1);
						i1 = 0;
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
	
	// 정방향
		public static void reverseSolution(int[] input) {
			
			ArrayList<String> result = new ArrayList<>();
			
			// ArrayList로 변형
			ArrayList<Integer> arrayList = new ArrayList<>();
			for(int i = 0 ; i < input.length ; i++) {
				arrayList.add(input[i]);
			}
			
			// 첫번째 값
			for(int i1 = arrayList.size()-1 ; i1 > 0 ; i1--) {
				for(int i2 = i1-1; i2-1 > 0 ; i2--) {
					for(int i3 = i2-1 ; i3-1 > 0; i3--) {
						if(arrayList.get(i1)+arrayList.get(i2)+arrayList.get(i3) == 0) {
							int[] temp = {arrayList.get(i1),arrayList.get(i2),arrayList.get(i3)};
							result.add(Arrays.toString(temp));
							arrayList.remove(i1);
							arrayList.remove(i2);
							arrayList.remove(i3);
							i1 = arrayList.size()-1;
							break;
						}
					}
				}
			}
			System.out.println(result);
		}
}
