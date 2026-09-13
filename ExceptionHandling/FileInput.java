package src.main.java.JavaBasic.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {
        BufferedReader render = null;
         try{
            render = new BufferedReader(new FileReader("src\\main\\java\\JavaBasic\\ExceptionHandling\\data.txt"));
                String data;
                while ((data = render.readLine()) != null){
                    System.out.println(data);
                }
         }catch(FileNotFoundException e){
              System.out.println("File not found: "+ e.getMessage());
         }catch (IOException e){
              System.out.println("An I/O error occurred: "+ e.getMessage());
         }finally{
            if(render != null){
                render.close();
                System.out.println("Execution completed.");
            }else{
                System.out.println("Reader was not opened.");
            }
        }
  } 
}
