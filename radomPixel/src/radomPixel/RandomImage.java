package radomPixel;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RandomImage {
	public static void main(String args[])throws IOException{
		//Dimensão da imagem
		int width = 640;
		int height = 320;
		//criar o obj de imagem
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		// https://www.programacaoprogressiva.net/2012/08/java-class-file-classe-file.html
		File f = null;
		
		for(int y = 0; y < height; y++){
			  for(int x = 0; x < width; x++){
				  int a = (int)(Math.random()*256); //alpha
				  int r = (int)(Math.random()*256); 
				  int g = (int)(Math.random()*256); 
				  int b = (int)(Math.random()*256); 
				  
				  int p = (a<<24) | (r<<16) | (g<<8) | b;
				  img.setRGB(x, y, p);
			  }
			}
		
		try{
			  f = new File("D:\\Image\\Output.jpg");
			  ImageIO.write(img, "png", f);
			}catch(IOException e){
			  System.out.println(e);
			}
	}
}
