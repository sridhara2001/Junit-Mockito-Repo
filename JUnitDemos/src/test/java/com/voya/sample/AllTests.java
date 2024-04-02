package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.voya.testcases.CalculatorTest;

@RunWith(JUnitPlatform.class) // junit4
@SelectPackages({"com.voya.testcases"})
//@IncludePackages({"com.voya.testcases.trial"})
//@ExcludePackages({"com.voya.testcases.greet"})
//@SelectClasses(CalculatorTest.class)
@IncludeTags({"First","Neg","Simple"})
public class AllTests {

}
