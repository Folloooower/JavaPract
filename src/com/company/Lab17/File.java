package com.company.Lab17;

import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class File {
    static String name;

    public File(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        File myFile = new File("src/com/company/Lab17/Hello.txt");
        myFile.writen();
       myFile.read();
        myFile.writen();
    }

    public void writen() {

        try {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            FileWriter writer = new FileWriter(name);
            writer.write(text);
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
        public void read() {
            try {
                FileReader filereader = new FileReader(name);
                BufferedReader reader = new BufferedReader(filereader);
                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            }catch (Exception ex)
            {
                ex.printStackTrace();

            }

        }
    }

