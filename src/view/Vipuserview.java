/*
 * Vipuserview.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Toolkit;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import info.Company;
import info.Employee;

/**
 *
 * @author  __USER__
 */
public class Vipuserview extends javax.swing.JFrame {

	/** Creates new form Vipuserview */
	public Vipuserview() {
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
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jPanel2.setBackground(new java.awt.Color(170, 187, 195));

		jButton1.setBackground(new java.awt.Color(170, 187, 195));
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

		jButton3.setBackground(new java.awt.Color(110, 123, 129));
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
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(169, 169, 169)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												172,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(116, 116, 116)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												172,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												127, Short.MAX_VALUE)
										.addComponent(
												jButton3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												172,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(143, 143, 143)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jButton1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 53,
								Short.MAX_VALUE).addComponent(jButton2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 53,
								Short.MAX_VALUE)).addComponent(jButton3,
				javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE));

		jPanel3.setBackground(new java.awt.Color(202, 222, 231));

		jButton7.setBackground(new java.awt.Color(230, 239, 244));
		jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton7.setForeground(new java.awt.Color(110, 123, 129));
		jButton7.setText("VIP\u7528\u6237");
		jButton7.setBorder(null);
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton7ActionPerformed(evt);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton8.setBackground(new java.awt.Color(202, 222, 231));
		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton8.setForeground(new java.awt.Color(110, 123, 129));
		jButton8.setText("\u4f1a\u5458\u529e\u7406");
		jButton8.setBorder(null);
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setBackground(new java.awt.Color(202, 222, 231));
		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton9.setForeground(new java.awt.Color(110, 123, 129));
		jButton9.setText("\u7528\u6237\u5145\u503c");
		jButton9.setBorder(null);
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addGap(234, 234, 234)
						.addComponent(jButton7,
								javax.swing.GroupLayout.PREFERRED_SIZE, 169,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								56, 56, 56).addComponent(jButton8,
								javax.swing.GroupLayout.PREFERRED_SIZE, 169,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								52, 52, 52).addComponent(jButton9,
								javax.swing.GroupLayout.PREFERRED_SIZE, 169,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(222, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel3Layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jButton9,
								javax.swing.GroupLayout.DEFAULT_SIZE, 41,
								Short.MAX_VALUE).addComponent(jButton7,
								javax.swing.GroupLayout.DEFAULT_SIZE, 41,
								Short.MAX_VALUE).addComponent(jButton8,
								javax.swing.GroupLayout.DEFAULT_SIZE, 41,
								Short.MAX_VALUE)));

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));

		jTable1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 17));
		jTable1.setForeground(new java.awt.Color(110, 123, 129));
		
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				obj, new String[] {
						"用户编号", "用户姓名", "备注", "用户余额" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1071,
				Short.MAX_VALUE));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel3,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
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
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel4,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

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

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		new Topview().setVisible(true);
		this.dispose();
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		new Transactionview().setVisible(true);
		this.dispose();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) throws UnknownHostException, IOException, ClassNotFoundException {
		JOptionPane.showMessageDialog(null, "你已在该页面");
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new Shopview().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Mainview().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Vipuserview().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private Object[][] obj = new Employee().showVipUser();
	// End of variables declaration//GEN-END:variables

}