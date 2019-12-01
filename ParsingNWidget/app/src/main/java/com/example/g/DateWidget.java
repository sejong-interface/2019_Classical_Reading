package com.example.g;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.RemoteViews;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Implementation of App Widget functionality.
 */
public class DateWidget extends AppWidgetProvider {

    public static Bitmap BuildUpdate(String txttime, int size, Context context){
        Paint paint = new Paint();
        paint.setTextSize(size);
        paint.setColor(Color. BLACK);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setSubpixelText(true);
        paint.setAntiAlias(true);
        float baseline = - paint.ascent();
        int width = (int) (paint.measureText(txttime)+0.5f);
        int height = (int) (baseline+paint.descent()+0.5f);
        Bitmap image = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(image);
        canvas.drawText(txttime,0,baseline,paint);
        return image;
    }

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText = context.getString(R.string.appwidget_text);
        // Construct the RemoteViews object
        //R.layout == xml 파일과 연결
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.date_widget);
        //현재 시간과 날짜를 계산해서 가져 와야 한다. 어떻게?
        String time = getDate("time");
        String day = getDate("day");
        //xml 파일에 있는 id와 연결
        views.setImageViewBitmap(R.id.imgtime, BuildUpdate(time, 250, context));
        views.setImageViewBitmap(R.id.imgdate, BuildUpdate(day, 100, context));

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }

    static private String getDate(String mode){
        SimpleDateFormat mFormat;
        if(mode == "day") {
            mFormat = new SimpleDateFormat("yyyy/MM/dd");
            long now = System.currentTimeMillis();
            Date date = new Date(now);
            return mFormat.format(date);
        } else if (mode == "time") {
            mFormat = new SimpleDateFormat("HH:mm");
            long now = System.currentTimeMillis();
            Date date = new Date(now);
            return mFormat.format(date);
        }
        return null;
    }
}
