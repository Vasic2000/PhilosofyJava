package de_JSON;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect
public class Cat
{
    public String name;
    @JsonDeserialize(as = ArrayList.class, contentAs = Cat.class)
    public List<Cat> cats = new ArrayList<>();
    Cat() {
    }
}
