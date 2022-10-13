package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	
		//reading the txt file
		String shapeType = in.next();
		
		
		//strawing the shape
		
		
		//rectangle bois
		
		if (shapeType.equals("rectangle")){
			
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if (isFilled == true){
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else{
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		} else if((shapeType.equals("ellipse"))){
			
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if (isFilled == true){
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			} else{
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		} else if((shapeType.equals("triangle"))){
			
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		double parameterFive = in.nextDouble();
		double parameterSix = in.nextDouble();
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			if (isFilled == true){
				double[] x = {parameterOne, parameterTwo, parameterThree};
				double[] y = {parameterFour, parameterFive, parameterSix};

				StdDraw.filledPolygon(x, y);
			} else{
				double[] x = {parameterOne, parameterTwo, parameterThree};
				double[] y = {parameterFour, parameterFive, parameterSix};
				StdDraw.polygon(x, y);
			}
		}
		
		
		

	}
}
