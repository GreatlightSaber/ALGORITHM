package search;

public class BinarySearch {
	// ����Ž��(Binary Search)
	
	/**
	 *  - ���ĵǾ��ִ� �ڷ���� ���տ��� Ư�� �ڷḦ ã���� �� �� ���� ��� ��
	 *  - '���� �� ����(divide and conquer)'
	 *  - ������ ũ�⸦ ��Ȯ�� ����ϴ� ��� ����ð��� �ּ� logN�� ������ ����
	 *  - Ž���ð��� T = K*logN ���� O(logN)�̴�.
	 *  - ���� Ž�� �ð����� ����� �������� �ݵ�� ���ĵǾ��־�� �Ѵ�.
	 *  - ����Ž���� ��ȣ�ϴ� ��Ȳ
	 *  	1) ���ο� �ڷᰡ �߰��Ǿ��־ ��� �ڷᰡ �������� �Ͼ�� �ʴ� ��� -> �ؽ�, �ε����� �̿��ϴ� ���
	 *  	2) ȹ�������� ������, ȿ������ �ڷ��� �������� ������ �ڷᱸ���� ����� ��� -> B-Ʈ�� �迭�� Ʈ������ ���
	 *  
	 * */
	
	public static void main(String[] args) {
		
		int[] input = {4,9,15,25,27,54,90,105,156,175,208};
		binarySearch(input,90);
	}
	
	public static void binarySearch(int[] input, int iKey) {
		int mid;
		int left = 0;
		int right = input.length -1;
		while(left <= right) {
			mid = (left+right)/2;
			
			if(input[mid] < iKey) {
				left = mid;
			} else if(input[mid] > iKey) {
				right = mid;
			}else {
				System.out.println("'" + iKey + "' is in the array with index value: " + mid);
				break;
			}
		}
	}
}
