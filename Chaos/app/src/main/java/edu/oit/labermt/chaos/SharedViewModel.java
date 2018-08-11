package edu.oit.labermt.chaos;

import android.arch.lifecycle.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    public static class UIData {
        private int vertices = 42;
        private float percent = .5f;
        public int getVertices()
        {
            return vertices;
        }
        public void setVertices(final int value)
        {
            vertices = value;
        }
        public float getPercent()
        {
            return percent;
        }
        public void setPercent(final float value)
        {
            percent = value;
        }
    }
    public MutableLiveData<UIData> uiDataLiveData_ = new MutableLiveData<>();
}