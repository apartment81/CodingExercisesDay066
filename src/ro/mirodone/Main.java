package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        RomanNumerals romanNumerals = new RomanNumerals();

        System.out.println(romanNumerals.solution(50000));

       /* for (int i = 1; i<= 100; i++) {
            System.out.println(i+"\t =\t "+romanNumerals.solution(i));
        }*/

       IntToRoman toRoman = new IntToRoman();

        System.out.println(toRoman.intToRoman(50000));

       ConversionToRoman conversionToRoman = new ConversionToRoman();
       System.out.println(conversionToRoman.solution(3999));


    }
}
