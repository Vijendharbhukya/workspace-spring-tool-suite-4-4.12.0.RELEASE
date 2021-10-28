package Question2;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.imageio.ImageIO;
public class MirrorImage {
//BufferedImage for source image
	BufferedImage simg = null;
	//File object
	File f=null;
	//read source image file
	try {
		f=new File("D:\\Image\\audrey.jpg");
		simg=javax.imageio.ImageIO.read(f);
	}
	catch(IOException e) {
		System.out.println("Error: "+e);
	}
	//get source image
	int Image1=simg.getImage();
	int 
	
}
