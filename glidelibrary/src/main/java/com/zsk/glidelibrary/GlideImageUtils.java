package com.zsk.glidelibrary;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;

public class GlideImageUtils extends AppGlideModule {
    private static int sCommonPlaceholder = R.mipmap.ic_launcher;
    private static int sRoundPlaceholder;
    public static void setRoundPlaceholder(int roundPlaceholder) {
        sRoundPlaceholder = roundPlaceholder;
    }

    public static void setCommonPlaceholder(int commonPlaceholder) {
        sCommonPlaceholder = commonPlaceholder;
    }
    public GlideImageUtils(){

    }
    /**
     * 加载普通图形
     * @param obj
     * @param iv
     */
    public static void loadNoCenterCropImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(sCommonPlaceholder)
                .error(sRoundPlaceholder)
                .priority(Priority.HIGH);
        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }
    /**
     * 加载普通图形
     * @param obj
     * @param iv
     */
    public static void loadImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .error(sCommonPlaceholder)
                .priority(Priority.HIGH);
        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }
    /**
     * 加载普通图形
     * @param obj
     * @param iv
     */
    public static void loadHighImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(sCommonPlaceholder)
                .error(sRoundPlaceholder)
                .priority(Priority.HIGH);
        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }
    /**
     * 加载普通图形
     * @param obj
     * @param iv
     */
    public static void loadNormalImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(sCommonPlaceholder)
                .error(sCommonPlaceholder)
                .priority(Priority.NORMAL);

        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }
    /**
     * 加载普通图形
     * @param obj
     * @param iv
     */
    public static void loadNormalFixImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .dontAnimate()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.NORMAL);

        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }
    /**
     * 加载普通图形
     *
     * @param obj
     * @param iv
     */
    public static void loadLookBigImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .dontAnimate()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.NORMAL);

        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }

    /**
     * 加载普通图形
     * @param obj
     * @param iv
     */
    public static void loadLowImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(sCommonPlaceholder)
                .error(sCommonPlaceholder)
                .priority(Priority.LOW);

        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }
    /**
     * 加载普通图形
     * @param obj
     * @param iv
     */
    public static void loadFixyLowImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(sCommonPlaceholder)
                .error(sRoundPlaceholder)
                .priority(Priority.LOW);

        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }

    /**
     * 加载圆形图
     * @param obj
     * @param iv
     */
    public static void loadRoundImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(sRoundPlaceholder)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.HIGH)
                .transform(new GlideRoundImage());
        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);

    }

    /**
     * 加载圆形图
     * @param obj
     * @param iv
     */
    public static void loadRoundLowImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(sRoundPlaceholder)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.LOW)
                .transform(new GlideRoundImage());
        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }
    /**
     * 加载圆形图
     * @param obj
     * @param iv
     */
    public static void loadRoundNormalImg(Object obj, ImageView iv) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(sRoundPlaceholder)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.NORMAL)
                .transform(new GlideRoundImage());
        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);

    }
    /**
     * 加载带圆角的圆形图
     * @param obj
     * @param iv
     */
    public static void loadCircleRadImg(Object obj, ImageView iv, int radius) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(sCommonPlaceholder)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.HIGH)
                .transform(new GlideCircleTransform(radius));
        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);

    }
    /**
     * 加载圆角图片左上角和右上角圆角
     * @param obj
     * @param iv
     */
    public static void loadCircleLiftRightRadImg(Context mContent, Object obj, ImageView iv,int radius) {
        CornerTransform transformation = new CornerTransform(mContent, 10);
        //只是绘制左上角和右上角圆角
        transformation.setExceptCorner(false, false, true, true);
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(sCommonPlaceholder)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.HIGH)
                .skipMemoryCache(true)
                .transform(transformation);
        Glide.with(mContent)
                .asBitmap()
                .load(obj)
                .apply(options)
                .into(iv);
    }

    /**
     * 加载带圆角的圆形图
     * @param obj
     * @param iv
     */
    public static void loadCircleRoundImg(Object obj, ImageView iv, int radius) {
        Context context = iv.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(sRoundPlaceholder)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.HIGH)
                .transform(new GlideRoundTransform(context, radius, Color.WHITE));
        Glide.with(context)
                .load(obj)
                .apply(options)
                .into(iv);
    }

    /**
     * 加载带圆角的圆形图
     * @param obj
     * @param iv
     */
    public static void loadCircleRoundImg(Activity activity, Object obj, ImageView iv, int radius) {
            RequestOptions options = new RequestOptions()
                    .placeholder(sRoundPlaceholder)
                    .error(R.mipmap.ic_launcher)
                    .priority(Priority.HIGH)
                    .transform(new GlideRoundTransform(activity, radius, Color.WHITE));
            Glide.with(activity)
                    .load(obj)
                    .apply(options)
                    .into(iv);
    }

    static {
        sCommonPlaceholder = R.mipmap.ic_launcher;
        sRoundPlaceholder = R.mipmap.ic_launcher_round;
    }
}
