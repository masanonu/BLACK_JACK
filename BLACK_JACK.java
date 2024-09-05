import java.util.Random;
import java.util.Scanner;
class BLACK_JACK
{
    private int _hand01;
    private int _hand02;
    private int _chr001;
    private int _chr002;
    public int _sum;
    private String _chr01;
    private String _chr02;
    Random rand = new Random();
    public void character01(int chr) {
	if (chr == 0) {
	    this._chr01 = "Spade";
	} else if (chr == 1) {
	    this._chr01 = "Clover";
	} else if (chr == 2) {
	    this._chr01 = "Heart";
	} else if (chr == 3) {
	    this._chr01 = "Diamond";
	} else {
	    System.out.println("Error!");
	}
    }
    public void character02(int chr) {
	if (chr == 0) {
	    this._chr02 = "Spade";
	} else if (chr == 1) {
	    this._chr02 = "Clover";
	} else if (chr == 2) {
	    this._chr02 = "Heart";
	} else if (chr == 3) {
	    this._chr02 = "Diamond";
	} else {
	    System.out.println("Error!");
	}
    }
    public void bit01() {
	this._chr001 = rand.nextInt(4);
	this.character01(this._chr001);
	this._hand01 = rand.nextInt(13) + 1;
	this._chr002 = rand.nextInt(4);
	this.character02(this._chr002);
	this._hand02 = rand.nextInt(13) + 1;
    }
    public void show() {
	System.out.println("card01 : " + this._hand01 + " " + this._chr01);
	System.out.println("card02 : " + this._hand02 + " " + this._chr02);
	this._sum = this._hand01 + this._hand02;
	System.out.println(" s u m : " + this._sum);
	if (this._sum == 21) {
	    System.out.println("Black Jack!");
	}
    }
    public void shuffle01() {
	this._chr001 = rand.nextInt(4);
	this.character01(this._chr001);
	this._hand01 = rand.nextInt(13) + 1;
	this._sum = this._hand01 + this._hand02;
    }
    public void shuffle02() {
	this._chr002 = rand.nextInt(4);
	this.character02(this._chr002);
	this._hand02 = rand.nextInt(13) + 1;
	this._sum = this._hand01 + this._hand02;	
    }
    public void shuffle03() {
	this.shuffle01();
	this.shuffle02();
    }
}
class BLACK_JACK_RUN
{
    public static void Judge(BLACK_JACK player01, BLACK_JACK machine01) {
	int Judge01;
	int Judge02;
	final int Just = 21;
	Judge01 = Just - player01._sum;
	Judge02 = Just - machine01._sum;
	if (Judge01 == Judge02) {
	    System.out.println("Draw");
	} else if (Judge01 < Judge02) {
	    System.out.println("You Win!");
	} else if (Judge01 > Judge02) {
	    System.out.println("machine Win!");
	} else if (Judge01 < 0) {
	    System.out.println("Game over!");
	} else {
	    System.out.println("Error!");
	}
    }
    public static void main(String[] args) {
	int choice01;
	BLACK_JACK player = new BLACK_JACK();
	BLACK_JACK machine = new BLACK_JACK();
	Scanner stdIn = new Scanner(System.in);
	System.out.println("This Program is the Black Jack Game.");
	System.out.println("Let's play!");
	machine.bit01();
	player.bit01();
	player.show();
	System.out.println("Please choice shuffle.");
	System.out.println("1. card01 shuffle");
	System.out.println("2. card02 shuffle");
	System.out.println("3. card01 and card02 shuffle");
	System.out.println("4. no thank you.");
	System.out.print(">");
	choice01 = stdIn.nextInt();
	if (choice01 == 1) {
	    player.shuffle01();
	} else if (choice01 == 2) {
	    player.shuffle02();
	} else if (choice01 == 3) {
	    player.shuffle03();
	} else if (choice01 == 4) {
	} else {
	    System.out.println("Error!");
	}
	player.show();
	Judge(player, machine);
    }
}
   
    
      
