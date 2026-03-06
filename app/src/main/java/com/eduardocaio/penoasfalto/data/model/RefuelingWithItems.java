package com.eduardocaio.penoasfalto.data.model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.ArrayList;

public class RefuelingWithItems {
    @Embedded
    private Refueling refueling;

    @Relation(
            parentColumn = "id",
            entityColumn = "refueling_id"
    )
    private ArrayList<RefuelingItem> items;

    public ArrayList<RefuelingItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<RefuelingItem> items) {
        this.items = items;
    }

    public Refueling getRefueling() {
        return refueling;
    }

    public void setRefueling(Refueling refueling) {
        this.refueling = refueling;
    }
}
