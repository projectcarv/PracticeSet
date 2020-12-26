package Calculator;

public abstract class AmarCal implements Calculator {
	public static void main(String[] args){
		Calculation cal=new Calculation();
		cal.sum(10, 11);
		cal.sub(15, 10);
		cal.mult(5, 75);
		cal.div(58, 2);
	}
}
