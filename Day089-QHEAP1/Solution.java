import java.io.*;
import java.util.*;

public class Solution {

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int[][] arr = new int[N][2];
        
        for(int i = 0; i< N; i++){
            String line = scan.nextLine();
            String[] query = line.split(" ");
            
            arr[i][0] = Integer.parseInt(query[0]);
            if(query.length ==2){
                arr[i][1] = Integer.parseInt(query[1]);
            }
        }
        
        heapMethods(arr);     
    }
    
    public static void heapMethods(int[][] arr){
        int N = arr.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        
        for(int i = 0; i<N; i++){
            if(arr[i][0] == 1){
                minHeap.add((arr[i][1]));
            } else if(arr[i][0] == 2){
                minHeap.remove((arr[i][1]));
            } else{
                System.out.println(minHeap.peek());
            }
        }
    }
}
