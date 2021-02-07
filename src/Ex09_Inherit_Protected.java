import kr.or.bit.Bird;

//Bird 상속받아서 구현

class Bi extends Bird{
	@Override
	protected void moveFast() {
		super.moveFast();
	}
	
	
}
class Ostrich extends Bird{
	void run() {
		System.out.println("run^^");
		
	}
	@Override
	protected void moveFast() {
		run();
	}
	
}


public class Ex09_Inherit_Protected {

	public static void main(String[] args) {
		Bi bi=new Bi();
		bi.fly();
		//POINT
		//bi.moveFast(); 불가능
		//protected 상속관계에서만 퍼블릭.
//					지금은 디폴트로 사용됌(같은 폴더에서만 접근가능)
	
	
		bi.moveFast();
		Ostrich o=new Ostrich();
		o.run();
		o.moveFast();
		
	}

}
