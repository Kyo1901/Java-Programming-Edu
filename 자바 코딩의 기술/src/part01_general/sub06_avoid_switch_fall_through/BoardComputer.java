package part01_general.sub06_avoid_switch_fall_through;

import java.util.Objects;

import part01_general.CruiseControl;
import part01_general.User;

// 1.6 switch 실패 피하기
// 업데이트

public class BoardComputer {
	CruiseControl cruiseControl;
	
	void authorize(User user) {
		Objects.requireNonNull(user);
		switch(user.getRank()) {
		case UNKNOWN:
			cruiseControl.logUnauthorizedAccessAttempt();
		case ASTRONAUT:
			cruiseControl.grantAccess(user);
			break;
		case COMMANDER:
			cruiseControl.grantAccess(user);
			cruiseControl.grantAdminAccess(user);
			break;
		}
	}
}
