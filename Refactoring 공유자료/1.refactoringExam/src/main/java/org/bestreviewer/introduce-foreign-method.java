/*


class Report {
  // ...
  void sendReport() {
    Date nextDay = new Date(previousEnd.getYear(),
      previousEnd.getMonth(), previousEnd.getDate() + 1);
    // ...
  }
}

*/

import java.time.LocalDate;

class Report {
    private LocalDate previousEnd;

    // Setter for previousEnd (for demonstration or initialization)
    public void setPreviousEnd(LocalDate previousEnd) {
        this.previousEnd = previousEnd;
    }

    void sendReport() {
        LocalDate nextDay = calculateNextDay(previousEnd);
        // ... (다음날 날짜를 기반으로 로직 추가)
    }

    private LocalDate calculateNextDay(LocalDate date) {
        return date.plusDays(1);
    }
}
