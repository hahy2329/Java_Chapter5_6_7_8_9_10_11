package chapter5.constructor;

public class StudentEx {
	String studentName;
	int studentGrade;
	String address; 
	int height;
	
	public StudentEx() {} //디폴트 생성자 
	
	public StudentEx(String studentName, int studentGrade) {
		this.studentName = studentName;
		this.studentGrade = studentGrade;
	} //매개변수로 전달 받아 만들어내는 생성자1
	
	public StudentEx(int studentGrade, int height) {
		this.studentGrade = studentGrade;
		this.height = height;
	} //매개변수로 전달 받아 만들어내는 생성자 2 
	// === 이렇게 동일한 클래스 이름의 매개변수를 변경하여 여러번 작성하는 방식을 '오버로드'라고 한다.

	
	
	
	// ===== 메서드 선언 ==== 
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
	
	
	
	
}
