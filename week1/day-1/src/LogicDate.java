public class LogicDate {
    //find the logic of leap year
    public static boolean isLeapYear(int year){
        if( (year%400==0 || year%100!=0) &&(year%4==0))
            return true;
        else
            return false;
    }
    //track no of days in a month
    public static  int noOfDays(int month, int year){
        int arr[]={-1,31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2){
            if(isLeapYear(year)){
                arr[2]=29;
            }
        }
        return arr[month];
    }

    public static void main(String[] args) {

        int d=28;
        int m=2;
        int y=2025;
        System.out.println("date is "+ d+"/"+m+"/"+y);

        d=d+1;
        if(d>noOfDays(m,y)){
            d=1;
            m++;
            if(m>12){
                m=1;
                y++;
            }
        }

        System.out.println("next date is "+ d+"/"+m+"/"+y);
    }
}
