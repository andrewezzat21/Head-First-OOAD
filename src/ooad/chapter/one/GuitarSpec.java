package ooad.chapter.one;

import java.util.Locale;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;


    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean compare(GuitarSpec guitarSpec){
        if(guitarSpec.getBuilder() != builder) return false;
        if(model != null && !model.equals("") && !model.equals(guitarSpec.getModel())) return false;
        if(guitarSpec.getType() != type) return false;
        if(guitarSpec.getBackWood() != backWood) return false;
        if(guitarSpec.getTopWood() != topWood) return false;
        if(guitarSpec.getNumStrings() != numStrings) return false;
        return true;
    }
}
