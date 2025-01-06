public class Player {
   private int id;
    private String name;
    private int rank;
    private static int playerCounter=0;


    //default ctr
    public Player(){
        this("foo",1000);
    }

    public void setRank(int rank){
        this.rank=rank;
    }
    //constructor
    public Player(String name, int rank){
        this.id=++playerCounter;
        this.name=name;
        this.rank=rank;
    }

    //class method
    //static method dont have access to instance variable
    //static method can not access "this"
    public static int getPlayerCounter(){
        return playerCounter;
    }

    //instance method
    public void printPlayerDetails(){
        System.out.println("id "+ this.id +" name "+ this.name+ " rank "+ this.rank);
    }
}
