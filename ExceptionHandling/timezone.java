package JavaBasic.ExceptionHandling;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class timezone {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try{
        System.out.print("Enter date: ");
        String userInput= br.readLine();
        LocalDate currenDate = LocalDate.now();
        LocalDate years18 = currenDate.minusYears(18);
        
        LocalDate userDate = LocalDate.parse(userInput,inputFormat);
        if(userDate.isBefore(years18)){
            System.out.println("ho gaya 18 ka!!");
        }else{
            System.out.println("Bacchaa hai");
        }
        System.out.println(years18);
        }catch(DateTimeParseException e){
            System.err.println(e.getMessage());
           }
       
        }
    }
