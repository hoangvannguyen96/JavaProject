package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    public LocalDate date;
    public String name;
    public String sex;
    public Person(){

    }
    public Person(String date, String name, String sex){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date=LocalDate.parse(date,formatter);
        this.name=name;
        this.sex=sex;
    }
    public String toString(){
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " " + name + " " + sex+" ";
    }
    public LocalDate getDate(){
        return this.date;
    }
    public String getSex(){
        return this.sex;
    }
}
