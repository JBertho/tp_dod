package grx.dod.demo.tp.types.simples;

import grx.dod.demo.tp.types.TypeScenario;
import grx.dod.demo.tp.types.objects.model.Forme;

import java.util.List;
import java.util.stream.Collectors;

public class ScenarioSimple implements TypeScenario<FormeSimple> {

    List<FormeSimple> simples;
    private final ConverterFormeToSimple converter = new ConverterFormeToSimple();

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
        this.simples = formes.stream().map(converter::apply).collect(Collectors.toList());
    }
}
