package org.gartcimore.codingame.easy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author gartcimore
 */
class AsciiSolution {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    in.nextLine();
    int h = in.nextInt();
    in.nextLine();
    String t = in.nextLine();
    ArrayList<String> ascii = new ArrayList<>();
    for (int i = 0; i < h; i++) {
      ascii.add(in.nextLine());
    }

    StringBuilder builder = new StringBuilder();

    t = t.toUpperCase();
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < t.length(); j++) {
        int ordinal = t.charAt(j);
        System.err.println(String.format("token is %s ascii is %d length", t.charAt(j), ascii.size()));
        System.err.println(String.format("ordinal is '%d' (l is '%d' h is '%d')", ordinal, l, h));
        if (ordinal < 65 || ordinal > 90) {
          ordinal = 91;
          System.err.println("ordinal is out of bound, setting to 91");
        }
        int pos = ordinal - 65;

        System.err.println(String.format("loop %d", i));
        System.err.println(String.format("ordinal is '%d' pos is %d", ordinal, pos));
        System.err.println(String.format("substring at %d,%d", (pos * l) + (i * h * (pos * l)), ((pos * l) + (i * h * (pos * l) + l))));
        builder.append(ascii.get(i).substring((pos * l), ((pos * l) + l)));
        System.err.println(String.format("wip : \n %s", builder.toString()));
      }
      builder.append("\n");
    }
    System.out.println(builder.toString());
  }
}
