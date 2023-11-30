package Oop_Review;

import java.time.LocalDateTime;

public class NoteEntitiy {

	private String title;
	private String content;
	private LocalDateTime last_update;

	public NoteEntitiy(String title, String content) {

		this.title = title;
		this.content = content;
		this.last_update = LocalDateTime.now();

	}

	// newIstance -> 정적 팩토리 메서드 형태.
	static NoteEntitiy newIstance(String title, String content) {
		return new NoteEntitiy(title, content );
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

//	public LocalDateTime getLast_update() {
//		return last_update;
//	}

	String getLast_update() {
		return last_update.toString();
	}

	public void setLast_update(LocalDateTime last_update) {
		this.last_update = last_update;
	}

}
