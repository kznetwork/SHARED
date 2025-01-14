/*


int low = daysTempRange.getLow();
int high = daysTempRange.getHigh();
boolean withinPlan = plan.withinRange(low, high);

*/

boolean withinPlan = plan.isWithinRange(daysTempRange);

class Plan {
    // 기존 메서드
    public boolean withinRange(int low, int high) {
        // 로직...
        return true; // 예시 값
    }

    // 리팩토링된 메서드
    public boolean isWithinRange(TemperatureRange range) {
        return withinRange(range.getLow(), range.getHigh());
    }
}

class TemperatureRange {
    private int low;
    private int high;

    public TemperatureRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }
}
