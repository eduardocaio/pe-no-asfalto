package com.eduardocaio.penoasfalto.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;

@Entity(tableName = "refueling")
public class Refueling {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "refuel_date_time")
    public long refuelDateTime;

    @ColumnInfo(name = "odometer_at_reserve")
    public int odometerAtReserve;

    @ColumnInfo(name = "amount_paid")
    public BigDecimal amountPaid;

}
