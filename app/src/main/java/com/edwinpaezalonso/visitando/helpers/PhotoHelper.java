package com.edwinpaezalonso.visitando.helpers;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.widget.Toast;

import com.edwinpaezalonso.visitando.R;
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

    public static Bitmap addWaterMark(Context context, Bitmap src, String text) {
        int w = src.getWidth();
        int h = src.getHeight();
        Bitmap result = Bitmap.createBitmap(w, h, src.getConfig());
        Canvas canvas = new Canvas(result);
        canvas.drawBitmap(src, 0, 0, null);

        Paint paint = setPaint();
        Point point = setPoint(h - 25,w - 85);
        //Bitmap waterMark = BitmapFactory.decodeResource(context.getResources(), R.drawable.watermark_1);
        //canvas.drawBitmap(waterMark, 0, 0, null);
        canvas.drawText(text, point.x, point.y, paint);

        return result;
    }

    public static Color setColor(int r, int g, int b) {
        Color color = new Color();
        color.red(r);
        color.green(g);
        color.blue(b);
        return color;
    }

    public static Paint setPaint () {
        Paint paint = new Paint();
        paint.setTextSize(14);
        paint.setColor(0xf59b42ff);
        return paint;
    }

    public static Point setPoint (int bottom, int right) {
        Point point = new Point();
        point.x = right;
        point.y = bottom;
        return point;
    }

    public static void showGenericError(Context context, String message) {
        Toast toast =
                Toast.makeText(context, message, Toast.LENGTH_LONG);
        toast.show();
    }
}
