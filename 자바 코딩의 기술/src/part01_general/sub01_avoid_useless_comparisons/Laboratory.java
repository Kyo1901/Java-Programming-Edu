package part01_general.sub01_avoid_useless_comparisons;

import part01_general.*;

// 1.1 쓸모없는 비교 피하기

/*
public class Laboratory {
	Microscope microscope;
	
	Result analyze(Sample sample) {
		if(microscope.isInorganic(sample) == true) {
			return Result.INORGANIC;
		}else {
			return analyzeOrganic(sample);
		}
	}
	
	private Result analyzeOrganic(Sample sample) {
		if(microscope.isHumanoid(sample) == false) {
			return Result.ALIEN;
		}else {
			return Result.HUMANOID;
		}
	}
}
*/

//boolean 반환 값과 boolean 리터럴 타입을 
//명시적으로 비교하는 안티 패턴(anti-pattern)
//boolean 아닌 다른 데이터 타입인 경우에는
//실제 값과 비교해야하지만 boolean 변수나 반환 타입은
//그럴 필요가 없다.

// solution
public class Laboratory {
	Microscope microscope;
	
	Result analyze(Sample sample) {
		//if(microscope.isInorganic(sample) == true) {
		if(microscope.isInorganic(sample)) {
			return Result.INORGANIC;
		}else {
			return analyzeOrganic(sample);
		}
	}
	
	private Result analyzeOrganic(Sample sample) {
		//if(microscope.isHumanoid(sample) == false) {
		if(!microscope.isHumanoid(sample)) {
			return Result.ALIEN;
		}else {
			return Result.HUMANOID;
		}
	}
}
