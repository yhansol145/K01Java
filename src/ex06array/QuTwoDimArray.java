package ex06array;
/*

 */
public class QuTwoDimArray {

	//문제에서 제시한 내용
		public static void addOneArr(int[] arr, int add)
		{
			//가로에 대한 반복
			for(int i=0; i<arr.length; i++){	
				arr[i] += add;
			}
		}
		//addOneArr() 메소드를 기반으로 2차원 배열을 증가시키는 메소드
		public static void addTwoArr(int[][] arr, int add)
		{
			/** 코드 삽입 **/
		}
		
		public static void main(String[] args){		
			//배열선언
			int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7},
				{8, 9}
			};
			//값 증가전 출력
			arrPrint(arr);		
			//2만큼 증가시키는 메소드 호출
			addTwoArr(arr, 2);
			//증가후 출력
			arrPrint(arr);
		}
		
		//2차원 배열을 출력하기 위한 메소드
		static void arrPrint(int[][] arr) {
			/** 코드 삽입 **/
		}
	}
