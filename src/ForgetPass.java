import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgetPass extends JFrame {
	public void swingAppLogic(int name) {
		name = name / 5646541;
		name = name * 5156161;
		name = name % 5646889;
		name = name * 1236541;
	}
	public ForgetPass() {
		super("Leading University");
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1250,800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
        
        Font labelFont=((new Font("sans-serif",Font.TYPE1_FONT,16)));
	    JPanel headerpanel=new JPanel();
	    //headerpanel.setBackground(new Color(93,130,250));
        headerpanel.setBounds(0, 0, 1250, 150);
        headerpanel.setBackground(new Color(69,90,100));
		
	    
	    JLabel headerTxt=new JLabel("Welcome to Leading University Portal");
		headerTxt.setFont((new Font("Segoe UI", Font.PLAIN, 30)));
		headerTxt.setForeground(Color.WHITE);
		JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));
		
		headerpanel.add(imgLabel);
		add(headerpanel);
		
		JPanel inputpanel3=new JPanel();
	    inputpanel3.setBackground(new Color(69,90,100));
        inputpanel3.setBounds(0, 150, 1250, 30);
		inputpanel3.setLayout(null);
		add(inputpanel3);

		JButton Homebtn=new JButton("Home");
	    Homebtn.setBounds(630,0,195,30);
	    Homebtn.setBackground(new Color(69,90,100));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.lightGray);
	    Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Homebtn.setFocusable(false);
        inputpanel3.add(Homebtn);

		JButton Resultbtn=new JButton("Return");
	    Resultbtn.setBounds(825,0,195,30);
	    Resultbtn.setBackground(new Color(69,90,100));
	    Resultbtn.setFont(labelFont);
	    Resultbtn.setForeground(Color.lightGray);
	    Resultbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Resultbtn.setFocusable(false);
        inputpanel3.add(Resultbtn);
        
        JButton Regbtn=new JButton("Register");
	    Regbtn.setBounds(1020,0,195,30);
	    Regbtn.setBackground(new Color(69,90,100));
	    Regbtn.setFont(labelFont);
	    Regbtn.setForeground(Color.lightGray);
	    Regbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Regbtn.setFocusable(false);
		inputpanel3.add(Regbtn);
	
	

		JPanel inputpanel1=new JPanel();
		inputpanel1.setBackground(new Color(255,255,255));
        inputpanel1.setBounds(450, 180, 350, 50);
		//inputpanel1.setLayout(null);
		JLabel imgLabel2 = new JLabel(new ImageIcon(this.getClass().getResource("/image/Forgot.png")));
		inputpanel1.add(imgLabel2);
		add(inputpanel1);

		JPanel inputpanel2=new JPanel();
		
		inputpanel2.setBackground(new Color(255,255,255));
        inputpanel2.setBounds(0, 180, 1250, 50);
		//inputpanel1.setLayout(null);
		add(inputpanel2);
	
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(new Color(93,130,250));
		inputPanel.setBounds(0,60,1250,740);
		inputPanel.setLayout(null);
		add(inputPanel);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(450,200,100,25);
        nameLabel.setFont(labelFont);
        nameLabel.setForeground(Color.WHITE);
		inputPanel.add(nameLabel);

		JTextField nameText = new JTextField();
		nameText.setBounds(625,200,200,25);
		nameText.setFont(labelFont);
		inputPanel.add(nameText);
		
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(450,235,100,25);
		emailLabel.setFont(labelFont);
		emailLabel.setForeground(Color.WHITE);
		inputPanel.add(emailLabel);
		
		JTextField emailTextField = new JTextField();
		emailTextField.setBounds(625,235,200,25);
		emailTextField.setFont(labelFont);
		inputPanel.add(emailTextField);
		
		
		JLabel MobileNum = new JLabel("Mobile");
		MobileNum.setBounds(450,270,100,25);
		MobileNum.setFont(labelFont);
		MobileNum.setForeground(Color.WHITE);
		inputPanel.add(MobileNum);
		
		JTextField mobileText= new JTextField();
		mobileText.setBounds(625,270,200,25);
		mobileText.setFont(labelFont);

		inputPanel.add(mobileText);

		JLabel uniID = new JLabel("University ID");
		uniID.setBounds(450,305,100,25);
		uniID.setFont(labelFont);
		uniID.setForeground(Color.WHITE);
		inputPanel.add(uniID);
				
		JTextField uniIDText= new JTextField();
		uniIDText.setBounds(625,305,200,25);
		uniIDText.setFont(labelFont);
		inputPanel.add(uniIDText);

		JLabel dob = new JLabel("Date of Birth");
		dob.setBounds(450,340,100,25);
		dob.setFont(labelFont);
		dob.setForeground(Color.WHITE);
		inputPanel.add(dob);
				
		JTextField dobText= new JTextField();
		dobText.setBounds(625,340,200,25);
		dobText.setFont(labelFont);
		inputPanel.add(dobText);


		JButton registerButton = new JButton("Fetch Password");
		registerButton.setBounds(550,395,150,30);
		registerButton.setBackground(new Color(219,143,160));
		registerButton.setFont(labelFont);
		registerButton.setForeground(Color.white);
		registerButton.setBorder(new LineBorder(new Color(93,130,250)));
		registerButton.setFocusable(false);
		inputPanel.add(registerButton);
		
		JButton loginButton = new JButton("Return to Login Page");
		loginButton.setBounds(475, 440, 300, 25);
		loginButton.setBackground(new Color(93,130,250));
		loginButton.setFont(labelFont);
		loginButton.setForeground(new Color(255,255,255));
		loginButton.setBorder(new LineBorder(new Color(93,130,250)));
		loginButton.setFocusable(false);
		inputPanel.add(loginButton);

		


		


		
        registerButton.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                String userName = nameText.getText();
				String pass = mobileText.getText();
				String pass2 = "123456789";
				String email= emailTextField.getText();
				String mobile = mobileText.getText();
				String adress = nameText.getText();
				String uniID = uniIDText.getText();
				Database db1 = new Database();
				int pax = 50000000;
	            
				String queryLogin = "SELECT * FROM `registered` WHERE `name` = '" + userName + "' AND `password` = '" + pass + "'";
				
	            db1.Logi(queryLogin,userName,pass);
				if (db1.ForgetChk(queryLogin, userName, pass)) {
					//swingAppLogic(pax);
        			//JOptionPane.showMessageDialog(null, sumAsString, "Title", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Password Reset Successfull. Your New Password is: 123456789 ");
					String insertQuery = "INSERT INTO `registered`"
							+ "(`name`, `password`, `email`, `number`, `address`, `uniID`,`dob`) "
							+ " VALUES ('" + userName + "','" + pass2 + "','" + email + "','" + mobile + "','" + adress
							+ "','" + uniID + "','" + mobile + "') ";
					db1.insertRegister1(insertQuery);
					dispose();
					new LoginPage();

				}
				else{
					JOptionPane.showMessageDialog(null, "Data No Found or Invalid Data");
				}
            }
        });
		Homebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new FrontPage();
			}
		});

		Resultbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LoginPage();
			}
		});
		Regbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Register();
			}
		});
		
		
		
		
		
		setVisible(true);
	}
	

}
