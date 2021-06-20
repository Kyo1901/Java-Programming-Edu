package part01_general.sub21_replace_magic_numbers_with_constant;

// 2.1 매직 넘버를 상수로 대체하기
//  매직 넘버 : 코드에서 옵션 집합을 표현할 때 종종 숫자 집합을 사용하게 된다.
//            : 표면상 의미가 없는 숫자이지만 프로그램의 동작을 제어하는 숫자

// 크루저 제어
// public class CruiseControl {
//     private double targetSpeedKmh;

//     // setPreset() 메서드를 정수와 함께 호출함으로써
//     // targetSpeedKmh 를 설정
//     void setPreset(int speedPreset) {
//         if(speedPreset == 2) {
//             setTargetSpeedKmh(16944);
//         }else if(speedPreset == 1) {
//             setTargetSpeedKmh(7667);
//         }else if(speedPreset == 0) {
//             setTargetSpeedKmh(0);
//         }
//     }

//     void setTargetSpeedKmh(double speed) {
//         targetSpeedKmh = speed;
//     }
// }

// 매직 넘버가 있으면 코드를 이해하기 어려워지고
// 오류가 발생하기도 쉬워진다.
// 컴파일러는 알지 못하는 수를 입력하지 못하도록
// 막을 방법이 없다.

// 위 코드는 setPreset() 메서드를 호출하려면
// 해당 메서드 배누에 대한 이해와 지식을 해야한다.
// 그렇지 않으면 올바르지 않은 값이 입력될 수 있다.

// 또한 speedPreset 과 대응하는 실제 targetSpeedKmh가 
// 임의적이기 때문에 CruiseControl 은 어떤 사전 속도 설정을
// 사용할 수있는지 알주지 않는다. 따라서 옵션을 외울 수 밖에 없다.


// 리터럴 부분을 없애며, 각 숫자마다 유의미하고 이해하기 쉬운 이름으로 작성.
// 코드에서 사용 가능한 사전 설정 옵션과 타깃 속도를 타나내는 상수를 추가.
// final 키워드로 통해 값이 바뀌지 않도록 한다.
public class CruiseControl {
    static final int STOP_PRESET = 0;
    static final int PLANETARY_SPEEN_PRESET = 1;
    static final int CRUISE_SPEED_PRESET = 2;

    static final double CRUISE_SPEED_KMH  = 16944;
    static final double PLANETARY_SPEED_KMH  = 7667;
    static final double STOP_SPEED_KMH  = 0;

    private double targetSpeedKmh;

    // setPreset() 메서드를 정수와 함께 호출함으로써
    // targetSpeedKmh 를 설정
    void setPreset(int speedPreset) {
        if(speedPreset == CRUISE_SPEED_PRESET) {
            setTargetSpeedKmh(CRUISE_SPEED_KMH);
        }else if(speedPreset == PLANETARY_SPEEN_PRESET) {
            setTargetSpeedKmh(PLANETARY_SPEED_KMH);
        }else if(speedPreset == STOP_PRESET) {
            setTargetSpeedKmh(STOP_SPEED_KMH);
        }
    }

    void setTargetSpeedKmh(double speed) {
        targetSpeedKmh = speed;
    }
}
