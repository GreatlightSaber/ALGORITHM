
public class test3 {

	
	/*
     * �¿� �ּ��̵� Ƚ�������� �ְ����� �پ��� ���̽� �׽�Ʈ ���   
     * 
     * 1.�Ϲ������δ� -> �������θ� �̵��ϴ°� ���� ���� count�� ���´�.
     * 2.������ �ʿ���� A�� ������ �ִ� �κ��� �ִ��� Ȯ��
     * 		2.1 ���ӵ� A������ ���ٸ� �Ϲ����� ->�������� ����
     * 		2.2 ���� �ִ������ A���� ���ӵǾ� �ִ� �κ��� ������ �϶��� �����ڸ��� ����� �κ��� ���� 
     * 3.������ �ִ� A������ ��ġ�� �������� �������� ���ĺ� ����(R), ������ ���ĺ� ����(L) ���ϱ�
     * 4.R���� L���� �������ִ� A������ ����(S)���� ū�� ������ Ȯ��
     *  	�� ������ ��ȯ�ϴ� ������ A�����̿����� �ִ� ��ġ�� ����(->���������) Ȥ�� ��(<-���������) ����
     *  	4.1 R,L ��� S���� �۴ٸ� L�� R�� ���� �� ��
     * 			4.1.1 R�� L���� ������ <- �������� ������ -> �������� �����ϴ°� ������ ���
     * 			4.1.2 L�� R���� ������ -> ���� ������ -< �������� �����ϴ°� ������ ���
     * 		4.2 R�� S���� ������ <- �������� ������ -> �������� �����ϴ°� ������ ���
     * 		4.3 L�� S���� ������ -> ���� ������ -< �������� �����ϴ°� ������ ���
     * 
     * */
	
	public static void main(String[] args) {
		// System.out.println(Integer.toString(solution("AJB")));
		System.out.println(solution("BABAAAAAAAAAAAABAAAB"));
	}
	
    public static int solution(String name) {
        int answer = 0;
        int length = name.length();
        
        // ���̽�ƽ ���Ʒ� Ƚ��
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
        
        // 2. A�� �������ִ� �κ��� �ִ��� Ȯ��
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
        
        // 2.1 ���ӵ� A������ ���ٸ� �Ϲ����� ->�������� ����
        if(!"".equals(sSeriseResult)) {
        	// 2.2 ���� �ִ������ A���� ���ӵǾ� �ִ� �κ��� ������ �϶��� �����ڸ��� ����� �κ��� ����
            int iLeftCheckCount = name.indexOf(sSeriseResult);
            int iRightCheckCount = name.lastIndexOf(sSeriseResult);
            int iCheckCount = Math.min(iLeftCheckCount, iRightCheckCount);
            
            // 3. ������ �ִ� A������ ��ġ�� �������� ������ ���ĺ� ����(R), ������ ���ĺ� ����(L)���ϱ�
            int iLeftCount = iCheckCount;
            int iRightCount = length - (iLeftCount + sSeriseResult.length()); 
            
            // 4.R���� L���� �������ִ� A������ ����(S)���� ū�� ������ Ȯ��
            
            // 4.1 R,L ��� S���� �۴ٸ� L�� R�� ���� �� ��
            if(iRightCount < length && iLeftCount< length) {
            	
            	// 4.1.1 R�� L���� ������ <- �������� ������ -> �������� �����ϴ°� ������ ���
            	if(iRightCount < iLeftCount) {
            		answer += (iRightCount * 2)-1 + iLeftCount;
            	}else { // 4.1.2 L�� R���� ������ -> ���� ������ -< �������� �����ϴ°� ������ ��� (-1�� �ѹ� �� �� ������ ���� Ŀ���� 0��°�� �ֱ� ������ �ش� ��ġ�� �̵��ϱ����� 1���� ��)
            		answer += (iLeftCount * 2) -1 -1 + iRightCount;
            	}
            	
            } else if(iRightCount < length) { 	// 4.2 R�� S���� ������ <- �������� ������ -> �������� �����ϴ°� ������ ���
            	answer += (iRightCount * 2)-1 + iLeftCount;
            } else if(iLeftCount < length) {	// 4.3 L�� S���� ������ -> ���� ������ -< �������� �����ϴ°� ������ ��� (-1�� �ѹ� �� �� ������ ���� Ŀ���� 0��°�� �ֱ� ������ �ش� ��ġ�� �̵��ϱ����� 1���� ��)
            	answer += (iLeftCount * 2) -1 -1 + iRightCount;
            } else { // �Ϲ� �� �������� ����
            	answer += length-1;
            }
        }else {
        	answer += length-1;
        }
        
        return answer;
    }

}