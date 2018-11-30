package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bean.DataBean;

public class RegTextAction extends Action{

	String text;


	public ActionForward execute(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) {

		// formキャストしてアクションフォームbeanのオブジェクト取得
		RegTextForm ftf = (RegTextForm)form;

		text = ftf.getText();
		request.setAttribute("text",text);

		setDB(request);
		getDB(request);



		return (mapping.findForward("thx"));
	}


	private void getDB(HttpServletRequest request) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 接続確立
			String path = "jdbc:oracle:thin:@localhost:1521:orcl";  //接続パス
			String id = "taka";
			String pw = "password";
			Connection con1 =  DriverManager.getConnection(path, id, pw);

			// SQL作成
			String sql1 = "select id,text from inputtable";
			Statement stmt1 = con1.createStatement();
			ResultSet rs1 = stmt1.executeQuery(sql1);

			// DataBeanのリスト化
			ArrayList<DataBean> list = new ArrayList<DataBean>();

			// クエリをDataBeanに格納
			while(rs1.next()) {
				list.add(new DataBean(rs1.getString("id"),rs1.getString("text")));
			}

			// リクエストパラメータにセット
			request.setAttribute("dbdata",list);

			rs1.close();
			stmt1.close();
			con1.close();

		} catch ( Exception e) {
			e.printStackTrace();
		} finally {

		}
	}

	private void setDB(HttpServletRequest request) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 接続確立
			String path = "jdbc:oracle:thin:@localhost:1521:orcl";  //接続パス
			String id = "taka";
			String pw = "password";
			Connection con2 =  DriverManager.getConnection(path, id, pw);

			// SQL作成
			String sql2 = "insert into inputtable(text) values('" + text + "')";
			Statement stmt2 = con2.createStatement();
			ResultSet rs2 = stmt2.executeQuery(sql2);

			rs2.close();
			stmt2.close();
			con2.close();


		} catch ( Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
