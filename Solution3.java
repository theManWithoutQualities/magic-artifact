package javaapplication1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Level{
    int a;
    int b;
    int x;
    int val;
}

public class Solution3 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        for(int testCount=0; testCount<t; testCount++){
            int n = reader.nextInt();
            ArrayList<Level> arr = new ArrayList<Level>(n);
            for(int indexLevel=0; indexLevel<n; indexLevel++){
                Level level = new Level();
                level.a=reader.nextInt();
                level.b=reader.nextInt();
                level.x=reader.nextInt();
                arr.add(level);
            }
            
            int sumA=0;
            for(int index=0; index<n; index++){
                sumA+=arr.get(index).a;
            }
            
            int sumB=0;
            for(int index=0; index<n; index++){
                sumB+=arr.get(index).b;
            }
            
            for(int index=0; index<n; index++){
                arr.get(index).val=-arr.get(index).a+arr.get(index).x*(sumA-arr.get(index).a-(sumB-arr.get(index).b));
            }
            
            Collections.sort(arr, new Comparator<Level>(){
                @Override
                public int compare(Level l1, Level l2){
                    return(l2.val-l1.val);
                }
            });
                      
            int result=0;
            sumA=0;
            
            for(int index = 0; index<n; index++){
                sumA+=arr.get(index).a;
                sumB-=arr.get(index).b;
                result+=(sumA+sumB)*arr.get(index).x;
            }
            
            System.out.println((float)result/10000000);
        }
    }
}
