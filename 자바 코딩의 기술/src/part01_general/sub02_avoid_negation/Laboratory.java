package part01_general.sub02_avoid_negation;

import part01_general.*;

// 1.2 부정 피하기

/*
public class Laboratory {
	Microscope microscope;
	
	Result analyze(Sample sample) {
		if(microscope.isInorganic(sample)) {
			return Result.INORGANIC;
		}else {
			return analyzeOrganic(sample);
		}
	}
	
	private Result analyzeOrganic(Sample sample) {
		if(!microscope.isHumanoid(sample)) {
			return Result.ALIEN;
		}else {
			return Result.HUMANOID;
		}
	}
}
*/

// 코드를 읽을 때 일반적으로 긍정 표현을 이해하기가 더 쉽다.

// solution
public class Laboratory {
	Microscope microscope;
	
	Result analyze(Sample sample) {
		if(microscope.isInorganic(sample)) {
			return Result.INORGANIC;
		}else {
			return analyzeOrganic(sample);
		}
	}
	
	private Result analyzeOrganic(Sample sample) {
		// if(!microscope.isHumanoid(sample)) {
		if(microscope.isHumanoid(sample)) {
			//return Result.ALIEN;
			return Result.HUMANOID;
		}else {
			//return Result.HUMANOID;
			return Result.ALIEN;
		}
	}
}
