package Chapter6;

public abstract class SpeedMeter {
	//ת��
	private double turnRate;
	public SpeedMeter() {
		
	}
	public abstract double getRadius();
	public void setTurnRate(double turnRate) {
		
		this.turnRate = turnRate;
		
	}
	//��������ٶȵ�ͨ�÷���
	public double getSpeed() {
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
	
}
