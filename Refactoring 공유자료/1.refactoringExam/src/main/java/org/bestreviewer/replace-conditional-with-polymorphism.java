/*


class Bird {
  // ...
  double getSpeed() {
    switch (type) {
      case EUROPEAN:
        return getBaseSpeed();
      case AFRICAN:
        return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
      case NORWEGIAN_BLUE:
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
    throw new RuntimeException("Should be unreachable");
  }
}

*/

abstract class Bird {
    abstract double getSpeed();
}

class EuropeanBird extends Bird {
    @Override
    double getSpeed() {
        return getBaseSpeed();
    }

    private double getBaseSpeed() {
        // 기본 속도 계산 로직
        return 10.0;
    }
}

class AfricanBird extends Bird {
    private int numberOfCoconuts;

    public AfricanBird(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    double getSpeed() {
        return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
    }

    private double getBaseSpeed() {
        return 10.0;
    }

    private double getLoadFactor() {
        return 1.5;
    }
}

class NorwegianBlueBird extends Bird {
    private boolean isNailed;
    private double voltage;

    public NorwegianBlueBird(boolean isNailed, double voltage) {
        this.isNailed = isNailed;
        this.voltage = voltage;
    }

    @Override
    double getSpeed() {
        return isNailed ? 0 : getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        return 10.0 + voltage * 0.5;
    }
}
