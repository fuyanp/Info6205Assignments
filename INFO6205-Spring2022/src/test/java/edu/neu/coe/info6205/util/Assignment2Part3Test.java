/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.coe.info6205.util;

import edu.neu.coe.info6205.sort.BaseHelper;
import edu.neu.coe.info6205.sort.GenericSort;
import edu.neu.coe.info6205.sort.Helper;
import edu.neu.coe.info6205.sort.HelperFactory;
import edu.neu.coe.info6205.sort.elementary.InsertionSort;
import edu.neu.coe.info6205.sort.elementary.InsertionSortTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fuyanping
 */
public class Assignment2Part3Test {
    int pre = 0;
    int run = 0;
    int post = 0;
    
    /*
    public Assignment2Part3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    */
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void randomArraySortTest1() throws Exception{
        Integer[] xs=new Integer[1000];
	for(int i=0;i<xs.length;i++){
            xs[i]=(int)(Math.random()*1500);
	}
	
        final Timer timer = new Timer();
        BaseHelper<Integer> helper = new BaseHelper<>("InsertionSort", xs.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter = new InsertionSort<Integer>(helper);
        Benchmark<Integer[]> bm = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter.sort(xs,0,xs.length);
                });
        double mean1 =bm.run(xs, 500);
        System.out.println("\n randomArraySortTest1: "+mean1);
    }
    
    @Test
    public void randomArraySortTest2() throws Exception{
        int al1=500,al2=1000,al3=1200,al4=1500,al5=2000,al6=2500;
        
        Integer[] xs1=new Integer[al1];
	for(int i=0;i<xs1.length;i++){
            xs1[i]=(int)(Math.random()*(al1+500));
	}
        Integer[] xs2=new Integer[al2];
	for(int i=0;i<xs2.length;i++){
            xs2[i]=(int)(Math.random()*(al2+500));
	}
        Integer[] xs3=new Integer[al3];
	for(int i=0;i<xs3.length;i++){
            xs3[i]=(int)(Math.random()*(al3+500));
	}
        Integer[] xs4=new Integer[al4];
	for(int i=0;i<xs4.length;i++){
            xs4[i]=(int)(Math.random()*(al4+500));
	}
        Integer[] xs5=new Integer[al5];
	for(int i=0;i<xs5.length;i++){
            xs5[i]=(int)(Math.random()*(al5+500));
	}Integer[] xs6=new Integer[al6];
	for(int i=0;i<xs6.length;i++){
            xs6[i]=(int)(Math.random()*(al6+500));
	}
        int runt=1000;
        
        BaseHelper<Integer> helper1 = new BaseHelper<>("InsertionSort", xs1.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter1 = new InsertionSort<Integer>(helper1);
        Benchmark<Integer[]> bm1 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter1.sort(xs1,0,xs1.length);
                });
        double mean1 =bm1.run(xs1, runt);
        System.out.println("\n randomArraySortTest with "+al1+"array length:  "+mean1);
        
        BaseHelper<Integer> helper2 = new BaseHelper<>("InsertionSort", xs2.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter2 = new InsertionSort<Integer>(helper2);
        Benchmark<Integer[]> bm2 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter2.sort(xs2,0,xs2.length);
                },
                b -> {
                    sorter2.sort(xs2,0,xs2.length);
                });
        double mean2 =bm2.run(xs2, runt);
        System.out.println("\n randomArraySortTest with "+al2+"array length:  "+mean2);
        
        BaseHelper<Integer> helper3 = new BaseHelper<>("InsertionSort", xs3.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter3 = new InsertionSort<Integer>(helper3);
        Benchmark<Integer[]> bm3 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter3.sort(xs3,0,xs3.length);
                });
        double mean3 =bm3.run(xs3, runt);
        System.out.println("\n randomArraySortTest with "+al3+"array length:  "+mean3);
        
        BaseHelper<Integer> helper4 = new BaseHelper<>("InsertionSort", xs4.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter4 = new InsertionSort<Integer>(helper4);
        Benchmark<Integer[]> bm4 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter4.sort(xs4,0,xs4.length);
                });
        double mean4 =bm4.run(xs4, runt);
        System.out.println("\n randomArraySortTest with "+al4+"array length:  "+mean4);
        
        BaseHelper<Integer> helper5 = new BaseHelper<>("InsertionSort", xs5.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter5 = new InsertionSort<Integer>(helper5);
        Benchmark<Integer[]> bm5 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter5.sort(xs5,0,xs5.length);
                });
        double mean5 =bm5.run(xs5, runt);
        System.out.println("\n randomArraySortTest with "+al5+"array length:  "+mean5);
        
        BaseHelper<Integer> helper6 = new BaseHelper<>("InsertionSort", xs6.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter6 = new InsertionSort<Integer>(helper6);
        Benchmark<Integer[]> bm6 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter6.sort(xs6,0,xs6.length);
                });
        double mean6 =bm6.run(xs6, runt);
        System.out.println("\n randomArraySortTest with "+al6+"array length:  "+mean6);
    }
    
    @Test
    public void randomArraySortTest3() throws Exception{
        int al1=3000,al2=3500,al3=4000,al4=4500,al5=5000,al6=5500;
        
        Integer[] xs1=new Integer[al1];
	for(int i=0;i<xs1.length;i++){
            xs1[i]=(int)(Math.random()*(al1+500));
	}
        Integer[] xs2=new Integer[al2];
	for(int i=0;i<xs2.length;i++){
            xs2[i]=(int)(Math.random()*(al2+500));
	}
        Integer[] xs3=new Integer[al3];
	for(int i=0;i<xs3.length;i++){
            xs3[i]=(int)(Math.random()*(al3+500));
	}
        Integer[] xs4=new Integer[al4];
	for(int i=0;i<xs4.length;i++){
            xs4[i]=(int)(Math.random()*(al4+500));
	}
        Integer[] xs5=new Integer[al5];
	for(int i=0;i<xs5.length;i++){
            xs5[i]=(int)(Math.random()*(al5+500));
	}Integer[] xs6=new Integer[al6];
	for(int i=0;i<xs6.length;i++){
            xs6[i]=(int)(Math.random()*(al6+500));
	}
       
        int runt=1000;
        
        BaseHelper<Integer> helper1 = new BaseHelper<>("InsertionSort", xs1.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter1 = new InsertionSort<Integer>(helper1);
        Benchmark<Integer[]> bm1 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter1.sort(xs1,0,xs1.length);
                });
        double mean1 =bm1.run(xs1, runt);
        System.out.println("\n randomArraySortTest with "+al1+"array length:  "+mean1);
        
        BaseHelper<Integer> helper2 = new BaseHelper<>("InsertionSort", xs2.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter2 = new InsertionSort<Integer>(helper2);
        Benchmark<Integer[]> bm2 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter2.sort(xs2,0,xs2.length);
                });
        double mean2 =bm2.run(xs2, runt);
        System.out.println("\n randomArraySortTest with "+al2+"array length:  "+mean2);
        
        BaseHelper<Integer> helper3 = new BaseHelper<>("InsertionSort", xs3.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter3 = new InsertionSort<Integer>(helper3);
        Benchmark<Integer[]> bm3 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter3.sort(xs3,0,xs3.length);
                });
        double mean3 =bm3.run(xs3, runt);
        System.out.println("\n randomArraySortTest with "+al3+"array length:  "+mean3);
        
        BaseHelper<Integer> helper4 = new BaseHelper<>("InsertionSort", xs4.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter4 = new InsertionSort<Integer>(helper4);
        Benchmark<Integer[]> bm4 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter4.sort(xs4,0,xs4.length);
                });
        double mean4 =bm4.run(xs4, runt);
        System.out.println("\n randomArraySortTest with "+al4+"array length:  "+mean4);
        
        BaseHelper<Integer> helper5 = new BaseHelper<>("InsertionSort", xs5.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter5 = new InsertionSort<Integer>(helper5);
        Benchmark<Integer[]> bm5 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter5.sort(xs5,0,xs5.length);
                });
        double mean5 =bm5.run(xs5, runt);
        System.out.println("\n randomArraySortTest with "+al5+"array length:  "+mean5);
        
        BaseHelper<Integer> helper6 = new BaseHelper<>("InsertionSort", xs6.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter6 = new InsertionSort<Integer>(helper6);
        Benchmark<Integer[]> bm6 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter6.sort(xs6,0,xs6.length);
                });
        double mean6 =bm6.run(xs6, runt);
        System.out.println("\n randomArraySortTest with "+al6+"array length:  "+mean6);
    }
    
    @Test
    public void randomArraySortTest4() throws Exception{
        int al1=5600,al2=5700,al3=5800,al4=5900,al5=6000,al6=6100;
        
        Integer[] xs1=new Integer[al1];
	for(int i=0;i<xs1.length;i++){
            xs1[i]=(int)(Math.random()*(al1+500));
	}
        Integer[] xs2=new Integer[al2];
	for(int i=0;i<xs2.length;i++){
            xs2[i]=(int)(Math.random()*(al2+500));
	}
        Integer[] xs3=new Integer[al3];
	for(int i=0;i<xs3.length;i++){
            xs3[i]=(int)(Math.random()*(al3+500));
	}
        Integer[] xs4=new Integer[al4];
	for(int i=0;i<xs4.length;i++){
            xs4[i]=(int)(Math.random()*(al4+500));
	}
        Integer[] xs5=new Integer[al5];
	for(int i=0;i<xs5.length;i++){
            xs5[i]=(int)(Math.random()*(al5+500));
	}Integer[] xs6=new Integer[al6];
	for(int i=0;i<xs6.length;i++){
            xs6[i]=(int)(Math.random()*(al6+500));
	}
       
        int runt=1000;
        
        BaseHelper<Integer> helper1 = new BaseHelper<>("InsertionSort", xs1.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter1 = new InsertionSort<Integer>(helper1);
        Benchmark<Integer[]> bm1 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter1.sort(xs1,0,xs1.length);
                });
        double mean1 =bm1.run(xs1, runt);
        System.out.println("\n randomArraySortTest with "+al1+"array length:  "+mean1);
        
        BaseHelper<Integer> helper2 = new BaseHelper<>("InsertionSort", xs2.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter2 = new InsertionSort<Integer>(helper2);
        Benchmark<Integer[]> bm2 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter2.sort(xs2,0,xs2.length);
                });
        double mean2 =bm2.run(xs2, runt);
        System.out.println("\n randomArraySortTest with "+al2+"array length:  "+mean2);
        
        BaseHelper<Integer> helper3 = new BaseHelper<>("InsertionSort", xs3.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter3 = new InsertionSort<Integer>(helper3);
        Benchmark<Integer[]> bm3 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter3.sort(xs3,0,xs3.length);
                });
        double mean3 =bm3.run(xs3, runt);
        System.out.println("\n randomArraySortTest with "+al3+"array length:  "+mean3);
        
        BaseHelper<Integer> helper4 = new BaseHelper<>("InsertionSort", xs4.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter4 = new InsertionSort<Integer>(helper4);
        Benchmark<Integer[]> bm4 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter4.sort(xs4,0,xs4.length);
                });
        double mean4 =bm4.run(xs4, runt);
        System.out.println("\n randomArraySortTest with "+al4+"array length:  "+mean4);
        
        BaseHelper<Integer> helper5 = new BaseHelper<>("InsertionSort", xs5.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter5 = new InsertionSort<Integer>(helper5);
        Benchmark<Integer[]> bm5 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter5.sort(xs5,0,xs5.length);
                });
        double mean5 =bm5.run(xs5, runt);
        System.out.println("\n randomArraySortTest with "+al5+"array length:  "+mean5);
        
        BaseHelper<Integer> helper6 = new BaseHelper<>("InsertionSort", xs6.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter6 = new InsertionSort<Integer>(helper6);
        Benchmark<Integer[]> bm6 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter6.sort(xs6,0,xs6.length);
                });
        double mean6 =bm6.run(xs6, runt);
        System.out.println("\n randomArraySortTest with "+al6+"array length:  "+mean6);
    }
    
    @Test
    public void randomArraySortTest5() throws Exception{
        int al1=6200,al2=6400,al3=6600,al4=6800,al5=7000,al6=7200;
        
        Integer[] xs1=new Integer[al1];
	for(int i=0;i<xs1.length;i++){
            xs1[i]=(int)(Math.random()*(al1+500));
	}
        Integer[] xs2=new Integer[al2];
	for(int i=0;i<xs2.length;i++){
            xs2[i]=(int)(Math.random()*(al2+500));
	}
        Integer[] xs3=new Integer[al3];
	for(int i=0;i<xs3.length;i++){
            xs3[i]=(int)(Math.random()*(al3+500));
	}
        Integer[] xs4=new Integer[al4];
	for(int i=0;i<xs4.length;i++){
            xs4[i]=(int)(Math.random()*(al4+500));
	}
        Integer[] xs5=new Integer[al5];
	for(int i=0;i<xs5.length;i++){
            xs5[i]=(int)(Math.random()*(al5+500));
	}Integer[] xs6=new Integer[al6];
	for(int i=0;i<xs6.length;i++){
            xs6[i]=(int)(Math.random()*(al6+500));
	}
       
        int runt=1000;
        
        BaseHelper<Integer> helper1 = new BaseHelper<>("InsertionSort", xs1.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter1 = new InsertionSort<Integer>(helper1);
        Benchmark<Integer[]> bm1 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter1.sort(xs1,0,xs1.length);
                });
        double mean1 =bm1.run(xs1, runt);
        System.out.println("\n randomArraySortTest with "+al1+"array length:  "+mean1);
        
        BaseHelper<Integer> helper2 = new BaseHelper<>("InsertionSort", xs2.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter2 = new InsertionSort<Integer>(helper2);
        Benchmark<Integer[]> bm2 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter2.sort(xs2,0,xs2.length);
                });
        double mean2 =bm2.run(xs2, runt);
        System.out.println("\n randomArraySortTest with "+al2+"array length:  "+mean2);
        
        BaseHelper<Integer> helper3 = new BaseHelper<>("InsertionSort", xs3.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter3 = new InsertionSort<Integer>(helper3);
        Benchmark<Integer[]> bm3 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter3.sort(xs3,0,xs3.length);
                });
        double mean3 =bm3.run(xs3, runt);
        System.out.println("\n randomArraySortTest with "+al3+"array length:  "+mean3);
        
        BaseHelper<Integer> helper4 = new BaseHelper<>("InsertionSort", xs4.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter4 = new InsertionSort<Integer>(helper4);
        Benchmark<Integer[]> bm4 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter4.sort(xs4,0,xs4.length);
                });
        double mean4 =bm4.run(xs4, runt);
        System.out.println("\n randomArraySortTest with "+al4+"array length:  "+mean4);
        
        BaseHelper<Integer> helper5 = new BaseHelper<>("InsertionSort", xs5.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter5 = new InsertionSort<Integer>(helper5);
        Benchmark<Integer[]> bm5 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter5.sort(xs5,0,xs5.length);
                });
        double mean5 =bm5.run(xs5, runt);
        System.out.println("\n randomArraySortTest with "+al5+"array length:  "+mean5);
        
        BaseHelper<Integer> helper6 = new BaseHelper<>("InsertionSort", xs6.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter6 = new InsertionSort<Integer>(helper6);
        Benchmark<Integer[]> bm6 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter6.sort(xs6,0,xs6.length);
                });
        double mean6 =bm6.run(xs6, runt);
        System.out.println("\n randomArraySortTest with "+al6+"array length:  "+mean6);
    }
    
    @Test
    public void randomArraySortTest6() throws Exception{
        int al1=7500,al2=7700,al3=7900,al4=8100,al5=8300,al6=8500;
        
        Integer[] xs1=new Integer[al1];
	for(int i=0;i<xs1.length;i++){
            xs1[i]=(int)(Math.random()*(al1+500));
	}
        Integer[] xs2=new Integer[al2];
	for(int i=0;i<xs2.length;i++){
            xs2[i]=(int)(Math.random()*(al2+500));
	}
        Integer[] xs3=new Integer[al3];
	for(int i=0;i<xs3.length;i++){
            xs3[i]=(int)(Math.random()*(al3+500));
	}
        Integer[] xs4=new Integer[al4];
	for(int i=0;i<xs4.length;i++){
            xs4[i]=(int)(Math.random()*(al4+500));
	}
        Integer[] xs5=new Integer[al5];
	for(int i=0;i<xs5.length;i++){
            xs5[i]=(int)(Math.random()*(al5+500));
	}Integer[] xs6=new Integer[al6];
	for(int i=0;i<xs6.length;i++){
            xs6[i]=(int)(Math.random()*(al6+500));
	}
       
        int runt=1000;
        
        BaseHelper<Integer> helper1 = new BaseHelper<>("InsertionSort", xs1.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter1 = new InsertionSort<Integer>(helper1);
        Benchmark<Integer[]> bm1 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter1.sort(xs1,0,xs1.length);
                });
        double mean1 =bm1.run(xs1, runt);
        System.out.println("\n randomArraySortTest with "+al1+"array length:  "+mean1);
        
        BaseHelper<Integer> helper2 = new BaseHelper<>("InsertionSort", xs2.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter2 = new InsertionSort<Integer>(helper2);
        Benchmark<Integer[]> bm2 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter2.sort(xs2,0,xs2.length);
                });
        double mean2 =bm2.run(xs2, runt);
        System.out.println("\n randomArraySortTest with "+al2+"array length:  "+mean2);
        
        BaseHelper<Integer> helper3 = new BaseHelper<>("InsertionSort", xs3.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter3 = new InsertionSort<Integer>(helper3);
        Benchmark<Integer[]> bm3 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter3.sort(xs3,0,xs3.length);
                });
        double mean3 =bm3.run(xs3, runt);
        System.out.println("\n randomArraySortTest with "+al3+"array length:  "+mean3);
        
        BaseHelper<Integer> helper4 = new BaseHelper<>("InsertionSort", xs4.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter4 = new InsertionSort<Integer>(helper4);
        Benchmark<Integer[]> bm4 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter4.sort(xs4,0,xs4.length);
                });
        double mean4 =bm4.run(xs4, runt);
        System.out.println("\n randomArraySortTest with "+al4+"array length:  "+mean4);
        
        BaseHelper<Integer> helper5 = new BaseHelper<>("InsertionSort", xs5.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter5 = new InsertionSort<Integer>(helper5);
        Benchmark<Integer[]> bm5 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter5.sort(xs5,0,xs5.length);
                });
        double mean5 =bm5.run(xs5, runt);
        System.out.println("\n randomArraySortTest with "+al5+"array length:  "+mean5);
        
        BaseHelper<Integer> helper6 = new BaseHelper<>("InsertionSort", xs6.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter6 = new InsertionSort<Integer>(helper6);
        Benchmark<Integer[]> bm6 = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter6.sort(xs6,0,xs6.length);
                });
        double mean6 =bm6.run(xs6, runt);
        System.out.println("\n randomArraySortTest with "+al6+"array length:  "+mean6);
    }
    
    @Test
    public void orderedArraySortTest() throws Exception{
        Integer[] xs=new Integer[1000];
	for(int i=0;i<xs.length;i++){
            xs[i]=i;
	}
	
        final Timer timer = new Timer();
        BaseHelper<Integer> helper = new BaseHelper<>("InsertionSort", xs.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter = new InsertionSort<Integer>(helper);
        Benchmark<Integer[]> bm = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter.sort(xs,0,xs.length);
                });
        double mean1 =bm.run(xs, 500);
        System.out.println("\n orderedArraySortTest: "+mean1);
    }
    
    @Test
    public void partOrderedArraySortTest() throws Exception{
        Integer[] xs=new Integer[1000];
	for(int i=0;i<500;i++){
            xs[i]=(int)(Math.random()*600);
	}
        for(int i=500;i<xs.length;i++){
            xs[i]=i;
	}
	
        final Timer timer = new Timer();
        BaseHelper<Integer> helper = new BaseHelper<>("InsertionSort", xs.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter = new InsertionSort<Integer>(helper);
        Benchmark<Integer[]> bm = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter.sort(xs,0,xs.length);
                });
        double mean1 =bm.run(xs, 500);
        System.out.println("\n partOrderedArraySortTest: "+mean1);
    }
    
    @Test
    public void reverseOrderedArraySortTest() throws Exception{
        Integer[] xs=new Integer[1000];
        for(int i=0;i<xs.length;i++){
            xs[i]=1000-i;
	}
	
        final Timer timer = new Timer();
        BaseHelper<Integer> helper = new BaseHelper<>("InsertionSort", xs.length, Config.load(Assignment2Part3Test.class));
        GenericSort<Integer> sorter = new InsertionSort<Integer>(helper);
        Benchmark<Integer[]> bm = new Benchmark_Timer<>(
                "testWaitPeriods", 
                b -> {
                    sorter.sort(xs,0,xs.length);
                });
        double mean1 =bm.run(xs, 500);
        System.out.println("\n reverseOrderedArraySortTest: "+mean1);
    }
    
    private void GoToSleep(long mSecs, int which) {
        try {
            Thread.sleep(mSecs);
            if (which == 0) run++;
            else if (which > 0) post++;
            else pre++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
