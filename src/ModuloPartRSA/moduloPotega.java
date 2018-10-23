package ModuloPartRSA;

public class moduloPotega {

	public static int pow_mod(int a, int b, int m) {
		int i;
		int r=1;
		long x=a%m;
		for(i=1;i<=b;i<<=1) {
			x%=m;
			System.out.println(" potla FOR " + "x=" +x + "  m=" +m + " b = "+ b + " I = " + i);
			if((b&i)!=0) {
				System.out.println("b =" +b + "  i=" +i );
				r*=x;
				System.out.println("r=" +r + "  x=" +x );
				r%=m;
				System.out.println("r=" +r + "  m=" +m );
			}
			x*=x;
			System.out.println("x=" +x  );
			}
		return r;
		}
	public static void main(String[] args) {
		System.out.println("12^54 mod 7=" + pow_mod(12,53,7));
	}
	}

