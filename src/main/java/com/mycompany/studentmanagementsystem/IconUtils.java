package com.mycompany.studentmanagementsystem;

import java.awt.Image;
import javax.swing.ImageIcon;



public class IconUtils {

    public static ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}