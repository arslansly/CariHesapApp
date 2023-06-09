package com.arslan.dnetcarihesapapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class NOTES {
    @JsonProperty("Meta")
    public Meta meta;
    public ArrayList<Item> items;
}
