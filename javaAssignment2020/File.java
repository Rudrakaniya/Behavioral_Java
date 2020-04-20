import java.util.*;
import java.io.*;

class File{
    public static void main(String[] args) throws IOException{
        // creating a object for the third file 
        PrintWriter writeObj = new PrintWriter("copy.txt"); 
          
        // creating a object for reading files 
        BufferedReader read1 = new BufferedReader(new FileReader("a1.txt")); 
        BufferedReader read2 = new BufferedReader(new FileReader("a2.txt")); 
          
          
        String line1 = read1.readLine();
        String line2 = read2.readLine(); 
          
        //coping the content of a1.txt and a2.txt to the third file
        while (line1 != null || line2 !=null) 
        { 
            if(line1 != null) 
            { 
                writeObj.println(line1); 
                line1 = read1.readLine(); 
            } 
              
            if(line2 != null) 
            { 
                writeObj.println(line2); 
                line2 = read2.readLine(); 
            } 
        } 
      
        writeObj.flush(); 
          
        read1.close(); 
        read2.close(); 
        writeObj.close(); 
          
        System.out.print("The data from files a1.txt and a2.txt is alternatively copied to copy.txt \n");
        
    }
}
