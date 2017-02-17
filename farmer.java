/*farmer.java
@ Author Yo
17/02/17
*/

public class farmer{

	//vars
	private int numEgg;
	private int numBox;
	private int numLeft;

	//constuctor
	public farmer(){
	numEgg=0;
	numBox=0;
	numLeft=0;
	}

	//set methods
	public void egg(int numEgg){
	this.numEgg=numEgg;
	}

	public void box(int numBox){
	this.numBox=numBox;
	}
	public void leftover(int numLeft){
	this.numLeft=numLeft;
	}

	//compute
	public void compute(){
	numBox=numEgg/12;
	numLeft=numEgg%12;
	}

	//get methods
	public int getnumLeft(){
		return numLeft;
	}
	public int getnumBox(){
		return numBox;
	}
}