package com.java17;

public class B_SwitchExpressions {
    public static void main(String[] args) {
        //Switch : till java 1.4 int/long, char
        //java 1.5: string object, enum

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

        //u can compile cases:
//        enum WeekDay {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }
//        WeekDay day = WeekDay.TUESDAY;
//        switch (day) {
//            case MONDAY, WEDNESDAY, FRIDAY:
//                System.out.println("Let's meet!");
//                break;
//            case TUESDAY, THURSDAY, SATURDAY:
//                System.out.println("no meeting!");
//                break;
//            case SUNDAY:
//                System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//                break;
//            default:
//                System.out.println("Do I really need this?!");
//                break;
//        }

//        enum WeekDay {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }
//        WeekDay day = WeekDay.TUESDAY;
//        switch (day) {
//            case MONDAY, WEDNESDAY, FRIDAY ->
//                System.out.println("Let's meet!");
//
//            case TUESDAY, THURSDAY, SATURDAY ->
//                System.out.println("no meeting!");
//            case SUNDAY ->
//                System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//        }

//        enum WeekDay {
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//        }
//        WeekDay day = WeekDay.MONDAY;
//        String result=switch (day) {
//            case MONDAY, WEDNESDAY, FRIDAY -> {
//                System.out.println("Let's meet!");
//                yield  "Let's meet!";
//            }
//            case TUESDAY, THURSDAY, SATURDAY -> "no meeting!";
//            case SUNDAY -> "Let's meet (although Sunday should be a free day, man!)!";
//        };
//        System.out.println(result);
        //exhaustiveness cases
        //Mon -sun
        int day=3;
        String result=switch (day) {
            case 1, 3, 5 -> {
                System.out.println("Let's meet!");
                yield  "Let's meet!";
            }
            case 2, 4, 6 -> "no meeting!";
            case 7 -> "Let's meet (although Sunday should be a free day, man!)!";
            default -> throw new IllegalArgumentException("day must be bw 1-7");
        };
        System.out.println(result);
    }
}
