package com.example.tugasdrawcanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint(); //digunakan untuk menggambar objek
    private Paint mPaintText = new Paint(); //digunakan untuk membuat tulisan atau label
    private Bitmap mBitmap;
    private ImageView mImageView;
    private Rect mRect = new Rect();
    private Rect mBounds = new Rect();

    private static final int OFFSET = 200; //untuk mengatur posisi dari objek
    private int mOffset = OFFSET;
    private static final int COUNT = 0;
    private int count = COUNT;

    private int mColorTrunk;
    private int mColorLeaf;
    private int mColorOrnament;
    private int mColorOrnament2;
    private int mColorOrnament3;
    private int mColorStar;
    private Paint paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mColorTrunk = ResourcesCompat.getColor(getResources(), R.color.trunk, null);
        mColorLeaf = ResourcesCompat.getColor(getResources(), R.color.leaf, null);
        mColorOrnament = ResourcesCompat.getColor(getResources(), R.color.ornament, null);
        mColorOrnament2 = ResourcesCompat.getColor(getResources(), R.color.ornament2, null);
        mColorOrnament3 = ResourcesCompat.getColor(getResources(), R.color.ornament3, null);
        mColorStar = ResourcesCompat.getColor(getResources(), R.color.star, null);

        mPaintText.setColor(ResourcesCompat.getColor(getResources(), R.color.leaf, null));
        mPaintText.setTextSize(120);

        mImageView = findViewById(R.id.myimageview);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawSomething(v);
            }
        });
    }

    private void drawSomething(View view) {
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        int halfWidth = vWidth / 2;
        int halfHeight = vHeight / 2;

        if (mOffset == OFFSET) {
            mBitmap = Bitmap.createBitmap(vWidth, vHeight, Bitmap.Config.ARGB_8888);
            mImageView.setImageBitmap(mBitmap);
            mCanvas = new Canvas(mBitmap); //baru draw text
            mPaintText.setTextSize(50);
            mCanvas.drawText(getString(R.string.keep_tapping), 100, 100, mPaintText);
            count += 1;
            mOffset += OFFSET;

        } else {
            if (count == 1) {
                mPaint.setColor(mColorTrunk);
                mRect.set(400, 1800, 670, 800 );
                mCanvas.drawRect(mRect, mPaint);

                Path pathTree6 = new Path();
                pathTree6.moveTo(550, 270); // Top
                pathTree6.lineTo(30, 1650); // Bottom left
                pathTree6.lineTo(1065, 1650); // Bottom right
                pathTree6.lineTo(550, 300); // Back to Top
                pathTree6.close();
                mPaint.setColor(mColorLeaf);
                mCanvas.drawPath(pathTree6, mPaint);

                count += 1;
                mOffset += OFFSET;

            } else if (count == 2) {

                Path pathTreeX = new Path();
                pathTreeX.moveTo(550, 270); // Top
                pathTreeX.lineTo(130, 900); // Bottom left
                pathTreeX.lineTo(965, 900); // Bottom right
                pathTreeX.lineTo(550, 300); // Back to Top
                pathTreeX.close();
                mPaint.setColor(mColorLeaf);
                mCanvas.drawPath(pathTreeX, mPaint);

                Path pathTree4 = new Path();
                pathTree4.moveTo(550, 270); // Top
                pathTree4.lineTo(110, 1050); // Bottom left
                pathTree4.lineTo(965, 1050); // Bottom right
                pathTree4.lineTo(550, 300); // Back to Top
                pathTree4.close();
                mPaint.setColor(mColorLeaf);
                mCanvas.drawPath(pathTree4, mPaint);

                Path pathTree3 = new Path();
                pathTree3.moveTo(550, 270); // Top
                pathTree3.lineTo(90, 1200); // Bottom left
                pathTree3.lineTo(990, 1200); // Bottom right
                pathTree3.lineTo(550, 300); // Back to Top
                pathTree3.close();
                mPaint.setColor(mColorLeaf);
                mCanvas.drawPath(pathTree3, mPaint);

                Path pathTree2 = new Path();
                pathTree2.moveTo(550, 270); // Top
                pathTree2.lineTo(70, 1350); // Bottom left
                pathTree2.lineTo(1015, 1350); // Bottom right
                pathTree2.lineTo(550, 300); // Back to Top
                pathTree2.close();
                mPaint.setColor(mColorLeaf);
                mCanvas.drawPath(pathTree2, mPaint);

                  Path pathTree5 = new Path();
                  pathTree5.moveTo(550, 270); // Top
                  pathTree5.lineTo(50, 1500); // Bottom left
                  pathTree5.lineTo(1040, 1500); // Bottom right
                  pathTree5.lineTo(550, 300); // Back to Top
                  pathTree5.close();
                  mPaint.setColor(mColorLeaf);
                  mCanvas.drawPath(pathTree5, mPaint);

                Path pathTree6 = new Path();
                pathTree6.moveTo(550, 270); // Top
                pathTree6.lineTo(30, 1650); // Bottom left
                pathTree6.lineTo(1065, 1650); // Bottom right
                pathTree6.lineTo(550, 300); // Back to Top
                pathTree6.close();
                mPaint.setColor(mColorLeaf);
                mCanvas.drawPath(pathTree6, mPaint);


                count += 1;
                mOffset += OFFSET;

            } else if (count == 3) {
                Paint paint  = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(12);
                paint.setColor(mColorOrnament2);

                Path myPath = new Path();

                int midX            = 200 + ((965- 200) / 2);
                int midY            = 700 + (( 1050 -700) / 2);
                float xDiff         = midX - 200;
                float yDiff         = midY - 700;
                double angle        = (Math.atan2(yDiff, xDiff) * (180 / Math.PI)) - 90;
                double angleRadians = Math.toRadians(angle);
                float pointX        = (float) (midX + 8 * Math.cos(angleRadians));
                float pointY        = (float) (midY + 8 * Math.sin(angleRadians));

                myPath.moveTo(200, 700);
                myPath.cubicTo(200,700,pointX, pointY, 965, 900);
                mCanvas.drawPath(myPath, paint);

                count += 1;
                mOffset += OFFSET;
            }


            else if (count == 4) {
                Paint paint  = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(12);
                paint.setColor(mColorOrnament2);

                Path myPath = new Path();


                int midX            = 965 + (( 110 - 965) / 2);
                int midY            = 900 + (( 1050 - 900) / 2);
                float xDiff         = midX - 965;
                float yDiff         = midY - 900;
                double angle        = (Math.atan2(yDiff, xDiff) * (180 / Math.PI)) - 90;
                double angleRadians = Math.toRadians(angle);
                float pointX        = (float) (midX + 8 * Math.cos(angleRadians));
                float pointY        = (float) (midY + 8 * Math.sin(angleRadians));

                myPath.moveTo(965, 900);
                myPath.cubicTo(965,900,pointX, pointY, 110, 1050);
                mCanvas.drawPath(myPath, paint);

                count += 1;
                mOffset += OFFSET;

            }

            else if (count == 5) {
                Paint paint  = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(12);
                paint.setColor(mColorOrnament2);

                Path myPath = new Path();
                int midX            = 110 + (( 1015 - 110) / 2);
                int midY            = 1050 + (( 1350 - 1050) / 2);
                float xDiff         = midX - 110;
                float yDiff         = midY - 1050;
                double angle        = (Math.atan2(yDiff, xDiff) * (180 / Math.PI)) - 90;
                double angleRadians = Math.toRadians(angle);
                float pointX        = (float) (midX + 8 * Math.cos(angleRadians));
                float pointY        = (float) (midY + 8 * Math.sin(angleRadians));

                myPath.moveTo(110, 1050);
                myPath.cubicTo(110,1050,pointX, pointY, 1015, 1350);
                mCanvas.drawPath(myPath, paint);

                count += 1;
                mOffset += OFFSET;

            }


            else if (count == 6) {
                Paint paint  = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(12);
                paint.setColor(mColorOrnament2);

                Path myPath = new Path();
                int midX            =  1015+ (( 30 - 1015) / 2);
                int midY            = 1350 + (( 1650 - 1350) / 2);
                float xDiff         = midX - 1005;
                float yDiff         = midY - 130;
                double angle        = (Math.atan2(yDiff, xDiff) * (180 / Math.PI)) - 90;
                double angleRadians = Math.toRadians(angle);
                float pointX        = (float) (midX + 7 * Math.sin(angleRadians));
                float pointY        = (float) (midY + 7 * Math.cos(angleRadians));

                myPath.moveTo(1000, 1400);
                myPath.cubicTo(1015, 1350,pointX, pointY, 30, 1650);
                mCanvas.drawPath(myPath, paint);

                count += 1;
                mOffset += OFFSET;

            }

            else if (count == 7) {
                mPaint.setColor(mColorOrnament);

                mCanvas.drawCircle(300, 810, halfWidth / 20, mPaint);

                mCanvas.drawCircle(500, 860, halfWidth / 20, mPaint);


                mCanvas.drawCircle(720, 890, halfWidth / 20, mPaint);

                mCanvas.drawCircle(600, 1000, halfWidth / 20, mPaint);

                mCanvas.drawCircle(400, 1190, halfWidth / 20, mPaint);

                mCanvas.drawCircle(730, 1300, halfWidth / 20, mPaint);

                mCanvas.drawCircle(760, 1460, halfWidth / 20, mPaint);
                count += 1;
                mOffset += OFFSET;

            }

            else if (count == 8){
                mPaint.setColor(mColorOrnament3);
                mCanvas.drawCircle(730, 1000, halfWidth / 20, mPaint);
                mCanvas.drawCircle(400, 1050, halfWidth / 20, mPaint);
                mCanvas.drawCircle(590, 1260, halfWidth / 20, mPaint);
                mCanvas.drawCircle(560, 1530, halfWidth / 20, mPaint);

                count += 1;
                mOffset += OFFSET;

            }
            else {
                String text = getString(R.string.xmastree);

                // Get bounding box for text to calculate where to draw it.
                mPaintText.getTextBounds(text, 0, text.length(), mBounds);

                // Calculate x and y for text so it's centered.
                int x = halfWidth - mBounds.centerX();
                int y = halfHeight + 900;
                mCanvas.drawText(text, x, y, mPaintText);

                mCanvas.drawText(getString(R.string.done), 100, 200, mPaintText);

            }
        }

        view.invalidate();
    }}
