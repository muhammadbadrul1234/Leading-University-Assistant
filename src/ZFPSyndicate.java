
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicPanelUI;
import org.w3c.dom.events.MouseEvent;

import FrontEndClass.FrontPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.*;
import java.lang.Object;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.plaf.ComboBoxUI;

public class ZFPSyndicate extends JFrame {
    JScrollPane jp;
    JLabel img;
   public ZFPSyndicate(){
    super("Leading University");
        ImageIcon icon;
        icon = new ImageIcon(this.getClass().getResource("/image/logo.png"));
		this.setIconImage(icon.getImage());
		JComboBox Manage,Update,Database,Attendence,Fee,Utility,Exam;

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
        JPanel inputpanel1=new JPanel();
	    inputpanel1.setBackground(new Color(69,90,100));
        inputpanel1.setBounds(0, 150, 1250, 30);
		inputpanel1.setLayout(null);

		JButton Homebtn=new JButton("Home");
	    Homebtn.setBounds(0,0,130,30);
	    Homebtn.setBackground(new Color(69,90,100));
	    Homebtn.setFont(labelFont);
	    Homebtn.setForeground(Color.WHITE);
	    Homebtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Homebtn.setFocusable(false);
		inputpanel1.add(Homebtn);
    
        String Man[] = {"About Us","Admministration","Board of Trustees","Syndicate","Academic Council","Proctorial Body"};
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
			case "Admministration":
				dispose();
				new ZFPAdministration();
                break;
            case "Board of Trustees":
                dispose();
							new ZFPTrustee();
                break;
            case "Add Employee":
                dispose();
							new ZFPSyndicate();
                break;
            default:
                        
                }
            }
			});
		



		inputpanel1.add(Manage);
        
        JButton Regbtn=new JButton("Login to Portal");
	    Regbtn.setBounds(1020,0,195,30);
	    Regbtn.setBackground(new Color(69,90,100));
	    Regbtn.setFont(labelFont);
	    Regbtn.setForeground(Color.lightGray);
	    Regbtn.setBorder(new LineBorder(new Color(69,90,100)));
	    Regbtn.setFocusable(false);
        inputpanel1.add(Regbtn);
         setSize(1250, 800);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
        img = new JLabel(new ImageIcon(this.getClass().getResource("/Front Image/2.png")));
        jp = new JScrollPane(img);
        jp.setBounds(00, 180, 1234, 580);
        jp.setForeground(Color.WHITE);
        jp.setViewportView(img);
        add(jp);

        add(inputpanel1);
        setVisible(true);
        // Resultbtn.addActionListener

       
        Homebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new FrontPage();
			}
		});
}

}
