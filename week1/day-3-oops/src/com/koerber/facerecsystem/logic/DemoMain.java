package com.koerber.facerecsystem.logic;

import com.koerber.facerecsystem.db.*;



public class DemoMain {
    public static void main(String[] args) {

        //Date: util =>90
        //Date : sql =>10

        MyClass myClass=new MyClass();

        Face face = new Face();
        face.saveFacePixelToDb();

        com.koerber.facerecsystem.db.foo.Face face3=new com.koerber.facerecsystem.db.foo.Face();
        com.koerber.facerecsystem.ui.Face face2=new com.koerber.facerecsystem.ui.Face();
        face2.printFacePixelToUI();

    }
}
