package org.gartcimore.codingame.easy.horse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author gartcimore
 */
class Solution {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    List<Integer> horsesPower = new ArrayList<>(N);
    int lowest = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int pi = in.nextInt();
      horsesPower.add(pi);
    }

    Collections.sort(horsesPower);
    for (int i = 1; i < N; i++) {

      int currentDiff = Math.abs(horsesPower.get(i) - horsesPower.get(i - 1));
      if (currentDiff < lowest) {
        lowest = currentDiff;
      }
    }
    System.out.println(lowest);
  }
}
