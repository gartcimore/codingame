package org.gartcimore.codingame.easy;

import java.util.Scanner;

/**
 * Le binaire avec des 0 et des 1 c'est bien. Mais le binaire avec que des 0, ou presque, c'est encore mieux. A l'origine, c'est un concept
 * invent� par Chuck Norris pour envoyer des messages dits unaires.
 *
 * Voici le principe d'encodage :
 *
 * Le message en entr�e est constitu� de caract�res ASCII (7 bits) Le message encod� en sortie est constitu� de blocs de 0 Un bloc est
 * s�par� d'un autre bloc par un espace Deux blocs cons�cutifs servent � produir une s�rie de bits de m�me valeur (que des 1 ou que des 0) :
 * Premier bloc : il vaut toujours 0 ou 00. S'il vaut 0 la s�rie contient des 1, sinon elle contient des 0 Deuxi�me bloc : le nombre de 0
 * dans ce bloc correspond au nombre de bits dans la s�rie
 *
 * Prenons un exemple simple avec un message constitu� d'un seul caract�re : C majuscule. C en binaire vaut 1000011 ce qui donne avec la
 * technique de Chuck Norris :
 *
 * 0 0 (la premi�re s�rie compos�e d'un seul 1) 00 0000 (la deuxi�me s�rie compos�e de quatre 0) 0 00 (la troisi�me s�rie compos�e de deux
 * 1)
 *
 * C vaut donc : 0 0 00 0000 0 00
 *
 * Deuxi�me exemple, nous voulons encoder le message CC (soit les 14 bits 10000111000011) :
 *
 * 0 0 (un seul 1) 00 0000 (quatre 0) 0 000 (trois 1) 00 0000 (quatre 0) 0 00 (deux 1)
 *
 * CC vaut donc : 0 0 00 0000 0 000 00 0000 0 00
 *
 * Ecrivez un programme qui, � partir d'un message en entr�e, affiche le message cod� fa�on Chuck Norris en sortie.
 *
 * @author gartcimore
 */
public class ChuckNorris {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String message = in.nextLine();
    ChuckNorris chuck = new ChuckNorris();
    System.out.println(chuck.toUnary(message));
  }

  public String toUnary(String message) {
    String chuckMessage;
    byte[] asBytes = message.getBytes();

    StringBuilder builder = new StringBuilder();
    for (byte aByte : asBytes) {
      String temp = Integer.toBinaryString(aByte);
      if(temp.length() < 7) {
        temp = "0" + temp;
      }
      builder.append(temp);
    }
    String binaryString = builder.toString();
    builder = new StringBuilder();
    System.err.println(String.format("binary string is %s", binaryString));
    builder.append("0");
    char previous = 2;
    for (int i = 0; i < binaryString.length(); i++) {
      char c = binaryString.charAt(i);
      if (c == '0') {
        if (previous == 1) {
          builder.append(' ').append(0).append(0).append(' ').append(0);
        } else if (previous == 2) {
          builder.append('0').append(' ').append('0');
        } else {
          builder.append('0');
        }
        previous = 0;
      } else {
        if (previous == 1) {
          builder.append('0');
        } else if (previous == 2) {
          builder.append(' ').append('0');
        } else {
          builder.append(' ').append('0').append(' ').append('0');
        }
        previous = 1;
      }
    }
    chuckMessage = builder.toString();
    return chuckMessage;

  }
}
