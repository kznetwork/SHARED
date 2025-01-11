package cleancode2.primeprinter;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrimePrinterTest {

    @Test
    public void testGeneratePrimes() {
        PrimePrinter printer = new PrimePrinter();
        printer.generatePrimes();

        // Check the first 10 primes
        int[] expectedPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < expectedPrimes.length; i++) {
            assertEquals(expectedPrimes[i], printer.primes[i + 1]);
        }

        // Check the 1000th prime
        assertEquals(7919, printer.primes[1000]);
    }

    @Test
    public void testPrintPrimes() {
        PrimePrinter printer = new PrimePrinter();
        printer.generatePrimes();

        // Capture the output of the printPrimes method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        printer.printPrimes();

        // Restore the original System.out
        System.setOut(System.out);

        // Check the output format
        String output = outputStream.toString();
        assertTrue(output.contains("The First 1000 Prime Numbers === Page 1"));
        assertTrue(output.contains("         2")); // First prime
        assertTrue(output.contains("      7919")); // 1000th prime
    }

    @Test
    public void testIsPrime() {
        PrimePrinter printer = new PrimePrinter();
        printer.generatePrimes();

        // Verify prime checking logic
        assertTrue(printer.isPrime(7));
        assertFalse(printer.isPrime(4));
        assertTrue(printer.isPrime(11));
        assertFalse(printer.isPrime(10));
    }
}