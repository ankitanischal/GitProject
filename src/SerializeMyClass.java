import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializeMyClass {
	public static void main(String[] args) {
		
		//MySerialClass ser = new MySerialClass("sss", 1);
		
		/*try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(ser);
			// 3
			os.close();
			} catch (Exception e) { e.printStackTrace(); }*/
			try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MySerialClass ser  = (MySerialClass) ois.readObject(); // 4
			System.out.println(ser.getSound());
			ois.close();
			} catch (Exception e) { e.printStackTrace(); }

	}

}
