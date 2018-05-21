package org.cats.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.cats.domain.Cat;




//TODO: change all try - catch blocks to REGEX, so that we won't throw any exceptions in our app
public class Interface {

	// global variables to use in program
	private static Scanner sc = new Scanner(System.in);
	private static CatDAO catsList = new CatDAO();
	private static Cat tempCat;

	public static void main(String[] args) {

		// main logic of the application
		while(true) {
			
			// show user the menu and ask him for input
			showCatsMenu();
			char userInput = sc.next().charAt(0);
			
			// call correct methods after he chose them
			if(userInput == '1') {
				addNewCat();
			}else if(userInput == '2') {
				showCat();
				
				// close program if user have clicked 'x'
			}else if(userInput == 'x') {
				System.out.println("Program is closing...");
				break;
			}else {
				System.out.println("\n" + "Invalid command" + "\n");
			}
		}



	}

	private static void showCatsMenu() {

		// show "menu" to the user, and ask him for one option he wants to choose
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1. Add new cat.");
		System.out.println("2. Show specific cat");
		System.out.println("x. exit the program");
		System.out.println("");
		System.out.print("Choose one option: ");
	}

	// method for showing chosen cat
	private static void showCat() {

		// if there are no cats in the list yet, tell it to user and show menu again
		if(catsList.getCatsList() == null || catsList.getCatsList().isEmpty() ) {
			System.out.println("\n" + "There are no cats on the list yet." + "\n");

			// if there are any cats in the list, show names and indexes of all of them
		}else {
			System.out.println("Which cat do you want to see?");
			System.out.println("");
			for(Cat cat : catsList.getCatsList()) {
				System.out.println(catsList.getCatsList().indexOf(cat) + ". " + cat.getName());
			}

			// then let user choose which cat he wants to see
			System.out.print("Choose index: ");
			int index = sc.nextInt();
			while(index < 0 || index > catsList.getCatsList().size() - 1) {
				System.out.print("Choose correct index: ");

				// get index of the cat from him
				index = sc.nextInt();
			}
			// show him cats info, and then show menu again
			System.out.println("Heres your cat: "+ catsList.getCatsList().get(index).introduceYourself());
			System.out.println("");
		}
	}

	private static void addNewCat() {

		// initialization of the new Cat instance, and new Scanner for getting user input	
		tempCat = new Cat();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date date = null;



		String catsName = "";

		// prompt user for cats name and save it into the cat
		System.out.print("Cats name: ");
		while(catsName.equals("")) {


			catsName = sc.nextLine();
		}

		tempCat.setName(catsName);

		// prompt user for owners name and save it into the cat
		System.out.print("Owners name: ");
		tempCat.setOwnersName(sc.nextLine());

		// try to get date from user
		while(date == null) {
			try {
				// prompt user for date
				System.out.print("Date: ");
				date = sdf.parse(sc.nextLine());
			}catch (ParseException e) {
				System.out.println("Wrong date value, it should be yyyy.MM.dd");
			}
		}

		// save date to Cat object (if its different then null)
		if(date != null) {
			tempCat.setBirthDate(date);
		}

		double catsWeight = 0.0;

		// prompt user for cats weight
		System.out.print("Provide cats weight: ");

		// prompt he as long as he is providing wrong answer, if he give us double, save it as a cats weight
		while(catsWeight == 0.0) {
			try {
				catsWeight = Double.parseDouble(sc.nextLine());
			} catch(InputMismatchException e) {
				System.out.println("Wrong cats weight (should be decimal)");
			} catch(NumberFormatException f) {
				System.out.println("Wrong cats weight (should be decimal)");
			}
		}

		if(catsWeight != 0) {
			tempCat.setWeight(catsWeight);
		}

		// add cat to CatDAO
		catsList.putInCat(tempCat);
	}
}
