/*


class Range {
  private int low, high;
  boolean includes(int arg) {
    return arg >= low && arg <= high;
  }
}


*/

class Range {
    private final int low;
    private final int high;

    public Range(int low, int high) {
        if (low > high) {
            throw new IllegalArgumentException("Low boundary cannot be greater than high boundary.");
        }
        this.low = low;
        this.high = high;
    }

    public boolean includes(int value) {
        return value >= low && value <= high;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    @Override
    public String toString() {
        return "Range{" + "low=" + low + ", high=" + high + '}';
    }
}
