package com.arslan.dnetcarihesapapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root {
    @JsonProperty("Meta")
    public Meta meta;
    public int offset;
    public int count;
    public int limit;
    public First first;
    public Next next;
    public Previous previous;
    public ArrayList<Item> items;
}
