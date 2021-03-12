package org.javabasic.d10codes;

public class Mouse implements UsbDevice {

  @Override
  public void open() {
    System.out.println("Mouse is Connected.");
  }

  @Override
  public void close() {
    System.out.println("Mouse is Disconnected.");
  }

}
