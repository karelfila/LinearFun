package com.company;


import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funkce> arr = new ArrayList<Funkce>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));

            String a = br.readLine();
            while (a!=(null)) {
                arr.add(new Funkce(a));
                a = br.readLine();
            }
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i).toString());
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
            bw.write(Integer.toString(arr.size()));
            bw.flush();
            bw.close();

            int Counter = 1;
            boolean unikatni = true;

            for (int i = 1; i < arr.size(); i++) {
                unikatni = true;
                for (int j = 0; j < i; j++) {
                    if(arr.get(i).equals(arr.get(j))) {
                        unikatni = false;
                    }
                }
                if(unikatni) {
                    Counter++;
                }
            }
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("count_distinct.txt"));
            bw2.write(Integer.toString(Counter));
            bw2.flush();
            bw2.close();

        } catch (IOException e) {

        }

    }
}
