import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class UpdateStudent extends JFrame {
    /**
     * 
     */
    public UpdateStudent() {
        super("Update Student");

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
        headerpanel.setBackground(new Color(69, 90, 100));
        JLabel imgLabel = new JLabel(new ImageIcon(this.getClass().getResource("/image/header.png")));

        headerpanel.add(imgLabel);
        add(headerpanel);

        JLabel Homebtn1 = new JLabel("Update Student Details");
        Homebtn1.setBounds(450, 190, 1000, 30);
        // Homebtn1.setBackground(new Color(255,255,255));
        Homebtn1.setFont(labelFont3);
        Homebtn1.setForeground(Color.WHITE);
        //Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
        // Homebtn.setFocusable(false);

        JPanel inputpanel2 = new JPanel();
        inputpanel2.setBackground(new Color(69, 90, 100));
        inputpanel2.setBounds(0, 180, 1250, 50);
        inputpanel2.setLayout(null);
        add(Homebtn1);
        add(inputpanel2);

        JPanel inputpanel1 = new JPanel();
        //inputpanel1.setBackground(new Color(112,128,144));
        inputpanel1.setBounds(0, 150, 1000, 30);
        inputpanel1.setLayout(null);
       JFrame f;
        JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
        JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
        JButton b,b1,b2,b3;
        JComboBox c1, c2;

      //  b2.addActionListener(this);


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
        
        b = new JButton("Update");
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

        // b.addActionListener(this);
        // b1.addActionListener(this);

       // setVisible(true);

        // public void actionPerformed(ActionEvent ae){
        //     if(ae.getSource()==b){
        //         try{
        //             conn con = new conn();
        //             String str = "update student set name='"+t1.getText()+"',fathers_name='"+t2.getText()+"',age='"+t3.getText()+"', dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',class_x='"+t8.getText()+"',class_xii='"+t9.getText()+"',aadhar='"+t10.getText()+"',course='"+t13.getText()+"',branch='"+t14.getText()+"' where rollno='"+t12.getText()+"'";
        //             con.s.executeUpdate(str);
        //             JOptionPane.showMessageDialog(null,"successfully updated");

        //         }catch(Exception e){
        //             System.out.println("The error is:"+e);
        //         }
        //     }
        //     if(ae.getSource()==b1){
        //         f.setVisible(false);
        //         new Project().setVisible(true);
        //     }
        //     if(ae.getSource() == b2){
        //         try{
        //             conn con = new conn();
        //             String str = "select * from student where rollno = '"+t12.getText()+"'";
        //             ResultSet rs = con.s.executeQuery(str);

        //             if(rs.next()){
        //                 f.setVisible(true);

        //                 t1.setText(rs.getString(1));
        //                 t2.setText(rs.getString(2));
        //                 t3.setText(rs.getString(3));
        //                 t4.setText(rs.getString(4));
        //                 t5.setText(rs.getString(5));
        //                 t6.setText(rs.getString(6));
        //                 t7.setText(rs.getString(7));
        //                 t8.setText(rs.getString(8));
        //                 t9.setText(rs.getString(9));
        //                 t10.setText(rs.getString(10));
        //                 t11.setText(rs.getString(11));
        //                 t13.setText(rs.getString(12));
        //                 t14.setText(rs.getString(13));
        //             }

        //         }catch(Exception ex){}

        //    //b2.addActionListener(this);

        // add(inputpanel1);


        //  b1.addActionListener(new ActionListener() {
			
		// 	@Override
		// 	public void actionPerformed(ActionEvent e) {
		// 		dispose();
		// 		new Homepage();
		// 	}
        // });

        // b2.addActionListener(new ActionListener() {
			
		// 	@Override
		// 	public void actionPerformed(ActionEvent e) {
		// 		dispose();
		// 		new Admission();
		// 	}
        // });
        
       
			
		 
     add(id15);
        setVisible(true);
    }}


