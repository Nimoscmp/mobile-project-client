package com.edwinpaezalonso.visitando.view;

import static com.edwinpaezalonso.visitando.helpers.PhotoHelper.addWaterMark;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.edwinpaezalonso.visitando.MainActivity;
import com.edwinpaezalonso.visitando.R;
import com.edwinpaezalonso.visitando.helpers.PhotoHelper;

import java.io.File;
import java.io.IOException;

public class CameraActivity extends AppCompatActivity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    static final int RESULT_OK = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        ImageButton photoButton = findViewById(R.id.imageButtonTakePhoto);

        photoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                try {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                } catch (ActivityNotFoundException e) {
                    PhotoHelper.showGenericError(CameraActivity.this, "Ha ocurrido un error");
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        ImageView imagePhoto = findViewById(R.id.imageViewPhoto);

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK && data != null) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            Bitmap imageWithWatermark = addWaterMark(CameraActivity.this, imageBitmap, "VisitAndo");

            imagePhoto.setImageBitmap(imageWithWatermark);
        }
    }
}