package practice;

import java.util.ArrayList;

public class Question_20201124 {
	// ������ ���ĺ��� �Է� ������ ���� �ֳ��� ��Ī���� �迭 ����
	// 	1) ���� ���°��� ������
	
	public static void main (String[] args) {
		
	}
	
	public static void solution(String[] input) {
		
		// ArrayList ����
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
