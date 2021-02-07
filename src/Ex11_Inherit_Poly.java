
	class Pbase{
	int p=100;
	}
class Cbase extends Pbase{
	int c=200;
}
class Dbase extends Pbase{
	
}
public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		
		Cbase cbase=new Cbase();
		System.out.println(cbase.toString());
		//다형성
		Pbase p=cbase;
		Dbase dbase=new Dbase();
		
		p=dbase;
		System.out.println(p);
		
		Cbase c=(Cbase)p; //부모가 객체의 주소를 다시 자식에게 줄때는 자식타입으로 casting을 통해서 전달을 합니다.
		//자식으로 내려주어 상속관계에서 자식은 모든 자원에 대한 접근이 가능하다.
		
		

	}

}