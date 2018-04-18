import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;
import java.util.Scanner;

public class klasa_5 extends Agent {
	
	protected void setup()
	{
		System.out.println("Agent " + getLocalName() );
		addBehaviour(new CheckNumberBehaviour());
	}

}

class CheckNumberBehaviour extends SimpleBehaviour{

	boolean finished = false;

	public void action()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe : ");
		int num = scanner.nextInt();
		if(num < 0) {
			System.out.println("Konczenie dzialania agenta");
			finished = true;
		}
	}
		
	
	public boolean done()
	{
		return finished;
	}
}