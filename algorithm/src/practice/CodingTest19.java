package codingTest;

import java.util.*;

public class CodingTest19 {
	
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {1,4,5};
		int[] reserve = {1,5};
		int results = solution(n, lost, reserve);
		System.out.println(results);
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        PriorityQueue<Integer> qLost = new PriorityQueue<Integer>();
        List<Integer> listReserve = new ArrayList<Integer>();
        
        for(int item : lost) {
        	qLost.add(item);
        }
        for(int item : reserve) {
        	listReserve.add(item);
        }
        
        while(!qLost.isEmpty()) {
        	int lostNum = qLost.poll();
        	if(listReserve.contains(lostNum)) {
        		listReserve.remove(listReserve.indexOf(lostNum));
        		answer++;
    			continue;
        	}
        	
        	if(lostNum -1 > 0) {
        		if(listReserve.contains(lostNum -1)) {
        			listReserve.remove(listReserve.indexOf(lostNum -1));
        			answer++;
        			continue;
        		}
        	}
        	
        	if(listReserve.contains(lostNum +1)) {
        		if(!qLost.contains(lostNum +1)) {
        			listReserve.remove(listReserve.indexOf(lostNum +1));
        			answer++;
        			continue;
        		}
    		}
        }
        
        return answer;
    }

	
}