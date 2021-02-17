package com.company;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    List<Human> human_list = new ArrayList<>();


//    public App(Human real_human) {
//
//    }
    public void createNewHumanList(){
        Scanner input =  new Scanner(System.in);
        Scanner input1 =  new Scanner(System.in);

//      For analog input
        //System.out.println("Insert size of list...");
        //int size = input.nextInt();

//        for (int i = 0; i < size; i++) {
//            System.out.println("Insert Age...");
//            int age = input.nextInt();
//            System.out.println("Insert weight...");
//            int weight = input.nextInt();
//            System.out.println("Insert first name...");
//            String firstName = input1.nextLine();
//            System.out.println("Insert last name...");
//            String lastName = input1.nextLine();
//            System.out.println("Insert year...");
//            int year = input.nextInt();
//            System.out.println("Insert month...");
//            int month = input.nextInt();
//            System.out.println("Insert day...");
//            int day = input.nextInt();
            int year = 2000;
            int month = 12;
            int day = 1;

            int year1 = 1998;
            int month1 = 10;
            int day1 = 6;

            int year2 = 2015;
            int month2 = 1;
            int day2 = 4;

            int age = 25;
            String firstName = "Vasya";
            String lastName = "Pupkin";
            int weight = 100;

            int age1 = 100;
            String firstName1 = "John";
            String lastName1 = "Liver";
            int weight1 = 90;

            int age2 = 5;
            String firstName2 = "Tema";
            String lastName2 = "Netov";
            int weight2 = 35;

            LocalDate birth = LocalDate.of(year,month,day);
            LocalDate birth1 = LocalDate.of(year1,month1,day1);
            LocalDate birth2 = LocalDate.of(year2,month2,day2);

            Human hm = new Human(age, firstName, lastName, birth, weight);
            human_list.add(hm);
            Human hm1 = new Human(age1, firstName1, lastName1, birth1, weight1);
            human_list.add(hm1);
            Human hm2 = new Human(age2, firstName2, lastName2, birth2, weight2);
            human_list.add(hm2);
        //}
    }
    public void sortByWeightVsAge()
    {
        Stream<Human> stream = human_list.stream();
        List <Human> newOne = stream.filter(a -> a.age > a.weight).collect(Collectors.toList());
        printAll(newOne);
    }
    public void sortByDate()
    {
        Stream<Human> stream = human_list.stream();
        List <Human> newOne = stream.sorted(Comparator.comparing(Human::getBirthDate)).collect(Collectors.toList());
        printAll(newOne);
    }
    public void multiplyAge()
    {
        Stream<Human> stream = human_list.stream();
        Optional <Integer> mul = stream.map(age -> age.getAge()).reduce((age, age2) -> age * age2);
        System.out.println("Product of ages: " + mul.get().toString());
    }
    public void sortByLastCharOfLastName(){
        Stream<Human> stream = human_list.stream();
        List <String> m = stream.map(name -> name.getLastName()).sorted(Comparator.comparingInt(name -> name.charAt(name.length() - 1))).collect(Collectors.toList());
        System.out.println(m);
        //.map(name -> name.getLastName())
    }
    public void sortByLastCharOfLastName2(){
        Stream<Human> stream = human_list.stream();
        List <Human> m = stream.sorted(Comparator.comparingInt(name -> name.getLastName().charAt(name.returnLen(name.getLastName()) - 1))).collect(Collectors.toList());
        printAll(m);
        //.map(name -> name.getLastName())
    }
    public void printAll(List<Human> list)
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Age: " + list.get(i).getAge());
            System.out.print(" Last name: " + list.get(i).getLastName());
            System.out.print(" First name: " + list.get(i).getFirstName());
            System.out.print(" Birth date: " + list.get(i).getBirthDate());
            System.out.print(" Weight: " + list.get(i).getWeight());
            System.out.println("");
        }
    }
}
