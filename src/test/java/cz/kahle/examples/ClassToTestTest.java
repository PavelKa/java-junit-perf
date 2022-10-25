package cz.kahle.examples;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class ClassToTestTest {

    @Timeout(value = 110, unit = TimeUnit.MILLISECONDS)
    @RepeatedTest(value=3, name = "testMethodToTest {currentRepetition}/{totalRepetitions}")
    public void testMethodToTest() throws InterruptedException {
        ClassToTest ct = new ClassToTest();
        ct.methodToTest();


    }
}