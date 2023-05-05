package org.example;

import java.io.*;

public class ReadAndWrite {
    public static String read(String filepath) {
        String str1="";
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                str1 += str;
            }
            bufferedReader.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File không tồn tại hoặc gặp lỗi nào đó ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str1;
    }

    public static void write(String filepath, String filepath1) {
        try {
            File file = new File(filepath);
            if (file.exists()) {
                System.out.println("Cảnh báo: Tệp " + filepath + " đã tồn tại và sẽ bị ghi đè!");
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(read(filepath1));
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
