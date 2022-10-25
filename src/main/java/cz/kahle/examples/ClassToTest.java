package cz.kahle.examples;

public class ClassToTest {
    public void methodToTest() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Finished");
    }
}
