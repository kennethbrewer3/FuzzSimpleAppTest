package net.kbb3.codingtests.fuzzsimpleapptest.domain;

import com.google.gson.annotations.SerializedName;

/**
 * The Element defined by the JSon at
 * http://quizzes.fuzzstaging.com/quizzes/mobile/1/data.json
 *
 * Created by Kenneth Brewer on 4/29/2015.
 */
public class Element {
    private String id;
    private Type type;
    private String date;
    private String data;

    private Element(){}

    public Element(String id, Type type, String date, String data) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Element element = (Element) o;

        if (id != element.id) return false;
        if (!data.equals(element.data)) return false;
        if (!date.equals(element.date)) return false;
        if (type != element.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + data.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Element{");
        sb.append("id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", date='").append(date).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public enum Type {
        @SerializedName("text") TEXT,
        @SerializedName("image") IMAGE,
        UNKNOWN //A default value in case an unknown type is returned
                // to prevent a null pointer exception
    }
}
