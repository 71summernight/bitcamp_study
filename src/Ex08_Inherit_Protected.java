import kr.or.bit.Pclass;

/*
 * private, default, public, [상속 관계]에서 protected
 * 
 * protected : 박쥐 (양면성) > default, public
 * 
 * >> 상속이 없는 클래스 안에서 protected 접근자는 default와 같음
 * >> 결국 상속관계에서만 의미를 가진다
 * 
 */

class Dclass {
    public int i;
    private int p;
    int s; // default
    protected int k; // default (일반 클래스는 사용할 이유 없다)
}

class Child2 extends Pclass {
    void method() {
        this.k = 100; // 상속관계 protected public 처럼
        System.out.println(this.k);
    }
    
}

public class Ex08_Inherit_Protected {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Child2 ch = new Child2();
        ch.method();
        
    }

}
