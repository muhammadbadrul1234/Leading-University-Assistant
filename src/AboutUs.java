import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


import java.lang.Object;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.plaf.ComboBoxUI;


public class AboutUs extends JFrame {
	private JPanel contentPane;
    public AboutUs() {
        super("About Developer - Leading University");
        
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
		headerTxt.setFont((new Font("Segoe UI", Font.BOLD, 30)));
		headerTxt.setForeground(Color.WHITE);
		JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));

		headerpanel.add(imgLabel);
        add(headerpanel);
        JPanel inputpanel1=new JPanel();
	//inputpanel1.setBackground(new Color(112,128,144));
        inputpanel1.setBounds(0, 150, 1250, 30);
		inputpanel1.setLayout(null);
		inputpanel1.setBackground(new Color(69,90,100));

JComboBox Manage,Update,Database,Attendence,Fee,Utility,Exam;
        JButton Homebtn=new JButton("Home");
	    Homebtn.setBounds(0,0,130,30);
	    Homebtn.setBackground(new Color(69,90,100));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.WHITE);
	    Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Homebtn.setFocusable(false);
		inputpanel1.add(Homebtn);
		
		String Man[] = {"Add","Admission","New Faculty","Add Employee"};
        Manage = new JComboBox(Man);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Manage.setName("Badrul");
        Manage.setBackground(new Color(69,90,100));
	   	Manage.setFont(labelFont);
	    Manage.setForeground(Color.WHITE);
	    Manage.setBorder(new LineBorder(new Color(69,90,100)));
	    Manage.setFocusable(false);
        Manage.setBackground(new Color(69,90,100));
        Manage.setBounds(130, 0, 130, 30);
        Manage.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
        });
          Manage.addActionListener(new ActionListener() {
			
			@Override
            public void actionPerformed(ActionEvent e) {
		String Man2 = (String) Manage.getSelectedItem();
		switch (Man2) {//check for a match
			case "Admission":
				dispose();
				new Admission();
                break;
            case "New Faculty":
                dispose();
                new AddTeacher();
                break;
            case "Add Employee":
                dispose();
				new AddEmployee();
                break;
            default:
                        
                }
            }
        });
		
		
		String Updt[] = {"Update","Student","Teacher"," Employee"};
        Update = new JComboBox(Updt);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Update.setName("Badrul");
        Update.setBackground(new Color(69,90,100));
	   	Update.setFont(labelFont);
	    Update.setForeground(Color.WHITE);
	    Update.setBorder(new LineBorder(new Color(69,90,100)));
	    Update.setFocusable(false);
        Update.setBackground(new Color(69,90,100));
        Update.setBounds(230, 0, 130, 30);
        Update.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
        });
        Update.addActionListener(new ActionListener() {
			
			@Override
            public void actionPerformed(ActionEvent e) {
		String updt2 = (String) Update.getSelectedItem();
		switch (updt2) {//check for a match
                    case "Student":
                        JFrame frame = new JFrame("Update Student");
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setSize(350, 250);
                        frame.setLocationRelativeTo(null);
                        frame.setLayout(null);
                        JPanel panel = new JPanel();
                        panel.setBounds(0, 0, 500, 500);
                        panel.setLayout(null);
                        frame.add(panel);
                        JLabel l1,l2;
                        JTextField t1;
                        JPasswordField t2;
                        JButton b1,b2;
                        l1 = new JLabel("Student ID");
                        l1.setBounds(40,20,100,30);
                        panel.add(l1);
                        JButton registerButton = new JButton("Check");
                        registerButton.setBounds(125,100,100,30);
                        registerButton.setBackground(new Color(219,143,160));
                        registerButton.setFont(labelFont);
                        registerButton.setForeground(Color.white);
                        registerButton.setBorder(new LineBorder(new Color(93,130,250)));
                        registerButton.setFocusable(false);
                        panel.add(registerButton);
                        t1=new JTextField();
                        t1.setBounds(150,20,150,30);
                        panel.add(t1);

                         registerButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String uniID = t1.getText();
                                Database db1 = new Database();
                                String pass =" 100";
                            
                            String queryLogin = "SELECT * FROM `registered` WHERE `uniID` = '" + uniID + "' AND `password` = '" + pass + "'";
                
                            //db1.Logi(queryLogin,uniID,pass);
                            if (db1.STChk(queryLogin, uniID, pass)) {
                                //swingAppLogic(pax);
                                //JOptionPane.showMessageDialog(null, sumAsString, "Title", JOptionPane.INFORMATION_MESSAGE);
        
                                dispose();
                                new UpdateStudent();

                            }
                            else{
                                    JOptionPane.showMessageDialog(null, "Data No Found or Invalid Data");
                                    dispose();
                                    new Homepage();
                            }
                        }
                    });

                       


                        frame.setVisible(true);



				// dispose();
				// new Admission();
                // break;
            case "New Faculty":
                dispose();
                new AddTeacher();
                break;
            case "Add Employee":
                dispose();
				new AddEmployee();
                break;
            default:
                        
                }
            }
        });
		

		String dtbs[] = {"Data Sheet","Student Details","Teacher Details"," Employee Details","Student Attendance","Teacher Attendence"," Employee Attendance"};
        Database = new JComboBox(dtbs);
        //DatabaseI(ColorArrowUI.createUDatabase
        Database.setName("Badrul");
        Database.setBackground(new Color(69,90,100));
	   	Database.setFont(labelFont);
	    Database.setForeground(Color.WHITE);
	    Database.setBorder(new LineBorder(new Color(69,90,100)));
	    Database.setFocusable(false);
        Database.setBackground(new Color(69,90,100));
        Database.setBounds(330, 0, 130, 30);
        Database.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});
		
		String Attndnc[] = {"Attendance","Student","Teacher"," Employee"};
        Attendence = new JComboBox(Attndnc);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Attendence.setName("Badrul");
        Attendence.setBackground(new Color(69,90,100));
	   	Attendence.setFont(labelFont);
	    Attendence.setForeground(Color.WHITE);
	    Attendence.setBorder(new LineBorder(new Color(69,90,100)));
	    Attendence.setFocusable(false);
        Attendence.setBackground(new Color(69,90,100));
        Attendence.setBounds(430, 0, 130, 30);
        Attendence.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});

		String fee[] = {"Fee","Fee Structure","Payslip"};
        Fee= new JComboBox(fee);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Fee.setName("Badrul");
        Fee.setBackground(new Color(69,90,100));
	   	Fee.setFont(labelFont);
	    Fee.setForeground(Color.WHITE);
	    Fee.setBorder(new LineBorder(new Color(69,90,100)));
	    Fee.setFocusable(false);
        Fee.setBackground(new Color(69,90,100));
        Fee.setBounds(530, 0, 130, 30);
        Fee.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});

		String exm[] = {"Exam","Fee Structure","Payslip"};
        Exam= new JComboBox(exm);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Exam.setName("Badrul");
        Exam.setBackground(new Color(69,90,100));
	   	Exam.setFont(labelFont);
	    Exam.setForeground(Color.WHITE);
	    Exam.setBorder(new LineBorder(new Color(69,90,100)));
	    Exam.setFocusable(false);
        Exam.setBackground(new Color(69,90,100));
        Exam.setBounds(630, 0, 130, 30);
        Exam.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});

		String utlt[] = {"Utility","Fee Structure","Payslip"};
        Utility= new JComboBox(utlt);
        // c1.setUI(ColorArrowUI.createUI(c1));
       
        
        Utility.setName("Badrul");
        Utility.setBackground(new Color(69,90,100));
	   	Utility.setFont(labelFont);
	    Utility.setForeground(Color.WHITE);
	    Utility.setBorder(new LineBorder(new Color(69,90,100)));
	    Utility.setFocusable(false);
        Utility.setBackground(new Color(69,90,100));
        Utility.setBounds(730, 0, 130, 30);
        Utility.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
                        basicComboPopup.setBorder(new LineBorder(new Color(69, 90, 100)));
                basicComboPopup.setBackground(new Color(69,90,100));
                return basicComboPopup;
            }
		});
		JButton Aboutbtn=new JButton("About");
	    Aboutbtn.setBounds(830,0,150,30);
	    Aboutbtn.setBackground(new Color(69,90,100));
	    Aboutbtn.setFont(labelFont);
	    Aboutbtn.setForeground(Color.WHITE);
	    Aboutbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Aboutbtn.setFocusable(false);
		inputpanel1.add(Aboutbtn);
		
		JButton Logoutbtn=new JButton("Logout");
	    Logoutbtn.setBounds(980,0,150,30);
	    Logoutbtn.setBackground(new Color(69,90,100));
	    Logoutbtn.setFont(labelFont);
	    Logoutbtn.setForeground(Color.WHITE);
	    Logoutbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Logoutbtn.setFocusable(false);
		inputpanel1.add(Logoutbtn);

		inputpanel1.add(Utility);
		inputpanel1.add(Exam);
		
		inputpanel1.add(Fee);
		inputpanel1.add(Attendence);
		inputpanel1.add(Database);
		inputpanel1.add(Update);

		inputpanel1.add(Manage);

		Homebtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//dispose();
				//new Homepage();
			}
		});
		Aboutbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new AboutUs();
		}
		});

		Logoutbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new LoginPage();
		}
		});



		  //setBackground(new Color(173, 216, 230));
            //setBounds(500, 250, 700, 500);
		
			contentPane = new JPanel();
			contentPane.setBounds(0, 180, 1250, 620);
			
            setContentPane(contentPane);
           contentPane.setLayout(null);

            


            JLabel l3 = new JLabel("Leading University Assistant");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Courier new", Font.BOLD, 40));
            l3.setBounds(140, 200, 1000, 55);
            contentPane.add(l3);


            JLabel l6 = new JLabel("Developed By : Muhammad Badrul");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(140, 275, 600, 35);
            contentPane.add(l6);

            JLabel l8 = new JLabel("Contact : muhammadbadrul@ieee.org");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(140, 315, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Education - B.Sc in Computer Science & Engineering (Student)");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(140, 340, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Phone - +8801727819354");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(140, 365, 600, 34);
            contentPane.add(l10);
                
		

        
			add(headerpanel);

        add(inputpanel1);
        setVisible(true);
    }
}