/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.containertpi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author crist
 */
public class ContainertpiSuite extends TestCase {
    
    public ContainertpiSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ContainertpiSuite");
        suite.addTest(new TestSuite(com.mycompany.containertpi.containerTest.class));
        suite.addTest(new TestSuite(com.mycompany.containertpi.warehouseTest.class));
        suite.addTest(new TestSuite(com.mycompany.containertpi.PackageTest.class));
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
}
