
/*
 * this : 객체 자신을 가르키는 this (this.empNo, this.eName)
 * this : 생성자를 호출하는 this (
 * 
 * 상속
 * 
 * 부모
 * 
 * 자식 (this)
 * 
 * super(현재 자식이 부모의 접근 주소값) : 상속 관계에서 부모에 접근 :
 * 자식 입장에서 super 부모의 객체의 주소
 * 
 * 1. super >> 상속관계에서 자식이 부모의 접근
 * 2. super >> 상속관계에서 부모의 생성자를 호출 (명시적으로)
 * 
 * Tip )
 * c# >> base()
 * java >> super()
 * 
 */

class Base {
    String baseName;
    Base() {
        System.out.println("Base 기본 생성자 함수");
    }
    Base(String baseName) { // 오버로딩
        this.baseName = baseName;
        System.out.println("baseName : " + this.baseName);
    }
    void method() {
        System.out.println("나 부모 method");
    }
}

class Derived extends Base {
    String dName;
    Derived() {
        System.out.println("Derived 기본 생성자 함수");
    }
    Derived(String dName) { // 오버로딩
        
        super(dName); // 상속관계에서 부모 생성자를 호출
        
        this.dName = dName;
        System.out.println("dName : " + this.dName);
    }
    @Override
    void method() {
        // TODO Auto-generated method stub
        //super.method();
        System.out.println("부모함수 재정의");
    }
    
    // 상속 관계에서 자식이 부모의 함수를 재정의 했다면, 부모의 함수를 다시 사용할 수 있는 방법은
    // 함수를 다시 만들고 super.부모함수(); 호출로 사용해야 할 수 없
    
    // 어느 날 부모님의 모습이... 갑자기 엄마가 보고싶어짐ㅠ
    // 유일한 방법 super
    void parent_method() {
        super.method();
    }
    
}

public class Ex06_Inherit_super {

    public static void main(String[] args) {
        //Derived d = new Derived();
        Derived d = new Derived("홍길동"); // 이렇게되면 부모는 오버로딩 생성자를 호출하는게 아닌 default 생성자 호출함
        d.method();
        d.parent_method();
    }

}
