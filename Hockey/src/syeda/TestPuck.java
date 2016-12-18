package syeda;

/**
 * TestPuck Class
 * @author Mary
 *
 */
public class TestPuck {
	public static void main(String[] args) {
		
		Puck saucer = new Puck(10, 5.1);

		System.out.println("Puck radius: " + saucer.getRadius());
		System.out.println("Puck type: " + saucer.getDivisor());
		System.out.println("Puck weight: " + saucer.getWeight());
		System.out.println("Puck surface area: " + saucer.area());
		System.out.println("Puck volume: " + saucer.volume());
	}

}
