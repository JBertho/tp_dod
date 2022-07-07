package grx.dod.demo.tp.types.generiques;

import grx.dod.demo.tp.types.TypeScenario;
import grx.dod.demo.tp.types.objects.Forme;

import java.util.List;
import java.util.stream.Collectors;

public class ScenarioGenerique implements TypeScenario<FormeGenerique> {

    List<FormeGenerique> generiques;
    private final ConverterFormeToGeneric converter = new ConverterFormeToGeneric();

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
        this.generiques = formes.stream().map(converter::apply).collect(Collectors.toList());
    }
}
