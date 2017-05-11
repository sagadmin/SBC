package aufin.common.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.stream.XMLInputFactory;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

import TestCases.IndividualLead;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Scripts extends JFrame {

	TestListenerAdapter tla = new TestListenerAdapter();
	TestNG tng = new TestNG();
	List<String> suites = Lists.newArrayList();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scripts frame = new Scripts();
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
	public Scripts() {
		setResizable(false);
		setTitle("AUFIN-Scripts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 423);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ishant Kushwaha\\Desktop\\1.jpg"));

		JCheckBox chk1 = new JCheckBox("Individual RLOS PROCESS");
		chk1.setForeground(new Color(255, 255, 255));
		chk1.setBackground(new Color(105, 105, 105));
		chk1.setFont(new Font("Tahoma", Font.BOLD, 10));

		JCheckBox chk2 = new JCheckBox("ETB RLOS");
		chk2.setFont(new Font("Tahoma", Font.BOLD, 10));

		JCheckBox chk3 = new JCheckBox("RLOS+CLOS");
		chk3.setBackground(new Color(105, 105, 105));
		chk3.setForeground(new Color(255, 255, 255));
		chk3.setFont(new Font("Tahoma", Font.BOLD, 10));

		JCheckBox chk4 = new JCheckBox("RLO + RLOS");
		chk4.setBackground(new Color(105, 105, 105));
		chk4.setForeground(new Color(255, 255, 255));
		chk4.setFont(new Font("Tahoma", Font.BOLD, 10));

		JButton btnRun = new JButton("RUN");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getURLLink();

				if (chk1.isSelected()) {
					suites.add("D:/GITHUB/AU Financers/framwork.testing/TestSuites/IndvidualLeadProcess.xml");
					tng.setTestSuites(suites);
					tng.run();

				} else {
					if (chk2.isSelected()) {
						suites.add("D:/GITHUB/AU Financers/framwork.testing/TestSuites/ETBRLOS.xml");
						tng.setTestSuites(suites);
						tng.run();
					} else {
						if (chk3.isSelected()) {
							suites.add("D:/GITHUB/AU Financers/framwork.testing/TestSuites/LeadDeDupe.xml");
							tng.setTestSuites(suites);
							tng.run();

						} else {
							if (chk4.isSelected()) {
								suites.add(
										"D:/GITHUB/AU Financers/framwork.testing/TestSuites/LeadToCustomerDedupe.xml");
								tng.setTestSuites(suites);
								tng.run();
							} else {
								JOptionPane.showConfirmDialog(null, "WORK IN PROGRESS");
							}
						}
					}
				}

			}
		});

		JCheckBox chk5 = new JCheckBox("CLOS+CLOS");
		chk5.setForeground(new Color(255, 255, 255));
		chk5.setBackground(new Color(105, 105, 105));
		chk5.setFont(new Font("Tahoma", Font.BOLD, 10));

		JLabel lblNewLabel_1 = new JLabel("Developed By: Ishant Kushwah");
		lblNewLabel_1.setForeground(new Color(0, 255, 0));

		JLabel lblNewLabel_2 = new JLabel("");

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Scripts.class.getResource("/TestCases/crmnextlogo.png")));

		JButton btnNewButton = new JButton("View Log");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (Desktop.isDesktopSupported()) {
					try {
						File myFile = new File("D:\\GITHUB\\AU Financers\\logfile.log");
						Desktop.getDesktop().open(myFile);
					} catch (IOException ex) {
						// no application registered for PDFs
					}
				}

			}
		});

		JCheckBox chckbxClosrlos = new JCheckBox("CLOS+RLOS");
		chckbxClosrlos.setBackground(new Color(105, 105, 105));
		chckbxClosrlos.setForeground(new Color(255, 255, 255));
		chckbxClosrlos.setFont(new Font("Tahoma", Font.BOLD, 10));

		JLabel lblSelectEnviorment = new JLabel("Select Enviorment");
		lblSelectEnviorment.setForeground(new Color(255, 255, 255));

		JRadioButton r1 = new JRadioButton("SA");
		r1.setForeground(new Color(255, 255, 255));
		r1.setBackground(new Color(105, 105, 105));

		JRadioButton r2 = new JRadioButton("SIT");
		r2.setForeground(new Color(255, 255, 255));
		r2.setBackground(new Color(105, 105, 105));

		JRadioButton r3 = new JRadioButton("UAT");
		r3.setForeground(new Color(255, 255, 255));
		r3.setBackground(new Color(105, 105, 105));

		JRadioButton r4 = new JRadioButton("Production");
		r4.setForeground(Color.WHITE);
		r4.setBackground(SystemColor.controlDkShadow);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel).addGroup(gl_contentPane.createSequentialGroup()
										.addContainerGap().addGroup(gl_contentPane
												.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(lblSelectEnviorment).addGap(25)
														.addComponent(r1)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_contentPane.createSequentialGroup()
																		.addPreferredGap(ComponentPlacement.RELATED,
																				361, Short.MAX_VALUE)
																		.addComponent(lblNewLabel_2).addGap(16))
																.addGroup(gl_contentPane.createSequentialGroup()
																		.addGap(18)
																		.addComponent(r2, GroupLayout.PREFERRED_SIZE,
																				74, GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addComponent(r3, GroupLayout.PREFERRED_SIZE,
																				63, GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addComponent(r4, GroupLayout.PREFERRED_SIZE,
																				98, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED))))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(chk1).addComponent(chk5,
																		GroupLayout.PREFERRED_SIZE, 155,
																		GroupLayout.PREFERRED_SIZE))
														.addGap(26)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(chk4, GroupLayout.PREFERRED_SIZE, 155,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(chckbxClosrlos,
																		GroupLayout.PREFERRED_SIZE, 155,
																		GroupLayout.PREFERRED_SIZE))
														.addGap(29)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(chk2, GroupLayout.PREFERRED_SIZE, 155,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(chk3, GroupLayout.PREFERRED_SIZE, 155,
																		GroupLayout.PREFERRED_SIZE))
														.addGap(7)))))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3).addContainerGap())
								.addGroup(gl_contentPane.createSequentialGroup().addGap(4).addComponent(btnRun)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnNewButton)
										.addGap(23)))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addGap(17)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblSelectEnviorment).addComponent(r1).addComponent(r2)
												.addComponent(r3).addComponent(r4))
										.addComponent(lblNewLabel_2))
								.addPreferredGap(ComponentPlacement.RELATED)))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel_1)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(44)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(chk1)
										.addComponent(chk4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(chk3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addGap(31)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(chk5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxClosrlos, GroupLayout.PREFERRED_SIZE, 21,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(chk2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnRun)
										.addComponent(btnNewButton))
								.addContainerGap()))));
		contentPane.setLayout(gl_contentPane);
	}

	public String getURLLink() {
		JRadioButton r1 = new JRadioButton("SA");
		JRadioButton r2 = new JRadioButton("SIT");
		JRadioButton r3 = new JRadioButton("UAT");
		JRadioButton r4 = new JRadioButton("Production");

		String URL[] = { "http://aufinsa/sn/app/login/login", "http://10.57.15.4/sn/app/login/login",
				"http://10.57.18.12/sn/app/login/login" };
		if (!r1.isSelected()) {

			return URL[0];
		}

		if (!r2.isSelected()) {
			return URL[1];
		}

		return null;
	}
}
