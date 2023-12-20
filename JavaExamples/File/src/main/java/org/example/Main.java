package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception{

        String[] names = {"Tunzala","Faraj","Rovnaq","Safar"};

        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));

        for(String name:names) {
            writer.append(name+"\n");
            writer.append("java"+"\n");
        }
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line;

        while((line=reader.readLine()) !=null) {
            System.out.println(line);
        }

    }
}