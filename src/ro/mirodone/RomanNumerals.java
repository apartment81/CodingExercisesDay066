package ro.mirodone;

import java.util.TreeMap;

public class RomanNumerals {

    private static final TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    private  String toRoman(int number) {
        int x = map.floorKey(number);
        if (number == x) return map.get(number);
        return map.get(x) + toRoman(number - x);
    }

    public String solution(int n) {
        return toRoman(n);
    }

}
