import kr.or.bit.Pclass;

/*
 * private, default, public, 상속관계에서 protected
 * 
 * protected: 박쥐(양면성) >어느상황에는 default, 어느 상황에는 public
 * 
 * >>상속이 없는 클래스 안에서 protected 접근자는 default와 같아요
 * >>결국 상속관계에서만 의미를 가진다.
 * 
 */
class Dclass{
	public int i;
	private int p;
	int s; //default
	protected int k; //default (일반클래스에서 쓸이유가 없음, 걍 디폴트랑 똑같음)

	
}

class Child2 extends Pclass{
	void method() {
		
		this.k=100; //상속관계 protected public 처
		System.out.println(this.k);
	}
	
	
}



public class Ex08_Inherit_Protedcted {
	public static void main(String[]args) {
		Child2 ch=new Child2();
		ch.method();
		
		
		
	}

}
