import java.util.Arrays;

class Product0 {
    int price;
    int bonusPoint;
    
    Product0(int price) {
        this.price = price;
        this.bonusPoint = (int)(this.price / 10.0);
    }
}

class KtTv0 extends Product0 {
    KtTv0() {
        super(500);
    }
    
    @Override
    public String toString() {
        return "KtTv";
    }
}

class Audio0 extends Product0 {
    Audio0() {
        super(100);
    }
    
    @Override
    public String toString() {
        return "Audio";
    }
}

class NoteBook0 extends Product0 {
    NoteBook0() {
        super(150);
    }
    
    @Override
    public String toString() {
        return "NoteBook";
    }
}

// 구매자
class Buyer0 {
    int money = 1000;
    int bonuspoint;
    Product0[] cart = new Product0[10];
    
    // 카트에 상품 담기
    void addCart(Product0 n) {
        for(int i = 0; i < this.cart.length; i++) {
            if (this.cart[i] != null) {
                if (i == 9) {
                    System.out.println("장바구니가 가득 찼습니다. 장바구니를 비워주세요!^^");
                    return;
                }
                continue;
            } else {
                this.cart[i] = n;
                System.out.println("장바구니에 넣은 상품 : " + n.toString());
                break;
            }
        }
    }
    
    // 카트 비우기
    void initCart() {
        for (int i = 0; i < this.cart.length; i++) {
            this.cart[i] = null;
        }
    }
    
    // 카트 프린트 기능
    void printCart() {
        String msg = "";
        if (beforeSummaryCartCheck() == false) {
            return;
        }
        for(int i = 0; i < this.cart.length; i++) {
            if (this.cart[i] == null) {
                break;
            }
            msg += this.cart[i].toString() + " ";

        }
        System.out.println("현재까지 카트에 담긴 목록 : " + msg);
    }
    
    // 카트 비었나 체크
    boolean beforeSummaryCartCheck() {
        if (this.cart[0] == null) {
            System.out.println("장바구니가 비어있습니다. 상품을 담아보세요!");
            return false;
        } else {
            return true;
        }
    }
    
    // 카트 이용하여 다중상품 계산대에서 구매
    void summary() {
        String msg = "";
        int totalPrice = 0;
        if (beforeSummaryCartCheck() == false) {
            return;
        }
        for (int i = 0; i < this.cart.length; i++) {
            if (this.cart[i] == null) {
                break;
            } else if (this.money < this.cart[i].price) {
                System.out.printf("\n[!] 카트에 담긴 상품의 총 결제 금액보다 잔액이 부족하여 일부 상품만 결제됩니다.\n");
                break;
            }
            else {
                this.money -= this.cart[i].price;
                this.bonuspoint += this.cart[i].bonusPoint;
                msg += this.cart[i].toString() + " ";
                totalPrice += this.cart[i].price;
            }
        }
        System.out.printf("\n == 계산대에 오신걸 환영합니다! 계산을 진행합니다. == \n");
        System.out.println("구매하신 상품 리스트 : " + msg);
        System.out.println("총 결제 금액 : " + totalPrice + " / " + "고객님의 잔액 : " + this.money);
        System.out.println("적립된 포인트 : " + this.bonuspoint);
        initCart();
    }
      
    // 하나의 상품만 구매
    void buyOneItem(Product0 n) {
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; // 함수를 빠져나감 (종료)
        }
        // 실 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonusPoint; // 누적
        System.out.println("구매한 물건은 : " + n.toString()); // 부모타입으로 자식타입을 받았어도 override된건 제외
    }

    @Override
    public String toString() {
        return "Buyer0 [money=" + money + ", bonuspoint=" + bonuspoint + ", cart=" + Arrays.toString(cart) + "]";
    }
    
}

public class Ex13_Grop1_Tasks {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        KtTv0 kttv = new KtTv0();
        Audio0 audio = new Audio0();
        NoteBook0 notebook = new NoteBook0();
        
        Buyer0 buyer = new Buyer0();
        
        buyer.addCart(kttv);
        buyer.addCart(audio);
        buyer.addCart(notebook);
        buyer.addCart(kttv);
        buyer.addCart(audio);
        buyer.addCart(notebook);
        
        buyer.printCart();
        
        buyer.summary();
        
    }

}
