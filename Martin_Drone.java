
//Author Name: Whitney Martin
//Date: 8/29/2021
//Program Name: Martin_Drone
//Purpose: Simulation using button, drone movement in x, y,z location



package projectdrone;
import java.util.Scanner;
public class Martin_Drone {

private int x, y, z;

 // 1 = north, 2 = east

 // 3 = south, 4 = west // 

private int direction;


public Martin_Drone() {

     x = 1;

     y = 1;

     z = 1;

     direction = 1; 
     
     // moving north

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

public void moveUp(int spaces) {

     z += spaces;

 }

 //  vertical down

public void moveDown(int spaces) {

     z -= spaces;


     if (z < 1) {

          z = 1;

     }

 }

public void forward(int spaces) {

     if (direction == 1) {

          // move to north

          y += spaces;

     } else if (direction == 2) {

          // move to east

          x += spaces;

     } else if (direction == 3) {

          // move to south

          y -= spaces;

     } else {

          // move to west

          x -= spaces;

     }

 }

 // move backward

 public void backward(int spaces) {

     if (direction == 1) {

          // south

          y -= spaces;

     } else if (direction == 2) {

          // west

          x -= spaces;

     } else if (direction == 3) {

          // north

          y += spaces;

     } else {

          // east

          x += spaces;

     }

 }


 public void turnRight() {

     direction = (direction + 2) % 4;

 }


 public void turnLeft() {

     direction--;

     if (direction < 1) {

          direction = 4;

     }

 }

 @Override

 public String toString() {


     return "Drone is at (x=" + x + ", y=" + y + ", z=" + z + ")";

 }

 public static void main(String[] args) {

     // create 

     Martin_Drone drone = new Martin_Drone();

     //  Scanner setup

     Scanner scanner = new Scanner(System.in);

     String ch = "";


     while (!ch.equalsIgnoreCase("X")) {


          System.out.println("\n" + drone + "\n");

          // option display

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



