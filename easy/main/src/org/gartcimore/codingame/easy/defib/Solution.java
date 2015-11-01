package org.gartcimore.codingame.easy.defib;

import java.util.Scanner;

/**
 * @author gartcimore
 */
public class Solution {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String LON = in.next();
    in.nextLine();
    String LAT = in.next();
    in.nextLine();
    int N = in.nextInt();
    in.nextLine();
    System.err.println(String.format("LON is %s", LON));
    System.err.println(String.format("LAT is %s", LAT));
    LON = LON.replaceAll(",", ".");
    LAT = LAT.replaceAll(",",".");
    System.err.println(String.format("LON is %s", LON));
    System.err.println(String.format("LAT is %s", LAT));
    float longitudeUser = Float.parseFloat(LON);
    float latitudeUser = Float.parseFloat(LAT);
    double distance = Double.MAX_VALUE;
    String nearest = "";
    for (int i = 0; i < N; i++) {
      String DEFIB = in.nextLine();
      String[] data = DEFIB.split(";");
      float lonDefib = Float.parseFloat(data[4].replaceAll(",","."));
      float latDefib = Float.parseFloat(data[5].replaceAll(",","."));
      double x = (lonDefib - longitudeUser) * Math.cos((latitudeUser + latDefib) / 2);
      double y = latDefib - latitudeUser;
      double currentDistance = Math.sqrt(x * x + y * y) * 6371;
      if (currentDistance < distance) {
        distance = currentDistance;
        nearest = data[1];
      }
    }

    // Write an action using System.out.println()
    // To debug: System.err.println("Debug messages...");

    System.out.println(nearest);
  }
}
