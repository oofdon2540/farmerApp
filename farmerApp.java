/*farmer.java
@ Author Yo
17/02/17
*/
import javax.swing.JOptionPane;
public class farmerApp{
	public static void main(String args[]){

	//vars
	int numEgg=0;
	int numBox=0;
	int numLeft=0;

	//declare and create object
	farmer farm;
	farm = new farmer();

	//take in inputs
	numEgg=Integer.parseInt(JOptionPane.showInputDialog(null, "How many eggs are there?"));

	//set methods
	farm.egg(numEgg);


	//compute
	farm.compute();

	//get methods
	numBox=farm.getnumBox();
	numLeft=farm.getnumLeft();

	//output
	JOptionPane.showMessageDialog(null, "Number of box is "+numBox);
	JOptionPane.showMessageDialog(null, "The leftovers are "+numLeft);
}
}