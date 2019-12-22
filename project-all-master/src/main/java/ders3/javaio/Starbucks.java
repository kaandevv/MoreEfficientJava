package ders3.javaio;

import java.io.Serializable;
import java.util.Date;

public class Starbucks implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date openTime;
    private Date closeTime;

    public Starbucks(Date openTime, Date closeTime) {
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public Starbucks setAllObject(Date openTime, Date closeTime) {
        /*this.openTime=openTime;
        this.closeTime=closeTime;*/
        return new Starbucks(openTime, closeTime);
    }

    public Starbucks() {

    }

    @Override
    public String toString() {
        return "openTime:" + this.openTime.getTime();
    }
}
