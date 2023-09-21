package com.stacks;

/**
 * Scenario: "Create a stack data structure using an array of limited size (cannot delete memory once assigned explicitly)"
 *
 */
public class Stack {

	static int max_size = 5;
	static int top = -1;
	static int arr[] = new int[max_size];

	static boolean isEmpty() {
		return top == -1 ? true : false;
	}

	static boolean isFull() {
		return top == max_size - 1 ? true : false;
	}

	static void push(int data) {
		if (!isFull()) {
			// top=top+1, arr[top] = data
			arr[++top] = data;
			System.out.printf("Added %d data to the stack \n", data);
		} else {
			System.out.println("Cannot add, as stack is full");
		}
	}

	static void pop() {
		if (!isEmpty()) {
			System.out.printf("Removing %d data from the stack \n", arr[top]);
			--top;
		} else {
			System.out.println("Cannot remove, as stack is empty");
		}
	}

	static void display() {
		if (!isEmpty()) {
			for (int i = 0; i <= top; ++i) {
				System.out.printf("%d ", arr[i]);
			}
			System.out.println();
		} else {
			System.out.println("Elements can't be displayed, as stack is empty");
		}
	}

	public static void main(String[] args) {
		pop();
		push(1); push(2); push(3); push(4); push(5);
		display();
		push(6);
		pop(); pop();
		display();
	}
}
