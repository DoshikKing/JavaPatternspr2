package com.company;

public class Main {

    public static void main(String[] args) {
	App app = new App();
	app.createNewHumanList();
	//working only on surnames (stream type String)
		System.out.println("Sorted by last char");
	app.sortByLastCharOfLastName();
	//working with Human list stream, but has a crutch with optional method for Human -> returnLen
	app.sortByLastCharOfLastName2();
		System.out.println("Sorted by date");
	app.sortByDate();
		System.out.println("Sorted weight < age");
	app.sortByWeightVsAge();
		System.out.println("Myltiply all ages:");
	app.multiplyAge();
    }
}
