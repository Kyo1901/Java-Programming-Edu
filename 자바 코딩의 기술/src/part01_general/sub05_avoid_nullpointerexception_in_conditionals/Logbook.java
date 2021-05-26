package part01_general.sub05_avoid_nullpointerexception_in_conditionals;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Collections;

// 1.5 조건문에서 NullPointerException 피하기

//public class Logbook {
//	void writeMessage(String message, Path location) throws IOException {
//		if(Files.isDirectory(location)) {
//			throw new IllegalArgumentException("The path is invalid!");
//		}
//		if(message.trim().equals("") || message==null) {
//			throw new IllegalArgumentException("The message is invalid!");
//		}
//		String entry = LocalDate.now() + ": "+message;
//		
//		Files.write(location,Collections.singletonList(entry), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//		
//	}
//}

// line.15 : null 검사가 없으며, 예외 발생 시 별다른 설명이 없음.
// line.18 : message 의 null 검사보다 메서드를 통한 값을 먼저 검사함.
//		   : null 인 경우 예외 발생

// 인수 검사할 때는 
//  1. null 검사
//  2. 빈 문자열 또는 빈 리스트 검사
//  3. 그 외 조건 검사
public class Logbook {
	void writeMessage(String message, Path location) throws IOException {
		if(message==null || message.trim().equals("")) {
			throw new IllegalArgumentException("The message is invalid!");
		}
		if(location == null || Files.isDirectory(location)) {
			throw new IllegalArgumentException("The path is invalid!");
		}
		String entry = LocalDate.now() + ": "+message;
		Files.write(location,Collections.singletonList(entry), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	}
}

















