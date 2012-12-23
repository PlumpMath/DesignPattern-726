package IteratorToEnum;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdaptor implements Enumeration<String> {
	Iterator<String> iterator;

	public IteratorAdaptor(Iterator<String> iterator) {
		this.iterator = iterator;
	}

	public boolean hasMoreElements() {		
		return iterator.hasNext();
	}

	public String nextElement() {		
		return iterator.next();
	}

}
