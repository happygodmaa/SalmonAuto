package com.wtc.myLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {
  public static void main(String[] args) {
    // List<Integer> list1= List.
    List<Integer> list2 = new ArrayList<>();
    list2.add(51);
    list2.add(8);
    list2.add(25);
    list2.add(58);
    System.out.println(list2);

    List<Integer> list3 = Arrays.asList(2, 5, 6, 7);
    List<Integer> listEven = new ArrayList<>();
    for (Integer i : list2) {
      if (i % 2 == 0) {
        listEven.add(i);
      }
    }
    System.out.println(listEven);

    Stream<Integer> myStream = list2.stream();
    List<Integer> listEven2 = myStream.filter(i -> i % 2 == 0).collect(Collectors.toList());
    System.out.println(listEven2);

  }


}


