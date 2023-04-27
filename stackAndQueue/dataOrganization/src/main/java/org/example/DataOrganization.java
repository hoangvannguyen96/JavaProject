package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DataOrganization {
    public static String data(Person person[]) {
        Queue<Person> nu = new LinkedList<>();
        Queue<Person> nam = new LinkedList<>();
        Queue<Person> data = new LinkedList<>();
        Arrays.sort(person, new ComparatorSex());
        for (Person person1 : person) {
            if (person1.getSex() == "nu") {
                nu.add(person1);
            } else {
                nam.add(person1);
            }
        }
        while (!nu.isEmpty()) {
            data.add(nu.remove());
        }
        while (!nam.isEmpty()) {
            data.add(nam.remove());
        }
        String str="";
        for(Person person1:data){
            str+=person1;
        }
        return str;
    }
}
