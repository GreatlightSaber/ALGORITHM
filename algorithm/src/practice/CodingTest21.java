package codingTest;

import java.util.*;

public class CodingTest21 {
	
	public static void main(String[] args) {
		int[] people = {70, 80, 50};
		int limit = 100;
		int results = solution(people, limit);
		System.out.println(results);
		// System.out.println(number.substring(0,1) + number.substring(2,number.length()));
	}
	
	public static int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        Deque<Integer> dqPeople = new LinkedList<Integer>();
        for(int person: people) {
        	dqPeople.add(person);
        }

        while(!dqPeople.isEmpty()) {
        	int heaviest = dqPeople.pollLast();
        	answer++;
        	if(!dqPeople.isEmpty()) {
        		if(heaviest + dqPeople.peek() <= limit) {
            		dqPeople.poll();
            		continue;
            	}
            	
            	if(heaviest + dqPeople.getLast() <= limit) {
            		dqPeople.pollLast();
            		continue;
            	}
        	}
        }
        
        return answer;
    }

	
}