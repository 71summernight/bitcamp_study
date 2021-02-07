package kr.or.bit;

import java.util.Scanner;

public class Cinnema {

	public static void main(String[] args) {
		String[][] seat= new String[4][5];
		String[][] reservationNum= new String[2][20];
		int index=0;
		for(int i=0; i < seat.length; i++) {
			for(int j=0; j < seat[i].length;j++) {	
				seat[i][j]=(char)(i+65)+"-"+(j+1);
//				System.out.print("["+seat[i][j]+"]");
				reservationNum[0][index]=seat[i][j];
				index++;

			}
//				System.out.println();

		}
		
		//메뉴
		boolean logOut=true;
		while(logOut) {
			System.out.println("**************************");
	        System.out.println("*******영화 예매 시스템*******");
	        System.out.println("**************************");

	        System.out.println("1. 예매하기");
	        System.out.println("2. 예매조회");
	        System.out.println("3. 예매취소");
	        System.out.println("4. 종료");
	        
	        Scanner sc= new Scanner(System.in);
	        System.out.println("숫자를 선택해주세요.");
	        System.out.println(">>");
	        int userChoice = sc.nextInt();
	        switch(userChoice) {
	        	case 1: //예매하기
	        		
	        		boolean innerLogOut=true;
	        		while(innerLogOut) {
	        			//좌석현황 보여주기
	        			System.out.println();
	                    System.out.println("*********좌석현황**********");
	                    for(int i=0;i<seat.length;i++) {
	                    	for(int j=0; j<seat[i].length;j++) {
	            				System.out.print("["+seat[i][j]+"]");
	                    	}
	        				System.out.println();

	                    }
	                    System.out.println("———————-------------—————");
		        		//좌석현황 끝
		        		//좌석선택
	                    System.out.println("좌석을 선택해주세요. 예) A-1");
	                    System.out.println("이미 예매된 좌석은 \"예매\"라고 표시됩니다." );
	                    String userChoiceSeat=sc.nextLine();
	                    for(int i=0;i<seat.length;i++) {
	                    	for(int j=0; j<seat[i].length;j++) {
	                    		if(userChoiceSeat.equals(seat[i][j])) {
	                    			System.out.println("예매 가능합니다. 예매하시겠습니까?");
	                                System.out.println("네(1), 아니오(2), 초기화면(0) 중 하나를 입력해주세요");     
	                                int choice= sc.nextInt();
	                                
	                                if(choice==1) { //예매 
	                                	
	                                	
	                                	
	                                }
	                                
	                                
	                                else if(choice==2) { //아니요
	                                
	                                	break;
	                                }else if(choice==0){ //초기화면
	                                	
		                               innerLogOut=false;
		                                break;
	                                }
	                                
	                                
	                                

	                    		}
	                    	}
	                    }
	        			
	        			
	        		}
	        		
	        		break;
	        		                    
                    
                    
	        	case 2:	//예매조회
	        		break;
	        	case 3: //예매취소
	        		break;
	        	case 4: //종료
	        		logOut=false;
	        		break;
	        	default: 
	        		System.out.println("잘못입력하셨습니다. 1~4까지의 숫자를 입력해주세요." );
	        		break;
	        }
		
		}

	
	}
}