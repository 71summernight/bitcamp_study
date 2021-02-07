package group1.cinema.function;

import java.util.Scanner;
import java.util.Random;
class FunctionClass {

    private Scanner scan;
    private Random rand;
    private String[][][] seat;
    private String seatTemp;
    private int rowTemp;
    private int colTemp;

    static final int ROW_SIZE;
    static final int COL_SIZE;

    static {
        ROW_SIZE = 4;
        COL_SIZE = 5;
    }

    protected FunctionClass() {
        this.scan = new Scanner(System.in);
        this.rand = new Random();
        this.seat = new String[2][ROW_SIZE][COL_SIZE]; // [0][X][X]-좌석 번호 저장
        initSeatNumber();                              // [1][X][X]-빈좌석 "__", 예매좌석 "예매번호"
        initSeatData();
    }

    // 배열에 좌석 숫자 지정
    private void initSeatNumber() {
        for (int i = 0; i < ROW_SIZE; i++) {
            for (int j = 0; j < COL_SIZE; j++) {
                String temp = String.valueOf(i+1) + "-" + String.valueOf(j+1); // 배열은 0부터 시작하므로 +1
                this.seat[0][i][j] = temp; // 좌석 번호 셋팅
            }
        }
    }

    // 배열에 예매여부 데이터 초기값(빈좌석) 세팅
    private void initSeatData() {
        for (int i = 0; i < ROW_SIZE; i++) {
            for (int j = 0; j < COL_SIZE; j++) {
                String temp = "__"; // 빈좌석 셋팅
                this.seat[1][i][j] = temp;
            }
        }
    }

    // 사용자 입력 숫자(메뉴 번호) 정합성 체크
    protected int checkInputNumber(int startNum, int endNum) {
        int userInput = 0;
        do {
            try {
                System.out.print("번호 입력 : ");
                userInput = Integer.parseInt(scan.nextLine());
                if (userInput >= startNum && userInput <= endNum) {
                    break;
                } else {
                    throw new Exception("번호를 잘못 입력하셨습니다.");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("입력 범위 내 숫자만 입력해 주세요.");
            }
        } while (true);
        return userInput;
    }

    // 사용자가 입력한 예매번호 입력값 정합성 체크
    private String checkInputReserveNum() {
        System.out.printf("\n예매번호를 입력해주세요.\n");
        String userInput = String.valueOf(checkInputNumber(10000000, 99999999));
        return userInput; // 10000000 ~ 99999999 사이의 숫자인지 정합성 체크
    }

    // 예매 조회 기능
    protected boolean askTicket() {
        String userInput = checkInputReserveNum(); // 사용자가 입력한 예매번호 입력값 정합성 체크
        for (int i = 0; i < ROW_SIZE; i++) {
            for (int j = 0; j < COL_SIZE; j++) {
                if (this.seat[1][i][j].equals(userInput)) { // 입력한 예매번호와 해당 배열에 저장된 예매번호가 같다면
                    System.out.printf("\n고객님이 예매하신 좌석은 %s 입니다.\n\n", this.seat[0][i][j]);
                    this.seatTemp = this.seat[1][i][j];
                    return true;
                } else {
                    if (i == (ROW_SIZE-1) && j == (COL_SIZE-1)) {
                        System.out.println("\n발급되지 않은 예매번호 입니다. 예매번호를 다시 확인해주세요.\n");
                    }
                    continue;
                }
            }
        }
        return false;
    }

    // 좌석 프린트 기능
    protected void printSeat() {
        for (int i = 0; i < ROW_SIZE; i++) {
            for (int j = 0; j < COL_SIZE; j++) {
                System.out.printf("[%s]", this.seat[1][i][j].equals("__") ? this.seat[0][i][j] : "예매");
            } // 해당 배열의 문자열이 "__" 인가?
            System.out.println();
        }
    }

    // 사용자가 입력한 좌석 번호 입력값 정합성 체크
    protected int[] checkInputSeatNum() {
        String userInput;
        int[] intSeat = new int[2];
        do {
            try {
                System.out.print("좌석 번호 입력 : ");
                userInput = scan.nextLine();

                String[] strSeat = userInput.split("-"); // "-" 문자 제거 후 strSeat배열에 나눠담음
                intSeat[0] = Integer.valueOf(strSeat[0]); // 나눠담은 숫자를 int형으로 변환
                intSeat[1] = Integer.valueOf(strSeat[1]);

                if ((intSeat[0] >= 1 && intSeat[0] <= ROW_SIZE)&&
                        (intSeat[1] >= 1 && intSeat[1] <= COL_SIZE)) {
                    break;
                } else {
                    throw new Exception("좌석 번호를 잘못 입력하셨습니다.");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("올바른 좌석 번호를 형식에 맞추어 입력해주세요.");
            }
        } while (true);
        return intSeat;
    }

    // 유저가 선택한 좌석 예매 가능 여부 체크
    protected boolean retrieveSeat(int[] array) {
        this.rowTemp = (array[0]-1); // 배열은 0부터 시작하므로 -1 처리
        this.colTemp = (array[1]-1);

        if (this.seat[1][this.rowTemp][this.colTemp].equals("__")) { // 사용자가 입력한 좌석(배열)의 문자열이 "__" 인가?
            System.out.printf("\n예매 가능합니다. 예매하시겠습니까?\n");
            return false;
        } else {
            System.out.printf("\n이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요.\n");
            return true;
        }
    }

    // 예매번호 랜덤 생성
    private String makeRandomNum() {
        int randNum = rand.nextInt(90000000)+10000000; // 10000000 ~ 99999999 사이 숫자 생성
        String temp = String.valueOf(randNum); // 생성한 랜덤 숫자 스트링으로 변환
        return temp;
    }

    // 혹시 모를 예매번호 중복 방지 기능
    private String checkOverlapReserveNum() {
        String temp = makeRandomNum(); // 랜덤번호 생성 후 스트링 변환
        again: for (int i = 0; i < ROW_SIZE; i++) {
            for (int j = 0; j < COL_SIZE; j++) {
                if (temp.equals(this.seat[1][i][j])) { // 생성된 랜덤번호와 같은 예매번호가 이미 있다면
                    temp = makeRandomNum(); // 랜덤번호 재생성
                    i = -1; // -1로 초기화 (continue 시 +1 하여 0부터 다시 체크하기 위해)
                    continue again; // again 라벨이 붙은 for문으로 이동
                }
            }
        }
        return temp;
    }

    // 예매 확정
    protected void ticketing() {
        String temp = checkOverlapReserveNum(); // 랜덤번호 생성 후 중복체크 완료
        this.seat[1][this.rowTemp][this.colTemp] = temp; // 해당 시트에 예매(랜덤) 번호 부여
        System.out.println("예매가 완료되었습니다.");
        System.out.printf("예매한 좌석번호 : [%s] / 예매번호 : [%s]\n", this.seat[0][this.rowTemp][this.colTemp], temp);
        System.out.println("감사합니다.");
    }

    // 예매 취소 시 해당 좌석 초기화
    protected void changeSeatData() {
        for (int i = 0; i < ROW_SIZE; i++) {
            for (int j = 0; j < COL_SIZE; j++) {
                if (this.seat[1][i][j].equals(this.seatTemp)) {
                    this.seat[1][i][j] = "__"; // 취소한 좌석 "__" 로 초기화
                    break;
                }
            }
        }
    }

}