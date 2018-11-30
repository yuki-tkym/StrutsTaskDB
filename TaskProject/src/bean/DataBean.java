package bean;

public class DataBean {

	private String id;
	private String text;

	public DataBean() {

	}

	public DataBean(String id, String text) {
		this.id = id;
		this.text = text;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getId() {
		return id;
	}

	public String getText() {
		return text;
	}
}
