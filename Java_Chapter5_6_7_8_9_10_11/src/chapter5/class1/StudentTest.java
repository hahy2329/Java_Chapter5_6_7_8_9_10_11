package chapter5.class1;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentHong = new Student();
		
		
		//==== 객체를 생성하여 변수 대입 및 출력 ====
		
		//방법 1. 직접 멤버 변수에 대입하여 출력
		studentHong.studentName = "홍길동";
		studentHong.studentGrade = 2;
		studentHong.address = "서울";
		studentHong.height = 178.2;
		
		System.out.println(studentHong.studentName);
		System.out.println(studentHong.studentGrade);
		System.out.println(studentHong.address);
		System.out.println(studentHong.height);
		System.out.println(studentHong.getStudentName());
		System.out.println();
		
		//방법 2. 메서드에 대입하여 출력
		
		Student studentKim = new Student();
		
		studentKim.setStudentName("김땡땡");
		System.out.println(studentKim.getStudentName());
		studentKim.setStudentGrade(3);
		System.out.println(studentKim.getStudentGrade());
		studentKim.setAddress("경기");
		System.out.println(studentKim.getAddress());
		studentKim.setHeight(175.5);
		System.out.println(studentKim.getHeight());
		

	}

}
