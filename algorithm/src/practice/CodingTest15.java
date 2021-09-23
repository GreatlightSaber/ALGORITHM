package codingTest;

import java.util.*;

public class CodingTest15 {
	
	public static void main(String[] args) {
		String[] operations = {"I 1", "I 2", "I 3", "I 4", "I 5", "D -1", "D -1","D -1", "D -1"};
		
		int[] results = solution(operations);
		for(int result : results) {
			System.out.println(result);
		}
		
	}
	
	public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue<String> qOperations = new LinkedList<String>();
        PriorityQueue<Integer> qProrityQueue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> qProrityQueueReverse = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(String opertaion : operations) {
        	qOperations.add(opertaion);
        }
        
        while(!qOperations.isEmpty()) {
        	String operation = qOperations.poll();
        	String[] arrOperation = operation.split(" ");
        	String caseOperation = arrOperation[0];
        	
        	switch(caseOperation) {
        		case "D":
        			if(Integer.parseInt(arrOperation[1]) < 0 ) {
        				qProrityQueueReverse.remove(qProrityQueue.poll());
        				
        			} else {
        				qProrityQueue.remove(qProrityQueueReverse.poll());
        			}
        			break;
        		case "I":
        			qProrityQueue.add(Integer.parseInt(arrOperation[1]));
        			qProrityQueueReverse.add(Integer.parseInt(arrOperation[1]));
        			break;
        	}
        }
        if(!qProrityQueue.isEmpty() && !qProrityQueue.isEmpty()) {
        	
        		int minumum = qProrityQueue.peek();
            	int maximum = qProrityQueueReverse.peek();
                if(maximum >= minumum) {
            		answer[0] = maximum;
                	answer[1] = minumum;
                }
        	
        }
        
        return answer;
    }
	

	
}