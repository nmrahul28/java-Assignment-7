package rahul.assignment.question2;

public class Mainclass {

	public static void main(String[] args) {
		Cycle [] cycles=new Cycle[] {new Cycle(), new Unicycle(), new Bicycle(), new Tricycle()};
		for(Cycle cycle:cycles) {
			((Unicycle)cycle).balance(); //throws an exception
			/*Exception in thread "main" java.lang.ClassCastException: class rahul.assignment.question2.
			 * Cycle cannot be cast to class rahul.assignment.question2.
			 * Unicycle (rahul.assignment.question2.Cycle and rahul.assignment.question2.
			 * Unicycle are in unnamed module of loader 'app')at rahul.assignment.question2.Mainclass.main(Mainclass.java:8)*/
		}

	}

}
