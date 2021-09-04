
public class Java_17_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바 1.5버전부터 추가된 for each 구문
		int[] iarr = {10,20,30,40,50};
		
		// 사용법 => for((타입 값을 받아줄 변수명) : (출력하고 싶은 자료구조))
		for(int value:iarr) {
			System.out.print(value);
		}
	}

}
