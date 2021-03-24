// The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed and is modifiable

// StringBuffer class is thread-safe or synchronized - multiple threads cannot call its methods simultaneously.

// StringBuffer()-              creates an empty string buffer with the initial capacity of 16.
// StringBuffer(String str)-	creates a string buffer with the specified string.
// StringBuffer(int capacity)-  creates an empty string buffer with the specified capacity as length.

// different methods: append, insert, replace, delete, reverse, capacity, ensureCapacity
 
public class StringBufferExample{  
	public static void main(String args[]){
		
		//append method
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");  
		System.out.println(sb);

				sb.replace(0,(sb.length()),"Hello");

		//insert() method
		sb.insert(1,"Java");  
		System.out.println(sb);
		
				sb.replace(0,(sb.length()),"Hello");
		
		//replace() method
		sb.replace(1,3,"Java");  
		System.out.println(sb);
		
				sb.replace(0,(sb.length()),"Hello");
		
		//delete() method
		sb.delete(1,3);  
		System.out.println(sb);  
		
				sb.replace(0,(sb.length()),"Hello");
		
		//reverse() method
		sb.reverse();  
		System.out.println(sb);
		
				sb.replace(0,(sb.length()),"Hello ");
		
		//capacity() method
		System.out.println(sb.capacity());
		sb.append("java is my favourite language"); 
		System.out.println(sb.capacity());
		
		//ensureCapacity() method
		sb.ensureCapacity(50); 
		System.out.println(sb.capacity());
		
	
	}  
}  
