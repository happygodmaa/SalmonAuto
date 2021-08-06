package com.wtc.myLambda;

public class Test1 {

  public Test1() {
    System.out.println("constructor");
  }

  public int add(int a, int b) {
    return a + b;
    // System.out.println("m1 method- inside anonymous");
  }
}


// immutable list--2
// List<Double> l2 = List.of()
// of(3.4, 5.6);
// l1.add(4.5);
// System.out.println(l1);

/*
 * // mutable list List<String> al = new ArrayList<>(); al.add("nikhil1"); al.add("nikhil12");
 * al.add("nikhil13"); al.add("nikhil14"); // System.out.println(al.get(4));
 * System.out.println(al.get(0)); al.remove("nikhil12"); System.out.println(al);
 * 
 * Vector<String> v = new Vector<>(); v.addAll(al); System.out.println("vector" + v);
 */
