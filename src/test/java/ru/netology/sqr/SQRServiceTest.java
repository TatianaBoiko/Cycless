package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/Params.csv")

    public void testQuantity(int expected, int firstNum, int secondNum) {

        SQRService service = new SQRService();

        int actual = service.calcSqrt(firstNum, secondNum);

        Assertions.assertEquals(expected, actual);
    }
}
