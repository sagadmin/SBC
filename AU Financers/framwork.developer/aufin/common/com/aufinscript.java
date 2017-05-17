package aufin.common.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

import aufin.reposrity.com.LeadData;
import aufin.reposrity.com.Properties;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;

public class aufinscript extends JFrame {

	TestListenerAdapter tla = new TestListenerAdapter();
	TestNG tng = new TestNG();
	List<String> suites = Lists.newArrayList();

	private JPanel contentPane;
	private static JComboBox pro1;
	private static JComboBox env;
	public static JCheckBox ck6 ;
	public static JCheckBox ck7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aufinscript frame = new aufinscript();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public aufinscript() {
		setResizable(false);
		setBackground(new Color(47, 79, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\SAGITHUB\\AU Financers\\1.jpg"));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\SAGITHUB\\AU Financers\\logo.png"));

		JLabel lblNewLabel_2 = new JLabel("SELECT ENVIORMENT");
		lblNewLabel_2.setForeground(new Color(240, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));

		env = new JComboBox();
		env.setFont(new Font("Tahoma", Font.BOLD, 11));
		env.setForeground(new Color(0, 0, 255));
		env.setModel(
				new DefaultComboBoxModel(new String[] {"AUFIN DEVPORT","AUFIN SA", "AUFIN SIT", "AUFIN UAT", "AUFIN PRODUCTION"}));

		JLabel product = new JLabel("SELECT PRODUCT");
		product.setForeground(new Color(240, 255, 255));
		product.setFont(new Font("Tahoma", Font.BOLD, 12));

		pro1 = new JComboBox();
		pro1.setFont(new Font("Tahoma", Font.BOLD, 11));
		pro1.setForeground(new Color(0, 0, 255));
		pro1.setModel(new DefaultComboBoxModel(new String[] { "Auto Loan (Refinance)", "CV Passenger (Used)",
				"CV Passenger (Refinance)", "CV Loading (New)", "CV Loading (Used)", "CV Loading (Refinance)",
				"Auto Loan (New)", "Auto Loan (Used)", "Auto Loan (Refinance)", "Car Taxi (New)", "Car Taxi (Used)",
				"Car Taxi (Refinance)", "Two Wheeler (New)", "Two Wheeler (Used)", "Construction Equipment (New)",
				"Construction Equipment (Used)", "Tractor (New)" }));

		JLabel lblSelectScript = new JLabel("SELECT SCRIPT");
		lblSelectScript.setForeground(new Color(240, 255, 255));
		lblSelectScript.setFont(new Font("Tahoma", Font.BOLD, 12));

		JCheckBox ck1 = new JCheckBox("ALL");
		ck1.setBackground(new Color(0, 128, 128));
		ck1.setForeground(new Color(240, 255, 240));
		ck1.setFont(new Font("Tahoma", Font.BOLD, 11));

		JCheckBox ck2 = new JCheckBox("RLOS WITH RLOS");
		ck2.setForeground(new Color(240, 255, 255));
		ck2.setFont(new Font("Tahoma", Font.BOLD, 11));
		ck2.setBackground(new Color(0, 128, 128));

		JCheckBox ck3 = new JCheckBox("RLOS WITH CLOS");
		ck3.setForeground(new Color(240, 255, 255));
		ck3.setFont(new Font("Tahoma", Font.BOLD, 11));
		ck3.setBackground(new Color(0, 128, 128));

		JCheckBox ck4 = new JCheckBox("CLOS WITH CLOS");
		ck4.setForeground(new Color(240, 255, 255));
		ck4.setFont(new Font("Tahoma", Font.BOLD, 11));
		ck4.setBackground(new Color(0, 128, 128));

		JCheckBox ck5 = new JCheckBox("CLOS WITH RLOS");
		ck5.setForeground(new Color(240, 255, 255));
		ck5.setFont(new Font("Tahoma", Font.BOLD, 11));
		ck5.setBackground(new Color(0, 128, 128));

		ck6 = new JCheckBox("LEAD TO LEAD DEDUPE");
		ck6.setForeground(new Color(240, 255, 255));
		ck6.setFont(new Font("Tahoma", Font.BOLD, 11));
		ck6.setBackground(new Color(0, 128, 128));

		ck7 = new JCheckBox("LEAD TO CUSTOMER DEDUPE");
		ck7.setForeground(new Color(240, 255, 255));
		ck7.setFont(new Font("Tahoma", Font.BOLD, 11));
		ck7.setBackground(new Color(0, 128, 128));

		JCheckBox ck8 = new JCheckBox("AML PROCESS");
		ck8.setForeground(new Color(240, 255, 255));
		ck8.setFont(new Font("Tahoma", Font.BOLD, 11));
		ck8.setBackground(new Color(0, 128, 128));

		JButton bt1 = new JButton("RUN");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getProduct();
				if (ck2.isSelected()) {
					suites.add("D:\\SAGITHUB\\AU Financers\\framwork.testing\\TestSuites\\RLOS&RLOSCR.xml");
					tng.setTestSuites(suites);
					tng.run();

				} else {
					if (ck3.isSelected()) {
						suites.add("D:\\SAGITHUB\\AU Financers\\framwork.testing\\TestSuites\\RLOS&CLOS.xml");
						tng.setTestSuites(suites);
						tng.run();

					} else {
						if (ck4.isSelected()) {
							suites.add("D:\\SAGITHUB\\AU Financers\\framwork.testing\\TestSuites\\CLOS &CLOS.xml");
							tng.setTestSuites(suites);
							tng.run();
						} else {
							if (ck5.isSelected()) {
								suites.add("D:\\SAGITHUB\\AU Financers\\framwork.testing\\TestSuites\\CLOS&RLOS.xml");
								tng.setTestSuites(suites);
								tng.run();
							} else {
								if (ck1.isSelected()) {
									suites.add(
											"D:\\SAGITHUB\\AU Financers\\framwork.testing\\TestSuites\\CLOS&RLOS.xml");
									suites.add(
											"D:\\SAGITHUB\\AU Financers\\framwork.testing\\TestSuites\\CLOS &CLOS.xml");
									suites.add(
											"D:\\SAGITHUB\\AU Financers\\framwork.testing\\TestSuites\\RLOS&CLOS.xml");
									suites.add(
											"D:\\SAGITHUB\\AU Financers\\framwork.testing\\TestSuites\\RLOS&RLOS.xml");
									tng.setTestSuites(suites);
									tng.run();
								}
							}
						}
					}
				}
			}
		});
		bt1.setForeground(new Color(0, 0, 255));
		bt1.setBackground(new Color(0, 128, 128));

		JButton btnViewLog = new JButton("VIEW LOG");
		btnViewLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Desktop.getDesktop().open(new java.io.File("D:\\SAGITHUB\\AU Financers\\logfile.log"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnViewLog.setForeground(Color.BLUE);
		btnViewLog.setBackground(new Color(0, 128, 128));

		JButton btnRepport = new JButton("REPPORT");
		btnRepport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Desktop.getDesktop().open(new java.io.File("D:\\SAGITHUB\\AU Financers\\test-output\\emailable-report.html"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnRepport.setForeground(Color.BLUE);
		btnRepport.setBackground(new Color(0, 128, 128));
		
		JLabel lblNewLabel_3 = new JLabel("DESIGN&DEVELOPED BY:ISHANT KUSHWAH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		
		JCheckBox ck9 = new JCheckBox("RLOS WITH RLOS-CR");
		ck9.setForeground(new Color(240, 255, 255));
		ck9.setFont(new Font("Tahoma", Font.BOLD, 11));
		ck9.setBackground(new Color(0, 128, 128));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(31)
							.addComponent(env, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addGap(133)
							.addComponent(product, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pro1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addComponent(lblSelectScript, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(ck1)
							.addGap(18)
							.addComponent(ck2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ck3, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(ck9, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(ck6, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(ck7, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
							.addGap(27)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(ck4, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ck5, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
						.addComponent(ck8, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(38, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
					.addComponent(bt1)
					.addGap(18)
					.addComponent(btnViewLog)
					.addGap(18)
					.addComponent(btnRepport, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(72))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1, 0, 0, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(env, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pro1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(product, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSelectScript, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(ck1)
						.addComponent(ck2)
						.addComponent(ck3)
						.addComponent(ck4)
						.addComponent(ck5))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(ck7)
						.addComponent(ck6)
						.addComponent(ck8))
					.addGap(18)
					.addComponent(ck9)
					.addGap(158)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(bt1)
								.addComponent(btnViewLog)
								.addComponent(btnRepport))
							.addContainerGap())
						.addComponent(lblNewLabel_3)))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public static String getProduct() {
		// TODO Auto-generated method stu
		return (String) pro1.getSelectedItem();

	}

	public static String getURL() {
		String SIT = "http://10.57.15.4/sn/app/login/login";
		String UAT = "http://10.57.18.12/sn/app/login/login";
		String devPort = "http://aufin.crmnext.com/sn/app/login/login";
		String SA ="http://aufinsa/sn/app/login/login";
		if (env.getSelectedItem().equals("AUFIN SIT")) {
			return SIT;

		} else {

			if (env.getSelectedItem().equals("AUFIN UAT")) {
				return UAT;
			} else {
				if (env.getSelectedItem().equals("AUFIN DEVPORT")) {
					return devPort;
				}else{
					if(env.getSelectedItem().equals("AUFIN SA")){
						return SA;
					}
				}
			}
		}
		return null;

	}

	public static String getAssertURL() {
		String SIT = "http://10.57.15.4/sn/app/AutoFlow/RunFlow?x=m7psnshf4ta9h2w6nn864pxdgzugpu8vd7aex6j94r36ftdyvkv9zyr2v9g52dw3&layid=T3b7fAU4O020z5B%2F4hHhAA%3D%3D&pid=zN93gbEB5guESYxo8mBJTQ%3D%3D&cogtype=false";
		String UAT = "http://10.57.18.12/sn/app/AutoFlow/RunFlow?x=m7psnshf4ta9h2w6nn864pxdgzugpu8vd7aex6j94r36ftdyvkv9zyr2v9g52dw3&layid=T3b7fAU4O020z5B%2F4hHhAA%3D%3D&pid=zN93gbEB5guESYxo8mBJTQ%3D%3D&cogtype=false";
		String devPort = "http://aufin.crmnext.com/sn/app/AutoFlow/RunFlow?x=m7psnshf4ta9h2w6nn864pxdgzugpu8vd7aex6j94r36ftdyvkv9zyr2v9g52dw3&layid=T3b7fAU4O020z5B%2F4hHhAA%3D%3D&pid=zN93gbEB5guESYxo8mBJTQ%3D%3D&cogtype=false";
		String SA ="http://aufinsa/sn/app/AutoFlow/RunFlow?x=m7psnshf4ta9h2w6nn864pxdgzugpu8vd7aex6j94r36ftdyvkv9zyr2v9g52dw3&layid=T3b7fAU4O020z5B%2F4hHhAA%3D%3D&pid=zN93gbEB5guESYxo8mBJTQ%3D%3D&cogtype=false";
		if (env.getSelectedItem().equals("AUFIN SIT")) {
			return SIT;

		} else {

			if (env.getSelectedItem().equals("AUFIN UAT")) {
				return UAT;
			} else {
				if (env.getSelectedItem().equals("AUFIN DEVPORT")) {
					return devPort;
				}else{
					if(env.getSelectedItem().equals("AUFIN SA")){
						return SA;
					}
				}
			}
		}
		return null;

	}
	
	public static String getHomeScreen() {
		String SIT = "http://10.57.15.4/sn/app/CRMNextObject/Home/Lead";
		String UAT = "http://10.57.18.12/sn/app/CRMNextObject/Home/Lead";
		String devPort = "http://aufin.crmnext.com/sn/app/CRMNextObject/Home/Lead";
		String SA ="http://aufinsa/sn/app/CRMNextObject/Home/Lead";
		if (env.getSelectedItem().equals("AUFIN SIT")) {
			return SIT;

		} else {

			if (env.getSelectedItem().equals("AUFIN UAT")) {
				return UAT;
			} else {
				if (env.getSelectedItem().equals("AUFIN DEVPORT")) {
					return devPort;
				}else{
					if(env.getSelectedItem().equals("AUFIN SA")){
						return SA;
					}
				}
			}
		}
		return null;

	}
}
