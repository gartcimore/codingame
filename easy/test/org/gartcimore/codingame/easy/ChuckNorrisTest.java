package org.gartcimore.codingame.easy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @author gartcimore
 */
public class ChuckNorrisTest {

  @Test
  public void testToUnaryWithC() {
    ChuckNorris chuckNorris = new ChuckNorris();
    assertThat(chuckNorris.toUnary("C"), is("0 0 00 0000 0 00"));
  }

  @Test
  public void testToUnaryWithCC() {
    ChuckNorris chuckNorris = new ChuckNorris();
    assertThat(chuckNorris.toUnary("CC"), is("0 0 00 0000 0 000 00 0000 0 00"));
  }

  @Test
  public void testToUnaryWithPercentage() {
    ChuckNorris chuckNorris = new ChuckNorris();
    assertThat(chuckNorris.toUnary("%"), is("00 0 0 0 00 00 0 0 00 0 0 0"));
  }

  @Test
  public void testToUnaryWithChuckFact() {
    ChuckNorris chuckNorris = new ChuckNorris();
    assertThat(chuckNorris.toUnary("Chuck Norris' keyboard has 2 keys: 0 and white space."),
               is("0 0 00 0000 0 0000 00 0 0 0 00 000 0 000 00 0 0 0 00 0 0 000 00 000 0 0000 00 0 0 0 00 0 0 00 00 0 0 0 00 00000 0 0 00 "
                  + "00 0 000 00 0 0 00 00 0 0 0000000 00 00 0 0 00 0 0 000 00 00 0 0 00 0 0 00 00 0 0 0 00 00 0 0000 00 00 0 00 00 0 0 0 "
                  + "00 00 0 000 00 0 0 0 00 00000 0 00 00 0 0 0 00 0 0 0000 00 00 0 0 00 0 0 00000 00 00 0 000 00 000 0 0 00 0 0 00 00 0 0"
                  + " 000000 00 0000 0 0000 00 00 0 0 00 0 0 00 00 00 0 0 00 000 0 0 00 00000 0 00 00 0 0 0 00 000 0 00 00 0000 0 0000 00 "
                  + "00 0 00 00 0 0 0 00 000000 0 00 00 00 0 0 00 00 0 0 00 00000 0 00 00 0 0 0 00 0 0 0000 00 00 0 0 00 0 0 00000 00 00 0"
                  + " 0000 00 00 0 00 00 0 0 000 00 0 0 0 00 00 0 0 00 000000 0 00 00 00000 0 0 00 00000 0 00 00 0000 0 000 00 0 0 000 00 0"
                  + " 0 00 00 00 0 0 00 000 0 0 00 00000 0 000 00 0 0 00000 00 0 0 0 00 000 0 00 00 0 0 0 00 00 0 0000 00 0 0 0 00 00 0 00 "
                  + "00 00 0 0 00 0 0 0 00 0 0 0 00 00000 0 000 00 00 0 00000 00 0000 0 00 00 0000 0 000 00 000 0 0000 00 00 0 0 00 0 0 0 "
                  + "00 0 0 0 00 0 0 000 00 0"));
  }
}
