package com.ebookfrenzy.gesturefun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this, this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent?): Boolean {
        return true
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        imageView.setImageResource(R.drawable.image7)
        return true
    }

    override fun onLongPress(e: MotionEvent?) {
        imageView.setImageResource(R.drawable.image2)
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        imageView.setImageResource(R.drawable.image3)
        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        imageView.setImageResource(R.drawable.image4)
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        imageView.setImageResource(R.drawable.image5)
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        imageView.setImageResource(R.drawable.image6)
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        return true
    }
}
