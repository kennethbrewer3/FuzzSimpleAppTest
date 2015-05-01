package net.kbb3.codingtests.fuzzsimpleapptest.data;

import com.google.gson.Gson;

import net.kbb3.codingtests.fuzzsimpleapptest.domain.Element;

import java.io.Reader;

/**
 * Created by Kenneth Brewer on 4/29/2015.
 */
public enum JsonConsumer {
    INSTANCE;

    private Gson gson;

    private JsonConsumer(){gson = new Gson();}

    public Element[] consumeJSon(String source) {
        return gson.fromJson(source,Element[].class);
    }
    public Element[] consumeJSon(Reader source) {
        return gson.fromJson(source,Element[].class);
    }
}
