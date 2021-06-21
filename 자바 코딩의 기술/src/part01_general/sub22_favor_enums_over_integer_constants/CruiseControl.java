package part01_general.sub22_favor_enums_over_integer_constants;

import java.util.Objects;

// 2.2 정수 상수 대신 열거형


/*
public class CruiseControl {
	static final int STOP_PRESET = 0;
	static final int PLANETARY_SPEED_PRESET= 1;
	static final int CRUISE_SPEED_PRESET= 2;
	
	static final double STOP_SPEED_KMH = 0;
	static final double PLANETARY_SPEED_KMH = 0;
	static final double CRUISE_SPEED_KMH = 0;
	
	private double targetSpeedKmh;
	
	void setPreset(int speedPreset) {
		if(speedPreset == CRUISE_SPEED_PRESET) {
			setTargetSpeedKmh(CRUISE_SPEED_KMH);
		}else if(speedPreset == PLANETARY_SPEED_PRESET) {
			setTargetSpeedKmh(PLANETARY_SPEED_KMH);
		}else if(speedPreset == CRUISE_SPEED_PRESET) {
			setTargetSpeedKmh(CRUISE_SPEED_KMH);
		}
	}
	
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh = speed;
	}
}
*/

// 입력 매개변수인 speedPreset 은 아직 정수이며
// 어떠한 정수 값(음수 포함)이 전달 될 수 있다.
// 즉, 클래스내에 선언된 상수 값을 사용도록 강제할 수 없다.
// 조건문에 의해 유효하지 않은 값이 전달이 되었을 때
// 상태 변경이나 오류 반환 없이 메서드가 종료하기 때문에
// 충돌이 발생하지는 않지만, 이후 다른 문제를 발생시킬 수 있다.

// 이를 해결하기 위해 사용 가능한 옵션들을 모두 열거할 수 있는
// enum 타입을 사용한다.
// enum을 사용함으로써 유효하지 않은 정수 값이 setPreset() 메서드에
// 전달될 수 없도록 할 수 있다.



public class CruiseControl {
	enum SpeedPreset{
		STOP(0), PLANETARY_SPEED(7667), CRUISE_SPEED(16944);
		
		final double speedKmh;
		
		SpeedPreset(double speedKmh) {
			this.speedKmh = speedKmh;
		}
	}
	
	private double targetSpeedKmh;
	
	void setPreset(SpeedPreset speedPreset) {
		Objects.requireNonNull(speedPreset);
		
		setTargetSpeedKmh(speedPreset.speedKmh);
	}
	
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh = speed;
	}
}

