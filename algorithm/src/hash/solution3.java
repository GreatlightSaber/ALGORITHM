package hash;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * 위장
 * 
 * - 문제설명
 * 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
 * 
 * 예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다
 * 음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
 * ---------------------------------
 * |  종류    |          이름                         |
 * ---------------------------------
 * |  얼굴    | 동그란 안경, 검정 선글라스            |
 * ---------------------------------
 * |  상의    | 파란색 티셔츠                                |
 * ---------------------------------
 * |  하의    | 청바지                                          |
 * ---------------------------------
 * |  겉옷    | 긴 코트                                         |
 * ---------------------------------
 * 스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도
 * solution 함수를 작성해주세요.
 * 
 * - 제한사항
 * clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
 * 스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
 * 같은 이름을 가진 의상은 존재하지 않습니다.
 * clothes의 모든 원소는 문자열로 이루어져 있습니다.
 * 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
 * 스파이는 하루에 최소 한 개의 의상은 입습니다.
 * 
 * */
public class solution3 {
	@Test
	public void test() {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"},{"red_hat", "headgear"},{"red_sunglasses", "eyewear"},{"blue_jeans", "pants"}};
		solution(clothes);
	}
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> kindOfClothesCount = new HashMap<String,Integer>();
        
        for(String[] item1 :clothes) {
        	String strKindOfClotheName = item1[1];
        	if(!kindOfClothesCount.containsKey(strKindOfClotheName)) {
        		kindOfClothesCount.put(strKindOfClotheName,1);
        	}else {
        		kindOfClothesCount.replace(strKindOfClotheName, kindOfClothesCount.get(strKindOfClotheName) +1);
        	}
        }
        for(String key : kindOfClothesCount.keySet()) {
        	answer *= (kindOfClothesCount.get(key) + 1);
        }
        answer -= 1;
        System.out.println(answer);
        return answer;
    }
}
