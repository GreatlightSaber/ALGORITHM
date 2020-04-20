package hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 배스트 앨범
 * 
 * - 문제설명
 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래
 * 는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
 * 
 *  1.속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 *  2.장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 *  3.장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 *  
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때,
 * 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
 *   
 * 
 * - 제한사항
 * genres[i]는 고유번호가 i인 노래의 장르입니다.
 * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
 * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
 * 장르 종류는 100개 미만입니다.
 * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
 * 모든 장르는 재생된 횟수가 다릅니다.
 * 
 * */
public class solution4 {
	@Test
	public void test() {
		String[] genres = {"classic","pop","classic","classic","pop"};
		int[] plays = {500,600,500,800,2500};
		System.out.println(solution(genres, plays));
	}
	public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<int[]>> genresList = new HashMap<String, ArrayList<int[]>>();
        HashMap<String, Integer> genresSortList = new HashMap<String, Integer>();
        List<Integer> arrAnswer = new ArrayList<Integer>();
        // 장르별 index, genres 담기
        for(int i = 0 ; i < plays.length ; i++) {
        	ArrayList<int[]> genresPlay = null;
        	String genresName = genres[i];
        	
        	if(!genresList.containsKey(genresName)) {
        		genresPlay = new ArrayList<int[]>();
        		genresSortList.put(genresName, plays[i]);
        	}else {
        		genresPlay = genresList.get(genresName);
        		genresSortList.put(genresName, plays[i] + genresSortList.get(genresName));
        	}
        	genresPlay.add(new int[] {i,plays[i]});
        	genresPlay.sort(new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[1] > o2[1]) {
						return -1;
					}else if(o1[1] < o2[1]) {
						return 1;
					}else {
						if(o1[0] > o2[0]) {
							return 1;
						}else if(o1[0] < o2[0]){
							return -1;
						}else {
							return 0;
						}
					}
				}
			});
        	genresList.put(genresName, genresPlay);
        }
        
        List<String> list = new ArrayList<String>();
        list.addAll(genresSortList.keySet());
        Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				
				return ((Comparable) genresSortList.get(o2)).compareTo(genresSortList.get(o1));
			}
		});
        // Collections.reverse(list);
        // int[] answer = new int[list.size() * 2];
        int count = 0;
        for(int i = 0 ; i < list.size(); i++) {
        	ArrayList<int[]> arrtemp = genresList.get(list.get(i));
        	for(int j = 0 ; j < arrtemp.size() ; j++) {
        		if(j == 2) {
        			break;
        		}
        		arrAnswer.add(arrtemp.get(j)[0]);
        		count++;
        	}
        }
        int[] answer = new int[arrAnswer.size()];
        for(int i = 0 ; i < arrAnswer.size(); i++) {
        	answer[i] = arrAnswer.get(i);
        }
        return answer;
    }
}
