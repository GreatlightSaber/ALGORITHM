package practice;

import java.util.ArrayList;

public class Question_20201124 {
	// ������ ���ĺ��� �Է� ������ ���� �ֳ��� ��Ī���� �迭 ����
	// 	1) ���� ���°��� ������
	
	public static void main (String[] args) {
		String[] input = {"G","M","Q","D","M","A","J","D","O","J","A","U","E","J","E","B",};
		solution(input);
	}
	
	public static void solution(String[] input) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		// ArrayList ����
		ArrayList<String> arrayList = new ArrayList<String>();
		for(int i = 0 ; i < input.length ; i++) {
			arrayList.add(input[i]);
		}
		
		while(arrayList.size() > 0) {
			String temp1 = arrayList.get(0);
			int index = arrayList.lastIndexOf(temp1);
			if(index != 0) {
				// �� ����(��Ī���� ���� �� �ִ� ���� ���� �ʿ�)
				result.add(0,arrayList.get(0));
				result.add(result.size(), arrayList.get(index));
				
				// ���� ���� ������ �ش� �� ����
				arrayList.remove(index);
				arrayList.remove(0);
			}else {
				// ���� ���� ���� remove
				arrayList.remove(0);
			}
		}
		System.out.println(result.toString());
	}
	
}
