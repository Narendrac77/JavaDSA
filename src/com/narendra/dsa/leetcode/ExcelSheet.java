package com.narendra.dsa.leetcode;
import java.util.ArrayList;
import java.util.List;

//A cell (r, c) of an excel sheet is represented as a string "<col><row>" where:
//
//<col> denotes the column number c of the cell. It is represented by alphabetical letters.
//For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
//<row> is the row number r of the cell. The rth row is represented by the integer r.
//You are given a string s in the format "<col1><row1>:<col2><row2>", where <col1> represents the column c1, <row1> represents the row r1, <col2> represents the column c2, and <row2> represents the row r2, such that r1 <= r2 and c1 <= c2.
//
//Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2. The cells should be represented as strings in the format mentioned above and be sorted in non-decreasing order first by columns and then by rows.
public class ExcelSheet {

    public static void main(String[] args) {
        test1();
    }

    public  static List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        char start = s.charAt(0);
        char end = s.charAt(3);
        int startColumn = s.charAt(1)-'0';
        int endColumn = s.charAt(4)-'0';
        while(start <= end){
            for(int i = startColumn; i<=endColumn; i++){
                result.add(start +String.valueOf(i));
            }
            start++;
        }
        return result;

    }

    public static void test1(){
        String s1 = "A1:C4";
        List<String> stringList = cellsInRange(s1);
        stringList.stream().forEach(System.out::println);
    }
}
