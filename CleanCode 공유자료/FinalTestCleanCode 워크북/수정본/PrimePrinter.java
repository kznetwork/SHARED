package cleancode2.primeprinter;

public class PrimePrinter {

    private static final int NUMBER_OF_PRIMES = 1000;
    private static final int LINES_PER_PAGE = 50;
    private static final int COLUMNS = 4;

    private int[] primes = new int[NUMBER_OF_PRIMES + 1];
    private int candidate = 1;
    private int primeIndex = 1;
    private int ord = 2;
    private int square = 9;
    private int[] multiples = new int[30 + 1];

    public static void main(String[] args) {
        PrimePrinter printer = new PrimePrinter();
        printer.generatePrimes();
        printer.printPrimes();
    }

    private void generatePrimes() {
        primes[1] = 2;
        while (primeIndex < NUMBER_OF_PRIMES) {
            candidate = getNextCandidate();
            if (isPrime(candidate)) {
                primeIndex++;
                primes[primeIndex] = candidate;
            }
        }
    }

    private int getNextCandidate() {
        candidate += 2;
        if (candidate == square) {
            ord++;
            square = primes[ord] * primes[ord];
            multiples[ord - 1] = candidate;
        }
        return candidate;
    }

    private boolean isPrime(int candidate) {
        boolean possiblyPrime = true;
        for (int n = 2; n < ord && possiblyPrime; n++) {
            while (multiples[n] < candidate) {
                multiples[n] += primes[n] + primes[n];
            }
            if (multiples[n] == candidate) {
                possiblyPrime = false;
            }
        }
        return possiblyPrime;
    }

    private void printPrimes() {
        int pageNumber = 1;
        int pageOffset = 1;
        while (pageOffset <= NUMBER_OF_PRIMES) {
            printPageHeader(pageNumber);
            printPageContent(pageOffset);
            pageNumber++;
            pageOffset += LINES_PER_PAGE * COLUMNS;
        }
    }

    private void printPageHeader(int pageNumber) {
        System.out.printf("The First %d Prime Numbers === Page %d%n%n", NUMBER_OF_PRIMES, pageNumber);
    }

    private void printPageContent(int pageOffset) {
        for (int rowOffset = pageOffset; rowOffset < pageOffset + LINES_PER_PAGE; rowOffset++) {
            for (int column = 0; column < COLUMNS; column++) {
                int index = rowOffset + column * LINES_PER_PAGE;
                if (index <= NUMBER_OF_PRIMES) {
                    System.out.printf("%10d", primes[index]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
