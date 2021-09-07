package practice;

import java.util.*;

public class CodingTest11 {
	
	public static void main(String[] args) {
		int bridge_length = 1;
		int weight = 5;
		int[] truck_weights = {1, 1, 1, 1, 1};
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> qWattingTruck = new LinkedList<Integer>();
        Queue<Integer> qCrossingTruck = new LinkedList<Integer>();
        
        for(int truck: truck_weights) {
        	qWattingTruck.add(truck);
        }
        
        int totalWeight = 0;
        int crossingTruckCount = 0;
        boolean isNearBy = false;
        while(!qWattingTruck.isEmpty()) {
        	int wattingTruck = qWattingTruck.poll();
        	while(true) {
        		totalWeight = 0;
	        	for(int crossingTruck: qCrossingTruck) {
	        		totalWeight += crossingTruck;
	        	}
	        	
	    		if(totalWeight + wattingTruck <= weight) {
	        		qCrossingTruck.add(wattingTruck);
	        		if(isNearBy) {
	        			answer += 1;
	        		} else {
	        			answer += bridge_length - crossingTruckCount;
	        		}
	        		isNearBy = true;
	        		break;
	        	} else {
	        		qCrossingTruck.poll();
	        		crossingTruckCount = qCrossingTruck.size();
	        		isNearBy = false;
	        	}
        	}
    	}
        	
        
        answer +=1;
        
        return answer;
    }
	

	
}