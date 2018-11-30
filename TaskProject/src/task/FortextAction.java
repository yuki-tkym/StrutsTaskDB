package task;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



public class FortextAction extends Action {
	public ActionForward execute(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) {

		// formキャストしてアクションフォームbeanのオブジェクト取得
		ForTextForm ftf = (ForTextForm)form;

		String text = ftf.getText();
		request.setAttribute("text",text);

		return (mapping.findForward("confirm"));
	}
}
