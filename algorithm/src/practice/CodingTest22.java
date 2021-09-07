package practice;

import java.util.*;

public class CodingTest22 {

	public static void main(String[] args) {
		int[][] scores = {
					 {100,90,98,88,65}
					,{50,45,99,85,77}
					,{47,88,95,80,67}
					,{61,57,100,80,65}
					,{24,90,94,75,65}};
		String results = solution(scores);
		System.out.println(results);
		// System.out.println(number.substring(0,1) + number.substring(2,number.length()));
	}
	
	public static String solution(int[][] scores) {
        String answer = "";
        for(int index1 = 0 ; index1 < scores.length ; index1++) {
        	int averageCnt = scores.length;
        	int myScore = 0;
        	int sum = 0;
        	int average = 0;
        	int maximum = 0;
        	int minimum = 100;
        	for(int index2 = 0 ; index2 < scores.length ; index2++) {
        		int item =  scores[index2][index1];
        		if(index1 == index2) {
        			myScore = item;
        		} else {
        			if(maximum < item) {
        				maximum = item;
        			} else if (minimum > item) {
        				minimum = item;
        			}
        		}
        		sum += item;
        	}
        	
        	if(myScore > maximum || myScore < minimum) {
        		sum -= myScore;
        		averageCnt -= 1;
        	}
        	
        	average = sum / averageCnt;
        	
        	if(average >= 90) {
        		answer += "A";
        	} else if(90 > average && average >= 80) {
        		answer += "B";
        	} else if(80 > average && average >= 70) {
        		answer += "C";
        	} else if(70 > average && average >= 50) {
        		answer += "D";
        	} else {
        		answer += "F";
        	}
        }
        return answer;
    }
	
}