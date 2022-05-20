package freak.module.fitness.pointset;

import freak.core.control.ScheduleInterface;
import freak.core.fitness.SingleObjectiveFitnessFunction;

public abstract class AbstractSingleObjectiveRobustRegressionFitness extends AbstractRobustRegressionFitness  implements SingleObjectiveFitnessFunction {

	public AbstractSingleObjectiveRobustRegressionFitness(
			ScheduleInterface schedule) {
		super(schedule);
		// TODO Auto-generated constructor stub
	}

	public double getOptimalFitnessValue() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public double getLowerBound() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public double getUpperBound() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public int compareIndividuals(freak.core.population.Individual ind1, freak.core.population.Individual ind2) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

}
