package me.thewing.oagis_crawling;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class RunTest {

  public static void main(String[] args) {
    Document doc = null;

    String url = "file:///C:/Users/SungJun/Desktop/OAGIS_10_6_EnterpriseEdition/OAGi-BPI-Platform/org_openapplications_oagis/10_6/Documentation/OAGIS.html";

    try {
      doc = Jsoup.connect(url).get();

      System.out.println("doc = " + doc);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
