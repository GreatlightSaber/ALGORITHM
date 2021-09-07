
public class test3 {

	
	/*
     * 좌우 최소이동 횟수에대한 주관적인 다양한 케이스 테스트 결론   
     * 
     * 1.일반적으로는 -> 방향으로만 이동하는게 가장 적은 count를 갖는다.
     * 2.변경이 필요없는 A가 연속해 있는 부분이 있는지 확인
     * 		2.1 연속된 A값들이 없다면 일반적인 ->방향으로 진행
     * 		2.2 같은 최대길이의 A값이 연속되어 있는 부분이 복수개 일때는 가장자리에 가까운 부분을 기준 
     * 3.연속해 있는 A값들의 위치를 기준으로 오른쪽의 알파벳 갯수(R), 왼쪽의 알파벳 갯수(L) 구하기
     * 4.R값과 L값이 연속해있는 A값들의 길이(S)보다 큰지 작은지 확인
     *  	※ 방향을 전환하는 기준은 A값들이연속해 있는 위치의 시작(->방향진행시) 혹은 끝(<-방향진행시) 지점
     *  	4.1 R,L 모두 S보다 작다면 L과 R중 작은 값 비교
     * 			4.1.1 R이 L보다 작으면 <- 방향으로 진행후 -> 방향으로 진행하는게 최적의 경로
     * 			4.1.2 L이 R보다 작으면 -> 방향 진행후 -< 방향으로 진행하는게 최적의 경로
     * 		4.2 R이 S보다 작으면 <- 방향으로 진행후 -> 방향으로 진행하는게 최적의 경로
     * 		4.3 L이 S보다 작으면 -> 방향 진행후 -< 방향으로 진행하는게 최적의 경로
     * 
     * */
	
	public static void main(String[] args) {
		// System.out.println(Integer.toString(solution("AJB")));
		System.out.println(solution("BABAAAAAAAAAAAABAAAB"));
	}
	
    public static int solution(String name) {
        int answer = 0;
        int length = name.length();
        
        // 조이스틱 위아래 횟수
        for(int i = 0; i < length; i++) {
        	char cTemp = name.charAt(i);
        	int iResult = cTemp -'A';
//        	if(iResult > 13) {
//        		answer += 26 - iResult;
//        	}else {
//        		answer += iResult;
//        	}
        	answer += iResult > 13 ? 26 - iResult : iResult;
        }
        
        // 2. A가 연속해있는 부분이 있는지 확인
        String sSeriseCheck = "";
        String sSeriseResult = "";
        for(int i = 1; i < length; i++) {
        	sSeriseCheck += "A";
        	if(name.contains(sSeriseCheck)) {
        		sSeriseResult = sSeriseCheck;
        	}else {
        		break;
        	}
        }
        
        // 2.1 연속된 A값들이 없다면 일반적인 ->방향으로 진행
        if(!"".equals(sSeriseResult)) {
        	// 2.2 같은 최대길이의 A값이 연속되어 있는 부분이 복수개 일때는 가장자리에 가까운 부분을 기준
            int iLeftCheckCount = name.indexOf(sSeriseResult);
            int iRightCheckCount = name.lastIndexOf(sSeriseResult);
            int iCheckCount = Math.min(iLeftCheckCount, iRightCheckCount);
            
            // 3. 연속해 있는 A값들의 위치를 기준으로 오른쪽 알파벳 갯수(R), 왼쪽의 알파벳 갯수(L)구하기
            int iLeftCount = iCheckCount;
            int iRightCount = length - (iLeftCount + sSeriseResult.length()); 
            
            // 4.R값과 L값이 연속해있는 A값들의 길이(S)보다 큰지 작은지 확인
            
            // 4.1 R,L 모두 S보다 작다면 L과 R중 작은 값 비교
            if(iRightCount < length && iLeftCount< length) {
            	
            	// 4.1.1 R이 L보다 작으면 <- 방향으로 진행후 -> 방향으로 진행하는게 최적의 경로
            	if(iRightCount < iLeftCount) {
            		answer += (iRightCount * 2)-1 + iLeftCount;
            	}else { // 4.1.2 L이 R보다 작으면 -> 방향 진행후 -< 방향으로 진행하는게 최적의 경로 (-1을 한번 더 한 이유는 최초 커서가 0번째에 있기 때문에 해당 위치로 이동하기위한 1값을 뺌)
            		answer += (iLeftCount * 2) -1 -1 + iRightCount;
            	}
            	
            } else if(iRightCount < length) { 	// 4.2 R이 S보다 작으면 <- 방향으로 진행후 -> 방향으로 진행하는게 최적의 경로
            	answer += (iRightCount * 2)-1 + iLeftCount;
            } else if(iLeftCount < length) {	// 4.3 L이 S보다 작으면 -> 방향 진행후 -< 방향으로 진행하는게 최적의 경로 (-1을 한번 더 한 이유는 최초 커서가 0번째에 있기 때문에 해당 위치로 이동하기위한 1값을 뺌)
            	answer += (iLeftCount * 2) -1 -1 + iRightCount;
            } else { // 일반 정 방향으로 진행
            	answer += length-1;
            }
        }else {
        	answer += length-1;
        }
        
        return answer;
    }

}