package com.example.piano;

import android.graphics.RectF;

public class Key {
    public int sound;
    public RectF rect;
    public boolean down;

    public Key(int sound, RectF rect) {
        this.sound = sound;
        this.rect = rect;
    }
}
