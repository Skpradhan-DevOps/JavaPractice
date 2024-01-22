package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable{
	int i=10, j=20;
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		//Serialization
		FileOutputStream fos= new FileOutputStream("abc.text");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(t);
		
		//Deserialization
		FileInputStream fis=new FileInputStream("abc.text");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Test t2=(Test) ois.readObject();
		
		System.out.println(t2.i+" "+t2.j);
		

	}

}
