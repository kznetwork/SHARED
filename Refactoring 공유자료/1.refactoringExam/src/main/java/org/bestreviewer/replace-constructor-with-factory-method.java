/*


class Employee {
  Employee(int type) {
    this.type = type;
  }
  // ...
}


*/

abstract class Employee {
    public abstract int getType();
}

class Engineer extends Employee {
    @Override
    public int getType() {
        return 1; // 엔지니어 타입 코드
    }
}

class Manager extends Employee {
    @Override
    public int getType() {
        return 2; // 매니저 타입 코드
    }
}

class Salesperson extends Employee {
    @Override
    public int getType() {
        return 3; // 영업 담당자 타입 코드
    }
}


class EmployeeFactory {
    public static Employee createEmployee(int type) {
        return switch (type) {
            case 1 -> new Engineer();
            case 2 -> new Manager();
            case 3 -> new Salesperson();
            default -> throw new IllegalArgumentException("Invalid employee type");
        };
    }
}

