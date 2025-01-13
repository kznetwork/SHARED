package com.samsung.isp;

// 기본 동물 행동 인터페이스
interface BasicAnimalActions {
    void eat();
    void sleep();
}

// 날 수 있는 동물을 위한 인터페이스
interface FlyingAnimalActions {
    void fly();
}

// 수영할 수 있는 동물을 위한 인터페이스
interface SwimmingAnimalActions {
    void swim();
}

// 새 클래스 (기본 행동 + 날기 구현)
class Bird implements BasicAnimalActions, FlyingAnimalActions {
    @Override
    public void eat() {
        System.out.println("새가 먹이를 먹고 있습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("새가 잠을 자고 있습니다.");
    }

    @Override
    public void fly() {
        System.out.println("새가 날고 있습니다.");
    }
}

// 물고기 클래스 (기본 행동 + 수영 구현)
class Fish implements BasicAnimalActions, SwimmingAnimalActions {
    @Override
    public void eat() {
        System.out.println("물고기가 먹이를 먹고 있습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("물고기가 잠을 자고 있습니다.");
    }

    @Override
    public void swim() {
        System.out.println("물고기가 수영하고 있습니다.");
    }
}

// 개 클래스 (기본 행동만 구현)
class Dog implements BasicAnimalActions {
    @Override
    public void eat() {
        System.out.println("개가 먹이를 먹고 있습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("개가 잠을 자고 있습니다.");
    }
}

// 메인 클래스 - ISP 데모
public class ISPDemo {
    public static void main(String[] args) {
        BasicAnimalActions bird = new Bird();
        BasicAnimalActions fish = new Fish();
        BasicAnimalActions dog = new Dog();

        // 공통 행동 실행
        bird.eat();
        bird.sleep();

        // 날 수 있는지 확인 후 실행
        if (bird instanceof FlyingAnimalActions) {
            ((FlyingAnimalActions) bird).fly();
        }

        fish.eat();
        fish.sleep();

        // 수영할 수 있는지 확인 후 실행
        if (fish instanceof SwimmingAnimalActions) {
            ((SwimmingAnimalActions) fish).swim();
        }

        dog.eat();
        dog.sleep();
    }
}

