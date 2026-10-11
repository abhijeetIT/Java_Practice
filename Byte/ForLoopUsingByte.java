package main.java.JavaBasic.Byte;

public class ForLoopUsingByte {
    public static void main(String[] args) {
        

        //this also work
        for(byte i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }
    
        //this will also work
        for(byte i = 0 ; i < 127 ; i++){
            System.out.println(i);
        }


        //this is infinite loop
        for(byte i = 0 ; i < 129 ; i++){
            System.out.println(i);
        }

}
}
