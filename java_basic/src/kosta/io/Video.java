package kosta.io;

import java.io.Serializable;

public class Video implements Serializable{
	private String videoNumber;
	private String title;
	private String actor;

	public Video() {
	}// default 생성자는 항상 습관적으로 만들자

	public Video(String videoNumber, String title, String actor) {
		super();
		this.videoNumber = videoNumber;
		this.title = title;
		this.actor = actor;
	}

	public String getVideoNumber() {
		return videoNumber;
	}

	public void setVideoNumber(String videoNumber) {
		this.videoNumber = videoNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Video [videoNumber=" + videoNumber + ", title=" + title + ", actor=" + actor + "]";
	}

	

}
