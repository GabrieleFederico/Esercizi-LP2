package Cardinal;

public enum Cardinal {
	N, NNE, NE, ENE, E, ESE, SE, SSE, NNW, NW, WNW, W, WSW, SW, SSW,S;
	
	public boolean isOpposite(Cardinal opposite) {
		return (ordinal() + opposite.ordinal() + 1) == Cardinal.values().length;
	}
	
	public static Cardinal mix(Cardinal first, Cardinal second) {
		if(first.isOpposite(second)) throw new IllegalArgumentException();
		return Cardinal.values()[(first.ordinal() + second.ordinal()) / 2];
	}
}
