package part01_general.sub03_return_boolean_expression_directly;

// 1.3 boolean ǥ������ ���� ��ȯ

// ���� �����
/*
public class Astronaut {
	String name;
	int missions; // ȭ�� Ž�� �̼� ��
	
	// ��ȿ�� �˻�
	boolean isValid() {
		if(missions < 0 || name == null || name.trim().isEmpty()) {
			return false;
		}else {
			return true;
		}
			
	}
}
*/

// name : null �̸� �ȵǸ� �� ���ڿ��̿����� �ȵȴ�.
// missions : ���������� �ȵȴ�.
// �ڵ忡 ��ɻ� ������ ������, ���ǹ��� ���ǽ��� ��� ����
// �޼����� ��ȯ ���� �����Ƿ� ��ǻ� if ���� ��������.

// solution
public class Astronaut {
	String name;
	int missions; // ȭ�� Ž�� �̼� ��
	
	// ��ȿ�� �˻�
	boolean isValid() {
		//if(missions < 0 || name == null || name.trim().isEmpty()) {
		//	return false;
		//}else {
		//	return true;
		//}
		
		// return missions >= 0 && name != null && !name.trim().isEmpty();
		// �� ó�� ���ǹ��� ������ ��� �����ϴ� ����� ����� �ʿ䰡 �ִ�.
		
		boolean isValidMissions = missions >= 0;
		boolean isValidName = name != null && !name.trim().isEmpty();
		return isValidMissions && isValidName;
			
	}
}
