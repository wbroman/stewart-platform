package computation;

import java.util.Arrays;

public class AlphaCalc extends Calculation{
	
	/*
	 * All units in mm
	 */
	

	
	/*
	 * Converts the leg length from LiCalc.java to the variable L used in equation 12
	 */
	public double[] leg(double[] L){
		double[] legSquared = new double[beta.length];
		for(int i=0; i < 6; i++){
			
			legSquared[i] = Math.pow(L[i], 2) - (Math.pow(fixedLegLength, 2) - Math.pow(armLength, 2));
			
		}
		return legSquared;
	}
	
	/*
	 * Stores the variable M from equation 12
	 */
	
	public double[] mVar(){
		
		//Creates the new array M, in which all M variable for all 6 legs will be stored.
		
		double[] M = new double[beta.length];
		
		for(int i=0; i < 6; i++){
			M[i] = 2*armLength*(zPlatCoords[i]-zBaseCoords[i]);
			
			
		}
		return M;
	}
	
	/*
	 * Stores the variable N from equation 12
	 */
	
	public double[] nVar(){
		
		//Creates the new array N
		
		double[] N = new double[beta.length];
		
		for(int i=0; i < 6; i++){
			N[i] = 2*armLength*(Math.cos(beta[i])*(xPlatCoords[i]-xBaseCoords[i])+Math.sin(beta[i])*(yPlatCoords[i]-yBaseCoords[i]));
			
			
		}
		return N;
	}
	
	/*
	 * Computes alpha, which is the array of data to be sent to the Arduino to move the servo motors.
	 */
	
	public double[] Alpha(double[] L, double[] M, double[] N) {
		for(int i = 0; i < 6; i++){
			Math.asin((L[i]/Math.sqrt(Math.pow(M[i],2)+Math.pow(N[i], 2))-Math.atan((N[i]/M[i]))));
			
			
		}
		
		return alpha;
	}
	
	public static void main(String[] args){
		System.out.println(Arrays.toString(AlphaCalc.alpha));
	}

}
