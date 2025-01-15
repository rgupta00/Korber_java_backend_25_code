package com.java17.features;

import java.time.LocalDate;
import java.time.Month;

public class C_SwitchEnhancement {
    public static void main(String[] args) {
        //java 6 u can only use char or int long: switch
        //java 7: string can also be used
        //java 13+ to simply the syntex of switch case


//        enum WeekDay {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }

//        WeekDay day = WeekDay.TUESDAY;
//        switch (day) {
//            case MONDAY:
//                System.out.println("Let's meet!");
//                break;
//            case TUESDAY:
//                System.out.println("no meeting!");
//                break;
//            case WEDNESDAY:
//                System.out.println("Let's meet!");
//                break;
//            case THURSDAY:
//                System.out.println("no meeting!");
//                break;
//            case FRIDAY:
//                System.out.println("Let's meet!");
//                break;
//            case SATURDAY:
//                System.out.println("no meeting!");
//                break;
//            case SUNDAY:
//                System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//                break;
//            default:
//                System.out.println("Do I really need this?!");
//                break;
//        }


//step 1

//        enum WeekDay {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }
//
//        WeekDay day = WeekDay.MONDAY;
//        switch (day) {
//            case MONDAY, WEDNESDAY,FRIDAY:
//                System.out.println("Let's meet!");
//                break;
//            case TUESDAY,THURSDAY,SATURDAY:
//                System.out.println("no meeting!");
//                break;
//            case SUNDAY:
//                System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//                break;
//        }

        //imporvement 2
//        enum WeekDay {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }
//
//        WeekDay day = WeekDay.MONDAY;
//        switch (day) {
//            case MONDAY, WEDNESDAY,FRIDAY ->
//                System.out.println("Let's meet!");
//            case TUESDAY,THURSDAY,SATURDAY ->
//                System.out.println("no meeting!");
//            case SUNDAY ->
//                System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//
//        }

        //improvement 2 form : to ->
//        enum WeekDay {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }
//
//        WeekDay day = WeekDay.MONDAY;
//        switch (day) {
//            case MONDAY, WEDNESDAY,FRIDAY ->
//                    System.out.println("Let's meet!");
//            case TUESDAY,THURSDAY,SATURDAY ->
//                    System.out.println("no meeting!");
//            case SUNDAY ->
//                    System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//
//        }

        //statement vs expression

//        switch (){
//
//        }
//        String value=switch (){
//
//        };


//        enum WeekDay {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }
//
//        WeekDay day = WeekDay.SATURDAY;
//       String message= switch (day) {
//            case MONDAY, WEDNESDAY,FRIDAY ->{
//                LocalDate localDate=LocalDate.now();
//               yield "let meet "+localDate;
//            }
//
//            case TUESDAY,THURSDAY,SATURDAY ->{
//                LocalDate localDate=LocalDate.of(2011, Month.JANUARY, 11);
//                yield  "no meeting! "+ localDate;
//            }
//            case SUNDAY -> "Let's meet (although Sunday should be a free day, man!)!";
//        };
//        System.out.println(message);

        //Note:
        int day=1;
        String message= switch (day){
            case 1,3,5 -> "lets meet";
            case 2,4,6 -> "no meeting";
            case 7->{
                yield "i told you no meeting! sleep";
            }
            default -> throw new IllegalArgumentException("day must be bw 1-7");
        };

        System.out.println(message);
    }
}
