package com.day3.session1.solid.lsp;
//Favor compostion over inheritance if u are looking only for resuabltity of code
class DA{
    void play(){
        System.out.println("game ...");
    }
    void lotsOfMoney(){
        System.out.println("i am super rich");
    }

    void shootAnyBody(){
        System.out.println("shoot any body you know i am don");
    }
}
class SonOfDA {
    private DA da=new DA();
    void play(){
        da.play();
    }
    void lotsOfMoney(){
        da.lotsOfMoney();
    }
    public void goToSchool(){
        System.out.println("going to school");
    }
}
public class DemoLSP {
    public static void main(String[] args) {
    SonOfDA sonOfDA=new SonOfDA();
        sonOfDA.goToSchool();
    }
}
