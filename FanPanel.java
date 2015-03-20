package homework2;

/**
 * Implement a class named Fan to represent a fan. The class contains: Three
 * constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote
 * the fan speed. A private int data field named speed that specifies the speed
 * of the fan (the default is SLOW). A private boolean data field named on that
 * specifies whether the fan is on (the default is false). A private double data
 * field named radius that specifies the radius of the fan (the default is 5). A
 * string data field named color that specifies the color of the fan (the
 * default is blue). The accessor and mutator methods for all four data fields.
 * A no-arg constructor that creates a default fan. A method named toString()
 * that returns a string description for the fan. If the fan is on, the method
 * returns the fan speed, color, and radius in one combined string. If the fan
 * is not on, the method returns the fan color and radius along with the string
 * “fan is off” in one combined string.
 */
public class FanPanel {
	public static class Fan {
		public static int SLOW = 1;
		public static int MEDIUM = 2;
		public static int FAST = 3;

		private int speed = SLOW;
		private boolean on = false;
		private double radius = 5.0;
		private String color = "blue";

		public int getSpeed() {
			return this.speed;
		}

		public void setSpeed(int updateSpeed) {
			this.speed = updateSpeed;
		}

		public boolean isFanOn() {
			return this.on;
		}

		public void setOn(boolean onOff) {
			this.on = onOff;
		}

		public double getRadius() {
			return this.radius;
		}

		public void setRadius(double newRadius) {
			this.radius = newRadius;
		}

		public String getColor() {
			return this.color;
		}

		public void setColor(String newColor) {
			this.color = newColor;
		}

		public String toString() {
			return "speed is " + this.speed + "\n" + "color is " + this.color
					+ "\n" + "radius is " + this.radius + "\n"
					+ (this.on ? "fan is on" : "fan is off");
		}
	}

	public static void main(String[] args) {
		// Fan fan0 = new Fan();
		// System.out.println("==== Fan #0 ====");
		// System.out.println(fan0.toString());

		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10.0);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println("==== Fan #1 ====");
		System.out.println(fan1.toString());

		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5.0);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println();
		System.out.println("==== Fan #2 ====");
		System.out.println(fan2.toString());
	}
}
