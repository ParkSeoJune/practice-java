
public class Java_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열을 생성하는 방법
		int[] array1 = new int[4];
		
		// 배열에 값을 저장하는 방법
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		
		// 배열에 저장된 값을 꺼내서 사용하는 방법
		int value = array1[2]; // 3의 값이 value에 저장된다
		System.out.print(array1[1]); // 2의 값이 콘솔에 출력된다
		
		// 선언과 동시에 초기화하는 방법
		int[] array2 = new int[] {1,2,3,4,5};
		
		// 배열에 접근할때에는 인덱스를 통해서 접근한다
		int[] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		
		// 배열의 길이를 알아내는 방법
		// iarray.length
		// 배열을 참조하는 레퍼런스 변수.length 하면 해당 배열의 길이를 리턴한다
		
		// 배열에 1부터 100까지 값넣기
		// 배열에 값을 반복적으로 넣어야 하므로, for 반복문을 이용한다
		for(int i = 0; i < iarray.length; i++) {
			//배열의 인덱스는 0부터 시작하므로, 0부터 배열의 길이보다 하나 작을때까지 반복하면 배열의 크기만큼 반복할 수 있다
			iarray[i] = i + 1; // 배열의 인덱스는 0부터인데 넣고 싶은 값은 1부터 사용하기 때문에 인덱스에 1을 더해준다
			
			
		}
	}

}
