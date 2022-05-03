package me.thewing.oagis_crawling;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class RunTest {

  public static void main(String[] args) {
    Document doc = null;

    String url = "https://github.com/sujl95/oagis_crawling/blob/main/Nouns/ActualLedger.htm";

    try {
      doc = Jsoup.connect(url).get();

      System.out.println("doc = " + doc);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
