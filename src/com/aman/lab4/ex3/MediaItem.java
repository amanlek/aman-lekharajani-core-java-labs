package com.aman.lab4.ex3;

public abstract class MediaItem extends Item {

    private int runtime;

    public MediaItem(int idNumber,
            String title,
            int numCopies,
            int runtime) {

        super(idNumber, title, numCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", runtime=" + runtime;
    }
}