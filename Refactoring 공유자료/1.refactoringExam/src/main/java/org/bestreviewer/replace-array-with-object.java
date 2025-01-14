/*


String[] row = new String[2];
row[0] = "Liverpool";
row[1] = "15";


*/


class Team {
    private String name;
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Team{name='" + name + "', score=" + score + "}";
    }
}

// 사용 예시
Team team = new Team("Liverpool", 15);
System.out.println(team);
