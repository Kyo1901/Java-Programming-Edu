package part01_general;

public interface User {
	boolean isUnknown();
	boolean isAstronaut();
	boolean isCommander();
	
	Rank getRank();
}
