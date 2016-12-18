/**
 * Disk Class
 * @author Mary
 * 
 */
package syeda;
/**
 * Puck class.
 *
 */
public class Puck extends Disk{

	private double weight;
	private boolean standard = false;
	private boolean youth = false;

	/**
	 * constructor
	 * pre: none
	 * post: A disk object has been created with radius r
	 * and thickness t.
	 */
	public Puck(double r, double w) {
		super(r, 1);
		weight = w;
		if((w < 4.5|| w == 4.5) && (w > 4|| w == 4)) {
			youth= true;
		}
		if((w > 5|| w == 5) && (w < 5.5|| w == 5.5)){
			standard= true;
		}
	}

	/**
	 * Changes the thickness of the disk.
	 * pre:  none
	 * post:  Thickness has been changed.
	 */
	public void setWeight(double newWeight) {
		weight = newWeight;
	}

	/**
	 * Returns the thickness of the disk.
	 * pre:  none
	 * post:  The thickness of the disk has been returned.
	 */
	public double getWeight() {
		return(weight);
	}

	/**
	 * Determines if the object is equal to another Disk 
	 * object.
	 * pre:  d is a Disk object.
	 * post:  true has been returned if objects have the same
	 * radii and thickness.  false has been returned otherwise.
	 */
	public boolean equals(Object d) {
		Puck testObj = (Puck)d;

		if (testObj.getRadius() == super.getRadius()
				&& testObj.getWeight() == weight) {
			return(true);
		} else {
			return(false);
		}
	}
	
	/**
	 * Returns the divisor of the puck
	 * Either Youth or Standard
	 * @return
	 */
	public String getDivisor() {
		if(youth)
			return("Youth ");
		else
		{
			return("Standard ");
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

		diskString = "The disk has radius " + getDivisor()  + " and weight " + weight + ".";
		return(diskString);
	}

	/**
	 * Returns the area of the puck
	 */
	public double area()
	{
		return(3.14 * radius * radius);
	}
}
