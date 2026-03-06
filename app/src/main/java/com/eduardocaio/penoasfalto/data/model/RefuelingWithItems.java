package com.eduardocaio.penoasfalto.data.model;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.ArrayList;

public class RefuelingWithItems {
    @Embedded
    public Refueling refueling;

    @Relation(
            parentColumn = "id",
            entityColumn = "refueling_id"
    )
    public ArrayList<RefuelingItem> items;
}
