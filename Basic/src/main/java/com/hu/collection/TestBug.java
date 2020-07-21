package com.hu.collection;

import java.util.*;


public class TestBug
{
    public static void main(String[] args)
    {
        List l = Arrays.asList(args);
        //Iterable l2 = Arrays.asList(args);
        //ArrayList
        System.out.println(l);
        Object[] ob =l.toArray();
        System.out.println(ob);
        System.out.println(l.toArray());
        System.out.println(l.toArray(new Object[0]));
        
        System.out.println("------------");
        
        List<String> l2 = new ArrayList<>();;
        //ArrayList
        System.out.println(l2);
        Object[] ob1 =l2.toArray();
        System.out.println(ob1);
        System.out.println(l2.toArray());
        System.out.println(l2.toArray(new Object[0]));
    }
}

