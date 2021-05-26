package part01_general.sub04_simplify_boolean_expressions;

// 1.4 boolean ǥ���� ����ȭ
//
//public class SpaceShip {
//	Crew crew; // �¹���
//	FuelTank fuelTank; // ���� �����
//	Hull hull;	// ���� ��ü
//	Navigator navigator; // �׺���̼�
//	OxygenTank oxygenTank; // ��� �����
//	
//	public boolean willCrewSurvive() {
//		
//		return hull.holes == 0 &&
//				fuelTank.fuel >= navigator.requiredFuelToEarth() &&
//				oxygenTank.lastsFor(crew.size)> navigator.timeToEarth(); 
//	}
//}
//
// �ټ��� ���ǹ��� ������ boolean ǥ������ �����ϱ� ��ư� �߸� �����ϱ� ����.
// ����, ���̰� ��ٺ��� �Ϻθ� �����ؾ� �� �� �Ǽ��� �߻��� �� �ִ�.
//  �� �߻�ȭ ������ ���� �׷����ϱ�

public class SpaceShip {
	Crew crew; // �¹���
	FuelTank fuelTank; // ���� �����
	Hull hull;	// ���� ��ü
	Navigator navigator; // �׺���̼�
	OxygenTank oxygenTank; // ��� �����
	
	public boolean willCrewSurvive() {
		// �ڿ�(���� + ����)�� ����Ѱ�		
		boolean hasEnoughResource = hasEnoughFuel() && hasEnoughOxygen();
		
		return hull.isIntact() && hasEnoughResource;
	}
	
	// ���ᰡ ����Ѱ�
	private boolean hasEnoughFuel() {
		return fuelTank.fuel >= navigator.requiredFuelToEarth();
	}
	// ���Ⱑ ����Ѱ�
	private boolean hasEnoughOxygen() {
		return oxygenTank.lastsFor(crew.size)> navigator.timeToEarth(); 
	}
}












