/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amlearning;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author elechill
 */
public class AmLearning {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        
        final String url = 
                "https://www.wtamu.edu/_files/docs/academics/Institutional%20Research/FACULTY_EVAL_SUMMARY_2021FR.htm";
     Document doc = Jsoup.connect(url).get();
    
     
        
      Elements pag = doc.getElementsByAttribute("bgcolor");
         System.out.println(pag);
          
        

    }}
