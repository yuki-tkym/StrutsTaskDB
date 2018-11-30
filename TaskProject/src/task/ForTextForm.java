package task;

import org.apache.struts.action.ActionForm;

public class ForTextForm extends ActionForm {
	private int id;
	private String text;

	public void setId(int id) {this.id = id;}
	public int getId() {return id;}

	public void setText(String text) {this.text = text;}
	public String getText() {return text;}
}
