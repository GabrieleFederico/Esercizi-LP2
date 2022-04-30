package Accumulator;

import java.util.ArrayList;
import java.util.List;

public class Accumulator<T extends Number> {
	
	private List<T> positives = new ArrayList<>();
	private List<T> negatives = new ArrayList<>();
	
	public void add(T number) {
		if(number.doubleValue() >= 0)
			positives.add(number);
		else
			negatives.add(number);
		
	}
	
	public List<? extends T> negatives() {
		return negatives;
	}
	
	public List<? extends T> positives() {
		return positives;
	}
	
	public double sum() {
		double sum = 0;
		for(T value : positives)
			sum += value.doubleValue();
		for(T value : negatives)
			sum += value.doubleValue();
		return sum;
	}
}
