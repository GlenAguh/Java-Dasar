package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
public class main {
    public static void main(String[] args) throws IOException{
        
    

        //        try {
        //            FileInputStream fileInput = new FileInputStream("input.txt");
        //        } catch (Exception e){
        //            System.err.println(e);
        //        }
        
                FileInputStream fileInput = new FileInputStream("input.txt");
        
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());
                System.out.print((char)fileInput.read());

        
    }
}
