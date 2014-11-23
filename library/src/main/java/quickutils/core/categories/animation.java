package quickutils.core.categories;

import android.view.View;
import android.view.animation.AlphaAnimation;

/**
 * Created by cesarferreira on 28/05/14.
 */
public class animation {


    protected animation() {
    }

    /**
     * Make a View Blink for a desired duration
     *
     * @param view     view that will be animated
     * @param duration for how long in ms will it blink
     * @param offset   start offset of the animation
     * @return returns the same view with animation properties
     */
    public static View blink(View view, int duration, int offset) {

        android.view.animation.Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(duration);
        anim.setStartOffset(offset);
        anim.setRepeatMode(android.view.animation.Animation.REVERSE);
        anim.setRepeatCount(android.view.animation.Animation.INFINITE);
        view.startAnimation(anim);
        return view;

    }
}
