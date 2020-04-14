package splitTemporaryVariable;

/*
 * 在函数开始处修改临时变量名称,临时变量声明为final
 * 在第二次赋值之前对acc变量所有引用点,全部改成新的临时变量,
 * 最后在第二次赋值处重新声明acc变量
 */
public class Demo2 {
	int primaryForce = 10, mass = 11, delay = 13, secondaryForce = 20;

	public double getDistanceTravelled(int time) {
		double result;
		final double primaryAcc = primaryForce / mass;
		int primaryTime = Math.min(time, delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time - delay;
		if (secondaryTime > 0) {
			double primaryVel = primaryAcc * delay;
			final double secondaryAcc = (primaryForce + secondaryForce) / mass;
			result += primaryVel * secondaryTime + 0.5 * secondaryAcc
					* secondaryTime * secondaryTime;
		}
		return result;
	}
	/*	public double getDistanceTravelled(int time) {
			double result;
			final double primaryAcc = primaryForce / mass;
			int primaryTime = Math.min(time, delay);
			result = 0.5 * primaryAcc * primaryTime * primaryTime;
			int secondaryTime = time - delay;
			if (secondaryTime > 0) {
				double primaryVel = primaryAcc * delay;
				double acc = (primaryForce + secondaryForce) / mass;
				result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime
						* secondaryTime;
			}
			return result;
		}
	*/
	/*	public double getDistanceTravelled(int time) {
			double result;
			double acc = primaryForce / mass;
			int primaryTime = Math.min(time, delay);
			result = 0.5 * acc * primaryTime * primaryTime;
			int secondaryTime = time - delay;
			if (secondaryTime > 0) {
				double primaryVel = acc * delay;
				acc = (primaryForce + secondaryForce) / mass;
				result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime
						* secondaryTime;
			}
			return result;
		}
	*/
}
