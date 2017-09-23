package it.sephiroth.android.library.imagezoom.test;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewTestActivity extends Activity {


    private TouchImageView imageView;
    private Button btn1,btn2,btn3,btn4;
    private Matrix matrix;
    private PointF pointF;

    private float xCoOrdinate, yCoOrdinate;
    private TouchImageView touchImageView,touchImageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        imageView = (TouchImageView) findViewById(R.id.image);
        imageView.setOnTouchImageListenser(new TouchImageView.CallbackOnTouchImage() {
            @Override
            public void result(TouchImageView matrix) {
            }
        });




        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                touchImageView2 = touchImageView;
            }
        });

        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setZoom(touchImageView2);
            }
        });
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageMatrix(matrix);
            }
        });
        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageMatrix(matrix);
            }
        });
    }

}
