
class Product {
    int price;
    int bonusPoint;
    
    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(this.price / 10.0);
    }
}

class KtTv extends Product {
    // 가격 정보는 부모가 
    KtTv() {
        super(500);
    }
    
    @Override
    public String toString() {
        return "KtTv";
    }
}

class Audio extends Product {
    // 가격 정보는 부모가 
    Audio() {
        super(100);
    }
    
    @Override
    public String toString() {
        return "Audio";
    }
}

class NoteBook extends Product {
    // 가격 정보는 부모가 
    NoteBook() {
        super(150);
    }
    
    @Override
    public String toString() {
        return "NoteBook";
    }
}

// 구매자
class Buyer {
    int money = 1000;
    int bonuspoint;
    
    // 구매자는 구매 행위를 할 수 있다. (기능, 메소드)
    // 구매행위 (잔액 - 제품의 가격, 포인트는 정보 갱신(증가)
    // *** 구매자는 매장에 있는 모든 물건을 구매할 수 있다.
    
    /*
    void KttvBuy(KtTv n) { // 구매자가 어떤 물건을 살지 정보를 알아야 (그 물건의 가격정보를 얻어올 수 있다)
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; // 함수를 빠져나감 (종료)
        }
        // 실 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonusPoint; // 누적
        System.out.println("구매한 물건은 : " + n.toString());
    }
    void AudioBuy(Audio n) { // 구매자가 어떤 물건을 살지 정보를 알아야 (그 물건의 가격정보를 얻어올 수 있다)
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; // 함수를 빠져나감 (종료)
        }
        // 실 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonusPoint; // 누적
        System.out.println("구매한 물건은 : " + n.toString());
    }
    void NoteBookBuy(NoteBook n) { // 구매자가 어떤 물건을 살지 정보를 알아야 (그 물건의 가격정보를 얻어올 수 있다)
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; // 함수를 빠져나감 (종료)
        }
        // 실 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonusPoint; // 누적
        System.out.println("구매한 물건은 : " + n.toString());
    } */
    void Buy(Product n) {
        if (this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다 ^^!" + this.money);
            return; // 함수를 빠져나감 (종료)
        }
        // 실 구매 행위
        this.money -= n.price; // 잔액
        this.bonuspoint += n.bonusPoint; // 누적
        System.out.println("구매한 물건은 : " + n.toString()); // 부모타입으로 자식타입을 받았어도 override된건 제외되기에 제품명으로 노출됨
    }
}

public class Ex12_Inherit_KeyPoint {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        KtTv kttv = new KtTv();
        Audio audio = new Audio();
        NoteBook notebook = new NoteBook();
        
        Buyer buyer = new Buyer();
        
        //buyer.KttvBuy(kttv);
        //buyer.AudioBuy(audio);
        //buyer.NoteBookBuy(notebook);
        //buyer.KttvBuy(kttv);
        
        buyer.Buy(kttv);
        buyer.Buy(audio);
        buyer.Buy(notebook);
        buyer.Buy(kttv);
        
        // 1차 코드 (물건 3개... 구매할 수 있는 함수)
        
        // 1차 오픈
        // - 하와이 휴가.....
        // D-day 공식 오픈
        // 매장에 제품이 1000개의 다른 종류의 제품 (마우스, 토스트기) 제품등록 (자동화)
        // 매장에 1000개의 제품 전시
        // 매장에 고객 입장... 고객 불만 폭주 >> 3개 제품만 살 수 있음 ... >> 997개 판매 불가
        
        // 전화 >> 친구 >> 욕(...) >> 친구 >> PC방 >> 국내 전산망 >> 개발 서버 접속 >> 남은 휴가 3일
        // 997개의 함수를 만들었어요... (마우스 함수, 토스트기 함수, ... )
        // 휴가 END....
        
        // 변화에 대응하는 코드를 만들지 못했다.
        // 즐거운 휴가를 보내기 위한 방법은?

    }

}
