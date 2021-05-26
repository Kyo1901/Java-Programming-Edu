package part01_general.sub01_avoid_useless_comparisons;

import part01_general.*;

// 1.1 ������� �� ���ϱ�

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

//boolean ��ȯ ���� boolean ���ͷ� Ÿ���� 
//��������� ���ϴ� ��Ƽ ����(anti-pattern)
//boolean �ƴ� �ٸ� ������ Ÿ���� ��쿡��
//���� ���� ���ؾ������� boolean ������ ��ȯ Ÿ����
//�׷� �ʿ䰡 ����.

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
