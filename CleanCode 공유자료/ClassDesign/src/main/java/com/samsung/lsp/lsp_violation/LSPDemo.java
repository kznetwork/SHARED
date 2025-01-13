package com.samsung.lsp.lsp_violation;

// 상위 클래스: Bird
class Bird {
    public void fly() {
        System.out.println("새가 날고 있습니다!");
    }
}

// 하위 클래스: Sparrow (정상 동작)
class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("참새가 날고 있습니다!");
    }
}

// 하위 클래스: Ostrich (날 수 없지만 fly 메서드 상속됨)
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("타조는 날 수 없습니다!");
    }
}

// 메인 클래스 - LSP 위반
public class LSPDemo {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird ostrich = new Ostrich(); // 타조는 Bird 타입으로 사용될 수 있음

        makeBirdFly(sparrow); // 정상 출력
        makeBirdFly(ostrich); // Runtime Exception 발생!
    }

    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }
}