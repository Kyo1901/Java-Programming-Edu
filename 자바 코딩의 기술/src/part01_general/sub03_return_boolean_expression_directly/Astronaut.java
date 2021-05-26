package part01_general.sub03_return_boolean_expression_directly;

// 1.3 boolean 표현식을 직접 반환

// 우주 비행사
/*
public class Astronaut {
	String name;
	int missions; // 화성 탐사 미션 수
	
	// 유효성 검사
	boolean isValid() {
		if(missions < 0 || name == null || name.trim().isEmpty()) {
			return false;
		}else {
			return true;
		}
			
	}
}
*/

// name : null 이면 안되며 빈 문자열이여서는 안된다.
// missions : 음수여서는 안된다.
// 코드에 기능상 오류는 없으나, 조건문의 조건식의 결과 값과
// 메서드의 반환 값이 같으므로 사실상 if 문이 쓸데없다.

// solution
public class Astronaut {
	String name;
	int missions; // 화성 탐사 미션 수
	
	// 유효성 검사
	boolean isValid() {
		//if(missions < 0 || name == null || name.trim().isEmpty()) {
		//	return false;
		//}else {
		//	return true;
		//}
		
		// return missions >= 0 && name != null && !name.trim().isEmpty();
		// 위 처럼 조건문이 복잡할 경우 분할하는 방법을 고려할 필요가 있다.
		
		boolean isValidMissions = missions >= 0;
		boolean isValidName = name != null && !name.trim().isEmpty();
		return isValidMissions && isValidName;
			
	}
}
