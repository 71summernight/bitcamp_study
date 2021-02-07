import java.util.Scanner;

public class dkansdjks {

	public static String getStudentName(String name1) {
		String result=name1+"학생";
		return result;
	}
	
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("값을 입력하세요");
//		int userChoice=scanner.nextInt();
////		if(userChoice==1) {
////			System.out.println("메");
////		}
//		
		
		String result = getStudentName("김현진");
		System.out.println(result);
	}
}



class GuGuClass {
	public int multi(int num) {
		int result= num*3;
		return result;
	}
}
