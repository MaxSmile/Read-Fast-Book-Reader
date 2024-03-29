package com.vasilkoff.readfast.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.graphics.Color;
import android.util.AttributeSet;

import com.github.axet.androidlibrary.widgets.ThemeUtils;
import com.vasilkoff.readfast.R;

@Keep
public class ToolbarRTLView extends ToolbarButtonView {
    public ToolbarRTLView(@NonNull Context context) {
        super(context);
    }

    public ToolbarRTLView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ToolbarRTLView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public ToolbarRTLView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void create() {
        super.create();
        image.setClickable(false);
        image.setFocusable(false);
        image.setImageResource(R.drawable.ic_gesture_black_24dp);
        image.setColorFilter(ThemeUtils.getColor(getContext(), Color.WHITE));
        image.setBackgroundDrawable(null);
        text.setText("RTL");
    }
}
