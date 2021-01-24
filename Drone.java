
//Author Name: Whitney Martin
//Date: 1/16/2021
//Program Name: Martin_Drone
//Purpose: Simulation using button, drone movement in x, y,z location


package projectdrone;
//Drone.java

import java.util.Scanner;

public class Drone {

 

 private int x, y, z;

 // 0 being north, 1 being east,

 // 2 south and 3 west

 private int direction;


 public Drone() {

     x = 0;

     y = 0;

     z = 0;

     direction = 0; // north

 }


 public int getX() {

     return x;

 }

 public void setX(int x) {

     this.x = x;

 }

 public int getY() {

     return y;

 }

 public void setY(int y) {

     this.y = y;

 }

 public int getZ() {

     return z;

 }

 public void setZ(int z) {

     this.z = z;

 }

 //  move the drone up vertically for given spaces

 public void moveUp(int spaces) {

     z += spaces;

 }

 //  move the drone down vertically

 public void moveDown(int spaces) {

     z -= spaces;

     // not allowing the drone to go below ground level 

     if (z < 0) {

          z = 0;

     }

 }

 // method to move forward the drone, for given spaces

 public void forward(int spaces) {

     if (direction == 0) {

          // moving north

          y += spaces;

     } else if (direction == 1) {

          // moving east

          x += spaces;

     } else if (direction == 2) {

          // moving south

          y -= spaces;

     } else {

          // moving west

          x -= spaces;

     }

 }

 // method to move backward the drone, for given spaces

 public void backward(int spaces) {

     if (direction == 0) {

          // moving south (opposite of north)

          y -= spaces;

     } else if (direction == 1) {

          // west

          x -= spaces;

     } else if (direction == 2) {

          // north

          y += spaces;

     } else {

          // east

          x += spaces;

     }

 }

 // turn drone 90 degrees to right

 public void turnRight() {

     direction = (direction + 1) % 4;

 }

 // turn drone 90 degrees to left

 public void turnLeft() {

     direction--;

     if (direction < 0) {

          direction = 3;

     }

 }

 @Override

 public String toString() {


     return "Drone is at (x=" + x + ", y=" + y + ", z=" + z + ")";

 }

 public static void main(String[] args) {

     // creating a Drone

     Drone drone = new Drone();

     // setting up a Scanner

     Scanner scanner = new Scanner(System.in);

     String ch = "";

     // looping until user chooses to quit

     while (!ch.equalsIgnoreCase("X")) {

          // displaying drone's current position

          System.out.println("\n" + drone + "\n");

          // displaying the menu

          System.out.println("Enter F to move forward 10 spaces");

          System.out.println("Enter B to move backward 10 spaces");

          System.out.println("Enter U to move up 10 spaces");

          System.out.println("Enter D to move down 10 spaces");

          System.out.println("Enter R to turn right");

          System.out.println("Enter L to turn left");

          System.out.println("Enter X to quit");

          System.out.print("Your choice: ");


          ch = scanner.next();


          if (ch.equalsIgnoreCase("F")) {

              drone.forward(10);

          } else if (ch.equalsIgnoreCase("B")) {

              drone.backward(10);

          } else if (ch.equalsIgnoreCase("U")) {

              drone.moveUp(10);

          } else if (ch.equalsIgnoreCase("D")) {

              drone.moveDown(10);

          } else if (ch.equalsIgnoreCase("R")) {

              drone.turnRight();

          } else if (ch.equalsIgnoreCase("L")) {

              drone.turnLeft();

          }

     }

 }

}



