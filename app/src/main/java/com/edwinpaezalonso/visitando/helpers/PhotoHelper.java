package com.edwinpaezalonso.visitando.helpers;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.edwinpaezalonso.visitando.view.CameraActivity;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhotoHelper {

    public static File createImageFile(File storageDir) throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";

        File image = File.createTempFile(
                imageFileName,  /* prefix */
                ".jpg",         /* suffix */
                storageDir      /* directory */
        );

        // Save a file: path for use with ACTION_VIEW intents
        return image;
    }

    public static void showGenericError(Context context, String message) {
        Toast toast =
                Toast.makeText(context, message, Toast.LENGTH_LONG);
        toast.show();
    }
}
