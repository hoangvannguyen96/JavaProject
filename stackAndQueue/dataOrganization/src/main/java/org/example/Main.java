package org.example;

public class Main {
    public static void main(String[] args) {
        Person person[] = new Person[6];
        person[0]=new Person("23-01-2023","hoa","nu");
        person[1]=new Person("25-04-2000","hoe","nam");
        person[2]=new Person("27-01-2023","la","nu");
        person[3]=new Person("23-01-2023","canh","nam");
        person[4]=new Person("23-06-2021","choi","nu");
        person[5]=new Person("29-04-1980","mam","nu");
        System.out.println(DataOrganization.data(person));
    }
}