package com.sqa.td;

import com.sqa.td.helpers.*;

public class ArrayExercise
{

	public static void main(String[] args)
	{
		char arrays[] =
		{ 'a', 'b', 'c', 'd', 'e' };
		int num[] =
		{ 1, 2, 3, 4 };
		String employeeNames[];
		String addresses[];
		int ages[];
		String cities[];
		String phoneNumbers[];
		String jobTitles[];
		String name = AppBasics.greetUserAndGetName("Simple Employee Entry Application");
		int employeesNum = AppBasics.requestInt("How many employees do you want to add? ");
		employeeNames = new String[employeesNum];
		addresses = new String[employeesNum];
		ages = new int[employeesNum];
		cities = new String[employeesNum];
		phoneNumbers = new String[employeesNum];
		jobTitles = new String[employeesNum];
		for (int i = 0; i < employeesNum; i++)
		{
			System.out.println("Employee #" + (i + 1));
			employeeNames[i] = AppBasics.requestString("\tPlease enter the employee's name: ");
			addresses[i] = AppBasics.requestString("\tPlease enter the employee's address: ");
			ages[i] = AppBasics.requestInt("\tPlease enter the employee's age: ");
			cities[i] = AppBasics.requestString("\tPlease enter the employee's city: ");
			phoneNumbers[i] = AppBasics.requestString("\tPlease enter the employee's phone number: ");
			jobTitles[i] = AppBasics.requestString("\tPlease enter the employee's job title: ");
		}
		for (int i = 0; i < employeesNum; i++)
		{
			System.out.println("Employee #" + (i + 1));
			System.out.println("Name: " + employeeNames[i]);
			System.out.println("Address: " + addresses[i]);
			System.out.println("Age: " + ages[i]);
			System.out.println("City: " + cities[i]);
			System.out.println("Phone Number: " + phoneNumbers[i]);
			System.out.println("Job Title: " + jobTitles[i]);
		}
		AppBasics.farewellUser(name);
		// registerUsers();
		// registerPets();
	}

	/**
	 *
	 */
	private static void registerPets(String[] name)
	{
		String[] petNames =
		{ "Bubba", "Yoshi", "Nemo" };
		for (int i = 1; i < petNames.length; i++)
		{
			System.out.println(petNames[i]);
		}
	}

	/**
	 * @param object
	 */
	private static void registerUsers(int[] num)
	{
		System.out.println(num.length);
	}
}
