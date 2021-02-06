package kr.or.bit;

public class Pclass {
    
    public int j; // default package, kr.or.bit 둘 다 사용
    private int o; // 여기 클래스에서만 사용
    int p; // default kr.or.bit 안에서만 사용
    
    protected int k;
    protected void m() { // 재정의
        // 니가 이 안의 내용을 바꾸었으면 좋겠어
    }

}
