import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

import FrontEndClass.*;

public class LoginPage extends JFrame {
    public LoginPage() {
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
		
		JPanel inputpanel2=new JPanel();
	    inputpanel2.setBackground(new Color(69,90,100));
        inputpanel2.setBounds(0, 150, 1250, 30);
		inputpanel2.setLayout(null);
		add(inputpanel2);
	
        JPanel inputpanel1=new JPanel();
		

        inputpanel1.setBounds(0, 175, 710, 700);

		JLabel imgLabel2 = new JLabel(new ImageIcon(this.getClass().getResource("/image/1lu.png")));
		inputpanel1.add(imgLabel2);
		add(inputpanel1);

	    JPanel inputpanel=new JPanel();
		inputpanel.setBackground(new Color(93, 130, 250));
	    inputpanel.setBounds(710,180,640,750);
	    inputpanel.setLayout(null);
		add(inputpanel);

        JLabel namelabel=new JLabel("University ID");
	    namelabel.setBounds(80,200,100,25);
		namelabel.setFont(labelFont);
		namelabel.setForeground(Color.WHITE);
		inputpanel.add(namelabel);

	    
	    JTextField nameTxt=new JTextField();
	    nameTxt.setBounds(200,200,200,25);
	    nameTxt.setFont(labelFont);
		inputpanel.add(nameTxt);
	    
	    JLabel passlabel=new JLabel("Password ");
	    passlabel.setBounds(80,240,100,25);
		passlabel.setFont(labelFont);
		passlabel.setForeground(Color.WHITE);
		inputpanel.add(passlabel);
	    
	    JTextField passTxt=new JTextField();
	    passTxt.setBounds(200,240,200,25);
	    passTxt.setFont(labelFont);
		inputpanel.add(passTxt);
	    
	    JButton loginBtn=new JButton("Login");
	    loginBtn.setBounds(300,290,100,30);
	    loginBtn.setBackground(new Color(93,161,217));
	    loginBtn.setFont(labelFont);
	    loginBtn.setForeground(Color.WHITE);
	    loginBtn.setBorder(new LineBorder(new Color(93,130,250)));
	    loginBtn.setFocusable(false);
		inputpanel.add(loginBtn);

		JButton registerLink = new JButton("Don't have an account?");
		registerLink.setBounds(140, 380, 250, 30);
        registerLink.setForeground(Color.WHITE);
	    registerLink.setBackground(new Color(93,130,250));
	   	registerLink.setFont(labelFont);
	    registerLink.setForeground(Color.WHITE);
	    registerLink.setBorder(new LineBorder(new Color(93,130,250)));
	    registerLink.setFocusable(false);
		inputpanel.add(registerLink);

		JLabel uniIDpp = new JLabel("or");
		uniIDpp.setBounds(260, 365, 100, 100);
		Font labelFont2=((new Font("Segoe UI",Font.CENTER_BASELINE,14)));
		uniIDpp.setFont(labelFont2);
		uniIDpp.setForeground(Color.WHITE);
		inputpanel.add(uniIDpp);


		JButton forgotPassLink = new JButton("Forgot Password?");
		forgotPassLink.setBounds(140, 425, 250, 30);
		forgotPassLink.setForeground(Color.WHITE);
	    forgotPassLink.setBackground(new Color(93,130,250));
	   	forgotPassLink.setFont(labelFont);
	    forgotPassLink.setForeground(Color.WHITE);
	    forgotPassLink.setBorder(new LineBorder(new Color(93,130,250)));
		forgotPassLink.setFocusable(false);
		inputpanel.add(forgotPassLink);


    
        // JButton Resultbtn=new JButton("Return");
	    // Resultbtn.setBounds(950,0,70,30);
	    // Resultbtn.setBackground(new Color(69,90,100));
	    // Resultbtn.setFont(labelFont);
	    // Resultbtn.setForeground(Color.lightGray);
	    // Resultbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    // Resultbtn.setFocusable(false);
        // inputpanel2.add(Resultbtn);
        
        JButton Regbtn=new JButton("Home");
	    Regbtn.setBounds(1020,0,195,30);
	    Regbtn.setBackground(new Color(69,90,100));
	    Regbtn.setFont(labelFont);
	    Regbtn.setForeground(Color.lightGray);
	    Regbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Regbtn.setFocusable(false);
		inputpanel2.add(Regbtn);
		
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userName = nameTxt.getText();
	            String pass = passTxt.getText();
	            Database db = new Database();
				//String queryLogin = "SELECT * FROM `registered`";
				Database db1 = new Database();
	            String queryLogin = "SELECT * FROM `registered`";
				db1.Login(queryLogin, userName, pass);
				if (db1.LoginChk(queryLogin, userName, pass)==true) {
					//JOptionPane.showMessageDialog(null, "Login Successful");
					dispose();
					//new Admission();
					new Homepage();
				} else {
					dispose();
					JOptionPane.showMessageDialog(null, "Login Failed");
				}
				//dispose();
				//new Homepage();
			}
		});
		registerLink.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Register();
			}
		});
		forgotPassLink.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new ForgetPass();
			}
		});
		// Resultbtn.addActionListener(new ActionListener() {
		// 	@Override
		// 	public void actionPerformed(ActionEvent e) {
		// 		dispose();
		// 		new FrontPage();
		// 	}
		// });
		Regbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new FrontPage();
			}
		});
		setVisible(true);
    }
    
}
