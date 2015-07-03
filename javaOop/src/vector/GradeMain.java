package vector;

import java.util.Scanner;

public class GradeMain {
	public static void main( String[] args ) {
		GradeService service = new GradeServiceImpl();
		Grade hong = new Grade("1111", "ȫ�浿", 90, 80, 70);
		Grade kang = new Grade("2111", "������", 80, 70, 60);
		Grade kim = new Grade("3111", "������", 70, 60, 50);
		Grade lee = new Grade("4111", "�̼���", 60, 50, 40);

		service.input(hong);
		service.input(kang);
		service.input(kim);
		service.input(lee);
		
		System.out.println("===== ��ü ��ȸ =====" );
		service.printList();
		
		System.out.println("===== �й����� ��ȸ =====" );
		Scanner scanner = new Scanner(System.in);
		service.searchGradeByHak(scanner.next());
	}
}
