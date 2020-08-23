package com.ymtechstudio.assignment7;

public class CustomArrayList<T> implements CustomList<T> {
		Object[] items = new Object[10];
		public int size = 0;

		@Override
		public boolean add(T item) {
			
			return add(size, item);
		}

		private Object[] increaseArraySize() {
			Object[] newArray = new Object[size * 2];
			for (int i = 0; i < size; i++) {
				newArray[i] = items[i];
			}
			return newArray;
		}

		@Override
		public int getSize() {
			return size;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T get(int index) {
			return (T) items[index];
		}

		@Override /** Add a new element at the specified index */
		public boolean add(int index, T item) throws IndexOutOfBoundsException {
			// Ensure the index is in the right range
			if (size == items.length) {
				items = increaseArraySize();
			}
		    // Move the elements to the right after the specified index
			for(int i = size -1; i >index; i --) {
				items[i + 1] = items[i];
			}
		    // Insert new element to data[index]
			items[index] = item;
		    // Increase size by 1
			size++;
			return true;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T remove(int index) throws IndexOutOfBoundsException {
			 T itemRemoved = (T) items[index];
			for(int i = index; i < size-1; i++) {
				items[i] = items[i+1];
				
			}
			size--;// Decrement size
//		
			return itemRemoved;
					 
				
		}  

	}


