import java.io.Serializable;


public class MySerialClass implements Serializable{
	public static final long serialVersionUID = 42L;
	private String sound;
	//private int i;
	public MySerialClass(String sound) {
		this.sound = sound;
		int ;
		//this.i = i;
	}
	
	public String getSound() {
		return sound;
	}

}
