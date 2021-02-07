
/*
 * Tip) C# 다형성(overloading, override)
 * 
 *Java: 상속관계에서 하나의 참조변수가 여러개의 타입을 가질 수 있다.
 *[하나의 참조변수]>>부모타입
 *
 *부모클래스 타입의 참조변수가 여러개의 자식 클래스 객체를 담을 수 있다.
 *
 */
class Tv2{
	boolean power;
	int ch;
	
	void power() {
		this.power=!this.power;
		
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		
	}
}
class CapTv extends Tv2{  //자막이 있는 Tv
	//특수화, 구체화 자원 >>자막기능
	String text;
	String captionText() {
		return this.text="현재 자막 처리중...";
		
	}
	
}
public class Ex10_Inherit_Poly {
		public static void main(String[]args) {	
			CapTv captv= new CapTv();
			captv.power();
			System.out.println("전원: "+captv.power);
			
			captv.chUp();
			System.out.println("채널: "+ captv.ch);
			System.out.println(captv.captionText());
			//기존 배운 내용
			//Car c= new Car();
			//Car c2=c;
			Tv2 tv2= captv; 
			//'상속관계'에서 [부모타입]은 [자식타입]의 [주소]를 가질 수 있다.(다형성)
			//단, 부모는 자신의 자원만 접근 가능하다.
			//단, 재정의를 제외하면.
			//프로그램 세계에서 자식은 부모에 조건없이 드려요.
			System.out.println(tv2.toString());	
			System.out.println(captv.toString()); //->부모타입으로 접근
			
			//tv2.captionText();
			//자식의 것은 접근 불가
			tv2.power();
		 
		
			
		}
		
	
}
