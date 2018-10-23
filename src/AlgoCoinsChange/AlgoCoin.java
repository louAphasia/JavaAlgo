package AlgoCoinsChange;

public class AlgoCoin {
	static int ac = 1;
	static int bc = 2;
	static int cc = 5;

	static int target = 10;

	public static void main(String[] args) {


	    method2();
	}

	  public static void method2(){
	    //running time n^2

	    int da = target/ac;
	    int db = target/bc;     

	    for(int i=0;i<=da;i++){         
	        for(int j=0;j<=db;j++){             
	            int rem = target-(i*ac+j*bc);               
	            if(rem < 0){                    
	                break;                  
	            }else{                  
	                if(rem%cc==0){                  
	                    System.out.format("\n%d, %d, %d ---- %d + %d + %d = %d \n", i, j, rem/cc, i*ac, j*bc, (rem/cc)*cc, target);                     
	                }                   
	            }                   
	        }           
	    }       
	}
	 }

