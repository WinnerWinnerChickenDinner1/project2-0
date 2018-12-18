/*
 * AddFilmview.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import info.Commodity;
import info.Company;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import tool.Client;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Toolkit;

/**
 *
 * @author  __USER__
 */
public class AddFilmview extends javax.swing.JFrame {

	/** Creates new form AddFilmview */
	public AddFilmview() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddFilmview.class.getResource("/img/littlelogo.png")));
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
		jLabel1 = new javax.swing.JLabel();
		jButton6 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator2 = new javax.swing.JSeparator();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jPanel2.setBackground(new java.awt.Color(170, 187, 195));

		jButton1.setBackground(new java.awt.Color(110, 123, 129));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 23));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u5f71\u7247\u7ba1\u7406");
		jButton1.setBorder(null);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(170, 187, 195));
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
										.addGap(90, 90, 90)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												172,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												172,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												172,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												172,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												172,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(107, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jButton1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
				.addComponent(jButton2,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 51,
						Short.MAX_VALUE).addComponent(jButton3,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 51,
						Short.MAX_VALUE).addComponent(jButton4,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 51,
						Short.MAX_VALUE).addComponent(jButton8,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 51,
						Short.MAX_VALUE));

		jPanel3.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(170, 187, 195)));

		jButton6.setBackground(new java.awt.Color(202, 222, 231));
		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton6.setForeground(new java.awt.Color(92, 104, 110));
		jButton6.setText("\u9009\u62e9\u56fe\u7247");
		jButton6.setBorder(null);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 21));
		jLabel4.setForeground(new java.awt.Color(104, 114, 117));
		jLabel4.setText("\u7247\u540d\uff1a");

		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 21));
		jLabel7.setForeground(new java.awt.Color(104, 114, 117));
		jLabel7.setText("\u4E3B\u6F14\uFF1A");

		jTextField5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 21));
		jLabel8.setForeground(new java.awt.Color(104, 114, 117));
		jLabel8.setText("\u7968\u4ef7\uff1a");

		jButton9.setBackground(new java.awt.Color(202, 222, 231));
		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton9.setForeground(new java.awt.Color(92, 104, 110));
		jButton9.setText("\u786e\u8ba4\u6dfb\u52a0");
		jButton9.setBorder(null);
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new java.awt.Color(150, 167, 175));
		jButton10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22));
		jButton10.setForeground(new java.awt.Color(255, 255, 255));
		jButton10.setText("\u53d6\u6d88\u6dfb\u52a0");
		jButton10.setBorder(null);
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});
		
		label = new JLabel();
		label.setText("\u5BFC\u6F14\uFF1A");
		label.setForeground(new Color(104, 114, 117));
		label.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 21));
		
		textField = new JTextField();
		textField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addContainerGap(90, Short.MAX_VALUE)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 894, GroupLayout.PREFERRED_SIZE)
						.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 894, GroupLayout.PREFERRED_SIZE))
					.addGap(94))
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(173)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jButton6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
						.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
					.addGap(89)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addComponent(jLabel8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jLabel4)
								.addComponent(jLabel7)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE))))
					.addGap(192))
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(184)
					.addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
					.addGap(59)
					.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(193, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(36)
					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addGap(39)
							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel3Layout.createSequentialGroup()
							.addGap(49)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4))
							.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addGap(46))
								.addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
									.addGap(37)))
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel7)
								.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8))))
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addGap(87))
		);
		jPanel3.setLayout(jPanel3Layout);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						jPanel1Layout.createSequentialGroup().addComponent(
								jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addComponent(jPanel2,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(80, 80,
						80).addComponent(jPanel3,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(93, Short.MAX_VALUE)));

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

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		if(jButton9.getText().equals("确认添加")) {
			if(!f.equals(null)) {
				new Company().setNewFilm(jTextField1.getText(), textField.getText(),jTextField4.getText(),
				Float.parseFloat(jTextField5.getText()), f.getAbsolutePath());
				this.dispose();
				new Adminview().setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "您还没有上传电影海报");
		}
		}else if(jButton9.getText().equals("确认修改")) {
			if(f != null) {
				new Company().setLastFilm(jTextField1.getText(), textField.getText(),jTextField4.getText(),
				Float.parseFloat(jTextField5.getText()), f.getAbsolutePath());
				
			}else {
				JOptionPane.showMessageDialog(null, "您选择不修改电影海报");
				new Company().setLastFilm(jTextField1.getText(), textField.getText(),jTextField4.getText(),
						Float.parseFloat(jTextField5.getText()), null);
			}
			
			this.dispose();
			new Adminview().setVisible(true);
		}
	}

	private File f = null;

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);
		f = jfc.getSelectedFile();
		if (!f.exists()) {
			JOptionPane.showMessageDialog(this, "图片不存在");
		} else if (!f.getAbsolutePath().endsWith(".jpg")) {
			JOptionPane.showMessageDialog(this, "格式不对");
		} else {
			String path = f.getAbsolutePath();
			Image img = new ImageIcon(path).getImage()
					.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),
							Image.SCALE_SMOOTH);
			this.jLabel1.setIcon(new ImageIcon(img));
		}
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		new Adminview().setVisible(true);
		this.dispose();
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
		new Hallview().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Adminview().setVisible(true);
		this.dispose();
	}
	
	public void changeFilm(String fname) {
		jTextField1.setEnabled(false);
		jTextField1.setText(fname);
		jButton9.setText("确认修改");
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddFilmview().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private JLabel label;
	private JTextField textField;
}