package ua.lviv.lgs;

public interface Iterator {

	public boolean hasNext();

	public Object next();

}

class Collection{
	
	private static Integer[] arr;
	
	Collection(Integer[] arr) {
		Collection.arr = arr;
	}
	
	public class Forward implements Iterator{

		int count = 0;
		
		@Override
		public boolean hasNext() {
			return count<arr.length;
		}

		@Override
		public Integer next() {
			return arr[count++];
		}
		
	}
	
	public Forward forward() {
		return new Forward();
	}
	
	public class Backward implements Iterator{

		int count = arr.length-1;
		
		@Override
		public boolean hasNext() {
			return count>=0;
		}

		@Override
		public Integer next() {
			count -=1;
			return arr[count--];
		}
		
	}
	
	public Backward backward() {
		return new Backward();
	}
	
}
