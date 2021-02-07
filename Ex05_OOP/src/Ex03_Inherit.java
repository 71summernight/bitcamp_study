// 설계도가 2개

class Tv {
    boolean power;
    int ch;
    
    void power() { // 토글 toggle
        this.power = !this.power;
    }
    void chUp() {
        this.ch++;
    }
    void chDown() {
        this.ch--;
    }
}

class Vcr { // 비디오 플레이어
    boolean power;
    void power() {
        this.power = !this.power;
    }
    void play() {
        System.out.println("재생하기");
    }
    void stop() {
        System.out.println("정지하기");
    }
    void rew() {
        System.out.println("뒤로감기");
    }
    void ff() {
        System.out.println("빨리감기");
    }
}

/*
 * Tv 설계도 / Vcr 설계도
 * 
 * TvVcr 이라는 제품
 * 1. 다중상속 안됨ㅠ
 * 2. 계층적 상속 시 >> 멤버필드 이름이 충돌남
 * 
 * 해결 : class TvVcr extends Tv { Vcr vcr }
 * 
 * 1. class TvVcr {Tv v; Vcr v;}
 * 2. class TvVcr extends Tv { Vcr vcr }
 * 3. class TvVcr extends Vcr { Tv tv }
 * 
 * Q : Tv 상속?, Vcr 상속? 
 * 주기능.메인기능 >> 둘 중에 비중 >> 비중이 높은 클래스 (상속) >> 나머지 포함
 */

class TvVcr extends Tv {
    Vcr vcr;
    TvVcr() {
        vcr = new Vcr();
    }
}

public class Ex03_Inherit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TvVcr t = new TvVcr();
        // 티비
        t.power();
        System.out.println("티비 전원 : " + t.power);
        t.chUp();
        System.out.println("티비 채널 : " + t.ch);
        
        // 비디오
        t.vcr.power();
        System.out.println("비디오 전원 : " + t.vcr.power);
        t.vcr.play();
        t.vcr.stop();
        t.vcr.power();
        t.power();
        
        System.out.println("티비 전원 : " + t.power);
        System.out.println("비디오 전원 : " + t.vcr.power);
    }

}
