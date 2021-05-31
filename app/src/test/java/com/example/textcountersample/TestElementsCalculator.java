package com.example.textcountersample;

import com.example.textcountersample.utils.ElementsCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestElementsCalculator {

    @Test
    public void Given_StringOfMultipleEmptySpaces_When_getCharsCountIsCalled_Then_ReturnNumberOfSpaces(){
        final String givenString = "     ";

        final int expectedResult = 5;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_EmptyString_When_getCharsCountIsCalled_Then_ReturnZero(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_TextString_When_getCharsCountIsCalled_Then_ReturnNumberOfElements(){
        final String givenString = "Testing element calculator";

        final int expectedResult = 26;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Given_SymbolsString_When_getCharsCountIsCalled_Then_ReturnNumberOfSymbols(){
        final String givenString = "...";

        final int expectedResult =3;
        final int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

}