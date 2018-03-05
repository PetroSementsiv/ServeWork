package Lesson13;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class HomeWork1 {
    public static void main(String[] args) throws IOException {
        String dirName = "D:\\";
        String fileName = "mytext.txt";

        try (FileInputStream fis = new FileInputStream(dirName + File.separator + fileName);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr) ) {
            List<String> lines = new ArrayList<String>();
            List<Integer> lineCount = new ArrayList<Integer>();
            String str = null;
            int countSymbol = 0;

            while ((str = br.readLine()) != null) {
                lines.add(str);
                lineCount.add(str.length());

            }

            System.out.println(lines);
            System.out.println(lineCount);
            System.out.println("The longest line is: " + longestLine((ArrayList<String>) lines));
            System.out.println("The shortest line is: "+shortestLine((ArrayList<String>) lines));
            System.out.println(newList((ArrayList<String>) lines, "old"));

        }


    }

    private static String longestLine(ArrayList<String> list){
    int largestString = list.get(0).length();
    int index = 0;

    for(int i = 0; i < list.size(); i++)
    {
        if(list.get(i).length() > largestString)
        {
            largestString = list.get(i).length();
            index = i;
        }
    }
     return  list.get(index);
}
    private static String shortestLine(ArrayList<String> list) {
        int shortestString = list.get(0).length();
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < shortestString) {
                shortestString = list.get(i).length();
                index = i;
            }
        }
        return list.get(index);
    }
    private static ArrayList<String> newList(ArrayList<String> list, String parametr) {
        int shortestString = list.get(0).length();
        int index = 0;
        List<String> withParametr = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(parametr)) {
                withParametr.add(list.get(i));
            }
        }
        return (ArrayList<String>) withParametr;
    }
}

