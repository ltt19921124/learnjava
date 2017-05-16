package Chapter6;

public abstract class SpeedMeter {
	//转速
	private double turnRate;
	public SpeedMeter() {
		
	}
	public abstract double getRadius();
	public void setTurnRate(double turnRate) {
		
		this.turnRate = turnRate;
		
	}
	//定义计算速度的通用方法
	public double getSpeed() {
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
	
}
