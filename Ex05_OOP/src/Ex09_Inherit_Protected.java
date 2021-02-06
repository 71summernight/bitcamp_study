import kr.or.bit.Bird;

// Bird를 상속 받아 구현

class Bi extends Bird {
    
    @Override
    protected void moveFast() { // 지금 Bi와 Ex09는 같은 폴더 같은 패키지
        super.moveFast();
    }   
}

class Ostrich extends Bird {
    // 구체화
    void run() {
        System.out.println("run^^");
    }
    
    @Override
    protected void moveFast(){
        run();
    }
}
public class Ex09_Inherit_Protected {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Bi bi = new Bi();
        bi.fly();
        // Point
        // bi.moveFast(); default .. (같은 폴더) .. 상속관계에서만..
        
        bi.moveFast();
        
        Ostrich o = new Ostrich();
        o.run();
        o.moveFast();
    }

}
