/**
 * Circle.java
 * @author Mary
 * @param <Disk>
 *
 */
package syeda;
/**
 * Disk class.
 */
public class Disk extends Circle {
	private double thickness;
	
	/**
	 * Returns area
	 */
	public double area()
	{
		return(3.14*radius*radius);
	}

	/**
	 * constructor
	 * pre:  none
	 * post:  A Disk object has been created with radius r and
	 * thickness t.
	 */
	public Disk(double r, double t) {
		super(r);
		thickness = t;
	}

	/**
	 * Changes the thickness of the disk.
	 * pre:  none
	 * post:  Thickness has been changed.
	 */
	public void setThickness(double newThickness) {
		thickness = newThickness;
	}

	/**
	 * Returns the thickness of the disk.
	 * pre:  none
	 * post:  The thickness of the disk has been returned.
	 */
	public double getThickness() {
		return(thickness);
	}

	/**
	 * Returns the volume of the disk.
	 * pre:  none
	 * post:  The volume of the disk has been returned.
	 */
	public double volume() {
		double v;

		v = super.area() * thickness;
		return(v);
	}
	/**
	 * Determines if the object is equal to another Disk 
	 * object.
	 * pre:  d is a Disk object.
	 * post:  true has been returned if objects have the same
	 * radii and thickness.  false has been returned otherwise.
	 */
	public boolean equals(Object d) {
		Disk testObj = (Disk)d;

		if (testObj.getRadius() == super.getRadius()
				&& testObj.getThickness() == thickness) {
			return(true);
		} else {
			return(false);
		}
	}

	/**
	 * Returns a String that represents the Disk object.
	 * pre:  none
	 * post:  A string representing the Disk object has been
	 * returned.
	 */
	public String toString() {
		String diskString;

		diskString = "The disk has radius " + super.getRadius() + " and thickness " + thickness + ".";
		return(diskString);
	}

}