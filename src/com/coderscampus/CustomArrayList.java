package com.coderscampus;

public class CustomArrayList<T> implements CustomList<T> {
	int i = 10;
	int b = 0;
	Object[] items = new Object[i];

	@Override
	public boolean add(T item) {
		if (b >= i) {
			
			Object[] newItems = new Object[i * 2];
			for(int j = 0; j < i; j++) {
				newItems[j] = items[j];
			}
		items = newItems;
		i = i +10;    
		}
		if(item != null) {
			items[b] = item;
			b++;
			return true;
		}
		return false;
		
			
		
	}

	@Override
	public int getSize() {
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if(items[i] !=null) {
				count++;
			}
		}
		return count;
	}

	@Override
	public T get(int index) {
			T input = (T) items[index];	
		return input;
	}

}
