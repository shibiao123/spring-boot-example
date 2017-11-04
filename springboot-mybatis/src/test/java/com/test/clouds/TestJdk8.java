package com.test.clouds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TestJdk8 {
    public static void main(String[] args){
//        List<String> stringCollection = new ArrayList<String>();
//        stringCollection.add("ddd2");
//        stringCollection.add("aaa2");
//        stringCollection.add("bbb1");
//        stringCollection.add("aaa1");
//        stringCollection.add("bbb3");
//        stringCollection.add("ccc");
//        stringCollection.add("bbb2");
//        stringCollection.add("ddd1");

        //stringCollection.forEach((s) -> System.out.println(s));

        //stringCollection.forEach(System.out :: println);

        //stringCollection.stream()
                //.filter((s) -> s.startsWith("a"))
               // .forEach(System.out :: println);

       // stringCollection.stream().sorted().forEach(System.out :: println);

        //stringCollection.stream().map(String :: toUpperCase).sorted((a,b) -> b.compareTo(a)).forEach(System.out :: println);

       // boolean a = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
        //System.out.println(a);

//       long count =  stringCollection.stream().filter((s) -> s.startsWith("a")).count();
//       System.out.println(count);
//


//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);

//        // 可改变对象
//        list.stream().map((i) ->  i * 3).forEach(System.out::println);
//        list.stream().forEach(System.out :: println);
//
//        // 不可改变元有对象
//        list.forEach(i -> i = i * 3);
//        list.forEach(System.out::println);

//           Integer integer = list.stream().map((i) ->  i * 3)
//                .reduce((sum, count) -> sum += count).get();
//
//        System.out.println(integer);

        List<String> strList = Arrays.asList("abc", "eqwr", "bcd", "qb" , "ehdc", "jk");
    String filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.joining(","));
     System.out.printf( filtered);

//        List<Integer> list = Arrays.asList(1,3,4,5,2);
//       IntSummaryStatistics intSummaryStatistics=  list.stream().mapToInt((x) -> x).summaryStatistics();
//       System.out.println(intSummaryStatistics.getMax() + "," + intSummaryStatistics.getMin() + "," + intSummaryStatistics.getAverage());
    }
}
