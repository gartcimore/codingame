package org.gartcimore.codingame.easy;

import java.util.Scanner;

/**
 * Solution facile Bon, on va être franc, ça paraît difficile n'est ce pas ? En réalité, cet énoncé est le même que celui que vous trouverez
 * dans la section "Expert" (Mars Lander lvl 3). C'est donc ce qui vous attend au tout dernier niveau de difficulté. Pour l'instant, votre
 * objectif est de bien lire l'énoncé (et les paramètres d'entrée et de sortie dans le dernier bloc ci-dessous), de regarder les tests à
 * passer et d'essayer de simplifier le problème au maximum. Ainsi, après avoir bien lu l'énoncé et si vous lancez l'unique test que vous
 * devez passer pour réussir votre mission, vous vous rendrez compte que :
 *
 * la zone d'atterrissage est juste en dessous du robot. Vous pouvez donc ignorer la rotation et toujours indiquer 0 en angle de rotation.
 * il vous suffit que votre vitesse d'atterrissage soit entre 0 et 40m/s. lorsque le robot chute, la vitesse verticale est négative. Lorsque
 * le robot s'élève dans les airs, la vitesse verticale est positive.
 *
 * En conclusion, un algorithme extrèmement simple pour résoudre votre mission est :
 *
 * Si votre vitesse verticale est égale ou inférieure à -40 (donc le robot chute plus vite que 40m/s), alors il faut ralentir : vous
 * indiquez donc une poussée des gaz à 4 pour inverser la tendance et ralentir la chute. Si la vitesse verticale est supérieure à -40 (votre
 * robot chute à une vitesse modérée, acceptable pour l'atterrisage), vous laissez le robot chuter : vous indiquez une poussée des gaz à 0.
 *
 * @author gartcimore
 */
public class MarsLander1 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
    for (int i = 0; i < surfaceN; i++) {
      int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
      int
          landY =
          in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
    }

    // game loop
    while (true) {
      int x = in.nextInt();
      int y = in.nextInt();
      int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
      int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
      int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
      int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
      int power = in.nextInt(); // the thrust power (0 to 4).

      // Write an action using System.out.println()
      // To debug: System.err.println("Debug messages...");
      int newPower = 0;
      int newRotate = 0;
      if (vSpeed <= -40) {
        newPower = 4;
      } else if (vSpeed > -40) {
        newPower = 0;
      }

      System.out.println(String.format("%d %d", newRotate,
                                       newPower)); // rotate power. rotate is the desired rotation angle. power is the desired thrust power.
    }
  }
}
