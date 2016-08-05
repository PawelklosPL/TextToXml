/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package txttoxml;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Pawel
 */
public class Txttoxml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
      PrintWriter zapis = new PrintWriter("plik.xml");
      
      zapis.println("<users>"); 
      for(int i =1;i<=60000;i++)
      {
          zapis.println("<user>");
          zapis.println("<name>name"+i+"</name>");
          zapis.println("<surname>surname"+i+"</surname>");
          zapis.println("<login>login"+i+"</login>");
          zapis.println("</user>");
      }
      zapis.println("</users>");
      
      zapis.close();
    }
    
}
