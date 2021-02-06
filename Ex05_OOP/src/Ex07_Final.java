
// 변수 <-> 상수
// 상수 : 한번 값이 초기화(최초로 값이 할당되면) 되면 변경이 불가능
// 상수자원 : 고유값(주민번호), 수학 : 원주율 PI = 3.141592, 버전번호, 시스템 관리 번호
// 상수는 관용적으로 대문자로 사용

// java : final int NUM = 10;
// c#   : const integer NUM = 10;

// final ... 이 키워드가 어디에 붙느냐에 따라
// final class car { } >> 상속 금지 >> final Math
// 함수앞에 붙으면 >> public final void print() { } >> 상속관계에서 재정의 (상속관계에서 오버라이드 금지)
// public static final void print() { } >> 객체간 공유 자원 (

class Vcard {
    final String KIND = "heart";
    final int NUM = 10;
    void method() {
        System.out.println(Math.PI);
    }
}

class Vcard2 {
    final String KIND;
    final int NUM;
    
    Vcard2() {
        this.KIND = "heart";
        this.NUM = 10;
    }
    Vcard2(String kind, int num) {
        this.KIND = kind;
        this.NUM = num;
    }
    
    @Override
    public String toString() {
        return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
    }
}

public class Ex07_Final {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vcard vcard = new Vcard();
        System.out.println(vcard.KIND);
        System.out.println(vcard.NUM);
        vcard.method();
        
        Vcard2 vcard2 = new Vcard2("Diamond", 3);
        System.out.println(vcard2.KIND);
        System.out.println(vcard2.NUM);
        System.out.println(vcard2);
        
    }

}
