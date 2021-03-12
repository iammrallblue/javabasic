package org.javabasic.d11codes.demo03;

// Outer Class
public class Body {
  // outer class field
  private String name;

  /** outer class method. */
  public void bodyMethod() {
    System.out.println("A method of Outer Class Body.");
    Heart heart = new Heart();
    heart.beat();
    // Anonymously Object access method of Heart (inner class)
    new Heart().beat();
  }

  // setter, getter
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // Instance Inner Class
  public class Heart {

    /** inner class method. */
    public void beat() {
      System.out.println("heart beating when I met you.");
      // inner class method can call the variable of outer class
      System.out.println("Access the outer class variable: " + name); // correct
    }
  }
}
