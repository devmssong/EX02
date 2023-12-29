import java.util.Scanner

// step1) 기능 정리
// 1. 키보드로 부터 입력 받는 기능
// 2. 짝수 여부를 판단하여 출력하는 기능

// step2) 각 기능별로 필요한 데이터, 발생되는 데이터, 입력되는 데이터 등을 정리
fun main() {
    val scanner = Scanner(System.`in`)

    // 1. 키보드로부터 숫자 입력 받기
    print("숫자를 입력하세요: ")
    val Input = scanner.nextInt()

    // 2. 입력 받은 숫자가 짝수인지 홀수인지 판단하여 출력
    if (Input % 2 == 0) {
        println("짝수입니다.")
    } else {
        println("홀수입니다.")
    }
}