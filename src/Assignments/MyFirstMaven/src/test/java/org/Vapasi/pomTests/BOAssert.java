//package org.Vapasi;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class BOAssert {
//    @BeforeClass
//    public void testRunBeforeClass() {
//        System.out.println("Before Class Run");
//    }
//
//    @BeforeMethod
//    public void runBeforeMethod() {
//        System.out.println("Test Before Run");
//    }
//
//    public static int Sum() {
//        int a = 1;
//        int b = 2;
//
//        // System.out.println("Sum : "+ sum);
//        return a + b;
//    }
//
//    @Test
//    public void testEqualsAssertion() {
//        int actual = Sum();
//        int expected = 3;
//
//        Assert.assertEquals(actual, expected, "message didn't match");
//        System.out.println("it worked");
//    }
//
//    @Test
//    public void testAssertTrue() {
//        int actual = Sum();
//        int expected = 10;
//
//        Assert.assertTrue( actual == expected, "Fail");
//       // System.out.println("it worked2");
//    }
//}