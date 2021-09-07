package practice;

import java.util.*;

public class CodingTest25 {

	public static void main(String[] args) {
		String[] table = {
				 "SI JAVA JAVASCRIPT SQL PYTHON C#"
				,"CONTENTS JAVASCRIPT JAVA PYTHON SQL C++"
				,"HARDWARE C C++ PYTHON JAVA JAVASCRIPT"
				,"PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP"
				,"GAME C++ C# JAVASCRIPT C JAVA"
		};
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7,5,5};
		
		 String results = solution(table, languages, preference);
		 System.out.println(results);
		
	}
	
	public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "ZZZZZZZZZ";
        List<List<String>> jobScores = new ArrayList<List<String>>();
        List<String> jobs = new ArrayList<String>(); 
        for(String item : table) {
        	List<String> scores = new ArrayList<String>(Arrays.asList(item.split(" "))) ;
        	jobs.add(scores.remove(0));
        	jobScores.add(scores);
        }
        int[] jobAllSocres = new int[jobs.size()];
        for(int index1 = 0; index1 < languages.length; index1++) {
        	for(int index2 = 0; index2 < jobScores.size(); index2++) {
        		List<String> item = jobScores.get(index2);
        		int jobScore = 0;
        		int indexOfLanguage = item.indexOf(languages[index1]);
        		jobScore = indexOfLanguage > 0 ? 5 - indexOfLanguage : 0;
        		jobAllSocres[index2] = (jobAllSocres[index2] + (jobScore * preference[index1]));
        	}
        }
        
        int max = 0;
        List<Integer> maxIndex = new ArrayList<Integer>();
        for(int index3 = 0; index3 < jobAllSocres.length; index3++) {
        	int jobScore = jobAllSocres[index3];
        	if(max < jobScore) {
        		max = jobScore;
        		maxIndex = new ArrayList<Integer>();
        		maxIndex.add(index3);
        	} else if (max == jobScore) {
        		maxIndex.add(index3);
        	}
        }
        
        for(int item : maxIndex) {
        	String job = jobs.get(item) != null ? jobs.get(item) : "";
        	answer = answer.compareTo(job) < 0 ? answer : job;
        }
        
        return answer;
    }
	
}