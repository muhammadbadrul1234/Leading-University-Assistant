import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.xml.crypto.Data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Admission extends JFrame {
    public Admission() {
        super("Admission");

        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
        this.setIconImage(icon.getImage());

        setSize(1250, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        Font labelFont = ((new Font("Segoe UI", Font.CENTER_BASELINE, 16)));
        Font labelFont2 = ((new Font("Segoe UI", Font.ROMAN_BASELINE, 20)));
        Font labelFont3 = ((new Font("Segoe UI", Font.CENTER_BASELINE, 20)));
        JPanel headerpanel = new JPanel();
        //headerpanel.setBackground(new Color(93,130,250));
        headerpanel.setBounds(0, 0, 1250, 150);
headerpanel.setBackground(new Color(69,90,100));
        JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));

        headerpanel.add(imgLabel);
        add(headerpanel);

        JLabel Homebtn1=new JLabel("New Student Admission");
        Homebtn1.setBounds(450,190,1000,30);
	   // Homebtn1.setBackground(new Color(255,255,255));
	    Homebtn1.setFont(labelFont3);
	    Homebtn1.setForeground(Color.WHITE);
	    //Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	   // Homebtn.setFocusable(false);
        

        JPanel inputpanel2=new JPanel();
		inputpanel2.setBackground(new Color(69,90,100));
        inputpanel2.setBounds(0, 180, 1250, 50);
        inputpanel2.setLayout(null);
        add(Homebtn1);
        add(inputpanel2);

         JPanel inputpanel1=new JPanel();
	//inputpanel1.setBackground(new Color(112,128,144));
        inputpanel1.setBounds(0, 150, 1000, 30);
		inputpanel1.setLayout(null);
        
        
        JButton Homebtn=new JButton("Home");
	    Homebtn.setBounds(0,0,100,30);
	    Homebtn.setBackground(new Color(69,90,100));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.WHITE);
	    Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Homebtn.setFocusable(false);
        inputpanel1.add(Homebtn);
        
        JButton Admissionbtn=new JButton("Admission");
	    Admissionbtn.setBounds(100,0,100,30);
	    Admissionbtn.setBackground(new Color(69,90,100));
	    Admissionbtn.setFont(labelFont);
	    Admissionbtn.setForeground(Color.WHITE);
	    Admissionbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Admissionbtn.setFocusable(false);
        inputpanel1.add(Admissionbtn);
        
        JButton contacButton=new JButton("Contact");
	    contacButton.setBounds(200,0,100,30);
	    contacButton.setBackground(new Color(69,90,100));
	    contacButton.setFont(labelFont);
	    contacButton.setForeground(Color.WHITE);
	    contacButton.setBorder(new LineBorder(new Color(69,90,100)));
	    contacButton.setFocusable(false);
        inputpanel1.add(contacButton);
        
        JButton FormBtn=new JButton("Forms");
	    FormBtn.setBounds(300,0,100,30);
	    FormBtn.setBackground(new Color(69,90,100));
	    FormBtn.setFont(labelFont);
	    FormBtn.setForeground(Color.WHITE);
	    FormBtn.setBorder(new LineBorder(new Color(69,90,100)));
	    FormBtn.setFocusable(false);
        inputpanel1.add(FormBtn);
        
        JButton noticebButton=new JButton("Notice");
	    noticebButton.setBounds(400,0,100,30);
	    noticebButton.setBackground(new Color(69,90,100));
	    noticebButton.setFont(labelFont);
	    noticebButton.setForeground(Color.WHITE);
	    noticebButton.setBorder(new LineBorder(new Color(69,90,100)));
	    noticebButton.setFocusable(false);
        inputpanel1.add(noticebButton);
        
        JButton Deptsbtn=new JButton("Departments");
	    Deptsbtn.setBounds(500,0,120,30);
	    Deptsbtn.setBackground(new Color(69,90,100));
	    Deptsbtn.setFont(labelFont);
	    Deptsbtn.setForeground(Color.WHITE);
	    Deptsbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Deptsbtn.setFocusable(false);
        inputpanel1.add(Deptsbtn);
        
        JButton Librarybtn=new JButton("Library");
	    Librarybtn.setBounds(620,0,100,30);
	    Librarybtn.setBackground(new Color(69,90,100));
	    Librarybtn.setFont(labelFont);
	    Librarybtn.setForeground(Color.WHITE);
	    Librarybtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Librarybtn.setFocusable(false);
        inputpanel1.add(Librarybtn);
        
        JButton Resultbtn=new JButton("Result");
	    Resultbtn.setBounds(720,0,70,30);
	    Resultbtn.setBackground(new Color(69,90,100));
	    Resultbtn.setFont(labelFont);
	    Resultbtn.setForeground(Color.WHITE);
	    Resultbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Resultbtn.setFocusable(false);
        inputpanel1.add(Resultbtn);
        
        JButton Regbtn=new JButton("Semester Registration");
	    Regbtn.setBounds(790,0,195,30);
	    Regbtn.setBackground(new Color(69,90,100));
	    Regbtn.setFont(labelFont);
	    Regbtn.setForeground(Color.WHITE);
	    Regbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Regbtn.setFocusable(false);
        inputpanel1.add(Regbtn);

        add(inputpanel1);


        

        JFrame f;
        JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
        JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
        JButton b,b1,b2,b3;
        JComboBox c1, c2;

        id15=new JLabel();
        id15.setBounds(0,0,1250,700);
        id15.setLayout(null);

         id8 = new JLabel("New Student Details");
        id8.setBounds(320,100,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(250,250,100,30);
        id1.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(400,250,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(600,250,200,30);
        id2.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(800,250,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(250,300,100,30);
        id3.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(400,300,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(600,300,200,30);
        id4.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(800,300,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(250,450,100,30);
        id5.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(400,450,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(600,450,100,30);
        id6.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(800,450,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(250,350,100,30);
        id7.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(400,350,150,30);
        id15.add(t7);

        id9= new JLabel("SSC GPA");
        id9.setBounds(600,350,130,30);
        id9.setFont(new Font("Calibri",Font.BOLD,20));    
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(800,350,150,30);
        id15.add(t8);

        id10= new JLabel("HSC GPA");
        id10.setBounds(250,400,130,30);
        id10.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(400,400,150,30);
        id15.add(t9);


        id11= new JLabel("NID No");
        id11.setBounds(600,400,100,30);
        id11.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(800,400,150,30);
        id15.add(t10);

        id12= new JLabel("Student ID");
        id12.setBounds(250,500,150,30);
        id12.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(400,500,150,30);
        t11.setText("");
        id15.add(t11);


        lab=new JLabel("Course");
        lab.setBounds(600,500,150,30);
	lab.setFont(new Font("Calibri",Font.BOLD,20));
        id15.add(lab);
            
        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(800,500,150,30);
        id15.add(c1);
        
        lab2=new JLabel("Branch");
        lab2.setBounds(250,550,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        
        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(400,550,150,30);
        id15.add(c2);
        
        b = new JButton("Submit");
        b.setBounds(670,610,100,30);
		b.setBackground(new Color(69,90,100));
		b.setFont(labelFont);
		b.setForeground(Color.white);
		b.setBorder(new LineBorder(new Color(69,90,100)));
		b.setFocusable(false);
        
        id15.add(b);

        b1=new JButton("Return");   
        b1.setBounds(550,610,100,30);
		b1.setBackground(new Color(69,90,100));
		b1.setFont(labelFont);
		b1.setForeground(Color.white);
		b1.setBorder(new LineBorder(new Color(69,90,100)));
		b1.setFocusable(false);
        
        id15.add(b1);

        b2=new JButton("Clear");   
        b2.setBounds(430,610,100,30);
		b2.setBackground(new Color(69,90,100));
		b2.setFont(labelFont);
		b2.setForeground(Color.white);
		b2.setBorder(new LineBorder(new Color(69,90,100)));
		b2.setFocusable(false);
        
        id15.add(b2);

        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Homepage();
			}
        });

        b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Admission();
			}
        });
        
        b.addActionListener(new ActionListener() {
			
			@Override
            public void actionPerformed(ActionEvent e) {
                
                String a = t1.getText();
                String bb = t2.getText();
                String c = t3.getText();
                String d = t4.getText();
                String ee = t5.getText();
                String ff = t6.getText();
                String g = t7.getText();
                String h = t8.getText();
                String i = t9.getText();
                String j = t10.getText();
                String k = t11.getText();
                String l = (String)c1.getSelectedItem();
                String m = (String) c2.getSelectedItem();
                if (a.trim().isEmpty() || bb.trim().isEmpty() || c.trim().isEmpty() || d.trim().isEmpty() || ee.trim().isEmpty() || ff.trim().isEmpty() || g.trim().isEmpty() || h.trim().isEmpty() || i.trim().isEmpty() || j.trim().isEmpty() || k.trim().isEmpty() || l.trim().isEmpty() || m.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Some Required Fields are Empty");
                }
                else {
                    String insertQuery = "INSERT INTO `teacher`"
                            + "(`Name`, `Father's Name`, `Age`, `DOB (dd/mm/yyyy)`, `Address`, `Phone`,`Email Id`, `SSC GPA`, `HSC GPA`, `NID No`, `Student Id`, `Course`,`Branch`) "
                            + " VALUES ('" + a + "','" + bb + "','" + c + "','" + d + "','" + ee + "','" + ff + "','"
                            + g + "','" + h + "','" + i + "','" + j + "','" + k + "','" + l + "','" + m + "')";

                    Database db = new Database();
                    db.admissionRegister(insertQuery);
                }
			}
		});

        
    
        




        setVisible(true);
    }
}