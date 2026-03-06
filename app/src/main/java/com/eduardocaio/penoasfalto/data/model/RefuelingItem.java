package com.eduardocaio.penoasfalto.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.math.BigDecimal;

@Entity(tableName = "refueling_item",
        foreignKeys = @ForeignKey(
                entity = Refueling.class,
                parentColumns = "id",
                childColumns = "refueling_id",
                onDelete = ForeignKey.CASCADE
        ),
        indices = {@Index("refueling_id")}
)
public class RefuelingItem {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "refueling_id")
    private int refuelingId;

    @ColumnInfo(name = "fuel_type")
    private String fuelType;

    @ColumnInfo(name = "price_per_liter")
    private BigDecimal pricePerLiter;

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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(BigDecimal pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public int getRefuelingId() {
        return refuelingId;
    }

    public void setRefuelingId(int refuelingId) {
        this.refuelingId = refuelingId;
    }

    public BigDecimal getTotalLiters() {
        return totalLiters;
    }

    public void setTotalLiters(BigDecimal totalLiters) {
        this.totalLiters = totalLiters;
    }
}
