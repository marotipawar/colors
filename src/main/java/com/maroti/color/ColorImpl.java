package com.maroti.color;
/*
* @Author Maroti Pawar
*
* */
public class ColorImpl implements Color {

    @Override
    public String getColorHex(Name color) {
        return color.getHexCode();
    }

    @Override
    public Name getColorName(String rgbColor) {
        if(rgbColor!=null){
            String[] splitColor=rgbColor.replace("rgba(", " ").replace(")", " ").split(",");
            int red=Integer.parseInt(splitColor[0].trim());
            int green=Integer.parseInt(splitColor[1].trim());
            int blue=Integer.parseInt(splitColor[2].trim());
            String fullHexCode = String.format("#%02x%02x%02x", red, green, blue).toUpperCase();
            String shortHexCode=fullHexCode.substring(0, 5).toUpperCase();
            Name[] colors= Name.values();
            for(Name color : colors){
                String shortHex = color.getHexCode().substring(0,4);

                if (color.getHexCode().equals(fullHexCode)){

                    return color;
                }
            }
        }
        return Name.COLOR_NOT_FOUND;
    }
}
