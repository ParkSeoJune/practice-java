
public class Java_04_기본형_타입변환 {

	public static void main(String[] args) {
		// 기본형 타입(형)변환
		//  형변환이란, 변수 또는 리터럴의 타입을 다른 타입으로 변환하는 것이다.
		
		// 묵시적 형변환
		// - 크기가 작은 타입을 크기가 더 큰 타입으로 바꿀 때에는 묵시적으로 형을 바꾸어 준다.
		int x = 50000;
		long y = x;
		// 이를 암묵적 형변환 이라고도 한다.
		
		// 명시적 형변환
		// - 크기가 더 큰 타입을 작은 타입으로 바꿀 때에는 명시적으로 변환 해주어야 한다.
		long c = 50000;
		// int y = x; (이렇게 묵시적으로 수행하면 컴파일러는 오류를 발생 시킨다.)
		int a = (int) c;	// (반드시(타입)으로 명시적으로 형을 바꾸어 주어야 한다.)
		// 이를 강제 형변환 이라고도 한다.
		
		

	}

}
