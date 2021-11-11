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
	int width=simg.getWidth();
	int height = simg.getHeight();
	//BufferingedImage for mirror
	BufferedImage mimg=new BufferedImage(width*2,height,BufferedImage.TYPE_INT_ARGB);
	//create mirror image pixel
	for(int y=0;y<height;y++) {
	for(int lx=0,rx=width*2 -1;lx<width;lx++,rx--) {
		//lx starts from the left side 
		//get sources pixel value
		int p= simg.getRGB(lx,y);
		mimg.setRGB(lx,y,p);
		mimg.setRGB(rx,y,p);
	}
	}
}
}
