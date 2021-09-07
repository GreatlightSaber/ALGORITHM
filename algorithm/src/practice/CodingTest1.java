package practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class CodingTest1 {
	@Test
	public void test() {
		int[][] v = {{1,4},{3,4},{2,10}};
		System.out.println(solution(v));
	}
	public int[] solution(int[][] v) {

        ArrayList<Integer> arrInteger1 = new ArrayList<Integer>();
        ArrayList<Integer> arrInteger2 = new ArrayList<Integer>();
       for(int[] item1 : v) {
    	   if(arrInteger1.contains(item1[0])) {
    		   arrInteger1.remove(arrInteger1.indexOf(item1[0]));
    	   }else {
    		   arrInteger1.add(item1[0]);
    	   }
    	   
    	   if(arrInteger2.contains(item1[1])) {
    		   arrInteger2.remove(arrInteger2.indexOf(item1[1]));
    		   
    	   }else {
    		   arrInteger2.add(item1[1]);
    	   }
       }
       int[] answer = {arrInteger1.get(0),arrInteger2.get(0)};

        return answer;
    }
}
