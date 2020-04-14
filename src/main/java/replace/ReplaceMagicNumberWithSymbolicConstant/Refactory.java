package replace.ReplaceMagicNumberWithSymbolicConstant;

/**
 * 以字面常亮取代魔法数
 * 
 * @author wangchao
 *
 */
public class Refactory {
	static final double GRAVITATIONAL_CONSTANT = 9.81;

	double potentialEnergy(double mass, double height) {
		return mass * GRAVITATIONAL_CONSTANT * height;
	}
}
