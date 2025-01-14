/*


double getValueForPeriod(int periodNumber) {
  try {
    return values[periodNumber];
  } catch (ArrayIndexOutOfBoundsException e) {
    return 0;
  }
}


*/


double getValueForPeriod(int periodNumber) {
    if (isValidPeriod(periodNumber)) {
        return values[periodNumber];
    }
    return 0;
}

private boolean isValidPeriod(int periodNumber) {
    return periodNumber >= 0 && periodNumber < values.length;
}
