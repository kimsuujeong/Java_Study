package ExceptionCustom;

// 사용자 정의 예외 클래스
// 내장 예외가 아닌 경우 사용.
// 응용 어플리케이션에서 발생하는 예외들
// ex ) 회원가입 실패시, 계좌의 잔고 부족 및 이체 실패 등.
public class Sujung_giyomi_Exception extends Exception{
	
	public Sujung_giyomi_Exception() {
		
	}
	public Sujung_giyomi_Exception(String message) {
		super(message);
	}
}
