package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> listA = new ArrayList<>();
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5; i++) {
            try {
                listA.add(bufferRead.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }System.out.println(listA);
        ArrayList <String> listB = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            try {
                listB.add(bufferRead.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }System.out.println(listB);
        ArrayList<String> listC = new ArrayList<>();
        Collections.reverse(listB);
        Iterator<String> iterator = listB.iterator();
        while
        (iterator.hasNext()){
            Iterator<String> iterator1 = listA.iterator();
            while (iterator.hasNext()) {
                listC.add(iterator1.next());
                iterator1.remove();
                break;
            }

            listC.add(iterator.next()); }
        System.out.println(listC);
        System.out.println("Отсортирован");
        Collections.sort(listC,new LengthFirstComparator());
        System.out.println(listC);
        mans();

    }
    public static void mans() {

        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        ListIterator<String> iter = states.listIterator();
        while(iter.hasNext()){

            System.out.println(iter.next());
        }
    }
}






