package ArrayIndex;

import java.util.*;

public class Array {
	public static void main(String[] args) {
		
	int [] arr = {1, 2, 3, 4, 5};
			
			int index = Arrays.binarySearch(arr, 5);
			// binarySearch를 사용하면된다. 
			// 매개 변수로는 1. 배열의 이름 , 2. 해당 배열의 찾고자 하는 데이터
			// 순서로 코드를 작성해주면 된다.
			
			System.out.println(index + " 에 해당하는 값 -> " + arr[index]);
		
	}
}
