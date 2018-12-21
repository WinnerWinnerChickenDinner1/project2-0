package tool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class ServerView extends JFrame {

	private JPanel contentPane;
	private JButton button_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerView frame = new ServerView();
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
	public ServerView() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ServerView.class.getResource("/img/littlelogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		TextArea textArea = new TextArea();
		
		textArea.setFont(new Font("ºÚÌå", Font.PLAIN, 20));
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(170, 187, 195));
		scrollPane.setColumnHeaderView(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setText("        \u670D\u52A1\u7AEF\u63A7\u5236\u5668        ");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
		textField.setEditable(false);
		textField.setBorder(null);
		textField.setBackground(new Color(110, 123, 129));
		panel_1.add(textField);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(170, 187, 195));
		panel.setBorder(null);
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Label label = new Label("port:");
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(label);
		
		Label label_1 = new Label("0000");
		label_1.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.add(label_1);
		
		JButton button = new JButton("\u5F00\u542F\u670D\u52A1\u7AEF");
		button.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		button.setBackground(new Color(110, 123, 129));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					button_1.setEnabled(true);
					button.setEnabled(false);
					button_1.setBackground(new Color(110, 123, 129));
					button.setBackground(new java.awt.Color(170, 187, 195));
					try {
						server = new Server(textArea);
						label_1.setText(""+server.ss.getLocalPort());
						
						new Thread(new Runnable() {
							
							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									while(true){
										 server.s = server.ss.accept();
										 textArea.append("IP:"+server.s.getInetAddress().getHostAddress()+"\t");
										 System.out.println(server.s);
										 new Thread(server).start();
										 }
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} 
							}
						}).start();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
			}
		});
		panel.add(button);
		
		
		button_1 = new JButton("\u5173\u95ED\u670D\u52A1\u7AEF");
		button_1.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		button_1.setEnabled(false);
		button_1.setBackground(new java.awt.Color(170, 187, 195));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					button.setBackground(new Color(110, 123, 129));
					button_1.setBackground(new java.awt.Color(170, 187, 195));
					button_1.setEnabled(false);
					button.setEnabled(true);
					label_1.setText("0000");
					textArea.setText("");
					server.ss.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(button_1);
		
	}
	
	Server server ;
	private JTextField textField;
}
