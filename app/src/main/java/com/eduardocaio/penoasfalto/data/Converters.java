package com.eduardocaio.penoasfalto.data;

import androidx.room.TypeConverter;

import java.math.BigDecimal;

public class Converters {

    @TypeConverter
    public static BigDecimal fromString(String value) {
        return value == null || value.isEmpty() ? null : new BigDecimal(value);
    }

    @TypeConverter
    public static String bigDecimalToString(BigDecimal value) {
        return value == null ? null : value.toPlainString();
    }

}
