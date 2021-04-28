package model;

import javafx.scene.paint.Color;

/**
 * This class is in charge of creating the ball object and setting up its attributes.
 * @author Eric Nielsen
 * @version 1.0 
 */
public class Ball {
	
	private double xCoordinate;
	private double yCoordinate;
	private double velocity;
	private double angle;
	private Color color;
	
	public Ball(double xCoordinate, double yCoordinate, double velocity, double angle) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.velocity = velocity;
		this.angle = angle;
	}
	
	
}
