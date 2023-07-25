
public class Base implements InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           InterfaceEx E= new Base();
           E.Sqare();
           E.triangle();
          E.Rectangle();
	}

	

	@Override
	public void Sqare() {
		// TODO Auto-generated method stub
		int a=5;
		int area;
		area= a*a;
		System.out.println("area of square= "+area);
		
	}

	@Override
	public void Rectangle() {
		// TODO Auto-generated method stub
		int a=5;
		int b=4;
		int area;
		area= a*b;
		System.out.println("area of rectangle= "+area);
	}

	@Override
	public void triangle() {
		// TODO Auto-generated method stub
		
	}

}
