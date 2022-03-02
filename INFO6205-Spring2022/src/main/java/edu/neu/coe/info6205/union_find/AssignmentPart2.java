/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.coe.info6205.union_find;

import java.util.Random;

/**
 *
 * @author fuyanping
 */
public class AssignmentPart2 {
    
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n=in.nextInt();
        //if(args.length==0) System.out.println("no input");
        //int n=Integer.parseInt(args[0]);
        int[] arr = new int[]{0,100,200,300,400,500,600,700,800,900,1000,1200,1400,1600,1800,2000,2200,2400,
            2600,2800,3000,3200,3400,3600,3800,4000,4200,4400,4600,4800,5000,5200,5400,5600,5800,6000,7000,8000,9000,
        10000,11000,12000,13000,14000,15000,16000,18000,20000,30000,40000,50000,60000};
        int tries = 30;
        for (int j = 0; j < arr.length; j++) {
            int n = arr[j];
            int totalconnections = 0;
            for (int i = 0; i < tries; i++) {
                totalconnections += count(n);
            }
            System.out.println(n+" sites : "+totalconnections / tries+" connections");
        }
    }
    
    public static int count(int n){
        int cnt=0;
         UF h = new UF_HWQUPC(n);
         Random random=new Random();
         while(h.components()>1){
             
             int s1=random.nextInt(n);
             int s2=random.nextInt(n);
             
                 h.connect(s1, s2);
                 cnt++;
             
         }
        return cnt;
    }
}
