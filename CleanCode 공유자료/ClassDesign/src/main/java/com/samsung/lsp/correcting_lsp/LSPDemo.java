package com.samsung.lsp.correcting_lsp;

// 인터페이스: 날 수 있는 새
interface Flyable {
    void fly();
}

// 상위 클래스: Bird
class Bird {
    public void eat() {
        System.out.println("새가 먹이를 먹고 있습니다!");
    }
}

// 하위 클래스: Sparrow (날 수 있음)
class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("참새가 날고 있습니다!");
    }
}

// 하위 클래스: Ostrich (날 수 없음)
class Ostrich extends Bird {
    // fly() 메서드를 구현하지 않음
}

// 메인 클래스 - LSP 준수
public class LSPDemo {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich();

        // 모든 새는 먹이를 먹을 수 있음
        makeBirdEat(sparrow);
        makeBirdEat(ostrich);

        // 날 수 있는 새만 Flyable 인터페이스를 사용
        Flyable flyableBird = new Sparrow();
        makeBirdFly(flyableBird);
    }

    public static void makeBirdEat(Bird bird) {
        bird.eat();
    }

    public static void makeBirdFly(Flyable bird) {
        bird.fly();
    }
}
