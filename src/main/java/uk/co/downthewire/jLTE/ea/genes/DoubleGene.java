package uk.co.downthewire.jLTE.ea.genes;

import flanagan.math.PsRandom;

public class DoubleGene implements IGene<Double> {

	private double value;
	private final double maximum;
	private final double minimum;
	private final PsRandom random;

	public DoubleGene(PsRandom random, double min, double max, double value) {
		this.random = random;
		this.value = value;
		this.maximum = max;
		this.minimum = min;
	}

	public DoubleGene(PsRandom random, double min, double max) {
		this.random = random;
		this.maximum = max;
		this.minimum = min;
		this.value = 0;
		mutate();
	}

	@Override
	public void mutate() {
		this.value = random.nextDouble(minimum, maximum);
	}

	@Override
	public IGene<Double> clone() {
        return new DoubleGene(random, minimum, maximum, value);
	}

	@Override
	public String toString() {
		return "" + value;
	}

	@SuppressWarnings("boxing")
	@Override
	public Double getValue() {
		return value;
	}
}
