/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은 제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
​시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원 , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은 감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
1차 코드 (물건이 3개 ...구매할 수 있는 함수)
 *
 * 
 *  * 1차오픈
 * -하와이 휴가......
 * 
 * 공식오픈
 * 매장에 제품이 1000개 다른 종류의 제품 (마우스, 토스트기) 제품등록(자동화)
 * 매장에 1000개의 전시
 * 고객>>>고객불만>>3개 제품만 살수 있다....>>997개 판매 못함
 * 
 * 전화>>친구>>욕(...)>>친구 >>PC방>>국내 ㅓㄴ산망>> 개발서버 접속 >>남은휴가 3일동안
 * 997개의 함수를 만들었어요(마우스 함수, 토스기 함수...)
 * 1. 함수를 하나로 통합할 방법
 * 2. 제품의 이름을 어찌어찌...
 * 3. buy함수를 하나 만들어서 파라미터를 product객체로 받는다.
 * 
 */





class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price=price;
		this.bonuspoint=(int)(this.price/10.0);
		
	}
}

class KtTv extends Product{
	//가격정보 부모
	KtTv(){
		//this = new Product(500);
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

//구매자
class Buyer{
	int money =1000;
	int bonuspoint;
	//구매자는 구매행위를 할 수 있다.(기능)
	//구매행위(잔액-제품의 가격, 포인트 정보 갱신(증가)
	//*******구매자는 매장에 있는 모든 물건을 구매할 수 있다.********
	
//	void KtTvBuy(KtTv n) { //구매자가 어떤 물건을 살지를 알아야 (그 물건의 가격정보를 얻어올 수 있다.)
//		if(this.money<n.price) {
//			System.out.println("고객님 잔액이 부족합니다 ^^!"+ this.money);
//			return;
//			}
//		//실제 구매 행위
//		this.money-=n.price; //잔액
//		this.bonuspoint+=n.bonuspoint; //포인트 누적
//		System.out.println("구매한 물건은: "+n.toString());
//		
//		
//				
//	}
//	
//	void AudioBuy(Audio n) { //구매자가 어떤 물건을 살지를 알아야 (그 물건의 가격정보를 얻어올 수 있다.)
//		if(this.money<n.price) {
//			System.out.println("고객님 잔액이 부족합니다 ^^!"+ this.money);
//			return;
//			}
//		//실제 구매 행위
//		this.money-=n.price; //잔액
//		this.bonuspoint+=n.bonuspoint; //포인트 누적
//		System.out.println("구매한 물건은: "+n.toString());
//		
//		
//				
//	}
//	
//	void NoteBookBuy(NoteBook n) { //구매자가 어떤 물건을 살지를 알아야 (그 물건의 가격정보를 얻어올 수 있다.)
//		if(this.money<n.price) {
//			System.out.println("고객님 잔액이 부족합니다 ^^!"+ this.money);
//			return;
//			}
//		//실제 구매 행위
//		this.money-=n.price; //잔액
//		this.bonuspoint+=n.bonuspoint; //포인트 누적
//		System.out.println("구매한 물건은: "+n.toString());
//		
//		
//				
//	}
//	
//	
//}
	
	
	//2차개선: 하나의 여러가지기능(overloading)
	//반복되는 코드를....모든 제품은 Product 상송... 모든 제품의 부모는 Product
	//다형성
	//Product p;
	//KtTv t=new KtTv();
	//p=t;
	
	
	void Buy(Product n) { //구매자가 어떤 물건을 살지를 알아야 (그 물건의 가격정보를 얻어올 수 있다.)
		if(this.money<n.price) {
			System.out.println("고객님 잔액이 부족합니다 ^^!"+ this.money);
			return;
			}
		//실제 구매 행위
		this.money-=n.price; //잔액
		this.bonuspoint+=n.bonuspoint; //포인트 누적
		System.out.println("구매한 물건은: "+n.toString());
		
		
				
	}
	
	
	
}

public class Ex12_Inherit_Keypoint {
	public static void main(String[]args) {
		KtTv kttv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		Buyer buyer = new Buyer(); //구매자
		buyer.Buy(kttv);
		buyer.Buy(audio);
		buyer.Buy(notebook);
		buyer.Buy(kttv);
		buyer.Buy(audio);
		
		
		
		
	}
	
}
