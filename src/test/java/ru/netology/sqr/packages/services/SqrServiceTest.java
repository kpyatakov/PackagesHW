package ru.netology.sqr.packages.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Numbers.csv")
    public void testUnderFiveThousand(int expected, int x, int y) {
        SqrService service = new SqrService();

        int actual = service.calcSqr(y) - service.calcSqr1(x);

        Assertions.assertEquals(expected, actual);
    }

}
