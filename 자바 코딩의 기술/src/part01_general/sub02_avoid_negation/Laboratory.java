package part01_general.sub02_avoid_negation;

import part01_general.*;

// 1.2 ���� ���ϱ�

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

// �ڵ带 ���� �� �Ϲ������� ���� ǥ���� �����ϱⰡ �� ����.

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
