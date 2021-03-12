package org.javabasic.d10codes;

public class Demo10Computer {
  /** connection of usb device.  */
  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.powerOn();

    // connect a mouse to computer
    // Mouse mouse = new Mouse();
    UsbDevice usbMouse = new Mouse();
    computer.usbConnection(usbMouse);

    computer.powerOff();
  } // main
}
