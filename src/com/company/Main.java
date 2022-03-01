package com.company;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("alphanumerics.txt")){
            char c;
            for(c = 'a'; c <= 'z'; ++c)
                writer.write(Character.toUpperCase(c)+" "+c+ "\n");
            for(int i=0;i<10;i++){
                writer.write(i+" \n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileReader reader = new FileReader("alphanumerics.txt")){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
