package lianxi5;

public class Complex implements Cloneable{

	float a,b;
	
	
	public Complex() {
		a = 0;
		b = 0;
	}
	
	public Complex(float a,float b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Complex(float a) {
		super();
		this.a = a;
		this.b = 0;
	}

	public static void add(Complex c1,Complex c2) {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		sb.append(c1.getRealPart());
		sb.append(" + ");
		sb.append(c1.getImaginaryPart());
		sb.append(") + (");
		sb.append(c2.getRealPart());
		sb.append(" + ");
		sb.append(c2.getImaginaryPart());
		sb.append(") = ");
		sb.append(c1.getRealPart()+c2.getRealPart());
		sb.append(" + ");
		sb.append(c1.getImaginaryPart()+c2.getImaginaryPart()+"i");
		System.out.println(sb.toString());
	}
	public static void substract(Complex c1,Complex c2) {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		sb.append(c1.getRealPart());
		sb.append(" + ");
		sb.append(c1.getImaginaryPart());
		sb.append(") - (");
		sb.append(c2.getRealPart());
		sb.append(" + ");
		sb.append(c2.getImaginaryPart());
		sb.append(") = ");
		sb.append(c1.getRealPart()-c2.getRealPart());
		sb.append(" + ");
		sb.append(c1.getImaginaryPart()-c2.getImaginaryPart()+"i");
		System.out.println(sb.toString());
	}
	public static void multiply(Complex c1,Complex c2) {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		sb.append(c1.getRealPart());
		sb.append(" + ");
		sb.append(c1.getImaginaryPart());
		sb.append(") * (");
		sb.append(c2.getRealPart());
		sb.append(" + ");
		sb.append(c2.getImaginaryPart());
		sb.append(") = ");
		sb.append(c1.getRealPart()*c2.getRealPart());
		sb.append(" + ");
		sb.append(c1.getImaginaryPart()*c2.getImaginaryPart()+"i");
		System.out.println(sb.toString());
	}
	public static void divide(Complex c1,Complex c2) {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		sb.append(c1.getRealPart());
		sb.append(" + ");
		sb.append(c1.getImaginaryPart());
		sb.append(") / (");
		sb.append(c2.getRealPart());
		sb.append(" + ");
		sb.append(c2.getImaginaryPart());
		sb.append(") = ");
		sb.append(c1.getRealPart()/c2.getRealPart());
		sb.append(" + ");
		sb.append(c1.getImaginaryPart()/c2.getImaginaryPart()+"i");
		System.out.println(sb.toString());
	}
	public void abc() {
		StringBuffer sb = new StringBuffer();
		sb.append("|(");
		sb.append(b);
		sb.append(" + ");
		sb.append(b);
		sb.append(")| =");
		sb.append(Math.sqrt(((a*a)+(b*b))));
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(a);
		sb.append(b!=0?b+"i":"");
		return sb.toString();
	}
	public float getRealPart() {
	     
		return a;
	}
	
	public float getImaginaryPart() {
		
		return b;
	}
	public static void main(String[] arg) {
		Complex cp1 = new Complex(3.5f,5.5f);
		Complex cp2 = new Complex(-3.5f,1f);
		Complex.add(cp1, cp2);
	}
	
}
