package chapter5.constructor;

public class StudentExTest {

	public static void main(String[] args) {
		
		//디폴트 생성자 방식
		StudentEx studentKim = new StudentEx();
		studentKim.studentName = "김땡땡";
		studentKim.address = "경기";
		System.out.println(studentKim.getStudentName());
		System.out.println(studentKim.getAddress());
		System.out.println();
		
		
		
		
		//생성자 1 방식을 이용한 객체 생성 방식
		StudentEx studentHong = new StudentEx("홍길동", 2);
		System.out.println(studentHong.getStudentName());
		System.out.println(studentHong.getStudentGrade());
		System.out.println();
		
		//생성자 2 방식을 이용한 객체 생성 방식
		StudentEx studentHan = new StudentEx(2, 178);
		System.out.println(studentHan.getStudentGrade());
		System.out.println(studentHan.getHeight());
	}

}
