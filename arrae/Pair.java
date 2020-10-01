package arrae;

public class Pair<X , Y> {

	
	X x;
	Y y;
	
	Pair(X x, Y y){
		this.x = x;
		this. y = y;
	}
	
	public void get() {
		System.out.print(x + " "+ y);
	}
	
	
	
}
