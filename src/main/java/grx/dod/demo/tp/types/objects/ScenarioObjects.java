package grx.dod.demo.tp.types.objects;

import grx.dod.demo.tp.types.TypeScenario;
import grx.dod.demo.tp.types.objects.model.Forme;

import java.util.List;

public class ScenarioObjects implements TypeScenario<Forme> {

    List<Forme> objects;

    @Override
    public long space() {
        return 0;
    }

    @Override
    public long pipeline() {
        return 0;
    }

    @Override
    public long multiThreads(int threadAmount) throws Exception {
        return 0;
    }

    @Override
    public void loadFormes(List<Forme> formes) {
        this.objects = formes;
    }
}
