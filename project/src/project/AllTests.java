package project;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ DivideTest.class, MultiplyTest.class, SubtractTest.class, SumTest.class, SumTestTest.class })
public class AllTests {

}
