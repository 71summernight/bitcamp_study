
/*
 * OOP
 * 1. 상속
 * 2. 캡슐화
 * 3. 다형성
 * 
 * 1. 상속
 * java : child extends Base
 * c# : child : Base
 * 
 * 2. 특징
 * 2.1 단일상속 (계층적 상속 : 여러개의 클래스 상속)
 * 2.1 다중 상속을 지원 (단 interface)
 * 
 * 3. 상속
 * 3.1 진정한 의미 : 재사용성
 * 3.2 단점 : 초기 설계 비용
 * 3.3 재사용성 >> 설계 >> 비용 (수학적으로는 공통분모(추상화))
 * 
 * 4. 상속관계
 * GrandFather >> Father >> Child
 * 부모부터 heap 올라간다...
 * Child child = new Child()
 * 
 * 사용자가 만드는
 * 
 */

// 상속 관계에서는 가장 최상위(Base)가 되는 클래스가 Object를 상속한다.
class GrandFather { // extends Object { 컴파일러가 알아서 처리
    public GrandFather() {
        System.out.println("GrandFater");
    }
    public int gmoney = 5000;
    
    private int pmoney = 1000;
    
    // 이건 아닌 방법
    //public void call() {
    //    System.out.println(pmoney);
    //}
}

class Father extends GrandFather {
    public Father() {
        System.out.println("Fater");
    }
    public int fmoney = 3000;
}

class Child extends Father {
    public Child() {
        System.out.println("Child");
    }
    public int cmoney = 1000;
}

// default
// 사용자가 만드는 모든 클래스는
// class Car extends Object

class Car { // extends Object {
    
}

// 사용자가 만드는 모든 클래스는 default Object(최상위) 클래스 상속
// Object 가장 추상화, 가장 일반화...
// Object 가 가지는 자원 : 모든 클래스가 공통 사용하는 것들 ... 주소 확인, 공통함수

public class Ex01_Inherit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Child child = new Child();
        System.out.println(child.gmoney);
        System.out.println(child.fmoney);
        System.out.println(child.cmoney);
        
        // child.pmoney; >> private 이라 안됨
        
        // child.call(); >> 이건 아닌 방법
        
        
        Car car = new Car();
        //car.

    }

}
