import java.util.Scanner;

public class Java_00_키보드로_데이터_입력 {
	
	public static void main(String[] args) {
		// 키보드로 데이터 입력
		// - 프로그램의 첫 행에 다음을 추가해 Scanner 클래스의 경로 이름을 컴파일러에 알린다.
		// import java.util.Scanner
		
		// 키보드로 데이터를 입력받으려고 System.in 객체와 연결된 Scanner 객체를 생성한다.
		Scanner in = new Scanner(System.in);
		
		// Scanner 클래스가 제공하는 다양한 메서드를 이용해 키보드로 데이터를 입력받는다.
		int x = in.nextInt(); // 정수를 읽어 변수 x에 대입한다.
		
		System.out.printf("%d가 나왔다", x);
	}
}
