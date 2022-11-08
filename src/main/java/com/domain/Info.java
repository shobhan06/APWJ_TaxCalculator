package com.domain;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Info {



    private int BSal;
    private int hrent;
    private int CAllowance;
    private int MAllowance;
    private int extra;


    public int getBSal() {
        return BSal;
    }

    public void setBSal(int BSal) {
        this.BSal = BSal;
    }

    public int getHrent() {
        return hrent;
    }

    public void setHrent(int hrent) {
        this.hrent = hrent;
    }

    public int getCAllowance() {
        return CAllowance;
    }

    public void setCAllowance(int CAllowance) {
        this.CAllowance = CAllowance;
    }

    public int getMAllowance() {
        return MAllowance;
    }

    public void setMAllowance(int MAllowance) {
        this.MAllowance = MAllowance;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }
}
