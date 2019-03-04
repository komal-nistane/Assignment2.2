package com.globalLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class AssignmentCases {

	public static void main(String[] args) {
		ArrayList<String> colorList = new ArrayList<String>();
		AssignmentCases assignmentCases = new AssignmentCases();
		assignmentCases.createAndPrintList(colorList);
		assignmentCases.iterateList(colorList);
		assignmentCases.insertElementAtFirstPosition(colorList);
		assignmentCases.retreiveAtIndex(colorList);
		assignmentCases.updateAtIndex(colorList);
		assignmentCases.removeThirdElement(colorList);
		assignmentCases.searchElement(colorList);
		assignmentCases.sortList(colorList);
		assignmentCases.CopyListToAnother(colorList);
		assignmentCases.reverseList(colorList);
		assignmentCases.getPortionOfList(colorList);
		assignmentCases.compareList(colorList);
		assignmentCases.increaseCapacity(colorList);
		assignmentCases.replaceSecondElement(colorList);
		assignmentCases.printListElements(colorList);

	}

	// Write a Java program to print all the elements of a ArrayList using the
	// position of the elements.
	public void printListElements(ArrayList<String> colorList) {
		for (int index = 0; index < colorList.size(); index++)
			System.out.println(colorList.get(index));

	}

//Write a Java program to replace the second element of a ArrayList with the specified element.
	public void replaceSecondElement(ArrayList<String> colorList) {

		String color = "White";
		colorList.set(1, color);
		System.out.println(colorList);

	}

	//Write a Java program to increase the size of an array list.
	public void increaseCapacity(ArrayList<String> colorList) {
		colorList.ensureCapacity(6);
		colorList.add("Orange");
		colorList.add("white");

		System.out.println("New array list: " + colorList);

	}

	// Write a Java program to compare two array lists.
	public void compareList(ArrayList<String> colorList) {

		ArrayList<String> colorListTwo = new ArrayList<>(Arrays.asList("Red", "Balck", "White", "Blue"));

		boolean isEqual = colorListTwo.equals(colorList);
		System.out.println(isEqual);
	}

	// Write a Java program to extract a portion of a array list.
	public void getPortionOfList(ArrayList<String> colorList) {

		List<String> subList = colorList.subList(0, 4);
		System.out.println(subList);

	}

	// Write a Java program to reverse elements in a array list.
	public void reverseList(ArrayList<String> colorList) {

		System.out.println("List before reversing :\n" + colorList);
		Collections.reverse(colorList);
		System.out.println("List after reversing :\n" + colorList);

	}

	// Write a Java program to copy one arraylist into another.
	public void CopyListToAnother(ArrayList<String> colorList) {

		ArrayList<String> flowerList = new ArrayList<>(Arrays.asList("Rose", "Lotus", "Hibiscus", "Mogara", "Lily"));

		Collections.copy(flowerList, colorList);
		System.out.println();
		System.out.println("New List: " + flowerList);

	}

	// Write a Java program to sort a given array list.
	public void sortList(ArrayList<String> colorList) {

		System.out.println("List before sort: " + colorList);
		Collections.sort(colorList);
		System.out.println("List after sort: " + colorList);
	}

	// Write a Java program to search an element in a array list.
	public void searchElement(ArrayList<String> colorList) {

		if (colorList.contains("Red")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}
	}

	// Write a Java program to remove the third element from a arraylist.
	public void removeThirdElement(ArrayList<String> colorList) {

		System.out.println();
		colorList.remove(3);
		colorList.forEach(System.out::println);

	}

	// Write a Java program to update specific array element by given element.
	public void updateAtIndex(ArrayList<String> colorList) {

		System.out.println();
		colorList.set(2, "Green");
		colorList.forEach(System.out::println);

	}

	// Write a Java program to insert an element into the array list at the first
	// position.
	public void insertElementAtFirstPosition(ArrayList<String> colorList) {

		colorList.add(1, "Purple");
		colorList.forEach(System.out::println);
	}

	// Write a Java program to iterate through all elements in a array list.
	public void iterateList(ArrayList<String> colorList) {
		Iterator iterator = colorList.iterator();

		System.out.println("Elements in list are: ");

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			System.out.println();
		}
		System.out.println();

	}

	// Write a Java program to create a new arraylist, add some colors (string) and
	// print out the collection.
	public void createAndPrintList(ArrayList<String> colorList) {
		colorList.add("Red");
		colorList.add("Balck");
		colorList.add("White");
		colorList.add("Blue");

		System.out.println("Colour List:: ");
		colorList.forEach(System.out::println);
		System.out.println();
	}

	// Write a Java program to retrieve an element (at a specified index) from a
	// given array list.
	public void retreiveAtIndex(ArrayList<String> colorList) {

		System.out.println();
		System.out.println(colorList);
		// Retrive the first and third element
		String element = colorList.get(0);
		System.out.println("First element: " + element);
		element = colorList.get(2);
		System.out.println("Third element: " + element);
		System.out.println();

	}
}