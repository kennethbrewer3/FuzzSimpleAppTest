package net.kbb3.codingtests.fuzzsimpleapptest.net;

import java.io.IOException;


import java.util.ArrayList;
import java.util.Arrays;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;

import net.kbb3.codingtests.fuzzsimpleapptest.MainActivity;
import net.kbb3.codingtests.fuzzsimpleapptest.data.JsonConsumer;
import net.kbb3.codingtests.fuzzsimpleapptest.domain.Element;

/*
 Programmer:  Mike Saradeth
 */

public class JsonDownloader extends AsyncTask<String, Void, ArrayList<Element>> {

    /** Activity to access to UI **/
    private final MainActivity activity;
    /** Progress dialog to display the progress **/
    private ProgressDialog progDialog;
    /** ArrayList with the Data object **/
    private ArrayList<Element> alData = new ArrayList<Element>();


    public JsonDownloader(MainActivity activity, ArrayList<Element> alData) {
        this.activity = activity;
        this.alData = alData;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        // Create and display a progress dialog to inform the user about the
        // download
        String title = "Load Title and Name";
        String message = "Loading title and name  ...";
        progDialog = ProgressDialog.show(this.activity, title, message, true, false);

    }

    @Override
    protected ArrayList<Element> doInBackground(String... params) {
        //String urlString = "http://www.washingtonpost.com/wp-srv/simulation/simulation_test.json";
        String urlString = params[0];
        String jsonString;

        try {
            // Create HttpClient and make GET request to the given URL
            HttpClient httpclient = new DefaultHttpClient();
            HttpResponse httpResponse = httpclient.execute(new HttpGet(urlString));

            // If response not OK (Code 200)
            if (httpResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                Log.d("responseCode", "responseCode != HttpStatus.SC_OK "
                        + httpResponse.getStatusLine().getStatusCode());
                return alData;
            } else {
                // Get the result on a String to parse as JSON object
                jsonString = EntityUtils.toString(httpResponse.getEntity());
            }
        } catch (IOException ioException) {
            Log.d("ioException", "ioException EntityUtils.toString(httpResponse.getEntity() "
                    + ioException.toString());
            return alData;
        }


        // Parse JSON String and load array list
            Element[] elements = JsonConsumer.INSTANCE.consumeJSon(jsonString);
            alData.clear();
            alData.addAll(Arrays.asList(elements));

        return alData;
    }

    @Override
    protected void onPostExecute(ArrayList<Element> result) {
        progDialog.dismiss();

//        activity.updateUI();
    }

}
