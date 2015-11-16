package peek;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer>
{
	

	    private Iterator<Integer> iterator;
	    private boolean peeked;
	    private Integer value;

		public PeekingIterator(Iterator<Integer> iterator) {
		    // initialize any member here.
		    this.iterator = iterator;
		    
		}

	    // Returns the next element in the iteration without advancing the iterator.
		public Integer peek() {
		    if (!peeked){

		        value = iterator.next();
		        peeked = true;

		    }
		    
	        return value;
		}

		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		public Integer next() {
		    if (peeked){
		        peeked = false;
		        return value;
		    }else{
		        return iterator.next();
		    }
		    
		}

		@Override
		public boolean hasNext() {
		    return iterator.hasNext();
		    
		}
	
		
}
