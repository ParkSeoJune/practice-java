import java.util.Scanner;

public class Java_00_Ű�����_������_�Է� {
	
	public static void main(String[] args) {
		// Ű����� ������ �Է�
		// - ���α׷��� ù �࿡ ������ �߰��� Scanner Ŭ������ ��� �̸��� �����Ϸ��� �˸���.
		// import java.util.Scanner
		
		// Ű����� �����͸� �Է¹������� System.in ��ü�� ����� Scanner ��ü�� �����Ѵ�.
		Scanner in = new Scanner(System.in);
		
		// Scanner Ŭ������ �����ϴ� �پ��� �޼��带 �̿��� Ű����� �����͸� �Է¹޴´�.
		int x = in.nextInt(); // ������ �о� ���� x�� �����Ѵ�.
		
		System.out.printf("%d�� ���Դ�", x);
	}
}
