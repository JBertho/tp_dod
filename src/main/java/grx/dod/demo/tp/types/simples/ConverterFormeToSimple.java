package grx.dod.demo.tp.types.simples;

import grx.dod.demo.tp.Type;
import grx.dod.demo.tp.types.objects.model.Cercle;
import grx.dod.demo.tp.types.objects.model.Espace;
import grx.dod.demo.tp.types.objects.model.Forme;
import grx.dod.demo.tp.types.objects.model.Rectangle;

public class ConverterFormeToSimple {

    public FormeSimple apply(Forme forme) {
        if (forme!=null) {
            Type type = forme.getType();

            switch (type) {
                case CERCLE:
                    Cercle cercle = (Cercle)forme;

                    return new FormeSimple(cercle.getX(), cercle.getY(), cercle.getRayon(), cercle.getColor());

                case RECTANGLE:
                    Rectangle rect = (Rectangle)forme;

                    return new FormeSimple(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight(), rect.getColor());

                case ESPACE:
                    Espace espace = (Espace)forme;

                    return new FormeSimple(espace.getX(), espace.getY(), espace.getWidth(), espace.getHeight(), espace.getColors());

                default:
                    // Type non supporté
                    return null;
            }
        } else {
            return null;
        }
    }

}
