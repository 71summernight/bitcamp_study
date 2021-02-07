package group1.cinema.function;

public class MenuClass extends FunctionClass {

    // 전체(초기) 메뉴
    public void cinemaExecute() {       
        while (true) {
            System.out.println("************************");
            System.out.println("***** 영화 예매 시스템 *****");
            System.out.println("************************");
            System.out.printf("1. 예매하기 \n\n");
            System.out.printf("2. 예매조회 \n\n");
            System.out.printf("3. 예매취소 \n\n");
            System.out.printf("4. 시스템종료 \n\n");

            switch(checkInputNumber(1, 4)) { // 유저 입력값 1~4 이내인지 정합성 체크
            case 1:
                reserve(); // 1. 예매하기
                break;
            case 2:
                askTicket(); // 2. 예매조회
                break;
            case 3:
                cancelTicket(); // 3. 예매취소
                break;
            case 4:
                System.out.println("이용해 주셔서 감사합니다. *^^*");
                System.exit(0); // 4. 시스템 종료
                break;
            }
        }
    }

    // 메뉴 - 1. 예매 하기
    private void reserve() {
        int[] userInput;
        System.out.println("******** 좌석 현황 ********");
        printSeat();
        System.out.println("*************************");
        System.out.println("좌석을 선택해주세요. 예) 1-1");
        System.out.println("이미 예매된 좌석은 \"예매\"라고 표시됩니다.");
        do {
            userInput = checkInputSeatNum(); // 좌석 입력 시(ex. 2-3) 좌석 범위 내 숫자인지 정합성 체크
        } while (retrieveSeat(userInput)); // 유저가 선택한 좌석 예매 가능 여부 체크
        System.out.println("네(1), 아니오(2), 초기화면(0) 중 하나를 입력해주세요.");
        switch (checkInputNumber(0, 2)) { // 유저 입력값 0~2 이내인지 정합성 체크
        case 0:
            System.out.println("초기화면으로 돌아갑니다.");
            return;
        case 1:
            ticketing(); // 예매 확정
            break;
        case 2:
            reserve(); // 해당 함수 재호출 후 현재 실행중인 함수는 종료처리
            return;
        }
    }

    // 메뉴 - 2. 예매 조회 askTicket(); - 예매 조회 기능

    // 메뉴 - 3. 예매 취소
    private void cancelTicket() {
        while (askTicket()) { // 예매 조회 기능
            System.out.println("예매를 취소하시겠습니까?");
            System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
            switch (checkInputNumber(1, 2)) { // 유저 입력값 1~2 이내인지 정합성 체크
            case 1:
                changeSeatData(); // 예매 취소 기능
                System.out.printf("\n예매가 취소되었습니다. 감사합니다.\n\n");
                return;
            case 2:
                System.out.println("\n초기 메뉴로 돌아갑니다.\n\n");
                return;
            }
        }
    }

}