package com.day4.session2;

import java.io.*;

public class B_IOException {
    public static void main(String[] args) {
        //read a file and print all the details
       try(BufferedReader br=new BufferedReader
               (new FileReader(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\story\\story.txt")))){
           String line=null;
           while ((line=br.readLine())!=null){
               System.out.println(line);
           }
           br.close();
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
