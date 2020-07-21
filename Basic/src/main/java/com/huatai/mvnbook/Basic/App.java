package com.huatai.mvnbook.Basic;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
	public String sayHello() {
		return "hell maven";
	}
    public static void main( String[] args )
    {
    	ArrayList<Integer> al = new ArrayList<Integer>(10);
    	al.add(1);al.add(2);
    	al.forEach(x->System.out.println(x));al.stream().forEach(x->System.out.println(x));;
    	String[] arr = { "program", "creek", "is", "a", "java", "site" };
    	Arrays.sort(arr, (m, n)->Integer.compare(m.length(), n.length()));
    	Stream<String> str = Stream.of(arr);
    	//str.forEach(x->System.out.println(x));
    	str.forEach(System.out::println);
    	//str.forEach(x->{for(int i=0; i<10; i++) System.out.println(i);});
    	//Predicate<String> condition;
    	List<String> languages = Arrays.asList("Java","Python","scala","Shell","R");
        System.out.println("Language starts with Ja: ");
        filterTest(languages,x -> x.startsWith("Ja"));

        System.out.println("\nLanguage ends with a: ");
        filterTest(languages,x -> x.endsWith("a"));
        System.out.println("\nAll languages: ");
        filterTest(languages,x -> true);
        System.out.println("\nNo languages: ");
        filterTest(languages,x -> false);
        System.out.println("\nLanguage length bigger three: ");
        filterTest(languages,x -> x.length() > 4);
    	
    }
    
    public static void test() {
    	System.out.println( new App().sayHello() );
        AbstractCollection a = new ArrayList<String>();
        Object[] ob ;
        String[] s = {"1","2","3"};
        ob =s;
        System.out.print(ob.getClass());
        System.out.println(int[].class);
        int i=1;
        ArrayList<Integer> al = new ArrayList<Integer>(10);
        al.add(1);al.add(2);
        System.out.println(al.size());
//        Integer[] alAr = al.toArray(new Integer[10]);
//        System.out.println(alAr[0]);
//        System.out.println(alAr[1]);
//        System.out.println(alAr[2]);
//        System.out.println(alAr[3]);
//        System.out.println(alAr[4]);
        
      
//        System.out.println(al.set(1,3));
//        System.out.println(al.get(1));
//        System.out.println(al.get(i++));
//        System.out.println(i);
        System.out.println("--------");
        al.add(0, 3);
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        System.out.println(al.size());System.out.println(al.toString());
        
        for (int i1 : al)
        	System.out.print(i1);
        
        Map ma = new HashMap();
        System.out.println("testing hashmap");
        HashMap<String,String> test1 = new HashMap<String,String>();
        String s1="ab";
        String s2=new String("ab");
        test1.put("1",s1);
        HashMap<String,String> test2= new HashMap<String,String>();
        test2.put("1",s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.equalsIgnoreCase(s1));
        System.out.print(test1.equals(test2));
        
    }
    
    public static void filterTest(List<String> languages, Predicate<String> condition) {
        languages.stream().filter(x -> condition.test(x)).forEach(x -> System.out.println(x + " "));
    }
}
