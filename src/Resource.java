import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Resource {
	public static BufferedImage Icon;
	public static BufferedImage jiemian;
	private static Resource rt;
	public static void load() throws IOException
	{
		rt=new Resource();
		
		Icon=ImageIO.read(rt.getClass().getResourceAsStream("/snake.png"));
		jiemian=ImageIO.read(rt.getClass().getResourceAsStream("/jiemian.png"));
	}
}