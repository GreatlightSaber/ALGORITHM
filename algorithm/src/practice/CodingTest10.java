package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest10 {
	
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		int result = solution(priorities, location);
		System.out.println(result);
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        ArrayList<Integer> listPriorities = new ArrayList<Integer>(priorities.length);
        ArrayList<Integer> listLocation = new ArrayList<Integer>(priorities.length);
        int locationItem = 0;
        
        for(int prioritie : priorities) {
        	listPriorities.add(prioritie);
        	listLocation.add(locationItem);
        	locationItem++;
        }
        
        while(listPriorities.size() > 0) {
        	boolean isChanged = false;
        	int listPrioritiesSize = listPriorities.size();
        	int firstPrioritie = listPriorities.get(0);
        	int firstLocation = listLocation.get(0);
        	
        	for(int index1 = 1; index1 < listPrioritiesSize; index1++) {
        		// 높은 우선순위가 있으면 대기열 맨 뒤로 이동
        		if(firstPrioritie < listPriorities.get(index1)) {
        			listPriorities.add(listPriorities.remove(0));
        			listLocation.add(listLocation.remove(0));
        			isChanged = true;
        			break;
        		}
        	}
        	
    		// 우선순위가 가장 높았으면 인쇄
        	if(!isChanged) {
        		answer++;
        		if(firstLocation == location) {
        			return answer;
        		} else {
        			listPriorities.remove(0);
        			listLocation.remove(0);
        		}
        	}
        }
        
        return answer;
    }
	
}