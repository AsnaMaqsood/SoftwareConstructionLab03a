/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
    
    @Test
    public void UnitTest2() {
        assertFalse("Expected false: code that has been previously used in coursework and was not written by you",
                RulesOf6005.mayUseCodeInAssignment(false, true, true, true, false));
    }
    
    @Test
    public void UnitTest3() {
        assertTrue("Expected true: cited publicly avaible code whose implementaion is not required",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, true, false));
    }
    @Test
    public void UnitTest4() {
        assertFalse("Expected false: cited publicly available code whose implementation was required",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, true, true));
    }
}
