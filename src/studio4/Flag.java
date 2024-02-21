package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		double freedomFlag = Math.random()*0.25 + 0.15;
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(0.5, 0.5, freedomFlag);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, 0.15, 0.1);
		
		//make an outline of a rectangle
		StdDraw.rectangle(0.5, 0.5, freedomFlag+0.12, freedomFlag+0.1);
		
		
		
	}
}