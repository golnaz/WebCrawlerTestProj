package domSearch;

import org.w3c.dom.*;
import org.apache.xerces.parsers.DOMParser;
import java.io.*;

public class DomElementSearch {

//  /media/New Volume/My Files/Website_categorization/java code/WebCrawlerTestProj/src/domSearch/Employee-Detail.xml

  public static void main(String[] args) {
  try{
  BufferedReader bf = new BufferedReader(
   new InputStreamReader(System.in));
  System.out.print("Enter file name: ");
  String str = bf.readLine();
  File file = new File(str);
  DOMParser parser = new DOMParser();
  parser.parse(str);
  if (file.exists()){
  /*DOMParser parser = new DOMParser();
  parser.parse(str);*/
  //Document doc = parser.getDocument();
  System.out.print("Enter element that have to count: ");
  //String ele = bf.readLine();
  //NodeList list = doc.getElementsByTagName(ele);
  /*if(list.getLength() == 0){
  System.out.println("Element doesn't exist in the " + 
  str + " Document.");
  }
  else{
  System.out.println("Element occurrs " + 
   list.getLength() + " times in the " + str);
  }*/
  }
  else{
  //System.out.println("File not found!");
  }
  }
  catch (Exception e){
  e.getMessage();
  }
  }
}