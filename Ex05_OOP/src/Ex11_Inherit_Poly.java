
class Pbase {
    int p = 100;
}

class Cbase extends Pbase {
    int c = 200;
}

class Dbase extends Pbase {
    int d = 300;
}

public class Ex11_Inherit_Poly {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Cbase cbase = new Cbase();
        System.out.println(cbase.toString());
        
        Pbase p = cbase; // 부모 타입이 자식 타입 객체의 주소를 가짐 >> 다 형 성
        System.out.println(p.toString());
        
        Dbase dbase = new Dbase();
        System.out.println(dbase.toString());

        p = dbase; // 부모 타입이 자식 타입 객체의 주소를 가짐 >> 다 형 성
        System.out.println(p.toString());
        
        // 부모가 객체의 주소를 다시 자식에게 줄때는 자식 타입으로 casting
        Cbase c = (Cbase)p;
        // 자식타입으로 내려주어야 상속관계에서 자식은 모든 자원에 대한 접근이 가능
    }

}
