package Lesson13;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        String dirName = "D:\\";
        String fileName = "file1.txt";

        try ( FileInputStream fis = new FileInputStream(dirName + File.separator +fileName);
        InputStreamReader osw = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(osw)) {
            List<String> list = new ArrayList<String>();
            String str = null;
            while ((str = br.readLine()) != null) {
                list.add(str);
            }

            String newName = "D:\\";
            String filenName = "file2.txt";
            File newDirectory = new File(dirName);
            if (!newDirectory.exists()) {
                boolean isDirCreated = newDirectory.mkdir();

                if (!isDirCreated) {
                    throw new RuntimeException("Not created directory");

                }
            }
            File newFile = new File(newName + File.separator + filenName);




            String data = null;
            try ( FileOutputStream fosi = new FileOutputStream(newFile);
                  OutputStreamWriter oswi = new OutputStreamWriter(fosi);
                  BufferedWriter bwi = new BufferedWriter(oswi) ) {

                bwi.write(((Integer)list.size()).toString());
                bwi.newLine();
                bwi.write(longestLine((ArrayList<String>) list));
                bwi.newLine();
                bwi.write(String.valueOf(getCreationDateTime(newFile)));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        }



    public static LocalDateTime getCreationDateTime (File file) throws IOException {

        BasicFileAttributes attr = Files.readAttributes(file.toPath(),
                BasicFileAttributes.class);
        return attr.creationTime()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
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
}
