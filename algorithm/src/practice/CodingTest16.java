package codingTest;

import java.util.*;

public class CodingTest16 {
	
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int[] results = solution(answers);
		for(int result : results) {
			System.out.println(result);
		}
	}
	
	public static int[] solution(int[] answers) {
        Queue<Integer> qAnswer = new LinkedList<Integer>();
        
        int[][] supojas = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        int maxCorrectCnt = 0;
        for(int index1 = 0; index1 < supojas.length; index1++) {
        	int[] supoja = supojas[index1];
        	int correctCnt = 0;
        	
        	for(int index2 = 0; index2 < answers.length; index2++) {
        		if(answers[index2] == supoja[index2 % supoja.length]) {
        			correctCnt++;
        		}
        	}
        	if(maxCorrectCnt < correctCnt ) {
        		maxCorrectCnt = correctCnt;
        		qAnswer.removeAll(qAnswer);
        		qAnswer.add(index1+1);
        	} else if(maxCorrectCnt == correctCnt) {
        		qAnswer.add(index1+1);
        	}
        }
        int[] answer = new int[qAnswer.size()];
        int index = 0;
        while(!qAnswer.isEmpty()) {
        	answer[index++] = qAnswer.poll();
        }
        return answer;
    }

	
}