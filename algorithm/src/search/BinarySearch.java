package search;

public class BinarySearch {
	// 이진탐색(Binary Search)
	
	/**
	 *  - 정렬되어있는 자료들의 집합에서 특정 자료를 찾고자 할 때 많이 사용 됨
	 *  - '분할 후 정복(divide and conquer)'
	 *  - 문제의 크기를 정확히 양분하는 경우 실행시간은 최소 logN의 성능을 보장
	 *  - 탐색시간은 T = K*logN 으로 O(logN)이다.
	 *  - 선형 탐색 시간보다 상당히 빠르지만 반드시 정렬되어있어야 한다.
	 *  - 이진탐색을 선호하는 상황
	 *  	1) 새로운 자료가 추가되어있어도 모든 자료가 재정렬이 일어나지 않는 경우 -> 해싱, 인덱스를 이용하는 경우
	 *  	2) 획기적으로 빠르고, 효율적은 자료의 재정렬이 가능한 자료구조를 사용할 경우 -> B-트리 계열의 트리구조 사용
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
