package com.day4.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q {
    public static void main(String[] args) {

        List<Book> books=new ArrayList<>();
        String line=null;
        //read file make token of each line and convert into Book object and put that object to AL
        try(BufferedReader br=new BufferedReader(new FileReader(new File("data.txt")))){
            while ((line=br.readLine())!=null){
                String tokens[]=line.split(":");
                    books.add(new Book(Integer.parseInt(tokens[0]),
                            tokens[1],
                            tokens[2],
                            tokens[3],
                            Integer.parseInt(tokens[4])));

            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //let print the list
        for(Book book: books){
            System.out.println(book);
        }

    }
}
