
/*
 * 현업 (실무 개발 환경)
 * 
 * 설계도 1개 일리 없음.....
 * 설계도 많다 (업무가 복잡하다.) >> 하나의 설계도로 불가능 >> 여러개의 설계도로 나누어서 작업
 * 
 * 쇼핑몰 >> 회원관리, 배송관리, 주문관리, 상품관리 ... >> 각각의 설계도 서로 관계
 * 
 * 여러개의 설계도 어떤 기준에서 나누고 합치고...
 * 
 * 학자 정의... 책...
 * 1. is ~ a >> 은 ~ 이다 (부모를 뒤에) >> 상속 
 * 2. has ~ a >> 은 ~ 을 가지고 있다 >> 포함
 * 
 * 예)
 * 1. 원    도형
 * 원은 도형이다 (O)
 * 원은 도형을 가지고 있다 (X)
 * 
 * 말이 되는걸로 
 * >> 원 extens 도형
 * 
 * 2. 원    점
 * 원은 점이다 (X)
 * 원은 점을 가지고 있다 (O)
 * >> class 원 { 점 }
 * 
 * 나머지는 경험 ...
 * 
 * 3. 경찰   권총
 * 경찰은 권총이다 (X)
 * 경찰은 권총을 가지고 있다 (O)
 * >> class 권총 { }
 * class 경찰 {
 *    void 출동(권총) {
 *    }
 * }
 * 
 * 예 ) 원, 삼각형, 사각형 만드는 설계도를 작성하세요
 * 원은 도형이다
 * 삼각형은 도형이다
 * 사각형은 도형이다
 * 
 * 도형 : 추상화, 일반화 >> 공통 자원 >> 그리다, 색상
 * 원 : 구체화, 특수화 >> 본인이 가지는 특징 >> 반지름, 한 점
 * 
 * 점 : 좌표값 >> (x, y)
 * - 원은 점을 가지고 있다
 * - 삼각형은 점을 가지고 있다
 * - 사각형은 점을 가지고 있다
 * 
 * class Shape {그리다, 색상} >> 상속 관계 (부모)
 * class Point { x, y} >> 포함
 * 
 */

class Shape {
    String color = "gold";
    void draw() {
        System.out.println("그리다");
    }
}

class Point {
    int x;
    int y;
    Point() {
        this(1, 1);
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// 원을 만드세요 (원의 정의는 한 점과 반지름을 가지고 있다)
// 1. 원은 도형이다
// 2. 원은 점을 가지고 있다
// 3. 원은 반지름을 가지고 있다

class Circle extends Shape {
    Point point; // 포함 has a
    int r; // 원의 구체화, 특수성
    Circle() {
        //this.r = 10;
        //this.point = new Point(10, 15);
        this(10, new Point(10, 15));
    }
    Circle(int r, Point point) {
        this.r = r;
        this.point = point;
    }
}

// 위 원 만든 것을 참조 하여
// 문제 : 삼각형 클래스를 만드세요
// 삼각형은 3 개의 점과 그리다 기능을 가지고 있다

class Triangle extends Shape {
    Point[] point;
    
    Triangle() {
        this(new Point[] {new Point(1, 2), new Point(3, 4), new Point(5, 6)});        
    }
    Triangle(Point[] point) {
        this.point = point;
    }
    
    void triPrint() {
        for(Point p : this.point) {
            System.out.println(p.x + " / " + p.y);
        }
    }
}

public class Ex02_Inherit_Composition {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Circle circle = new Circle();
        System.out.println("반지름 : " + circle.r);
        System.out.println("부모자원 색깔 : " + circle.color);
        System.out.println("좌표 : " + circle.point.x);
        System.out.println("좌표 : " + circle.point.y);
        circle.draw(); // 부모자원
        System.out.println("---------------------------------");
        
        Circle circle2 = new Circle(20, new Point(30, 50));
        System.out.println("반지름 : " + circle2.r);
        System.out.println("부모자원 색깔 : " + circle2.color);
        System.out.println("좌표 : " + circle2.point.x);
        System.out.println("좌표 : " + circle2.point.y);
        circle2.draw(); // 부모자원
        System.out.println("---------------------------------");
        
        Triangle tri1 = new Triangle();
        System.out.println("부모자원 색깔 : " + tri1.color);
        System.out.println("점 1 좌표 : " + tri1.point[0].x+ " / " + tri1.point[0].y);
        System.out.println("점 2 좌표 : " + tri1.point[1].x + " / " + tri1.point[1].y);
        System.out.println("점 3 좌표 : " + tri1.point[2].x + " / " + tri1.point[2].y);
        tri1.triPrint();
        tri1.draw();
        System.out.println("---------------------------------");
        
        Point[] pointArr = {new Point(11, 22), new Point(33, 44), new Point(55, 66)};
        Triangle tri2 = new Triangle(pointArr);
        System.out.println("부모자원 색깔 : " + tri2.color);
        System.out.println("점 1 좌표 : " + tri2.point[0].x+ " / " + tri2.point[0].y);
        System.out.println("점 2 좌표 : " + tri2.point[1].x + " / " + tri2.point[1].y);
        System.out.println("점 3 좌표 : " + tri2.point[2].x + " / " + tri2.point[2].y);
        tri2.triPrint();
        tri2.draw();
        System.out.println("---------------------------------");
        
        // Point[] pointTest1 = new Point[] {(1, 2), (3, 4), (5, 6)}; >> 틀림
        Point[] pointTest2 = new Point[] {new Point(1, 2), new Point(3, 4), new Point(5, 6)};
        pointTest2.toString();
    }

}
