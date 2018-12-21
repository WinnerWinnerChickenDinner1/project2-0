/*
 * Hallview.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

import info.Company;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author  __USER__
 */
public class Hallview extends javax.swing.JFrame {

	private static final String[][] Object = null;
	/** Creates new form Hallview */
	public Hallview() {
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
		jButton4 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jPanel2.setBackground(new java.awt.Color(170, 187, 195));

		jButton1.setBackground(new java.awt.Color(170, 187, 195));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u5f71\u7247\u7ba1\u7406");
		jButton1.setBorder(null);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(110, 123, 129));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u5f71\u5385\u7ba1\u7406");
		jButton2.setBorder(null);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(170, 187, 195));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u5546\u54c1\u7ba1\u7406");
		jButton3.setBorder(null);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setBackground(new java.awt.Color(170, 187, 195));
		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u64cd\u4f5c\u8bb0\u5f55");
		jButton4.setBorder(null);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton8.setBackground(new java.awt.Color(170, 187, 195));
		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jButton8.setForeground(new java.awt.Color(255, 255, 255));
		jButton8.setText("\u7528\u6237\u7ba1\u7406");
		jButton8.setBorder(null);
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});
		
		button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Showreason().setVisible(true);
			}
		});
		button.setText("\u5220\u9664\u539F\u56E0");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 23));
		button.setBorder(null);
		button.setBackground(new Color(170, 187, 195));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
					.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
					.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
					.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addComponent(jButton8, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
					.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
		);
		jPanel2.setLayout(jPanel2Layout);
        obj=new Company().showmoviehall();
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				obj, new String[] { "影厅编号",
						"放映电影", "放映时间", "容量","播放时长","播放序号" }));
		jScrollPane1.setViewportView(jTable1);
		jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jTable1AncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1079,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		jButton6.setBackground(new java.awt.Color(150, 167, 175));
		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton6.setForeground(new java.awt.Color(255, 255, 255));
		jButton6.setText("\u4fee\u6539\u5f71\u5385");
		jButton6.setBorder(null);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setBackground(new java.awt.Color(202, 222, 231));
		jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton7.setForeground(new java.awt.Color(92, 104, 112));
		jButton7.setText("\u5f71\u5385\u4e0a\u6620");
		jButton7.setBorder(null);
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton9.setBackground(new java.awt.Color(150, 167, 175));
		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton9.setForeground(new java.awt.Color(255, 255, 255));
		jButton9.setText("\u5f71\u5385\u4e0b\u6620");
		jButton9.setBorder(null);
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap(
								168, Short.MAX_VALUE).addComponent(jButton6,
								javax.swing.GroupLayout.PREFERRED_SIZE, 223,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								38, 38, 38).addComponent(jButton7,
								javax.swing.GroupLayout.PREFERRED_SIZE, 223,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								38, 38, 38).addComponent(jButton9,
								javax.swing.GroupLayout.PREFERRED_SIZE, 223,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								166, 166, 166)));
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
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(45, 45, 45)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																47,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																47,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																47,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(57, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		int i = jTable1.getSelectedRow();
		if(i==-1){
			JOptionPane.showMessageDialog(null,"请选择一行信息在进行操作");
		}
		else{
			String why = "未输入原因";
			why  =JOptionPane.showInputDialog("请输入修改原因");
			String happened = "删除了"+obj[i][0].toString()+"号厅放映的"+obj[i][1]+",放映时间为："+obj[i][2].toString();
			
		new Company().deletemoviehall(obj[i][5].toString());
		new Company().saveReason(why, happened);
		obj=new Company().showmoviehall();
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				obj, new String[] { "影厅编号",
						"放映电影", "放映时间", "容量","播放时长","播放序号" }));
		
		}
	               	}
	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		new AddShowview().setVisible(true);
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		int i = jTable1.getSelectedRow();
		
		
		AddHallview add = new AddHallview();
		add.setVisible(true);
		add.getUpdate(obj[i][0],obj[i][1],obj[i][2],obj[i][3]);
		setVisible(false);
	               	}

	

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		new AUserview().setVisible(true);
		this.dispose();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new Operationview().setVisible(true);
		this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new Commodityview().setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new Hallview().setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Adminview().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Hallview().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private Object[][] obj;
	private JButton button;
}