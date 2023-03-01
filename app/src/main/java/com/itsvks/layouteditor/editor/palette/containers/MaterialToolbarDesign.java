package com.itsvks.layouteditor.editor.palette.containers;

import com.google.android.material.appbar.MaterialToolbar;
import android.content.Context;
import android.graphics.Canvas;
import com.itsvks.layouteditor.utils.Utils;

public class MaterialToolbarDesign extends MaterialToolbar {
  
  private boolean drawStrokeEnabled;

  public MaterialToolbarDesign(Context context) {
    super(context);
  }

  @Override
  protected void dispatchDraw(Canvas canvas) {
    super.dispatchDraw(canvas);

    if (drawStrokeEnabled) Utils.drawDashPathStroke(this, canvas);
  }

  public void setStrokeEnabled(boolean enabled) {
    drawStrokeEnabled = enabled;
    invalidate();
  }
}