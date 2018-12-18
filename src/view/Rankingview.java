/*
 * Rankingview.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import tool.Systems;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author  __USER__
 */
public class Rankingview extends javax.swing.JFrame {

	/** Creates new form Rankingview */
	public Rankingview() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminLoginview.class.getResource("/img/littlelogo.png")));
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jButton5 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel1 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addGap(169)
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addGap(94)
					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addGap(192))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
					.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
				.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
		);
		jPanel2.setLayout(jPanel2Layout);

		jPanel3.setBackground(new java.awt.Color(202, 222, 231));

		jButton5.setBackground(new java.awt.Color(202, 222, 231));
		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jButton5.setForeground(new java.awt.Color(110, 123, 129));
		jButton5.setText("\u653e\u6620\u5217\u8868");
		jButton5.setBorder(null);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(230, 239, 244));
		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jButton8.setForeground(new java.awt.Color(110, 123, 129));
		jButton8.setText("\u6392\u884c\u699c");
		jButton8.setBorder(null);

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

		jTextField1.setBackground(new java.awt.Color(202, 222, 231));
		jTextField1.setEditable(false);
		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jTextField1.setForeground(new java.awt.Color(92, 104, 110));
		jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField1.setText("\u6392\u540d\u7b2c\u4e00");

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("\u7535\u5f71\u5c01\u9762");
		jLabel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		jTextField2.setBackground(new java.awt.Color(202, 222, 231));
		jTextField2.setEditable(false);
		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jTextField2.setForeground(new java.awt.Color(92, 104, 110));
		jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField2.setText("\u300a\u7247\u540d\u300b");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("\u7535\u5f71\u5c01\u9762");
		jLabel2.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		jTextField3.setBackground(new java.awt.Color(202, 222, 231));
		jTextField3.setEditable(false);
		jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jTextField3.setForeground(new java.awt.Color(92, 104, 110));
		jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField3.setText("\u300a\u7247\u540d\u300b");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("\u7535\u5f71\u5c01\u9762");
		jLabel3.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		jTextField4.setBackground(new java.awt.Color(202, 222, 231));
		jTextField4.setEditable(false);
		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jTextField4.setForeground(new java.awt.Color(92, 104, 110));
		jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField4.setText("\u300a\u7247\u540d\u300b");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel4.setText("\u7535\u5f71\u5c01\u9762");
		jLabel4.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				obj, new String[] { "排名",
						"电影名", "导演","主演", "热度" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel2,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jPanel3,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(42, 42, 42)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																218,
																Short.MAX_VALUE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																218,
																Short.MAX_VALUE))
										.addGap(37, 37, 37)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																218,
																Short.MAX_VALUE)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																218,
																Short.MAX_VALUE))
										.addGap(36, 36, 36)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																218,
																Short.MAX_VALUE)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																218,
																Short.MAX_VALUE))
										.addGap(37, 37, 37)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																218,
																Short.MAX_VALUE)
														.addComponent(
																jLabel4,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																218,
																Short.MAX_VALUE))
										.addGap(54, 54, 54))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(31, 31, 31)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jSeparator1,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																1004,
																Short.MAX_VALUE))
										.addContainerGap(43, Short.MAX_VALUE)));
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
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				259,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				259,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				259,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				259,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(18, 18, 18)
										.addComponent(
												jSeparator1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1078,
				Short.MAX_VALUE).addComponent(jPanel1,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 908,
				Short.MAX_VALUE).addComponent(jPanel1,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		init();
		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Mainview().setVisible(true);
		this.dispose();
	}

	

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new Vipuserview().setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new Shopview().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Rankingview().setVisible(true);
				
			}
		});
	}
	
	public void init() {
		String[] names = {obj[0][1].toString(),obj[1][1].toString(),obj[2][1].toString(),obj[3][1].toString()};
		JLabel[] jLabels = {jLabel1,jLabel2,jLabel3,jLabel4}; 
		JTextField[] texts = {jTextField1,jTextField2,jTextField3,jTextField4};
		new Systems().gettop4(names,jLabels,texts);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	Object[][] obj= new Systems().getRank();
	// End of variables declaration//GEN-END:variables

}