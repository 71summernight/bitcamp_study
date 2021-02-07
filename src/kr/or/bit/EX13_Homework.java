package kr.or.bit;

/*
문제 풀어 보세요 ^^
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개 , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다
계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력​
hint) 카트 물건을 담는 행위 (Buy() 함수안에서 cart 담는 것을 구현 )
hint) Buyer ..>> summary() main 함수에서 계산할때
구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
*/



class Product{

    int price;
    Product(int price){
        price = price;
    }

    public int getPrice(){
        return price;
    }
}


class KtTv extends Product{
    //가격정보 부모
    KtTv(){
        super(500);
    }
    @Override
    public String toString() {
        return "KtTv";

    }


}


class Audio extends Product{
    Audio(){
        super(100);
    }
    @Override
    public String toString() {
        return "Audio";

    }

}


class NoteBook extends Product{
    NoteBook(){
        super(150);
    }
    @Override
    public String toString() {
        return "NoteBook";

    }

}


class Mp3 extends Product {
    Mp3() {
        super(50);
    }

    @Override
    public String toString() {
        return "Mp3";

    }
}


class Washer extends Product {
    Washer() {
        super(120);
    }

    @Override
    public String toString() {
        return "Washer";

    }
}

class Buyer {

    void buy(Product[] products) {
        if (products.length > 10) {
            System.out.println("수량초과!! 고객님 더이상 담으실 수 없습니다.");
            return;
        }
        int totalPrice = 0;
        String name="";
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].getPrice();
            name=name+", "+products[i].toString();
        }
        System.out.println("구매하신 물품은: "+name);
        System.out.println("구매하신 물품의 총 가격은: " + totalPrice);
    }
}


public class EX13_Homework {

    public static void main(String[] args) {	

        KtTv kttv = new KtTv();
        Audio audio = new Audio();
        NoteBook notebook = new NoteBook();
        Mp3 mp3 = new Mp3();
        Washer washer= new Washer();

        Buyer buyer = new Buyer(); //구매자

        Product[] products = {kttv, audio, notebook, mp3, washer,};
        buyer.Cart(products);

    }

}