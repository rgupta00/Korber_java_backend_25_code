package com.day4.session3;

import java.io.*;

public class A_IOBasicsEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedInputStream fis=
                new BufferedInputStream
                        (new FileInputStream
                                (new File("C:\\Users\\busyc\\OneDrive\\Desktop\\ali\\ali.jpg")));

        BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream
                (new File("C:\\Users\\busyc\\OneDrive\\Desktop\\ali\\ali1.jpg")));

        long start=System.currentTimeMillis();

        int byteReads=1;
        while ((byteReads=fis.read())!=-1){
            fos.write(byteReads);//4KB
        }
        fis.close();
        fos.close();

        long end=System.currentTimeMillis();
        System.out.println("time taken is "+ (end-start )+" ms");






//        FileInputStream fis=
//                new FileInputStream(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\ali\\ali.jpg"));
//
//        FileOutputStream fos=new FileOutputStream
//                (new File("C:\\Users\\busyc\\OneDrive\\Desktop\\ali\\ali1.jpg"));
//
//        long start=System.currentTimeMillis();
//
//        int byteReads=1;
//        while ((byteReads=fis.read())!=-1){
//            fos.write(byteReads);
//        }
//        fis.close();
//        fos.close();
//
//        long end=System.currentTimeMillis();
//        System.out.println("time taken is "+ (end-start )+" ms");

    }
}
