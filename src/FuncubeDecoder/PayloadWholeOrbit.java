package FuncubeDecoder;

import common.Spacecraft;
import telemetry.BitArrayLayout;
import telemetry.FramePart;

public class PayloadWholeOrbit extends FramePart {

	public static final int WOD_TYPE = 0;
	
	protected PayloadWholeOrbit(BitArrayLayout l) {
		super(l, WOD_TYPE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getStringValue(String name, Spacecraft fox) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double convertRawValue(String name, int rawValue, int conversion, Spacecraft fox) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
