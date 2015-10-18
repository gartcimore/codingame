package org.gartcimore.codingame.easy.MimeType;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * @author gartcimore
 */
public class SolutionTest {


  @Test
  public void simpleTest() {
    Map<String, String> mimeTable = new HashMap<>();
    mimeTable.put("html", "text/html");
    mimeTable.put("png", "image/png");
    mimeTable.put("gif", "image/gif");

    List<String> result = Solution.parse(mimeTable, asList("animated.gif", "portrait.png", "index.html"));
    assertThat(result, contains("image/gif", "image/png", "text/html"));
  }

  @Test
  public void withUnknownTypes() {
    Map<String, String> mimeTable = new HashMap<>();
    mimeTable.put("txt", "text/plain");
    mimeTable.put("xml", "text/xml");
    mimeTable.put("flv", "video/x-flv");

    List<String> result = Solution.parse(mimeTable, asList("image.png", "animated.gif", "script.js", "source.cpp"));
    assertThat(result, contains("UNKNOWN", "UNKNOWN", "UNKNOWN", "UNKNOWN"));
  }

  @Test
  public void withDotExtensionToParse() {
    Map<String, String> mimeTable = new HashMap<>();
    mimeTable.put("wav", "audio/x-wav");
    mimeTable.put("mp3", "audio/mpeg");
    mimeTable.put("pdf", "application/pdf");

    List<String>
        result =
        Solution.parse(mimeTable, asList("a", "a.wav", "b.wav.tmp", "test.vmp3", "pdf", ".pdf", "mp3", "report..pdf", "defaultwav", ".mp3.",
                                         "final."));
    assertThat(result, contains("UNKNOWN", "audio/x-wav", "UNKNOWN", "UNKNOWN", "UNKNOWN", "application/pdf", "UNKNOWN", "application/pdf",
                                "UNKNOWN", "UNKNOWN", "UNKNOWN"));
  }
}
