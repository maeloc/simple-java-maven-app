package com.mycompany.app;

import java.util.Base64;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
  /**
   * Create the test case
   *
   * @param testName
   *          name of the test case
   */
  public AppTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(AppTest.class);
  }

  /**
   * Rigourous Test :-)
   */
  public void testStringToByteArray() {
    // Original String
    final String string = "howtodoinjava.com";

    // Convert to byte[]
    final byte[] bytes = string.getBytes();

    // Convert back to String
    final String s = new String(bytes);

    // Check converted string against original String
    System.out.println("Decoded String : " + s);
    assertEquals("howtodoinjava.com", s);
  }

  public void testStringToByteArrayUsingB64() {
    // Original byte[]
    final byte[] bytes = "howtodoinjava.com".getBytes();

    // Base64 Encoded
    final String encoded = Base64.getEncoder().encodeToString(bytes);

    // Base64 Decoded
    final byte[] decoded = Base64.getDecoder().decode(encoded);

    // Verify original content
    final String s = new String(decoded);
    System.out.println(s);
    assertEquals("howtodoinjava.com", s);
  }
}
