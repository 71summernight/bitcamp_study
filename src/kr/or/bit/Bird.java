package kr.or.bit;

// 새 공통사항 (일반, 추상) >> 새는 날 수 있다, 새는 빠르다

public class Bird {
    // 공통기능
    public void fly() {
        System.out.println("flying");
    }
    
    // 설계자 입장
    // 나를 상속하는 클래스가 moveFast를 필요에 따라 재정의 했으면 좋겠다 (80%) >> 상속관계에서만
    protected void moveFast() {
        fly();
    }
}
