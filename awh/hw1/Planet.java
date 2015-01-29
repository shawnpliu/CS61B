/**
 * @(#)Planet.java
 *
 *
 * @author 
 * @version 1.00 2015/1/28
 */

import java.util.*;

public class Planet {
	public double x, y, xVelocity, yVelocity, mass;
	public double xNetForce,yNetForce,xAccel,yAccel;
	public String img;
	private double G=6.67*Math.pow(10,-11);
	
    public Planet(double px, double py, double vx, double vy, double m, String name) {
    	x=px;
    	y=py;
    	xVelocity=vx;
    	yVelocity=vy;
    	mass=m;
    	img=name;
    	xNetForce=0;
    	yNetForce=0;
    }
    
    public double calcDistance(Planet p){
    	return Math.pow(Math.pow((p.x-this.x),2)+Math.pow((p.y-this.y),2),.5);
    }
    
    public double calcPairwiseForce(Planet p){
    	double dist=this.calcDistance(p);
    	if (dist==0){
    		return 0;
    	}
    	else{
    		return G*this.mass*p.mass/Math.pow(dist,2);
    	}
    }
    
    public double calcPairwiseForceX(Planet p){
    	double force=this.calcPairwiseForce(p);
    	double theta=Math.atan2(p.y-this.y,p.x-this.x);
    	return force*Math.cos(theta);
    }
    
    public double calcPairwiseForceY(Planet p){
    	double force=this.calcPairwiseForce(p);
    	double theta=Math.atan2(p.y-this.y,p.x-this.x);
    	return force*Math.sin(theta);
    }
    
    public void setNetForce(Planet[] planets){
    	xNetForce=0;
    	yNetForce=0;
    	for (int i=0;i<planets.length;i++){
    		xNetForce+=this.calcPairwiseForceX(planets[i]);
    		yNetForce+=this.calcPairwiseForceY(planets[i]);
    	}
    }
    
    public void draw(){
    	StdDraw.picture(this.x,this.y,"images/"+img);
    }
    
    public void update(double dt){
    	xAccel=xNetForce/mass;
    	yAccel=yNetForce/mass;
    	xVelocity+=xAccel*dt;
    	yVelocity+=yAccel*dt;
    	x+=xVelocity*dt;
    	y+=yVelocity*dt;
    }
}