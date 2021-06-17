package part01_general.sub16_avoid_switch_fall_through;

import java.util.Objects;

import part01_general.CruiseControl;
import part01_general.User;

// 1.6 switch 실패 피하기
// 1.7 항상 괄호 사용하기

//public class BoardComputer {
//	CruiseControl cruiseControl;
//	
//	void authorize(User user) {
//		Objects.requireNonNull(user);
//		switch(user.getRank()) {
//		case UNKNOWN:
//			cruiseControl.logUnauthorizedAccessAttempt();
//		case ASTRONAUT:
//			cruiseControl.grantAccess(user);
//			break;
//		case COMMANDER:
//			cruiseControl.grantAccess(user);
//			cruiseControl.grantAdminAccess(user);
//			break;
//		}
//	}
//}

// switch 문은 break 문 또는 블록의 끝에 다다라야 실행을 멈춘다.
// break 문을 실수로 작성하지 않게되면, 버그를 발생하는 경우가 많다.
// 만약 의도적으로 break 문을 작성하지 않았다면, 주석을 남길 필요가 있다.

// 서로 다른 관심사는 서로 다른 코드 블록으로 나눠야한다.
//  → 코드의 가독성 증가
//  → switch 실패와 같은 우연한 버그 발생 가능성 저하
// switch 문은 서로 다른 관심사를 분리하기 힘드므로, 
// if 문으로 사용하는 방법을 이용 
// 이때, 코딩하지 않은 값을 명시적으로 처리하는 예비 분기(branch)가 항상 있어야한다.
//  → switch : default
//  → if : else	

// switch 문 → if 문으로 수정할 때
// 들여쓰기를 올바르게 하더라도 괄호를 잘 사용해야한다.
//  → 코드를 추가할 때 안정적으로 추가할 수 있다.
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

