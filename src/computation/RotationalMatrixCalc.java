package computation;

public class RotationalMatrixCalc extends Calculation{

	/*
	 * This is the class used to calculate the full rotation matrix of the platform relative to the base.  
	 * The variables psi, theta, and phi, come from the user inputs of what the new orientation of the platform
	 * should be via the GUI.
	 * 
	 * The method rotationMatrix() returns the 3x3 matrix that is completed when the variables have been assigned a value.
	 */
		
	public double[][] rotationMatrix(double psi, double theta, double phi){
		
		matrix[1][1] = Math.cos(psi)*Math.cos(theta);
		matrix[1][2] = -Math.sin(psi)*Math.cos(phi)+Math.cos(psi)*Math.sin(theta)*Math.sin(phi);
		matrix[1][3] = Math.sin(psi)*Math.sin(phi)+Math.cos(psi)*Math.sin(theta)*Math.cos(phi);
		matrix[2][1] = Math.sin(psi)*Math.cos(theta); 
		matrix[2][2] = Math.cos(psi)*Math.cos(phi)+Math.sin(psi)*Math.sin(theta)*Math.sin(phi); 
		matrix[2][3] = -Math.cos(psi)*Math.sin(phi)+Math.sin(psi)*Math.sin(theta)*Math.cos(phi);
		matrix[3][1] = -Math.sin(theta);
		matrix[3][2] = Math.cos(theta)*Math.sin(phi);
		matrix[3][3] = Math.cos(theta)*Math.cos(phi);
		
		return matrix;
	}
	
}
