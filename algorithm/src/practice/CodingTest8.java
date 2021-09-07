package practice;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CodingTest8 {
	@Test
	public void test() {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		int[] result = solution(progresses, speeds);
		
		for(int item : result) {
			System.out.println(item);
		}
	}
	
	
	public int[] solution(int[] progresses, int[] speeds) {
		
        ArrayList<Integer> arrListProgresses = new ArrayList(Arrays.asList(progresses));
        ArrayList<Integer> arrListSpeeds = new ArrayList(Arrays.asList(speeds));
        ArrayList<Integer> arrListAnswer = new ArrayList<Integer>();
        
        // ��� progresses ����
        if(arrListProgresses.size() > 0) {
    		// [�ݺ���] ���� - ��� progresses�� ������ �Ǿ��ٸ� break
        	while(true) {
        		System.out.println("1");
                int deployCnt = 0;
                
            	// [�ݺ���] ���� - progresses �迭 ���� ��ŭ �ݺ�
        		for(int index = 0 ; arrListProgresses.size() -1 > index ; index++ ) {
            		// item�� �ش��ϴ� speeds ���� �����ش�
        			int udpateProgress = arrListProgresses.get(index) + arrListSpeeds.get(index);
        			arrListProgresses.set(index, udpateProgress);
        		}
            	
            	// [�ݺ���] ���� - progresses �迭 ���� ��ŭ �ݺ�
        		for(int index = 0 ; arrListProgresses.size() -1 > index ; index++ ) {
        			// [����] ���� - ù��° �迭�� 100�� �Ѿ�����
        			if(arrListProgresses.get(0) > 100) {
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
