package grx.dod.demo.tp.types;

import grx.dod.demo.tp.types.objects.model.Forme;

import java.util.List;

public interface TypeScenario<T> {
    long space();
    long pipeline();
    long multiThreads(int threadAmount) throws  Exception;

    void loadFormes(List<Forme> formes);

}
