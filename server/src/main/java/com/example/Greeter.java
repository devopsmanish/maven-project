package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //greeting function
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
