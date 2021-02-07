import java.util.Scanner;

import kr.or.bit.Bird;

class Student{
	
	public String getName(String name) {
		String aa = "";
		if("김현진".equals(name)) {
			aa = name + "학생";
		}else {
			aa = name + "선생";
		}
		
		return aa;
	}
	
	public String getClass(String name) {
		String aa = "";
		if("김현진".equals(name)) {
			aa = name + "학생";
		}else {
			aa = name + "선생";
		}
		
		return aa;
	}
	
	public int getAge(String name) {
		int age = 0;
		if("김현진".equals(name)) {
			age = 29;
		}else {
			age = 30;
		}
		
		return age;
	}
}

public class ahffk {
	
	
	public static void main(String[] args) {
	
		//1.학생 클래스 갖고오기
		//2.학생클래스의 겟네임이라는 메소드 갖고오기
		//3.그 메소드의 서명주라는 이름을 넣기
		//4. 결과값 출력
		
		Student student = new Student();
		String name = "김현진";
		String result = student.getName(name);
		int age = student.getAge(name);
		
		result = student.getName("서명주");
		
		
		
		
		
		System.out.println(result);
	 
		
		
	}
}



