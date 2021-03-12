package org.javabasic.d13codes;

public class GenericInterfaceReviewImpl<I> implements GenericInterfaceReview<I> {

  @Override
  public void printMethod(I i) {
    System.out.println("Generic: " + i);
  }
  
}
