/*


class Manager extends Employee {
  public Manager(String name, String id, int grade) {
    this.name = name;
    this.id = id;
    this.grade = grade;
  }
  // ...
}


*/


class Manager extends Employee {
    private int grade;

    public Manager(String name, String id, int grade) {
        super(name, id); // 부모 클래스의 생성자 호출
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 10) {
            throw new IllegalArgumentException("Grade must be between 1 and 10.");
        }
        this.grade = grade;
    }

    // 추가적인 Manager만의 로직이 필요한 경우 여기에 작성
}


class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 공통 로직 (예: work() 메서드 등)을 여기에 추가
}
