package cz.kahle.examples;

import org.jsmart.zerocode.core.domain.LoadWith;
import org.jsmart.zerocode.core.domain.TestMapping;
import org.jsmart.zerocode.jupiter.extension.ParallelLoadExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({ParallelLoadExtension.class})
public class LoadClassToTest {

    @LoadWith("load.properties")
    @TestMapping(testClass = ClassToTestTest.class, testMethod = "testMethodToTest")
    @Test
    @DisplayName("ClassToTestTest#testMethodToTest")

    public void testLoad_xy() {


    }
}