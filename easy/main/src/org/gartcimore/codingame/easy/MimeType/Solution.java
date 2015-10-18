package org.gartcimore.codingame.easy.MimeType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Le type MIME est utilis� dans de nombreux protocoles internet pour associer un type de m�dia (html, image, vid�o, ...) avec le contenu
 * envoy�. Ce type MIME est g�n�ralement d�duit de l'extension du fichier � transf�rer. Vous devez �crire un programme qui permet de
 * d�tecter le type MIME d'un fichier � partir de son nom.<br/>
 *
 *
 * Une table qui associe un type MIME avec une extension de fichier vous est fournie. Une liste de noms de fichier � transf�rer vous sera
 * aussi fournie et vous devrez d�duire pour chacun d'eux, le type MIME � utiliser.<br/>
 *
 * L'extension d'un fichier se d�finit par la partie du nom qui se trouve apr�s le dernier point qui le compose. Si l'extension du fichier
 * est pr�sente dans la table d'association (la casse ne compte pas. ex : TXT est �quivalent � txt), alors affichez le type MIME
 * correspondant . S'il n'est pas possible de trouver le type MIME associ� � un fichier, ou si le fichier n'a pas d'extensions, affichez
 * UNKNOWN.<br/>
 *
 * ENTR�E : <ul> <li>Ligne 1 : Nombre N d��l�ments composant la table d'association.</li> <li>Ligne 2 : Nombre Q de noms de fichiers �
 * analyser.</li> <li>N Lignes suivantes : Une extension de fichier par ligne et son type MIME correspondant (s�par� par un espace). </li>
 * <li>Q Lignes suivantes : Un nom de fichier par ligne.</li> </ul>
 *
 *
 * SORTIE : Pour chacun des Q noms de fichiers, afficher sur une ligne le type MIME associ�. S'il n'y a pas de correspondance, afficher
 * UNKNOWN.
 *
 * CONTRAINTES : 0 < N < 10000 0 < Q < 10000
 *
 * Les extensions de fichiers sont compos�es d'un maximum de 10 caract�res ascii alphanum�riques. Les type MIME sont compos�s d'un maximum
 * de 50 caract�res ascii alphanum�rique et de ponctuations. Les noms de fichiers sont compos�s d'un maximum de 256 caract�res ascii
 * alphanum�riques et points. Il n'y a pas d'espaces dans les noms de fichiers, les extensions et les types MIME.
 *
 * @author gartcimore
 */
public class Solution {

  public static String UNKNOWN = "UNKNOWN";

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int nbMimeType = in.nextInt(); // Number of elements which make up the association table.
    in.nextLine();
    int nbFiles = in.nextInt(); // Number nbFiles of file names to be analyzed.
    in.nextLine();
    Map<String, String> mimeTable = new HashMap<>();
    for (int i = 0; i < nbMimeType; i++) {
      String EXT = in.next(); // file extension
      String MT = in.next(); // MIME type.
      in.nextLine();
      mimeTable.put(EXT.toLowerCase(), MT);
    }
    List<String> files = new ArrayList<>();
    for (int i = 0; i < nbFiles; i++) {
      String FNAME = in.nextLine(); // One file name per line.
      files.add(FNAME);
    }

    List<String> outputs = parse(mimeTable, files);
    // Write an action using System.out.println()
    // To debug: System.err.println("Debug messages...");
    for (String output : outputs) {
      System.out.println(output);
    }

  }

  public static List<String> parse(Map<String, String> mimeTable, List<String> files) {
    List<String> outputs = new ArrayList<>();

    for (String file : files) {
      int lastIndex = file.lastIndexOf(".");
      System.err.println("lastindex is " + lastIndex);
      String output = UNKNOWN;
      if (lastIndex >= 0) {
        String extension = file.substring(lastIndex + 1);
        System.err.println("extension found is " + extension);
        if (mimeTable.containsKey(extension.toLowerCase())) {
          System.err.println("extension exists in mimetable");
          output = mimeTable.get(extension.toLowerCase());
        }
      }
      outputs.add(output);
    }
    return outputs;
  }

}
