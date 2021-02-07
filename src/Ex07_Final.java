//변수<->상수
//상수: 한번값이 최기화(최초값의 할당) 되면 변경 불가
//상수자원: 고유값(주민번호...),수학:원주율,,등등,,
//상수는 관용적으로 대문자 

//java: final int NUM=10;
//c#: const integer NUM=10;

//final 키워드
//final class Car{}>>상속 금지>> final Math
//함수앞에>>public final void print(){} 상속관계에서 재정의 (오버라이드 금지!)
//public static final void print()>>객체 공유자원(

class Vcard{
	final String KIND="heart";
	final int NUM=10;
	void method() {
		System.out.println(Math.PI);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

class Vcard2{
		final String KIND;
		final int NUM;
		
		Vcard2(){
			this.KIND="heart";
			this.NUM=10;
		}
		Vcard2(String kind, int num){
			this.KIND=kind;
			this.NUM=num;
			
		}

		@Override
		public String toString() {
			return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
		}
}

public class Ex07_Final {
	public static void main(String[]args) {
		Vcard vcard= new Vcard();
		System.out.println(vcard.KIND);
		vcard.method();
		
		Vcard2 vcard2=new Vcard2();
		System.out.println(vcard2);

		Vcard2 vcard3=new Vcard2("heart",7);
		System.out.println(vcard);
		
	}
			

}
