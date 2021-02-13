package com.company;

public class Main {

    public static void main(String[] args) {
	App app = new App();
	app.createNewHumanList();
	//working only on surnames (stream type String)
	app.sortByLastCharOfLastName();
	//working with Human list stream, but has a crutch with optional method for Human -> returnLen
	app.sortByLastCharOfLastName();
	//app.sortByDate();
	//app.sortByWeightVsAge();
	//app.multiplyAge();
    }
}
