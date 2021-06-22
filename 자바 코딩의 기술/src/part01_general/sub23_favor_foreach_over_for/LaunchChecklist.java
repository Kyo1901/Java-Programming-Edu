package part01_general.sub23_favor_foreach_over_for;

import java.util.Arrays;
import java.util.List;

// 2.3 For 루프 대신 For-Each

/*
public class LaunchChecklist {
	List<String> checks = Arrays.asList("Cabin Pressure", "Communication", "Engine");
	
	Status prepareForTakeoff(Commander commander) {
		for(int i = 0; i < checks.size(); i++) {
			boolean shouldAbortTakeoff = commander.isFailing(checks.get(i));
			
			if(shouldAbortTakeoff) {
				return Status.ABORT_TAKE_OFF;
			}
			
		}
		
		return Status.READY_FOR_TAKE_OFF;
	}
}
*/

// 위 코드는 흔히 배우는 for 루프를 이용한 순회 방법이다.
// 인덱스 변수 i 를 통해서 checks를 순회하는 코드이며
// 이 순회 방법은 인덱스 i 를 바로 사용할 수 있다는 장점이 있지만
// 위 코드는 원소에 접근할 때 말고는 사용되지 않는다.

//---------------------------------------------------
//  인덱스 변수가 제공하는 정보를 자세히 알아야 할 경우는 드물다.
//  이럴 때는 반복문을 다르게 작성해야한다.
//  세부 순회 내용은 보호할 수 없지만 적어도 프로그래머에게는 숨기는 식으로
//  작성해야한다.
//      - 아직 이해 불가 문구 - 
//---------------------------------------------------


// For-Each 를 사용함으로써 반복 인덱스를 사용하지 않아도 되며
// 배열과 Set 처럼 인덱싱이 되지 않는 컬렉션에도 동작한다.
// 인덱스로 순회하는 방식은 기본적으로 잘 사용되지 않는다.
// 컬렉션의 특정 부분만 순회하거나 명시적으로 다른 목적을 위해
// 인덱스가 필요할 때가 아니라면 인덱스 순회 방식은 사용되지 않는다.
public class LaunchChecklist {
	List<String> checks = Arrays.asList("Cabin Pressure", "Communication", "Engine");
	
	Status prepareForTakeoff(Commander commander) {
		// checks 내 각 check에 대해 블록의 코드를 수행
		// 매 반복 마다 리스트에서 새로운 객체를 가져와 check에 할당
		for(String check : checks) {
			boolean shouldAbortTakeoff = commander.isFailing(check);
			
			if(shouldAbortTakeoff) {
				return Status.ABORT_TAKE_OFF;
			}
			
		}
		
		return Status.READY_FOR_TAKE_OFF;
	}
}
