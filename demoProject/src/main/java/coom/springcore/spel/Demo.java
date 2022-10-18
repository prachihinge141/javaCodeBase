package coom.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{11+22}") //how to insert primitive datatype
	private int x;
	
	@Value("#{33+67}")
	private int y;
	public int getX() {
		return x;
	}
	
	//@Value("#{ T(java.lang.math).sqrt(25)}")// not done cnnot found java.lang.math
	//private double z;
	
	@Value("#{8>6}")
	private boolean isActive;
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", isActive=" + isActive + "]";
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
//	public double getZ() {
//		return z;
//	}
//	public void setZ(double z) {
//		this.z = z;
//	}
//	
	
}
