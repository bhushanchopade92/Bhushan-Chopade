package encapsulation.practice;

public class Valueclass  extends EncapCladss{
	private int number;
	public void setNumber(int number)
	{
		this.number= number;
	}
	public int getNumber()
	{
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Valueclass obj= new Valueclass();
		
		obj.setNumber(100);
		obj.setName("test data");
		obj.setPercaentage(10.3f);
		obj.setGender('m');
		
		
		System.out.println(obj.getNumber());
		System.out.println(obj.getName());
		System.out.println(obj.getGender());
		System.out.println(obj.getPercaentage());
		
		

	}

}
