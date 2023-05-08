package org.example;

import java.io.*;
import java.util.Arrays;

public class ReadFile {
    public void read(String filepath) {
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                String str[]=line.split(",");
                char a = ' ';
                for (String elemnt: str
                     ) {
                    for (int i = 0; i < elemnt.length(); i++) {
                        if ( (a = elemnt.charAt(i)) == '"'){
                            a = ' ';
                        }
                    }
                }
//                System.out.println(Arrays.toString(str));
//                System.out.println("ID là: "+str[0]+" code là: "+str[1]+" quốc gia: "+str[2]);
                System.out.printf("ID là: %s, code là %s, quốc gia: %s \n",str[0],str[1].replace('"',' ').trim(),str[2].replace('"',' ').trim());
//                System.out.println("ID là: "+1+" code là: "+"AU"+" quốc gia: "+"Áutrlia");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
