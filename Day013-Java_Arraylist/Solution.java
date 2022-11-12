import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            int d=scanner.nextInt();
            ArrayList<Integer>temparr=new ArrayList<>();
            for(int j=0;j<d;j++){
                int ele=scanner.nextInt();
                temparr.add(ele);
            }
            arr.add(temparr);
        }
        int q = scanner.nextInt();
        for(int i=0;i<q;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x<=n){
                if(y<=arr.get(x-1).size()){
                    System.out.println(arr.get(x-1).get(y-1));
                }
                else{
                    System.out.println("ERROR!");
                }
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }  
    
}
