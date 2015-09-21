package com.example.nicoloereni.bitcoinexchange;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;

import com.example.nicoloereni.bitcoinexchange.MainActivity;
import com.example.nicoloereni.bitcoinexchange.R;

public class ActivityMainAcceptanceTest extends ActivityInstrumentationTestCase2<MainActivity>{

    public ActivityMainAcceptanceTest() {
        super(MainActivity.class);
    }

    private MainActivity mainActivity;
    private ListView listView;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
        listView = (ListView)mainActivity.findViewById(R.id.exchange_list);
    }

    public void testPreconditions() {
        assertNotNull("mainActivity is null", mainActivity);
        assertNotNull("listView is null", listView);
    }
}
