package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest9 {
	
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1,1,1,1,1,1};
		int[] result = solution(progresses, speeds);
		
		for(int item : result) {
			System.out.println(item);
		}
	}
	
public static int[] solution(int[] progresses, int[] speeds) {
	
		String[] subjects = {"maths", "english", "history", "physics"};
	    ArrayList<String> sublist = new ArrayList<String>(Arrays.asList(subjects));
		
//        ArrayList<Integer> arrListProgresses = new ArrayList(Arrays.asList(progresses));
        ArrayList<Integer> arrListProgresses = new ArrayList<Integer>(progresses.length);
        for (int item : progresses)
        {
        	arrListProgresses.add(item);
        }
//        ArrayList<Integer> arrListSpeeds = new ArrayList(Arrays.asList(speeds));
        ArrayList<Integer> arrListSpeeds = new ArrayList<Integer>(speeds.length);
        for (int item : speeds)
        {
        	arrListSpeeds.add(item);
        }
        ArrayList<Integer> arrListAnswer = new ArrayList<Integer>();
        
        // ��� progresses ����
        if(arrListProgresses.size() > 0) {
    		// [�ݺ���] ���� - ��� progresses�� ������ �Ǿ��ٸ� break
        	while(true) {
                int deployCnt = 0;
                
            	// [�ݺ���] ���� - progresses �迭 ���� ��ŭ �ݺ�
        		for(int index = 0 ; arrListProgresses.size() > index ; index++ ) {
            		// item�� �ش��ϴ� speeds ���� �����ش�
        			int udpateProgress = arrListProgresses.get(index) + arrListSpeeds.get(index);
        			arrListProgresses.set(index, udpateProgress);
        		}
            	
            	// [�ݺ���] ���� - progresses �迭 ���� ��ŭ �ݺ�
        		while(arrListProgresses.size() > 0) {
        			// [����] ���� - ù��° �迭�� 100�� �Ѿ�����
        			if(arrListProgresses.get(0) >= 100) {
        				// => true - deployCnt++
	        			// => true - �ش� item progresses, speeds ����Ʈ���� pop
        				deployCnt++;
        				arrListProgresses.remove(0);
        				arrListSpeeds.remove(0);
        			} else {
	        			// => false - break
        				break;
        			}
        		}
            
        		
            	// [����] ���� - deployCnt�� 0�� �Ѵ���
        		if(deployCnt > 0) {
            		// => true answer �� deployCnt push
        			arrListAnswer.add(deployCnt);
        		} else {
            		// => false continue
        			continue;
        		}
            	
            	// [����] progresses ���̰� 0�̻�����
        		if(arrListProgresses.size() > 0) {
            		// => true continue
        			continue;
        		} else {
            		// => false break
        			break;
        		}
        	}
        	
        }
        
        int[] answer = new int[arrListAnswer.size()];
        int size = 0;
        for(int item : arrListAnswer) {
        	answer[size++] = item;
        }
        
        return answer;
    }
	
}
