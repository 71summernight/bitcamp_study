
/*
 *this: 객체 자신을 가르키는 this (this.empnno,ename)
 *
 *상송
 *
 *자식(this)
 *
 *super(현재 자식이 부모의 접근 주소값): 상속관계에서 부모에 접근: 
 *자식 입장에서 super는 부모객체의 주소
 *
 *1.super >>상속관계에서 자식이 부모에 접근
 *2super>> 상속관계에서 부모의 생성자를 호출(명시적으로)
 *
 *tip)
 *c#>>base()
 *java>>super()
 *
 */
class Base{
	String basename;
	Base(){
		System.out.println("Base 기본 생성자 함수");
		
	}
	Base(String basename){
		this.basename=basename;
		System.out.println("basename: "+this.basename);
		
	}
	
 void method() {
	 System.out.println("나 부모 method");
	 
 }
}
class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived 기본 생성자 함수");
		
	}
	
	Derived(String dname){
		super(dname); //부모 생성자를 호출(상속관계)
		this.dname=dname;
		System.out.println("dname: "+this.dname);
	}
	
	@Override
	void method() {
		System.out.println("부모함수 재정의");
		
	}
	
	//어느 부모님의 모습이....그리워요
	//유일한 방법:super
	void parent() {
		
	}
	
}


public class Ex06_Inherit_super {

	public static void main(String[] args) {
		Derived d=new Derived("홍길동");
		d.method();//부모의 함수
//		d.parent_method();
		
	}

}
