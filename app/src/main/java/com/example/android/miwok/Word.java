package com.example.android.miwok;

/**
 * Created by Arpit Bhal on 16-12-2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId){
        mMiwokTranslation= miwokTranslation;
        mDefaultTranslation= defaultTranslation;
        mAudioResourceId=audioResourceId;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResourceId){
        mMiwokTranslation= miwokTranslation;
        mDefaultTranslation= defaultTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() {return mImageResourceId;}

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){return mAudioResourceId;}

    @Override
    public String toString(){
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }



}
