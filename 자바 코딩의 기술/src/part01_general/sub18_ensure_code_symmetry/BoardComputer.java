package part01_general.sub18_ensure_code_symmetry;

import java.util.Objects;

import part01_general.CruiseControl;
import part01_general.User;

// 1.9 코드 대칭 이루기
//  조건 분기를 대칭적 방법으로 구조화하면
//  코드를 쉽게 이해하고 파악할 수 있다.
/*
public class BoardComputer {
	CruiseControl cruiseControl;
	
	void authorize(User user) {
		Objects.requireNonNull(user);
		if(user.isUnknown()) {
			cruiseControl.logUnauthorizedAccessAttempt();
		}else if(user.isAstronaut()) {
			cruiseControl.grantAccess(user);
		}else if(user.isCommander()) {
			cruiseControl.grantAccess(user);
			cruiseControl.grantAdminAccess(user);
		}
		
	}
}
*/

// 코드에 눈에 띄는 버그는 없었으나, 조건과 명령문이 이어진다.
// 이어진 조건과 명령어는 한 번에 읽고 이해해야하기 때문에
// 이해하기 어려울 수 있다.

// → 본질적인 문제 : 코드의 대칭성(code symmetry)
//     "거의 같은 것들은 똑같은 부분과 완전히 다른 부분으로 나눌 수 있다."
//		- 켄트 백(Kent Beck) -

// 권한을 부여하는 코드와 권한을 부여하지 않는 코드를 분리
public class BoardComputer {
	CruiseControl cruiseControl;
	
	void authorize(User user) {
		Objects.requireNonNull(user);
		
		// 접근을 거절하는 분기
		if(user.isUnknown()) {
			cruiseControl.logUnauthorizedAccessAttempt();
		}
		
		// 접근을 부여하는 분기
		if(user.isAstronaut()) {
			cruiseControl.grantAccess(user);
		}else if(user.isCommander()) {
			cruiseControl.grantAccess(user);
			cruiseControl.grantAdminAccess(user);
		}
	}
}