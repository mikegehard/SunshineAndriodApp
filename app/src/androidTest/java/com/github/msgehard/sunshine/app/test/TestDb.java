package com.github.msgehard.sunshine.app.test;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;
import com.github.msgehard.sunshine.app.data.WeatherDbHelper;

public class TestDb extends AndroidTestCase {
    public void testCreateDb() throws Throwable {
        mContext.deleteDatabase(WeatherDbHelper.DATABASE_NAME);
        SQLiteDatabase db = new WeatherDbHelper(
                this.mContext).getWritableDatabase();
        assertEquals(true, db.isOpen());
        db.close();
    }
}
