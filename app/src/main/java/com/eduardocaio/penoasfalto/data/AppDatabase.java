package com.eduardocaio.penoasfalto.data;

@Database(entities = {Refueling.class, RefuelingItem.class}, version = 1)
@TypeConverters(Converters.class)
public abstract class AppDatabase {
    private static AppDatabase database;

    public static synchronized AppDatabase getDatabase(Context context) {
        if (database == null) {
            database = Room.databaseBuilder(
                context.getApplicationContext(),
                AppDatabase.class,
                "penoasfalto_db"
            ).build();
        }
        return database;
    }
}
