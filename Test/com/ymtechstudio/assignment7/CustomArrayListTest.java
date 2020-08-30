package com.ymtechstudio.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Test- Driven development methodology
	// Step 1 write failing test
	// Step 2 write business logic to make test past
	// Reactor your code "rinse and repeat
	CustomList<Integer> myCustomList;

	@BeforeEach

	void setUp() {
		myCustomList = new CustomArrayList<>();
		for (int i = 0; i < 99; i++) {
			myCustomList.add(i + 1);
		}
	}

	@Test
	void should_add_one_item_to_list() {
		// Three A's
		// Arrange, Act , Assert
		myCustomList.add(5);

		// Assert
		assertEquals(5, myCustomList.get(4));
		assertEquals(100, myCustomList.getSize());

	}

	@Test
	void should_remove_one_item_to_list() {
		// Three A's
		// Arrange, Act , Assert
		Integer itemRemoved = myCustomList.remove(0);

		// Assert
		assertEquals(1, itemRemoved);
		assertEquals(98, myCustomList.getSize());
		assertEquals(2, myCustomList.get(0));
		assertEquals(99, myCustomList.get(myCustomList.getSize() - 1));

	}

	@Test
	void should_remove_form_middle_of_list() {
		// Three A's
		// Arrange, Act , Assert

		Integer itemRemoved = myCustomList.remove(23);

		// Assert
		assertEquals(24, itemRemoved);
		assertEquals(98, myCustomList.getSize());
		assertEquals(1, myCustomList.get(0));
		assertEquals(99, myCustomList.get(myCustomList.getSize() - 1));

	}

	@Test
	void should_remove_from_end_item_to_list() {
		// Three A's
		// Arrange, Act , Assert

		Integer itemRemoved = myCustomList.remove(98);

		// Assert
		assertEquals(99, itemRemoved);
		assertEquals(98, myCustomList.getSize());
		assertEquals(1, myCustomList.get(0));
		assertEquals(98, myCustomList.get(myCustomList.getSize() - 1));

	}
}
