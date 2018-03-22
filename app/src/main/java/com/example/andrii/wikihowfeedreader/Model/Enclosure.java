package com.example.andrii.wikihowfeedreader.Model;

/**
 * Created by andrii on 3/18/18.
 */

public class Enclosure
{
    public String link;
    public String type;

    public Enclosure(String link, String type) {
        this.link = link;
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

