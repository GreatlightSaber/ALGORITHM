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
        
        // 모든 progresses 실행
        if(arrListProgresses.size() > 0) {
    		// [반복문] 실행 - 모든 progresses가 배포가 되었다면 break
        	while(true) {
        		System.out.println("1");
                int deployCnt = 0;
                
            	// [반복문] 실행 - progresses 배열 길이 만큼 반복
        		for(int index = 0 ; arrListProgresses.size() -1 > index ; index++ ) {
            		// item에 해당하는 speeds 값을 더해준다
        			int udpateProgress = arrListProgresses.get(index) + arrListSpeeds.get(index);
        			arrListProgresses.set(index, udpateProgress);
        		}
            	
            	// [반복문] 실행 - progresses 배열 길이 만큼 반복
        		for(int index = 0 ; arrListProgresses.size() -1 > index ; index++ ) {
        			// [조건] 실행 - 첫번째 배열이 100이 넘었는지
        			if(arrListProgresses.get(0) > 100) {
        				// => true - deployCnt++
	        			// => true - 해당 item progresses, speeds 리스트에서 pop
        				deployCnt++;
        				arrListProgresses.remove(0);
        				arrListSpeeds.remove(0);
        			} else {
	        			// => false - break
        				break;
        			}
        		}
            
        		
            	// [조건] 실행 - deployCnt가 0을 넘는지
        		if(deployCnt > 0) {
            		// => true answer 에 deployCnt push
        			arrListAnswer.add(deployCnt);
        		} else {
            		// => false continue
        			continue;
        		}
            	
            	// [조건] progresses 길이가 0이상인지
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
