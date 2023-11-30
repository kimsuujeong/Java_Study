package SOLID;

// 어떤 사이트에서 유저의 정보와 그 유저가 진행했던 채팅 정보를 담는 클래스
// 이 클래스의 문제점 : 기능이 너무 많다 ( 하나의 클래스가 많은 책임을 가지고 있다.)
// 유저정보, 프로필, 채팅내용, 
class ChatProfile{
    private String userName;
    private int age;
    private String profileImage;
    private String chatRoomName;
    private String recentChatMessage;
    private int numberParticipants;
}
// ----------------------------------------------------
// SRP를 준수한 변환
// 추상클래스나 인터페이스를 통해 공통적인 필드와 메서드를 선언하고
// 해당 추상 클래스를 상속받아 각각의 클래스가 필요한대로 선언하고 사용.


abstract class User{
    private String name;
    private int age;
    abstract void enterChatRoom();
}

class ChatRoom extends User{

    private String chatRoomName;
    private String recentChatMessage;
    private int numberPaticipant;
	@Override
	void enterChatRoom() {
		// TODO Auto-generated method stub
		
	}
}

class Profile extends User{
    private String profile;

	@Override
	void enterChatRoom() {
		// TODO Auto-generated method stub
		
	}
}


public class SRPExam {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}