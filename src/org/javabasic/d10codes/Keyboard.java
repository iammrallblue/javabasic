package org.javabasic.d10codes;

public class Keyboard implements UsbDevice {

  @Override
  public void open() {
    System.out.println("Keyboard is Connected.");
  }

  @Override
  public void close() {
    System.out.println("Keyboard is Disconnected.");
  }
  
}
