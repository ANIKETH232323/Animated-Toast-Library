package com.example.animetoast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.airbnb.lottie.LottieAnimationView;

public class AnimeToasty extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public AnimeToasty(Context context) {
        super(context);
    }

    public static Toast makeToast(Context context,String msg,int animation,int background,int duration){

        Toast toast = new Toast(context);

        View view = LayoutInflater.from(context).inflate(R.layout.custom_toast,null,false);

        CardView cardView =  view.findViewById(R.id.card);
        LottieAnimationView lottieAnimationView = view.findViewById(R.id.anim_lottie);
        TextView textView = view.findViewById(R.id.text);

        textView.setText(msg);

//        cardView.setCardBackgroundColor(background);
        cardView.setBackgroundResource(background);
        lottieAnimationView.setAnimation(animation);
        lottieAnimationView.playAnimation();

        toast.setDuration(duration);
        toast.setView(view);

        return toast;


    }
}
