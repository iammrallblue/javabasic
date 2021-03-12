package org.javabasic.d10codes;

public class Computer {
  // instance method
  public void powerOn() {
    System.out.println("Laptop power is on.");
  }

  public void powerOff() {
    System.out.println("Laptop power is off.");
  }

  /** to opt the usb device. */
  public void usbConnection(UsbDevice usbDevice) {
    usbDevice.open();

    usbDevice.close();;
  }
}
