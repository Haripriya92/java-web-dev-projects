package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    private String musician;

    public CD(String musician,String producer) {
        this.musician = musician;
        this.producer=producer;
    }

    @Override
    public void spin() {

    }

    @Override
    public boolean store() {
        System.out.println("Disc producer"+producer);
        return false;
    }

    @Override
    public double write() {
        return 0;
    }

    @Override
    public boolean read() {
        return false;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
