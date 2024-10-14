package dev.levenshtein;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags("validation")
@SelectClasses(DistanceLevenshteinTest.class)
public class ValidationSuiteTests {
}
