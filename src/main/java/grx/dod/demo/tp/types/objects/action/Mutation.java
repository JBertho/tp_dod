package grx.dod.demo.tp.types.objects.action;

import grx.dod.demo.tp.types.objects.model.Forme;
import grx.dod.demo.tp.types.objects.Pipeline;

import java.util.List;
import java.util.stream.Collectors;

public class Mutation implements Pipeline<Forme> {

	// Transforme : Cercle => Rectangle
	
	Conversion conversion;
	
	public Mutation(Conversion conversion) {
		this.conversion = conversion;
	}
	
	@Override
	public List<Forme> output(List<Forme> input) {
		if (conversion!=null) {
			return input.stream().map(conversion)
			.collect(Collectors.toList());
		} else {
			return input;
		}
	}

}
