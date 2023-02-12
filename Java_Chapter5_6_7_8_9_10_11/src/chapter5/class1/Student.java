package chapter5.class1;


//클래스(설계도)
public class Student {
	//============ 멤버변수(학생이 가지는 속성) ==============
	String studentName; //학생 이름
	int studentGrade; // 학년
	String address; // 주소
	double height; // 키 
	
	
	// ============= 메서드(기능) =================
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
