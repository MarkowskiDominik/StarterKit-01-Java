package bowlingGameResultCalculator;

public interface Frame {

	public void addScore(Integer numberOfPins);
	
	public Integer getScore();

	public Boolean isDone();

	public Boolean isSpare();
	
	public Integer getFirstRoll();

	public Boolean isStrike();
	
	public Integer getStrikeBonusToPreviousFrame();
}
