package dto;

public class MemoDTO {

	private int no;
	private String content;
	private String writer;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public MemoDTO(int no, String content, String writer) {
		this.no = no;
		this.content = content;
		this.writer = writer;
	}
	public MemoDTO() {
		// TODO Auto-generated constructor stub
	}
}
