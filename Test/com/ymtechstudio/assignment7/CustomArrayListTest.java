package com.ymtechstudio.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Test- Driven development methodology
	// Step 1 write failing test
	// Step 2 write business logic to make test pass
	// Reactor your code "rinse and repeat
	// System Under Test or sut = myCustomList
	CustomList<Integer> myCustomList;
	// @BeforeEach and @BeforeAll are the JUnit 5 equivalents of @Before and
	// @BeforeClass. These annotations were renamed with clearer names to avoid
	// confusion.

	@BeforeEach
	// setUp() method, which runs before every test invocation.
	void setUp() {
		myCustomList = new CustomArrayList<>();
		for (int i = 0; i < 99; i++) {
			myCustomList.add(i + 1);
		}
	}

	@Test
	void test_should_add_one_item_to_list() {
		// Three A's
		// Arrange,
		// Act
		myCustomList.add(5);

		// Assert
		// What you expect and what would actually happen
		// assertEquals() method compares tow values: the expected result and the actual
		// value returned from the test code
		assertEquals(5, myCustomList.get(4));
		assertEquals(100, myCustomList.getSize());

	}

	@Test
	void test_should_add_to_middle_of_list() {
		myCustomList.add(5, 10);

		assertEquals(10, myCustomList.get(5));

	}

	@Test
	void test_should_remove_one_item_to_list() {
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
	void test_should_remove_form_middle_of_list() {
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
	void test_should_remove_from_end_item_to_list() {
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
