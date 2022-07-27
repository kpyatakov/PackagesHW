package ru.netology.sqr.packages.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Numbers.csv")
    public void testMax(int expected, int FirBorder, int SecBorder) {
        SqrService service = new SqrService();

        int actual = service.calcSqr(FirBorder, SecBorder);

        Assertions.assertEquals(expected, actual);
    }

}
