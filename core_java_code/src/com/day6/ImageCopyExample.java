package com.day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyExample {

    public static void main(String[] args) {
        String sourceImage = "input.jpg";     // original image path
        String destinationImage = "output.jpg"; // copied image path

        try (
            FileInputStream fis = new FileInputStream(sourceImage);
            FileOutputStream fos = new FileOutputStream(destinationImage);
        ) {
            byte[] buffer = new byte[1024];  // buffer to read/write chunks
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully!");
        } catch (IOException e) {
            System.out.println("Error during image file copy.");
            e.printStackTrace();
        }
    }
}
