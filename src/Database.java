import java.sql.*;
import javax.swing.*;
import java.awt.*;


public class Database {
    private Connection con;
	private Statement st;
	private ResultSet rs;
	private int flag = 0;
	public Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			st = con.createStatement();
			//System.out.println("Connected to DB");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void Login(String queryLogin, String userName, String pass) {
		try {
			rs = st.executeQuery(queryLogin);
			while (rs.next()) {
				String tableUserName = rs.getString(7);
				String tablePass = rs.getString(3);
				if (userName.equals(tableUserName) && pass.equals(tablePass)) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				JOptionPane.showMessageDialog(null, "Invalid paswword or username!!");
			}

			else {
				//JOptionPane.showMessageDialog(null, "Registration Not Completed");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	Connection c;
    Statement s;
    public void conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");    
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  

	public void Logi(String queryLogin, String userName, String pass) {
		try {
			rs = st.executeQuery(queryLogin);
			while (rs.next()) {
				String tableUserName = rs.getString(7);
				String tablePass = rs.getString(3);
				if (userName.equals(tableUserName) ) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				//JOptionPane.showMessageDialog(null, "Data not found!");
			}

			else {
				//JOptionPane.showMessageDialog(null, "Registration Not Completed");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	boolean LoginChk(String queryLogin, String userName, String pass) {
		try {
			rs = st.executeQuery(queryLogin);
			while (rs.next()) {
				String tableUserName = rs.getString(7);
				String tablePass = rs.getString(3);
				if (userName.equals(tableUserName) && pass.equals(tablePass)) {
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}
	}

	boolean STChk(String queryLogin, String uniID, String pass) {
		try {
			rs = st.executeQuery(queryLogin);
			while (rs.next()) {
				String tableUserName = rs.getString(7);
				String tablePass = rs.getString(3);
				if (uniID.equals(tableUserName)) {
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}
	}

	boolean ForgetChk(String queryLogin, String userName, String pass) {
		try {
			rs = st.executeQuery(queryLogin);
			while (rs.next()) {
				String tableUserName = rs.getString(7);
				String tablePass = rs.getString(3);
				if (userName.equals(tableUserName)) {
					//System.out.println(tableUserName);
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}
	}

	public void insertRegister(String insertQuesry) {
		try {
			st.executeUpdate(insertQuesry);
			JOptionPane.showMessageDialog(null, "You have successfully registered!");
		}
		catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Registration Not Completed");
		}

	}
	public void insertRegister1(String insertQuesry) {
		try {
			st.executeUpdate(insertQuesry);
			//JOptionPane.showMessageDialog(null, "You have successfully registered!");
		}

		catch (Exception e) {

			//JOptionPane.showMessageDialog(null, "Registration Not Completed");
		}

	}

	public void Login1(String queryLogin, String userName, String pass) {
		try {

			rs = st.executeQuery(queryLogin);
			String x;
			while (rs.next()) {
				String tableUserName = rs.getString(7);
				String tablePass = rs.getString(3);

				if (userName.equals(tableUserName) && pass.equals(tablePass)) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				JOptionPane.showMessageDialog(null, "Data Not Found");
			}

			else {
				JOptionPane.showMessageDialog(null, "Password is: aa ");
				//JOptionPane.showMessageDialog (null, x, "Title", JOptionPane.INFORMATION_MESSAGE);
			}
			//System.out.println(x);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	public void admissionRegister(String insertQuesry) {
		try {
			st.executeUpdate(insertQuesry);
			JOptionPane.showMessageDialog(null, "Details Inserted Successfully");
		}

		catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Process Not Completed. Internal error");
		}

	}

    
}
