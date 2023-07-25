import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> a=new ArrayList<String>();
		//ArrayList<Integer> a= new ArrayList<Integer>();
		//a.add(1);
	    a.add("Faizan");
		a.add("Faizan");
		a.add(1, "Azhar");
		a.add("Adnan");
		a.add(1, "Bashar");
		a.indexOf("Bashar");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("Azhar"));
		System.out.println(a.contains("Rahul"));
		
		
	}
}
