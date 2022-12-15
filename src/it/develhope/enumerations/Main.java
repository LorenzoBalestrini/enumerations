package it.develhope.enumerations;

public class Main {
    public static void main(String[] args) {

        enum Month{
            January,
            February,
            March,
            April,
            May,
            June,
            July,
            August,
            September,
            October,
            November,
            December
        }

        for(Month currentMonth : Month.values()){
            if(currentMonth.toString().endsWith("y")){
                System.out.println(currentMonth + " - ends with y");
            }else{
                System.out.println(currentMonth + " - doesn't end with y");
            }
        }
    }
}
