
/*
 * Tip) C# 다형성 (overloading override)
 * 
 * Java : [상속관계]에서 [하나의 참조 변수]가 [여러개의 타입]을 가질 수 있다.
 * [하나의 참조변수] >> 상속에서만 되고 부모타입만 됨
 * 
 * 부모 클래스 타입의 참조변수가 여러개의 자식클래스 객체를 담을 수 있다.
 */

class Tv2 {
    boolean power;
    int ch;
    
    void power() {
        this.power = !this.power;
    }
    void chUp() {
        this.ch++;
    }
    void chDown() {
        this.ch--;
    }
}

class CapTv extends Tv2 { // 자막이 있는 티비
    // 특수화, 구체화 된 자원 : 자막 기능
    String text;
    String captionText() {
        return this.text = "현재 자막 처리 중...";
    }
}

public class Ex10_Inherit_Poly {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        CapTv captv = new CapTv();
        captv.power();
        System.out.println("전원 : " + captv.power);
        
        captv.chUp();
        System.out.println("채널 정보 : " + captv.ch);
        System.out.println(captv.captionText());
        // 기존 배운 내용 
        
        // Car c = new Car();
        // Car c2 = c;
        
        Tv2 tv2 = captv;
        // 상속 관계에서 [부모타입]은 [자식타입]의 [주소]를 가질 수 있다
        // 단 부모는 자신의 자원만 접근할 수 있다. (자식의 자원은 못봄)
        // 단 재정의를 제외한다. (자식이 부모 tv를 재정의(override) 개조 해놨다면 부모는 개조된 tv를 보게된다)
        
        System.out.println(tv2.toString()); //CapTv@6ff3c5b5
        System.out.println(captv.toString()); //CapTv@6ff3c5b5 둘이 주소 같음
        
        //tv2.captionText();
        //tv2.text;
        // 자식 것은 접근 불가
        tv2.power(); // 내것은 접근 가능
        
        // 자원을 아끼기 위해 사용 (자식 객체 생성 시, heap에 이미 부모 객체도 생성되어있으니까)

    }

}
