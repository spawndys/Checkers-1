package com.example.Checkers.draw.util;

import java.util.TreeMap;

public class CheckersTreeMap<K, V> extends TreeMap<K, V> {

    private boolean contentUpdate;
    private boolean scoreUpdate;
    private boolean makeToast;

    public CheckersTreeMap() {
        this.contentUpdate = false;
        this.scoreUpdate = false;
        this.makeToast = false;
    }

    public boolean isContentUpdate() {
        return contentUpdate;
    }

    public void setContentUpdate(boolean contentUpdate) {
        this.contentUpdate = contentUpdate;
    }

    public boolean isScoreUpdate() {
        return scoreUpdate;
    }

    public void setScoreUpdate(boolean scoreUpdate) {
        this.scoreUpdate = scoreUpdate;
    }

    public boolean isMakeToast() {
        return makeToast;
    }

    public void setMakeToast(boolean makeToast) {
        this.makeToast = makeToast;
    }
}
