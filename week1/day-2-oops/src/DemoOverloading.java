class Cal{
    public long add(int a, long b){
        return a+b;
    }
    public long add(long a, int b){
        return a+b;
    }

}
public class DemoOverloading {
    public static void main(String[] args) {
        Cal cal=new Cal();
        System.out.println(cal.add(2,4L));
    }
}
