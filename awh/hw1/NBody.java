/**
 * @(#)NBody.java
 *
 *
 * @author 
 * @version 1.00 2015/1/28
 */

public class NBody {
    public static Planet getPlanet(In in){
    	double x,y,vx,vy,m;
    	String name;
    	
    	x=in.readDouble();
    	y=in.readDouble();
    	vx=in.readDouble();
    	vy=in.readDouble();
    	m=in.readDouble();
    	name=in.readString();
    	
    	return new Planet(x,y,vx,vy,m,name);
    }
    public static void main(String[] args) {
        double T=Double.parseDouble(args[0]);
        double dt=Double.parseDouble(args[1]);
        String filename=args[2];
        
        In in=new In(filename);
        int n=in.readInt();
        double r=in.readDouble();
        
        Planet[] planets= new Planet[n];
        
        for (int i=0;i<n;i++){
        	planets[i]=getPlanet(in);
        }
        
        StdDraw.setXscale(-1*r,r);
        StdDraw.setYscale(-1*r,r);
        /*StdDraw.picture(0,0,"images/starfield.jpg");
        for(int i=0; i<n; i++){
        	System.out.println(planets[i].x);
        	planets[i].draw();
        }*/
        int time=0;
        StdAudio.play("audio/2001.mid");
        while (time<T){
        	for(int i=0; i<n; i++){
        		planets[i].setNetForce(planets);
        	}
        	for(int i=0; i<n; i++){
        		planets[i].update(dt);
        	}
        	StdDraw.picture(0,0,"images/starfield.jpg");
        	for(int i=0; i<n; i++){
        		planets[i].draw();
        	}
        	StdDraw.show(10);
        	time+=dt;
        }
        StdAudio.close();
        StdDraw.show();
        System.out.println(n);
        System.out.println(r);
        double px,py,vx,vy,m;
        String name;
        for (int i=0; i<n; i++){
        	px=planets[i].x;
        	py=planets[i].y;
        	vx=planets[i].xVelocity;
        	vy=planets[i].yVelocity;
        	m=planets[i].mass;
        	name=planets[i].img;
        	System.out.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",px,py,vx,vy,m, name);
        }
    }
}
