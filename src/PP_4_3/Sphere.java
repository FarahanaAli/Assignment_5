package PP_4_3;

public class Sphere {
double diameter;
double volume;
double surfacearea;
	public Sphere(double dia) {
		diameter = dia;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diaset) {
		diameter = diaset;
	}
	public double Volume() {
		volume = ((1.33)*(3.14)*(Math.pow((diameter/2), 3)));
		return volume;
	}
	public double surfaceArea() {
		surfacearea = ((4)*(3.14)*(Math.pow((diameter/2), 2))); 
		return surfacearea;
	}
	public String toString() {
		return "Diameter: " + diameter + " volume: " + volume + " surface area: " + surfacearea;
	}
	

}

