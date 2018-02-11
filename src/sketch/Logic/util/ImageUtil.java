package sketch.Logic.util;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageUtil {

    public static BufferedImage loadImage(String path) {
        try {

            return ImageIO.read(new File(path));
        } catch (Exception exc) {

            exc.printStackTrace();
        }
        return null;
    }

    //метод для загрузки изображения из jar архива
    public static BufferedImage loadResourceImage(String path) {
        //
        try {

            return ImageIO.read(ImageUtil.class.getResourceAsStream(path));
        } catch (Exception exc) {

            exc.printStackTrace();
        }
        return null;
    }
}
