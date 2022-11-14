import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}
