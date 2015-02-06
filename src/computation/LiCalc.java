package computation;

public class LiCalc extends Calculation {
	
	
	/*
	 * This class calculates the leg length, l(i), per equation 3.  This leg length will be used in the 
	 * alpha calculation class.
	 */
	
	public static double[] legLength(double[] tLength, double[][] rotation, double[] platformCoords, double[] baseCoords ){
		
		double[] rotatedCoords = new double[platformCoords.length];
		
		
		  for (int i = 0; i < 3; i++){
			  
			  double rotatedValue = 0;
		      for (int j = 0; j < 3; j++){
		    	  
		    	  //Adds the value of the array multiplication to rotatedValue
		    	  rotatedValue += rotation[i][j] * platformCoords[i];
		      }
		      
		      //Stores rotatedValue in the array rotatedCoords[], the array can then be used
		      //to calculate total leg length.
		      rotatedCoords[i] = rotatedValue;
		  }    
		  
		  double[] length = new double[platformCoords.length];
		  
		  for (int i = 0; i < 3; i++){
			  length[i] = tLength[i] + rotatedCoords[i] - baseCoords[i];
		  }
		
		return length;
		
	}

}
