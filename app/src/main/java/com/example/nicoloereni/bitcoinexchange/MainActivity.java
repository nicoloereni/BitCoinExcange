package com.example.nicoloereni.bitcoinexchange;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nicoloereni.bitcoinexchange.module.ValueExchangeFactoryModule;

import java.util.ArrayList;
import java.util.List;

import static com.example.nicoloereni.bitcoinexchange.R.layout.list_item;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO
        // restituisce una lista contenente le info sui bitcoin e l'oro trovate qui: "http://coinabul.com/api.php"
        // prima lista contiene oro e bitcoin in dollare
        // tap vai a una seconda lista e vedi il resto

        final ListView listView = (ListView) findViewById(R.id.exchange_list);

        AsyncTask asyncTask = new AsyncTask() {
            @Override
            protected ArrayList doInBackground(Object[] params) {

                ValueExchangeFactory valueExchangeFactory = new ValueExchangeFactory(new HttpRequest(ValueExchangeFactoryModule.URL_BITCOIN_INFO));
                ArrayList<ValueExchangeModel> values = valueExchangeFactory.all();

                ArrayList result = new ArrayList();

                for(ValueExchangeModel value : values){
                    result.add(value.symbol);
                }
                return result;
            }

            @Override
            protected void onPostExecute(Object o) {
                super.onPostExecute(o);
                listView.setAdapter(new ArrayAdapter(MainActivity.this, list_item, R.id.textViewList, (List)o));
            }
        };

        asyncTask.execute();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
