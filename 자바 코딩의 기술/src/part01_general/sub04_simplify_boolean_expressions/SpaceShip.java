package part01_general.sub04_simplify_boolean_expressions;

// 1.4 boolean 표현식 간소화
//
//public class SpaceShip {
//	Crew crew; // 승무원
//	FuelTank fuelTank; // 연료 저장소
//	Hull hull;	// 배의 선체
//	Navigator navigator; // 네비게이션
//	OxygenTank oxygenTank; // 산소 저장소
//	
//	public boolean willCrewSurvive() {
//		
//		return hull.holes == 0 &&
//				fuelTank.fuel >= navigator.requiredFuelToEarth() &&
//				oxygenTank.lastsFor(crew.size)> navigator.timeToEarth(); 
//	}
//}
//
// 다수의 조건문이 합쳐진 boolean 표현식은 이해하기 어렵고 잘못 이해하기 쉽다.
// 또한, 길이가 길다보니 일부를 변경해야 할 때 실수가 발생할 수 있다.
//  → 추상화 정도에 따른 그루핑하기

public class SpaceShip {
	Crew crew; // 승무원
	FuelTank fuelTank; // 연료 저장소
	Hull hull;	// 배의 선체
	Navigator navigator; // 네비게이션
	OxygenTank oxygenTank; // 산소 저장소
	
	public boolean willCrewSurvive() {
		// 자원(연료 + 공기)가 충분한가		
		boolean hasEnoughResource = hasEnoughFuel() && hasEnoughOxygen();
		
		return hull.isIntact() && hasEnoughResource;
	}
	
	// 연료가 충분한가
	private boolean hasEnoughFuel() {
		return fuelTank.fuel >= navigator.requiredFuelToEarth();
	}
	// 공기가 충분한가
	private boolean hasEnoughOxygen() {
		return oxygenTank.lastsFor(crew.size)> navigator.timeToEarth(); 
	}
}












