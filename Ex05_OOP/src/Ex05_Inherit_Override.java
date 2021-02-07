import kr.or.bit.Emp;

class Test2 {
    int x = 100;
    void print() {
        System.out.println("부모 함수 Test2");
    }
}

class Test3 extends Test2 {
    int x = 300;  //c# 표현 >> 부모 무시하기 ㅋㅋ 쓰지마세요
    
    @Override
    void print() {
        System.out.println("자식이 부모 함수를 재정의");
    }
    
    //overloading
    void print(String str) {
        System.out.println("나 오버로딩이야");
    }
    
}

public class Ex05_Inherit_Override {

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        System.out.println(t3.x);
        t3.print();
        t3.print("안녕");
        
        System.out.println("--------------------------");
        
        Emp emp = new Emp(1000, "홍길동");
        System.out.println(emp); // 조작된 주소 : kr.or.bit.Emp@3764951d
        System.out.println(emp.toString()); // kr.or.bit.Emp@3764951d
        // emp 라고 출력하면 사실은 toString() 뒤에 숨어있음
        // toString()은 Object가 가지는 자원
        // toString은 주소값과 자원을 가지고 있다.
        
        // Object toString() 원하면 재정의 해서 써
        // 개발자들은 toString은 관용적으로 멤버필드를 찍는 용도로(검증) 사용
    }

}
