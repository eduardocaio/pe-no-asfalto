package com.eduardocaio.penoasfalto.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;

@Entity(tableName = "refueling")
public class Refueling {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "refuel_date_time")
    private long refuelDateTime;

    @ColumnInfo(name = "odometer_at_reserve")
    private int odometerAtReserve;

    @ColumnInfo(name = "amount_paid")
    private BigDecimal amountPaid;

    @ColumnInfo(name = "total_liters")
    private BigDecimal totalLiters;

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOdometerAtReserve() {
        return odometerAtReserve;
    }

    public void setOdometerAtReserve(int odometerAtReserve) {
        this.odometerAtReserve = odometerAtReserve;
    }

    public long getRefuelDateTime() {
        return refuelDateTime;
    }

    public void setRefuelDateTime(long refuelDateTime) {
        this.refuelDateTime = refuelDateTime;
    }

    public BigDecimal getTotalLiters() {
        return totalLiters;
    }

    public void setTotalLiters(BigDecimal totalLiters) {
        this.totalLiters = totalLiters;
    }
}
