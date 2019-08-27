package rahul.assignment.question1;

public class Mainclass {

	public static void main(String[] args) {
		Rodent[] rodent=new Rodent[3];
		
		rodent[0]=new Mouse();
		rodent[1]=new Gerbil();
		rodent[2]=new Hamster();
		
		rodent[0].work();
		rodent[0].sleep();
		
		rodent[1].work();
		rodent[1].sleep();
		
		rodent[2].work();
		rodent[2].sleep();

	}

}
