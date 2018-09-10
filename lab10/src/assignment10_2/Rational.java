package assignment10_2;


public class Rational {
	public Rational (int p, int q)  throws Exception {
		if(q<1)
			throw new IllegalStateException("Problem with denominator less than 1. denominator is equal with" + q);
		
		this.numitor = p;
		this.denominator = q;
		reShort();
	}
	private int numitor;
	private int denominator;
	
	
	//adds the rational rat to this Rational
	public Rational add(Rational rat) {
		numitor =rat.getNum()*denominator + numitor*rat.getDen() ;
		denominator =rat.getDen()*denominator;
		
		reShort();
		return this;
	}
	
	//multiplies rat by this Rational
	public Rational multiply(Rational rat) {
		numitor *= rat.getNum();
		denominator *= rat.getDen();
		reShort();
		
		return this;
	}
	
	public void reShort() {
		for(int i = 10; i>1; i--) {
			if((numitor%i==0)&&(denominator%i==0)) {
				denominator = denominator/i;
				numitor = numitor/i;
				return;
			}
		}
	}
	
	//returns ñ1 if this rational is less than rat
	//returns 0 if this rational equals (see equals
	// method discussion below) rat
	//returns 1 if this rational is greater than rat
	public int compareTo(Rational rat) {
		return denominator*rat.getNum() - numitor*rat.getDen();
	}
	
	//Mutators and accessors for numerator and denominator
	public int getNum() {
		return numitor;
	}
	public void setNum(int p) {
		this.numitor = p;
	}
	public int getDen() {
		return denominator;
	}
	public void setDen(int q) {
		this.denominator = q;
	}
	
	public String toString() {
		return getNum() +"/"+ getDen();
	}
	
	 public static void main(String[] args) throws Exception {
		 	Rational my110num = new Rational(1, 10); 
			Rational my34num = new Rational(3, 4); 
			System.out.println("1/10 + 3/4 = " + my110num.add(my34num));
			
			Rational my2d3 = new Rational(2, 3); 
			Rational mym17d5 = new Rational(-17, 5); 
			Rational my1d3 = new Rational(1, 3);
			
			Rational f1 = my2d3.multiply(mym17d5).add(my1d3);
			Rational f2 = mym17d5.add(my1d3).multiply(my2d3);
			
			String result = "";
			if(f1.compareTo(f2)>0) {
				result = "is greater";
			}else if(f1.compareTo(f2)<0) {
				result = "is lower";
			} else result = "equals";
			
			
			
			System.out.println("f1=" +f1+ " f2="+f2);
			System.out.println("(2/3 * -17/5) + 1/3 " +result+ " 2/3 * (-17/5 + 1/3)");
	 }
}

