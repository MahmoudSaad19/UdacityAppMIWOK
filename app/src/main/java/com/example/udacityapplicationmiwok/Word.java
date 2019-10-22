package com.example.udacityapplicationmiwok;

class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId;

    private int audio;

    Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId, int audio) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.audio = audio;
    }

    int getAudioResourceId() {
        return audio;
    }
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId =0;
        audio = 0;
    }

    Word(String mDefaultTranslation, String mMiwokTranslation, int audio) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = 0;
        this.audio = audio;
    }

    /**
     * Get the default translation of the word.
     */
    String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    int getmImageResourceId() {
        return mImageResourceId;
    }
}
