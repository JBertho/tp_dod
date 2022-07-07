package grx.dod.demo.tp.types.generiques;

import grx.dod.demo.tp.Type;
import grx.dod.demo.tp.types.objects.Cercle;
import grx.dod.demo.tp.types.objects.Espace;
import grx.dod.demo.tp.types.objects.Forme;
import grx.dod.demo.tp.types.objects.Rectangle;

import java.util.HashMap;
import java.util.Map;

public class ConverterFormeToGeneric {

    public FormeGenerique apply(Forme forme) {
        if (forme!=null) {
            Type type = forme.getType();
            Map<String, Object> attributes = new HashMap<>();

            switch (type) {
                case CERCLE:
                    Cercle cercle = (Cercle)forme;

                    attributes.put("cx", cercle.getX());
                    attributes.put("cy", cercle.getY());
                    attributes.put("radius", cercle.getRayon());
                    attributes.put("color", cercle.getColor());
                    return new FormeGenerique(Type.CERCLE, attributes);

                case RECTANGLE:
                    Rectangle rect = (Rectangle)forme;

                    attributes.put("x", rect.getX());
                    attributes.put("y", rect.getY());
                    attributes.put("width", rect.getWidth());
                    attributes.put("height", rect.getHeight());
                    attributes.put("color", rect.getColor());
                    return new FormeGenerique(Type.RECTANGLE, attributes);

                case ESPACE:
                    Espace espace = (Espace)forme;

                    attributes.put("x", espace.getX());
                    attributes.put("y", espace.getY());
                    attributes.put("width", espace.getWidth());
                    attributes.put("height", espace.getHeight());
                    attributes.put("colors", espace.getColors());
                    return new FormeGenerique(Type.ESPACE, attributes);

                default:
                    // Type non supporté
                    return null;
            }
        } else {
            return null;
        }
    }

}
