public class ArrayList implements List{
	int size;
	Object[] array;

	public ArrayList(){
		size = 0;
		array = new Object[10];
	}

	public void add(Object obj){
		if(size >= array.length){
			grow_array();
		}
		array[size++] = obj;
	}

	public void add(int pos, Object obj){
		if(size == array.length){
			grow_array();
		}

		for(int i = size ; i > pos ; i--){
			array[i] = array[i-1];
		}
		array[pos] = obj;
		size++;
	}
	public Object get(int pos){
		if (pos > size) {
			throw new IndexOutOfBoundsException();
		}
		return array[pos];
	}

	public Object remove(int pos){
		 if(pos >= size || pos < 0){
		 	throw new Exception("Nothing");
		}
		Object temp = array[pos];
		for (int i = pos; i < size -1  ;i++ ){
			array[i] = array[i+1];
		}
		--size;
		return temp;
	}

	public int size(){
		return size;
	}

	public void grow_array(){
		Object[] new_array = new Object[array.length*2];
		for(int i = 0; i < array.length; i++){
			new_array[i] = array[i];
		}
		array = new_array;
	}
}