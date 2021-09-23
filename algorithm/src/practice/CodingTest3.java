package codingTest;

import org.junit.jupiter.api.Test;

public class CodingTest3 {
	@Test
	public void test() {
		int[][] office = {{5, -1, 4}, {6, 3, -1}, {2, -1, 1}};
		int r = 1;
		int c = 0;
		String[] move = {"go", "go", "right", "go", "right", "go", "left", "go"};
		System.out.println(solution(office, r, c, move));
	}
	 public int solution(int[][] office, int r, int c, String[] move) {
	      int answer = office[r][c];
	      office[r][c] = 0;
	      
	      int controlNum = 0;
	      int[][] control = {{-1,0}, {0,1}, {1,0}, {0,-1}};
	      int controlLength = control.length;
	      
	      for(String strMove : move) {
	    	  switch(strMove) {
	    	  case "go":
	    	      int tempR = r;
	    	      int tempC = c;
	    		  tempR += control[controlNum][0];
	    		  tempC += control[controlNum][1];
	    		  if(tempR > -1 && tempC > -1 && tempR < office.length && tempC < office.length) {
	    			  if(office[tempR][tempC] != -1) {
		    			  r += control[controlNum][0];
			    		  c += control[controlNum][1];
			    		  answer += office[r][c];
			    		  office[r][c] = 0;
		    		  } 
	    		  }
	    		  break;
	    	  case "right":
	    		  controlNum += 1;
	    		  if(controlNum >= controlLength) {
	    			  controlNum = 0;
	    		  }
	    		  break;
	    	  case "left":	    		 
	    		  controlNum -= 1;
	    		  if(controlNum < 0) {
	    			  controlNum = controlLength-1;
	    		  }
	    		  break;
	    	  }
	      }
	      
	      return answer;
	  }
}
