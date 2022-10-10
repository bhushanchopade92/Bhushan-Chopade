package Stringss;

public class StringbufferStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str=  new StringBuffer ("Heeloworld");
		
		System.out.println("str before append: "+  str);
		
		str.append("First line");
		
		System.out.println("str after apend: "+   str);
		
		str.append('m');
		
		System.out.println("str after second append:"+   str);
		
		str.append(23);
		
		
		System.out.println("str after third append which is integer:"+   str);
		
		
		//reverse he sring
		
		str.reverse();
		
		System.out.println("string after reverse:"+    str);
		
		// delete method (start ,end)
		
		str.delete(2, 4);
		
		System.out.println("string afeter delete method:  "+    str);
		
		//Insertmethod    insert(indexToinsert, contentToInsert) :
		
		str.insert(0, false);
		
		//replace method
		
		str.replace(0, 5, "HHHHH");
		
		System.out.println("String after replace:    "+      str);
		
		//capacity : The capacity() method of StringBuffer class returns the current capacity of the buffer. 
		
		System.out.println("capacity of stringbuffer is :"+   str.capacity());

	}

}
