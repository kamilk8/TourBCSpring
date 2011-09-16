package tour.spring.bc.bo.impl;

public enum TourLength {
	BELOW_WEEK(0, 5, "tourlength.below_week"), 
	WEEK (6, 8, "tourlength.week"), 
	ABOVE_WEEK (9, 21, "tourlength.below_week"); 
	
	private final int min;
	private final int max;
	private final String label;
	
	private TourLength(int min, int max, String label) {
		this.min = min;
		this.max = max;
		this.label = label;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public String getLabel() {
		return label;
	}
}
