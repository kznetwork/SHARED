/*


int withdraw(int amount) {
  if (amount > _balance) {
    return -1;
  }
  else {
    balance -= amount;
    return 0;
  }
}


*/

enum WithdrawalStatus {
    SUCCESS, INSUFFICIENT_FUNDS
}

int withdraw(int amount) {
    if (!hasSufficientBalance(amount)) {
        return WithdrawalStatus.INSUFFICIENT_FUNDS.ordinal();
    }
    deductBalance(amount);
    return WithdrawalStatus.SUCCESS.ordinal();
}

private boolean hasSufficientBalance(int amount) {
    return amount <= _balance;
}

private void deductBalance(int amount) {
    _balance -= amount;
}
