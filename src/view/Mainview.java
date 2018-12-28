/*
 * Mainview.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import info.Employee;
import info.Film;
import info.ManagerHall;
import jdk.nashorn.internal.scripts.JO;
import player.PlayerMain;
import tool.Systems;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

/**
 * 
 *
 * @author  __USER__
 */
public class Mainview extends javax.swing.JFrame implements ActionListener {

	/** Creates new form Mainview */
	public Mainview() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminLoginview.class.getResource("/img/littlelogo.png")));
		initComponents();
		addlistenner();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTextField85 = new javax.swing.JTextField();
		jTextField84 = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButton5 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton6 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jRadioButton2 = new javax.swing.JRadioButton();
		jRadioButton1 = new javax.swing.JRadioButton();
		jTextField2 = new javax.swing.JTextField();
		jButton7 = new javax.swing.JButton();
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jButton7.getText().equals("查 询")) {
				if(!jTextField2.getText().equals("会员卡号")) {
					try {
						vip = jTextField2.getText();
						money= new Employee().checkVIP(jButton7,jButton9,jTextField2);
						jRadioButton1.setEnabled(false);
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "您似乎没有输入会员卡号");
				}}else {
					if(jButton7.getText().equals("重新输入会员卡号")) {
						jRadioButton1.setEnabled(true);
						jButton7.setText("查 询");
						jButton9.setEnabled(false);
						jTextField2.setText("会员卡号");
						jTextField2.setEnabled(true);
					}
				}
			}
		});
		jButton9 = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		btn13 = new javax.swing.JButton();
		btn14 = new javax.swing.JButton();
		btn15 = new javax.swing.JButton();
		btn16 = new javax.swing.JButton();
		btn17 = new javax.swing.JButton();
		btn18 = new javax.swing.JButton();
		btn19 = new javax.swing.JButton();
		btn110 = new javax.swing.JButton();
		btn21 = new javax.swing.JButton();
		btn22 = new javax.swing.JButton();
		btn23 = new javax.swing.JButton();
		btn24 = new javax.swing.JButton();
		btn25 = new javax.swing.JButton();
		btn26 = new javax.swing.JButton();
		btn27 = new javax.swing.JButton();
		btn28 = new javax.swing.JButton();
		btn29 = new javax.swing.JButton();
		btn210 = new javax.swing.JButton();
		btn41 = new javax.swing.JButton();
		btn42 = new javax.swing.JButton();
		btn43 = new javax.swing.JButton();
		btn44 = new javax.swing.JButton();
		btn45 = new javax.swing.JButton();
		btn46 = new javax.swing.JButton();
		btn47 = new javax.swing.JButton();
		btn48 = new javax.swing.JButton();
		btn49 = new javax.swing.JButton();
		btn410 = new javax.swing.JButton();
		btn31 = new javax.swing.JButton();
		btn32 = new javax.swing.JButton();
		btn33 = new javax.swing.JButton();
		btn34 = new javax.swing.JButton();
		btn35 = new javax.swing.JButton();
		btn36 = new javax.swing.JButton();
		btn37 = new javax.swing.JButton();
		btn38 = new javax.swing.JButton();
		btn39 = new javax.swing.JButton();
		btn310 = new javax.swing.JButton();
		btn81 = new javax.swing.JButton();
		btn82 = new javax.swing.JButton();
		btn83 = new javax.swing.JButton();
		btn84 = new javax.swing.JButton();
		btn85 = new javax.swing.JButton();
		btn86 = new javax.swing.JButton();
		btn87 = new javax.swing.JButton();
		btn88 = new javax.swing.JButton();
		btn89 = new javax.swing.JButton();
		btn810 = new javax.swing.JButton();
		btn71 = new javax.swing.JButton();
		btn72 = new javax.swing.JButton();
		btn73 = new javax.swing.JButton();
		btn74 = new javax.swing.JButton();
		btn75 = new javax.swing.JButton();
		btn76 = new javax.swing.JButton();
		btn77 = new javax.swing.JButton();
		btn78 = new javax.swing.JButton();
		btn79 = new javax.swing.JButton();
		btn710 = new javax.swing.JButton();
		btn61 = new javax.swing.JButton();
		btn62 = new javax.swing.JButton();
		btn63 = new javax.swing.JButton();
		btn64 = new javax.swing.JButton();
		btn65 = new javax.swing.JButton();
		btn66 = new javax.swing.JButton();
		btn67 = new javax.swing.JButton();
		btn68 = new javax.swing.JButton();
		btn69 = new javax.swing.JButton();
		btn610 = new javax.swing.JButton();
		btn51 = new javax.swing.JButton();
		btn52 = new javax.swing.JButton();
		btn53 = new javax.swing.JButton();
		btn54 = new javax.swing.JButton();
		btn55 = new javax.swing.JButton();
		btn56 = new javax.swing.JButton();
		btn57 = new javax.swing.JButton();
		btn58 = new javax.swing.JButton();
		btn59 = new javax.swing.JButton();
		btn510 = new javax.swing.JButton();
		btn11 = new javax.swing.JButton();
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btn12 = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel6 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel3 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jTextField83 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();

		jTextField85.setBackground(new java.awt.Color(202, 222, 231));
		jTextField85.setEditable(false);

		jTextField84.setBackground(new java.awt.Color(202, 222, 231));
		jTextField84.setEditable(false);
		jTextField84.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField84ActionPerformed(evt);
			}
		});

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u5f71\u9662\u552e\u7968\u7cfb\u7edf");

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jPanel2.setBackground(new java.awt.Color(170, 187, 195));

		jButton1.setBackground(new java.awt.Color(110, 123, 129));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u8d2d \u7968");
		jButton1.setBorder(null);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(170, 187, 195));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u8d2d \u7269");
		jButton2.setBorder(null);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(170, 187, 195));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u7528 \u6237");
		jButton3.setBorder(null);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addGap(228, 228, 228)
						.addComponent(jButton1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 172,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								53, 53, 53).addComponent(jButton2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 172,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								54, 54, 54).addComponent(jButton3,
								javax.swing.GroupLayout.PREFERRED_SIZE, 172,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(227, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jButton1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 53,
								Short.MAX_VALUE).addComponent(jButton2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 53,
								Short.MAX_VALUE).addComponent(jButton3,
								javax.swing.GroupLayout.DEFAULT_SIZE, 53,
								Short.MAX_VALUE)));

		jPanel3.setBackground(new java.awt.Color(202, 222, 231));

		jButton5.setBackground(new java.awt.Color(230, 239, 244));
		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jButton5.setForeground(new java.awt.Color(110, 123, 129));
		jButton5.setText("\u653e\u6620\u5217\u8868");
		jButton5.setBorder(null);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(202, 222, 231));
		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jButton8.setForeground(new java.awt.Color(110, 123, 129));
		jButton8.setText("\u6392\u884c\u699c");
		jButton8.setBorder(null);
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addComponent(
												jButton5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												169,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												169,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(731, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 37,
				Short.MAX_VALUE).addComponent(jButton8,
				javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE));

		jList1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jList1.setForeground(new java.awt.Color(110, 123, 129));
		jList1.setModel(new javax.swing.AbstractListModel() {
			String[] strings = { "电影名字1", "电影名字2", "电影名字3", "电影名字4", "电影名字5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jList1.setToolTipText("");
		jScrollPane1.setViewportView(jList1);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16));
		jLabel1.setText("         \u7535\u5f71\u5c01\u9762");
		jLabel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		jTextField1.setBackground(new java.awt.Color(202, 222, 231));
		jTextField1.setEditable(false);
		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16));
		jTextField1.setForeground(new java.awt.Color(92, 104, 110));
		jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField1.setText("\u300a\u7247\u540d\u300b");
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jButton6.setBackground(new java.awt.Color(202, 222, 231));
		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16));
		jButton6.setForeground(new java.awt.Color(92, 104, 110));
		jButton6.setText("\u9884\u544a\u7247\u64ad\u653e");
		jButton6.setBorder(null);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));
		jPanel4.setBorder(javax.swing.BorderFactory
				.createTitledBorder("   \u7279\u6b8a\u7968   "));
		jPanel4.setForeground(new java.awt.Color(92, 104, 110));

		jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
		jRadioButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16));
		jRadioButton2.setForeground(new java.awt.Color(92, 104, 110));
		jRadioButton2.setText("\u4f1a\u5458\u7968");
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});

		jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
		jRadioButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16));
		jRadioButton1.setForeground(new java.awt.Color(92, 104, 110));
		jRadioButton1.setText("\u666e\u901a\u7968");
		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jTextField2.setForeground(new java.awt.Color(153, 153, 153));
		jTextField2.setText("\u4F1A\u5458\u5361\u53F7");
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});
		jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				jTextField2FocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				jTextField2FocusLost(evt);
			}
		});

		jButton7.setBackground(new java.awt.Color(170, 187, 195));
		jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 19));
		jButton7.setForeground(new java.awt.Color(255, 255, 255));
		jButton7.setText("\u67e5 \u8be2");
		jButton7.setBorder(null);

		jButton9.setBackground(new java.awt.Color(170, 187, 195));
		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 19));
		jButton9.setForeground(new java.awt.Color(255, 255, 255));
		jButton9.setText("\u8d2d\u7968");
		jButton9.setBorder(null);
		jButton9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(money > Float.parseFloat(jLabel8.getText()) || !isvip) {
				money = new Employee().getTicket(pid,jComboBox1.getSelectedItem().toString(),jTextField1.getText(), hot, jComboBox2.getSelectedItem().toString(), waitsize,Float.parseFloat(jLabel8.getText()),vip,isvip,money);
				seat = new Employee().chooseSeat(seat.length,seat[0].length,pid);
				waitsize = new int[5][3];
				addlistenner();
				jTextField2.setText("当前用户余额为:"+money);
				}else {
					JOptionPane.showMessageDialog(null, "余额不足");
				}
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				47,
																				47,
																				47)
																		.addComponent(
																				jRadioButton1)
																		.addGap(
																				37,
																				37,
																				37)
																		.addComponent(
																				jRadioButton2))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				34,
																				34,
																				34)
																		.addGroup(
																				jPanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton7,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								235,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								235,
																								Short.MAX_VALUE)))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				34,
																				34,
																				34)
																		.addComponent(
																				jButton9,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				235,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jRadioButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jRadioButton1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												41,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(16, 16, 16)
										.addComponent(
												jButton7,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												40, Short.MAX_VALUE)
										.addGap(21, 21, 21)
										.addComponent(
												jButton9,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												40, Short.MAX_VALUE)
										.addContainerGap()));

		jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/close.png"))); // NOI18N

		jPanel5.setBackground(java.awt.Color.white);

		btn13.setBackground(new java.awt.Color(255, 255, 255));
		btn13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn13.setForeground(new java.awt.Color(92, 104, 110));
		btn13.setText("03");
		btn13.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));


		btn14.setBackground(new java.awt.Color(255, 255, 255));
		btn14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn14.setForeground(new java.awt.Color(92, 104, 110));
		btn14.setText("04");
		btn14.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn15.setBackground(new java.awt.Color(255, 255, 255));
		btn15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn15.setForeground(new java.awt.Color(92, 104, 110));
		btn15.setText("05");
		btn15.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn16.setBackground(new java.awt.Color(255, 255, 255));
		btn16.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn16.setForeground(new java.awt.Color(92, 104, 110));
		btn16.setText("06");
		btn16.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn17.setBackground(new java.awt.Color(255, 255, 255));
		btn17.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn17.setForeground(new java.awt.Color(92, 104, 110));
		btn17.setText("07");
		btn17.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn18.setBackground(new java.awt.Color(255, 255, 255));
		btn18.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn18.setForeground(new java.awt.Color(92, 104, 110));
		btn18.setText("08");
		btn18.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn19.setBackground(new java.awt.Color(255, 255, 255));
		btn19.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn19.setForeground(new java.awt.Color(92, 104, 110));
		btn19.setText("09");
		btn19.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn110.setBackground(new java.awt.Color(255, 255, 255));
		btn110.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn110.setForeground(new java.awt.Color(92, 104, 110));
		btn110.setText("10");
		btn110.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn21.setBackground(new java.awt.Color(255, 255, 255));
		btn21.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn21.setForeground(new java.awt.Color(92, 104, 110));
		btn21.setText("01");
		btn21.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn22.setBackground(new java.awt.Color(255, 255, 255));
		btn22.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn22.setForeground(new java.awt.Color(92, 104, 110));
		btn22.setText("02");
		btn22.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn23.setBackground(new java.awt.Color(255, 255, 255));
		btn23.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn23.setForeground(new java.awt.Color(92, 104, 110));
		btn23.setText("03");
		btn23.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn24.setBackground(new java.awt.Color(255, 255, 255));
		btn24.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn24.setForeground(new java.awt.Color(92, 104, 110));
		btn24.setText("04");
		btn24.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn25.setBackground(new java.awt.Color(255, 255, 255));
		btn25.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn25.setForeground(new java.awt.Color(92, 104, 110));
		btn25.setText("05");
		btn25.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn26.setBackground(new java.awt.Color(255, 255, 255));
		btn26.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn26.setForeground(new java.awt.Color(92, 104, 110));
		btn26.setText("06");
		btn26.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn27.setBackground(new java.awt.Color(255, 255, 255));
		btn27.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn27.setForeground(new java.awt.Color(92, 104, 110));
		btn27.setText("07");
		btn27.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn28.setBackground(new java.awt.Color(255, 255, 255));
		btn28.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn28.setForeground(new java.awt.Color(92, 104, 110));
		btn28.setText("08");
		btn28.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn29.setBackground(new java.awt.Color(255, 255, 255));
		btn29.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn29.setForeground(new java.awt.Color(92, 104, 110));
		btn29.setText("09");
		btn29.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn210.setBackground(new java.awt.Color(255, 255, 255));
		btn210.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn210.setForeground(new java.awt.Color(92, 104, 110));
		btn210.setText("10");
		btn210.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn41.setBackground(new java.awt.Color(255, 255, 255));
		btn41.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn41.setForeground(new java.awt.Color(92, 104, 110));
		btn41.setText("01");
		btn41.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn42.setBackground(new java.awt.Color(255, 255, 255));
		btn42.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn42.setForeground(new java.awt.Color(92, 104, 110));
		btn42.setText("02");
		btn42.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn43.setBackground(new java.awt.Color(255, 255, 255));
		btn43.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn43.setForeground(new java.awt.Color(92, 104, 110));
		btn43.setText("03");
		btn43.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn44.setBackground(new java.awt.Color(255, 255, 255));
		btn44.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn44.setForeground(new java.awt.Color(92, 104, 110));
		btn44.setText("04");
		btn44.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn45.setBackground(new java.awt.Color(255, 255, 255));
		btn45.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn45.setForeground(new java.awt.Color(92, 104, 110));
		btn45.setText("05");
		btn45.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn46.setBackground(new java.awt.Color(255, 255, 255));
		btn46.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn46.setForeground(new java.awt.Color(92, 104, 110));
		btn46.setText("06");
		btn46.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn47.setBackground(new java.awt.Color(255, 255, 255));
		btn47.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn47.setForeground(new java.awt.Color(92, 104, 110));
		btn47.setText("07");
		btn47.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn48.setBackground(new java.awt.Color(255, 255, 255));
		btn48.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn48.setForeground(new java.awt.Color(92, 104, 110));
		btn48.setText("08");
		btn48.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn49.setBackground(new java.awt.Color(255, 255, 255));
		btn49.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn49.setForeground(new java.awt.Color(92, 104, 110));
		btn49.setText("09");
		btn49.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn410.setBackground(new java.awt.Color(255, 255, 255));
		btn410.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn410.setForeground(new java.awt.Color(92, 104, 110));
		btn410.setText("10");
		btn410.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn31.setBackground(new java.awt.Color(255, 255, 255));
		btn31.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn31.setForeground(new java.awt.Color(92, 104, 110));
		btn31.setText("01");
		btn31.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn32.setBackground(new java.awt.Color(255, 255, 255));
		btn32.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn32.setForeground(new java.awt.Color(92, 104, 110));
		btn32.setText("02");
		btn32.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn33.setBackground(new java.awt.Color(255, 255, 255));
		btn33.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn33.setForeground(new java.awt.Color(92, 104, 110));
		btn33.setText("03");
		btn33.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn34.setBackground(new java.awt.Color(255, 255, 255));
		btn34.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn34.setForeground(new java.awt.Color(92, 104, 110));
		btn34.setText("04");
		btn34.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn35.setBackground(new java.awt.Color(255, 255, 255));
		btn35.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn35.setForeground(new java.awt.Color(92, 104, 110));
		btn35.setText("05");
		btn35.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn36.setBackground(new java.awt.Color(255, 255, 255));
		btn36.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn36.setForeground(new java.awt.Color(92, 104, 110));
		btn36.setText("06");
		btn36.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn37.setBackground(new java.awt.Color(255, 255, 255));
		btn37.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn37.setForeground(new java.awt.Color(92, 104, 110));
		btn37.setText("07");
		btn37.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn38.setBackground(new java.awt.Color(255, 255, 255));
		btn38.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn38.setForeground(new java.awt.Color(92, 104, 110));
		btn38.setText("08");
		btn38.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn39.setBackground(new java.awt.Color(255, 255, 255));
		btn39.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn39.setForeground(new java.awt.Color(92, 104, 110));
		btn39.setText("09");
		btn39.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn310.setBackground(new java.awt.Color(255, 255, 255));
		btn310.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn310.setForeground(new java.awt.Color(92, 104, 110));
		btn310.setText("10");
		btn310.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn81.setBackground(new java.awt.Color(255, 255, 255));
		btn81.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn81.setForeground(new java.awt.Color(92, 104, 110));
		btn81.setText("01");
		btn81.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn82.setBackground(new java.awt.Color(255, 255, 255));
		btn82.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn82.setForeground(new java.awt.Color(92, 104, 110));
		btn82.setText("02");
		btn82.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn83.setBackground(new java.awt.Color(255, 255, 255));
		btn83.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn83.setForeground(new java.awt.Color(92, 104, 110));
		btn83.setText("03");
		btn83.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));


		btn84.setBackground(new java.awt.Color(255, 255, 255));
		btn84.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn84.setForeground(new java.awt.Color(92, 104, 110));
		btn84.setText("04");
		btn84.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn85.setBackground(new java.awt.Color(255, 255, 255));
		btn85.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn85.setForeground(new java.awt.Color(92, 104, 110));
		btn85.setText("05");
		btn85.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn86.setBackground(new java.awt.Color(255, 255, 255));
		btn86.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn86.setForeground(new java.awt.Color(92, 104, 110));
		btn86.setText("06");
		btn86.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn87.setBackground(new java.awt.Color(255, 255, 255));
		btn87.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn87.setForeground(new java.awt.Color(92, 104, 110));
		btn87.setText("07");
		btn87.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn88.setBackground(new java.awt.Color(255, 255, 255));
		btn88.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn88.setForeground(new java.awt.Color(92, 104, 110));
		btn88.setText("08");
		btn88.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn89.setBackground(new java.awt.Color(255, 255, 255));
		btn89.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn89.setForeground(new java.awt.Color(92, 104, 110));
		btn89.setText("09");
		btn89.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn810.setBackground(new java.awt.Color(255, 255, 255));
		btn810.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn810.setForeground(new java.awt.Color(92, 104, 110));
		btn810.setText("10");
		btn810.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn71.setBackground(new java.awt.Color(255, 255, 255));
		btn71.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn71.setForeground(new java.awt.Color(92, 104, 110));
		btn71.setText("01");
		btn71.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn72.setBackground(new java.awt.Color(255, 255, 255));
		btn72.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn72.setForeground(new java.awt.Color(92, 104, 110));
		btn72.setText("02");
		btn72.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn73.setBackground(new java.awt.Color(255, 255, 255));
		btn73.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn73.setForeground(new java.awt.Color(92, 104, 110));
		btn73.setText("03");
		btn73.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));


		btn74.setBackground(new java.awt.Color(255, 255, 255));
		btn74.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn74.setForeground(new java.awt.Color(92, 104, 110));
		btn74.setText("04");
		btn74.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn75.setBackground(new java.awt.Color(255, 255, 255));
		btn75.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn75.setForeground(new java.awt.Color(92, 104, 110));
		btn75.setText("05");
		btn75.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn76.setBackground(new java.awt.Color(255, 255, 255));
		btn76.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn76.setForeground(new java.awt.Color(92, 104, 110));
		btn76.setText("06");
		btn76.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn77.setBackground(new java.awt.Color(255, 255, 255));
		btn77.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn77.setForeground(new java.awt.Color(92, 104, 110));
		btn77.setText("07");
		btn77.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn78.setBackground(new java.awt.Color(255, 255, 255));
		btn78.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn78.setForeground(new java.awt.Color(92, 104, 110));
		btn78.setText("08");
		btn78.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn79.setBackground(new java.awt.Color(255, 255, 255));
		btn79.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn79.setForeground(new java.awt.Color(92, 104, 110));
		btn79.setText("09");
		btn79.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn710.setBackground(new java.awt.Color(255, 255, 255));
		btn710.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn710.setForeground(new java.awt.Color(92, 104, 110));
		btn710.setText("10");
		btn710.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn61.setBackground(new java.awt.Color(255, 255, 255));
		btn61.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn61.setForeground(new java.awt.Color(92, 104, 110));
		btn61.setText("01");
		btn61.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn62.setBackground(new java.awt.Color(255, 255, 255));
		btn62.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn62.setForeground(new java.awt.Color(92, 104, 110));
		btn62.setText("02");
		btn62.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn63.setBackground(new java.awt.Color(255, 255, 255));
		btn63.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn63.setForeground(new java.awt.Color(92, 104, 110));
		btn63.setText("03");
		btn63.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn64.setBackground(new java.awt.Color(255, 255, 255));
		btn64.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn64.setForeground(new java.awt.Color(92, 104, 110));
		btn64.setText("04");
		btn64.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn65.setBackground(new java.awt.Color(255, 255, 255));
		btn65.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn65.setForeground(new java.awt.Color(92, 104, 110));
		btn65.setText("05");
		btn65.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn66.setBackground(new java.awt.Color(255, 255, 255));
		btn66.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn66.setForeground(new java.awt.Color(92, 104, 110));
		btn66.setText("06");
		btn66.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn67.setBackground(new java.awt.Color(255, 255, 255));
		btn67.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn67.setForeground(new java.awt.Color(92, 104, 110));
		btn67.setText("07");
		btn67.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn68.setBackground(new java.awt.Color(255, 255, 255));
		btn68.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn68.setForeground(new java.awt.Color(92, 104, 110));
		btn68.setText("08");
		btn68.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn69.setBackground(new java.awt.Color(255, 255, 255));
		btn69.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn69.setForeground(new java.awt.Color(92, 104, 110));
		btn69.setText("09");
		btn69.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn610.setBackground(new java.awt.Color(255, 255, 255));
		btn610.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn610.setForeground(new java.awt.Color(92, 104, 110));
		btn610.setText("10");
		btn610.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn51.setBackground(new java.awt.Color(255, 255, 255));
		btn51.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn51.setForeground(new java.awt.Color(92, 104, 110));
		btn51.setText("01");
		btn51.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn52.setBackground(new java.awt.Color(255, 255, 255));
		btn52.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn52.setForeground(new java.awt.Color(92, 104, 110));
		btn52.setText("02");
		btn52.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn53.setBackground(new java.awt.Color(255, 255, 255));
		btn53.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn53.setForeground(new java.awt.Color(92, 104, 110));
		btn53.setText("03");
		btn53.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn54.setBackground(new java.awt.Color(255, 255, 255));
		btn54.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn54.setForeground(new java.awt.Color(92, 104, 110));
		btn54.setText("04");
		btn54.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn55.setBackground(new java.awt.Color(255, 255, 255));
		btn55.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn55.setForeground(new java.awt.Color(92, 104, 110));
		btn55.setText("05");
		btn55.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn56.setBackground(new java.awt.Color(255, 255, 255));
		btn56.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn56.setForeground(new java.awt.Color(92, 104, 110));
		btn56.setText("06");
		btn56.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn57.setBackground(new java.awt.Color(255, 255, 255));
		btn57.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn57.setForeground(new java.awt.Color(92, 104, 110));
		btn57.setText("07");
		btn57.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn58.setBackground(new java.awt.Color(255, 255, 255));
		btn58.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn58.setForeground(new java.awt.Color(92, 104, 110));
		btn58.setText("08");
		btn58.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn59.setBackground(new java.awt.Color(255, 255, 255));
		btn59.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn59.setForeground(new java.awt.Color(92, 104, 110));
		btn59.setText("09");
		btn59.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn510.setBackground(new java.awt.Color(255, 255, 255));
		btn510.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn510.setForeground(new java.awt.Color(92, 104, 110));
		btn510.setText("10");
		btn510.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn11.setBackground(new java.awt.Color(255, 255, 255));
		btn11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn11.setForeground(new java.awt.Color(92, 104, 110));
		btn11.setText("01");
		btn11.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		btn12.setBackground(new java.awt.Color(255, 255, 255));
		btn12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		btn12.setForeground(new java.awt.Color(92, 104, 110));
		btn12.setText("02");
		btn12.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				btn81,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn82,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn83,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn84,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn85,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn86,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn87,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn88,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn89,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn810,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				btn71,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn72,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn73,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn74,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn75,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn76,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn77,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn78,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn79,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn710,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				btn61,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn62,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn63,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn64,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn65,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn66,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn67,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn68,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn69,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn610,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				btn51,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn52,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn53,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn54,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn55,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn56,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn57,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn58,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn59,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn510,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(
								jPanel5Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				btn41,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn42,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn43,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn44,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn45,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn46,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn47,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn48,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn49,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn410,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				btn31,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn32,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn33,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn34,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn35,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn36,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn37,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn38,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn39,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn310,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				btn21,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn22,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn23,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn24,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn25,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn26,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn27,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn28,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn29,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn210,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				btn11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn12,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn13,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn14,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn15,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn16,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn17,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn18,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn19,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				btn110,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btn13,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn14,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn15,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn16,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn17,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn18,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn19,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn110,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn11,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btn21,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn22,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn23,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn24,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn25,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn26,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn27,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn28,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn29,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn210,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btn31,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn32,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn33,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn34,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn35,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn36,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn37,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn38,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn39,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn310,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btn41,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn42,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn43,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn44,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn45,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn46,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn47,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn48,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn49,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn410,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btn51,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn52,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn53,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn54,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn55,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn56,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn57,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn58,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn59,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn510,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btn61,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn62,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn63,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn64,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn65,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn66,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn67,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn68,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn69,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn610,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btn71,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn72,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn73,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn74,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn75,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn76,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn77,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn78,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn79,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn710,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btn81,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn82,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn83,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn84,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn85,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn86,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn87,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn88,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn89,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btn810,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))));

		jPanel6.setBackground(new java.awt.Color(255, 255, 255));

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel2.setForeground(new java.awt.Color(92, 104, 110));
		jLabel2.setText("\u5bfc\u6f14\uff1a");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel4.setForeground(new java.awt.Color(92, 104, 110));
		jLabel4.setText("\u4e3b\u6f14\uff1a");

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel9.setForeground(new java.awt.Color(92, 104, 110));
		jLabel9.setText("\u7968\u4ef7\uff1a");

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel11.setForeground(new java.awt.Color(92, 104, 110));
		jLabel11.setText("\u5927\u5385\uff1a");

		jComboBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jComboBox1.setForeground(new java.awt.Color(92, 104, 110));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"1号厅", "2号厅", "3号厅", "4号厅", "5号厅" }));
		jComboBox1.setBorder(null);
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel6.setForeground(new java.awt.Color(92, 104, 110));
		jLabel6.setText("热度:   ");

		jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel12.setForeground(new java.awt.Color(92, 104, 110));
		jLabel12.setText("\u653e\u6620\u65f6\u95f4\uff1a");

		jComboBox2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jComboBox2.setForeground(new java.awt.Color(92, 104, 110));
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"9:00", "11:00", "13:00", "15:00", "17:00", "19:00", "21:00",
				"23:00" }));
		jComboBox2.setBorder(null);

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel3.setForeground(new java.awt.Color(92, 104, 110));
		jLabel3.setText("\u5bfc\u6f14\u540d\u5b57");

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel5.setForeground(new java.awt.Color(92, 104, 110));
		jLabel5.setText("\u4e3b\u6f14\u540d\u5b57");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel7.setForeground(new java.awt.Color(92, 104, 110));
		jLabel7.setText("\u5f71\u7247\u7c7b\u578b");

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jLabel8.setForeground(new java.awt.Color(92, 104, 110));
		jLabel8.setText("\u5f71\u7247\u7968\u4ef7");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel12,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				90,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jComboBox2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				150,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel9)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel8))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel6)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel7))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel5))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel11)
																						.addComponent(
																								jLabel2))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jComboBox1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								76,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(160, Short.MAX_VALUE)));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGap(24, 24, 24)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																29,
																Short.MAX_VALUE)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																29,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																29,
																Short.MAX_VALUE)
														.addComponent(
																jLabel5,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																29,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																29,
																Short.MAX_VALUE)
														.addComponent(
																jLabel7,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																29,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel9,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																31,
																Short.MAX_VALUE)
														.addComponent(
																jLabel8,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																29,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel11,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																24,
																Short.MAX_VALUE)
														.addComponent(
																jComboBox1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel12,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																24,
																Short.MAX_VALUE)
														.addComponent(
																jComboBox2))
										.addGap(35, 35, 35)));

		jTextField83.setBackground(new java.awt.Color(170, 187, 195));
		jTextField83.setEditable(false);
		jTextField83.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jTextField83.setForeground(new java.awt.Color(255, 255, 255));
		jTextField83.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField83.setText("\u94f6 \u5e55");

		jTextField6.setBackground(new java.awt.Color(202, 222, 231));
		jTextField6.setEditable(false);
		jTextField6.setBorder(null);

		jTextField7.setBackground(new java.awt.Color(202, 222, 231));
		jTextField7.setEditable(false);
		jTextField7.setBorder(null);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												167,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				51,
																				51,
																				51)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jSeparator1,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								823,
																								Short.MAX_VALUE)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jButton6,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																jLabel1,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																153,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField1))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jPanel6,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addGap(
																												18,
																												18,
																												18)
																										.addComponent(
																												jPanel4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				60,
																				60,
																				60)
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				112,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				39,
																				39,
																				39)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jTextField83,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												55,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jPanel5,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												516,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField6,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												55,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addGap(37, 37, 37)).addComponent(
								jPanel2,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addComponent(jPanel3,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(1, 1, 1)
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												31,
																												31,
																												31)
																										.addComponent(
																												jPanel4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												22,
																												22,
																												22)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jPanel6,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				177,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jTextField1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				35,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jButton6,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				37,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)))))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jSeparator1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				10,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												109,
																												109,
																												109)
																										.addComponent(
																												jLabel10))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField83,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												48,
																												Short.MAX_VALUE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jPanel5,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																419,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField7,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																388,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jTextField6,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																387,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))
																		.addContainerGap())
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				1,
																				1,
																				1)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				817,
																				Short.MAX_VALUE)))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		resetSomething();
		jList1.setSelectedIndex(0);
		if(jComboBox2.getSelectedIndex() >=0) {
		jComboBox2.setSelectedIndex(0);
		}
		jRadioButton1.setSelected(true);
		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		jButton9.setEnabled(false);
		if (jRadioButton2.isSelected()) {
			jTextField2.setEnabled(true);
			jButton7.setEnabled(true);
		} else {
			jTextField2.setEnabled(false);
		}

		if (jRadioButton1.isSelected()) {
			jRadioButton1.setSelected(false);
		}
		isvip = true;
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new Employee().saveWorknote(jTextField1.getText());
	}

	private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {
		// TODO add your handling code here:
		if (jTextField2.getText().equals("")) {
			jTextField2.setText("会员卡号");
		}
	}

	private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {
		// TODO add your handling code here:
		if (jTextField2.getText().equals("会员卡号")) {
			jTextField2.setText("");
		}

	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		new Employee().saveWorknote(jButton8.getText());
		new Rankingview().setVisible(true);
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		String path = new Systems().getTrailer(jTextField1.getText());
		
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new Shopview().setVisible(true);
		this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new Vipuserview().setVisible(true);
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField2.setEnabled(false);
		jButton9.setEnabled(false);

		if (jRadioButton2.isSelected()) {
			jRadioButton2.setSelected(false);
			jButton9.setEnabled(true);
			jButton7.setEnabled(false);
		}
		isvip = false;
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (jComboBox1.isFontSet()) {
			jTextField2.enable(true);
		}

	}

	private void jTextField87ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField84ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Mainview().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btn11;
	private javax.swing.JButton btn110;
	private javax.swing.JButton btn12;
	private javax.swing.JButton btn13;
	private javax.swing.JButton btn14;
	private javax.swing.JButton btn15;
	private javax.swing.JButton btn16;
	private javax.swing.JButton btn17;
	private javax.swing.JButton btn18;
	private javax.swing.JButton btn19;
	private javax.swing.JButton btn21;
	private javax.swing.JButton btn210;
	private javax.swing.JButton btn22;
	private javax.swing.JButton btn23;
	private javax.swing.JButton btn24;
	private javax.swing.JButton btn25;
	private javax.swing.JButton btn26;
	private javax.swing.JButton btn27;
	private javax.swing.JButton btn28;
	private javax.swing.JButton btn29;
	private javax.swing.JButton btn31;
	private javax.swing.JButton btn310;
	private javax.swing.JButton btn32;
	private javax.swing.JButton btn33;
	private javax.swing.JButton btn34;
	private javax.swing.JButton btn35;
	private javax.swing.JButton btn36;
	private javax.swing.JButton btn37;
	private javax.swing.JButton btn38;
	private javax.swing.JButton btn39;
	private javax.swing.JButton btn41;
	private javax.swing.JButton btn410;
	private javax.swing.JButton btn42;
	private javax.swing.JButton btn43;
	private javax.swing.JButton btn44;
	private javax.swing.JButton btn45;
	private javax.swing.JButton btn46;
	private javax.swing.JButton btn47;
	private javax.swing.JButton btn48;
	private javax.swing.JButton btn49;
	private javax.swing.JButton btn51;
	private javax.swing.JButton btn510;
	private javax.swing.JButton btn52;
	private javax.swing.JButton btn53;
	private javax.swing.JButton btn54;
	private javax.swing.JButton btn55;
	private javax.swing.JButton btn56;
	private javax.swing.JButton btn57;
	private javax.swing.JButton btn58;
	private javax.swing.JButton btn59;
	private javax.swing.JButton btn61;
	private javax.swing.JButton btn610;
	private javax.swing.JButton btn62;
	private javax.swing.JButton btn63;
	private javax.swing.JButton btn64;
	private javax.swing.JButton btn65;
	private javax.swing.JButton btn66;
	private javax.swing.JButton btn67;
	private javax.swing.JButton btn68;
	private javax.swing.JButton btn69;
	private javax.swing.JButton btn71;
	private javax.swing.JButton btn710;
	private javax.swing.JButton btn72;
	private javax.swing.JButton btn73;
	private javax.swing.JButton btn74;
	private javax.swing.JButton btn75;
	private javax.swing.JButton btn76;
	private javax.swing.JButton btn77;
	private javax.swing.JButton btn78;
	private javax.swing.JButton btn79;
	private javax.swing.JButton btn81;
	private javax.swing.JButton btn810;
	private javax.swing.JButton btn82;
	private javax.swing.JButton btn83;
	private javax.swing.JButton btn84;
	private javax.swing.JButton btn85;
	private javax.swing.JButton btn86;
	private javax.swing.JButton btn87;
	private javax.swing.JButton btn88;
	private javax.swing.JButton btn89;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JList jList1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField83;
	private javax.swing.JTextField jTextField84;
	private javax.swing.JTextField jTextField85;
	private int[][] seat = new Employee().chooseSeat(7,8,"");
	private int[][] waitsize = new int[5][3];
	private float money;
	private boolean isvip = false;
	private List<ManagerHall> mlist = new Employee().managerHall();
	private List<Film> flist = new Employee().showFilm();
	private String pid = null;
	private int hot = -1;
	int bilibili = 0;
	String vip = "";
	
	private void resetSomething(){
		final String[] fnames = new String[flist.size()];
		for(int i = 0;i<flist.size();i++){
			fnames[i] = flist.get(i).getFname();
		}
		jList1.setModel(new javax.swing.AbstractListModel() {
			String[] strings = fnames;

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		
		jList1.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int i = jList1.getSelectedIndex();
				if(jComboBox1.getItemCount()>0) {jComboBox1.removeAllItems();}
				if(jComboBox2.getItemCount()>0) {jComboBox2.removeAllItems();}
				if(i>=0) {
					jLabel1.setText("");
					String path = null;
					try {
						path = new Employee().getFilmcover(jList1.getSelectedValue().toString());
					} catch (UnknownHostException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Image img = new ImageIcon(path).getImage()
							.getScaledInstance(150, 200,
									Image.SCALE_SMOOTH);
					jLabel1.setIcon(new ImageIcon(img));
				}
				for(int a = 0;a<mlist.size();a++){
					System.out.println(mlist.get(a).getHname()+":"+mlist.get(a).getPlayID()+":"+mlist.get(a).getPlaytime());
					if(flist.get(i).getFname().equals(mlist.get(a).getFname())){
						jComboBox2.addItem(mlist.get(a).getStarttime());
					}
				}
				if(jComboBox1.getSelectedIndex()>=0) {
					
				jComboBox1.setSelectedIndex(0);}
				jTextField1.setText(flist.get(i).getFname());
				jLabel3.setText(flist.get(i).getDirector());
				jLabel5.setText(flist.get(i).getStar());
				jLabel7.setText("已有"+flist.get(i).getHot()+"人购票");
				hot = flist.get(i).getHot();
				jLabel7.setForeground(Color.red);
				jLabel8.setText(Float.toString(flist.get(i).getPrice()));		
				if(jComboBox2.getItemCount() == 0) {JOptionPane.showMessageDialog(null, "该电影暂时没有放映信息");
					waitsize = null;
					
					addlistenner();
				}
				
			}
		});
		
		jComboBox2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				// TODO Auto-generated method stub
				
				if(jComboBox2.getSelectedIndex() != -1){
					jComboBox1.removeAllItems();
				for(int a = 0;a<mlist.size();a++){
				if(jComboBox2.getSelectedItem().equals(mlist.get(a).getStarttime())){
					jComboBox1.addItem(mlist.get(a).getHname());
					//自动生成影厅
				}
				}
			}
				if(jComboBox1.getSelectedIndex() != -1 || jComboBox2.getSelectedIndex() != -1) {
					for(int i =0;i<mlist.size();i++) {
						if(jComboBox1.getSelectedItem().equals(mlist.get(i).getHname())  && (jComboBox2.getSelectedItem().equals(mlist.get(i).getStarttime()))) {//不能这样写
							System.out.println("选项栏自动生成座位");
							seat = new Employee().chooseSeat(mlist.get(i).getX(),mlist.get(i).getY(),mlist.get(i).getPlayID());
							pid = mlist.get(i).getPlayID();
							waitsize = new int[5][3];
							addlistenner();
						}
					}
					}	
			}
			
			
		});
		jComboBox1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(jComboBox1.getSelectedIndex() != -1) {
				for(int i =0;i<mlist.size();i++) {
					if(jComboBox1.getSelectedItem().equals(mlist.get(i).getHname())) {
						System.out.println(":"+mlist.get(i).getPlayID());
						System.out.println("选项栏自动生成座位");
						seat = new Employee().chooseSeat(mlist.get(i).getX(),mlist.get(i).getY(),mlist.get(i).getPlayID());
						pid = mlist.get(i).getPlayID();
						waitsize = new int[5][3];
						addlistenner();
					}
				}
				}else {
					seat = new int[1][0];
					pid = "";
					waitsize = new int[5][3];
					addlistenner();
				}
			}
		});
	}

	// End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void addlisten(final JButton jb, final int x, final int y) {
		if(seat.length != 0) {
		int closize = seat.length;
		int rowsize = seat[0].length;
		jb.setEnabled(true);
		jb.setVisible(true);
		if(jb.getActionListeners().length != 0) {
		jb.removeActionListener(jb.getActionListeners()[0]);}
		jb.setBackground(Color.WHITE);
		if (x >= closize || y >= rowsize) {
			jb.setVisible(false);
		} else {
			if (seat[x][y] == 1) {
				System.out.println("aaa" + x + " " + y);
				jb.setEnabled(false);
				jb.setBackground(new Color(202, 222, 231));
			}
			jb.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int a = bilibili++;
					if (jb.getBackground().equals(Color.WHITE)) {

						int i = 0;
						while (true) {
							System.out.println(a);
							if (i == 5) {
								System.out.println("你只能选择五个座位");
								JOptionPane.showMessageDialog(null,"你只能选择五个座位" );
								break;
							}
							if (waitsize[i][0] == 0) {
								waitsize[i][0] = 1;
								waitsize[i][1] = x;
								waitsize[i][2] = y;
								System.out.println("选座成功,剩余" + (4 - i) + "个位置");
								JOptionPane.showMessageDialog(null,"选座成功,剩余" + (4 - i) + "个位置" );
								jb.setBackground(new Color(202, 222, 231));
								break;
							} else {
								i++;
							}

						}
					} else {
						if (jb.getBackground().equals(new Color(202, 222, 231))) {
							int i = 4;
							while (true) {
								if (i == -1) {
									JOptionPane.showMessageDialog(null,"还没有选择座位" );
									break;
								}
								if (waitsize[i][0] == 1) {
									waitsize[i][0] = 0;
									waitsize[i][1] = 0;
									waitsize[i][2] = 0;
									JOptionPane.showMessageDialog(null,"取消选座成功" );
									System.out.println("取消选座成功");
									jb.setBackground(Color.white);
									break;
								} else {
									i--;
								}
							}
						}
					}
				}
			});
		}}
	}

	public void addlistenner() {
		if(!jButton7.getText().equals("重新输入会员卡号")) {
		jTextField2.setEnabled(false);
		jButton7.setEnabled(false);
		}
		 waitsize = new int[5][3];

		addlisten(btn11, 0, 0);
		addlisten(btn12, 0, 1);
		addlisten(btn13, 0, 2);
		addlisten(btn14, 0, 3);
		addlisten(btn15, 0, 4);
		addlisten(btn16, 0, 5);
		addlisten(btn17, 0, 6);
		addlisten(btn18, 0, 7);
		addlisten(btn19, 0, 8);
		addlisten(btn110, 0, 9);

		addlisten(btn21, 1, 0);
		addlisten(btn22, 1, 1);
		addlisten(btn23, 1, 2);
		addlisten(btn24, 1, 3);
		addlisten(btn25, 1, 4);
		addlisten(btn26, 1, 5);
		addlisten(btn27, 1, 6);
		addlisten(btn28, 1, 7);
		addlisten(btn29, 1, 8);
		addlisten(btn210, 1, 9);

		addlisten(btn31, 2, 0);
		addlisten(btn32, 2, 1);
		addlisten(btn33, 2, 2);
		addlisten(btn34, 2, 3);
		addlisten(btn35, 2, 4);
		addlisten(btn36, 2, 5);
		addlisten(btn37, 2, 6);
		addlisten(btn38, 2, 7);
		addlisten(btn39, 2, 8);
		addlisten(btn310, 2, 9);
		addlisten(btn41, 3, 0);
		addlisten(btn42, 3, 1);
		addlisten(btn43, 3, 2);
		addlisten(btn44, 3, 3);
		addlisten(btn45, 3, 4);
		addlisten(btn46, 3, 5);
		addlisten(btn47, 3, 6);
		addlisten(btn48, 3, 7);
		addlisten(btn49, 3, 8);
		addlisten(btn410, 3, 9);
		addlisten(btn51, 4, 0);
		addlisten(btn52, 4, 1);
		addlisten(btn53, 4, 2);
		addlisten(btn54, 4, 3);
		addlisten(btn55, 4, 4);
		addlisten(btn56, 4, 5);
		addlisten(btn57, 4, 6);
		addlisten(btn58, 4, 7);
		addlisten(btn59, 4, 8);
		addlisten(btn510, 4, 9);
		addlisten(btn61, 5, 0);
		addlisten(btn62, 5, 1);
		addlisten(btn63, 5, 2);
		addlisten(btn64, 5, 3);
		addlisten(btn65, 5, 4);
		addlisten(btn66, 5, 5);
		addlisten(btn67, 5, 6);
		addlisten(btn68, 5, 7);
		addlisten(btn69, 5, 8);
		addlisten(btn610, 5, 9);
		addlisten(btn71, 6, 0);
		addlisten(btn72, 6, 1);
		addlisten(btn73, 6, 2);
		addlisten(btn74, 6, 3);
		addlisten(btn75, 6, 4);
		addlisten(btn76, 6, 5);
		addlisten(btn77, 6, 6);
		addlisten(btn78, 6, 7);
		addlisten(btn79, 6, 8);
		addlisten(btn710, 6, 9);
		addlisten(btn81, 7, 0);
		addlisten(btn82, 7, 1);
		addlisten(btn83, 7, 2);
		addlisten(btn84, 7, 3);
		addlisten(btn85, 7, 4);
		addlisten(btn86, 7, 5);
		addlisten(btn87, 7, 6);
		addlisten(btn88, 7, 7);
		addlisten(btn89, 7, 8);
		addlisten(btn810, 7, 9);
	}
}