package dev.levenshtein;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags("calcul")
@SelectClasses(DistanceLevenshteinTest.class)
public class DistanceSuiteTests {
}
