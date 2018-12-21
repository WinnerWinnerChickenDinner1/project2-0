package player;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
 
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import view.AdminLoginview;

import javax.swing.JButton;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;

import javax.print.attribute.standard.MediaName;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.FlowLayout;
 
public class View extends JFrame {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	EmbeddedMediaPlayerComponent playerComponent;
	private JPanel panel;
	private JButton btnPlay;
	private JButton btnPause;
	private JButton btnStop;
	private JPanel controlpanel;
	private JProgressBar progress;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem openmenu;
	private JMenuItem closemenu;
	private JSlider slider;
	private JPanel panel_1;
	JTextField textField;
	private JMenu menu_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}
 
	/**
	 * Create the frame.
	 */
	public View() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminLoginview.class.getResource("/img/littlelogo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1131, 637);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menu = new JMenu("\u6587\u4EF6");
		menuBar.add(menu);
		
		openmenu = new JMenuItem("\u6253\u5F00");
		menu.add(openmenu);
		
		closemenu = new JMenuItem("\u9000\u51FA");
		menu.add(closemenu);
		
		menu_1 = new JMenu("\u5173\u95ED");
		menu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PlayerMain.stop();
				dispose();
			}
		});
		menu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		menuBar.add(menu_1);
		
		openmenu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PlayerMain.openVideo();
			}
		});
		
		closemenu.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
 
				setVisible(false);
			}
		});
		
		
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Videopanel = new JPanel();
		contentPane.add(Videopanel, BorderLayout.CENTER);
		Videopanel.setLayout(new BorderLayout(0, 0));
		
		playerComponent = new EmbeddedMediaPlayerComponent();
		Videopanel.add(playerComponent);
		
		panel = new JPanel();
		Videopanel.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		controlpanel = new JPanel();
		panel.add(controlpanel);
		
		btnStop = new JButton("stop");
		controlpanel.add(btnStop);
		
		btnPlay = new JButton("play");
		controlpanel.add(btnPlay);
		
		btnPause = new JButton("pause");
		controlpanel.add(btnPause);
		
		slider = new JSlider();
		slider.setValue(100);
		slider.setMaximum(120);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				PlayerMain.setvol(slider.getValue());
			}
		});
		controlpanel.add(slider);
		
		progress = new JProgressBar();
		progress.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				int x=e.getX();
				PlayerMain.jumpTo(((float)x/progress.getWidth()));
				
			}
		});
		progress.setStringPainted(true);
		panel.add(progress, BorderLayout.NORTH);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(170, 187, 195));
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\u7535\u5F71\u540D\u5B57");
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
		textField.setEditable(false);
		textField.setBorder(null);
		textField.setBackground(new Color(110, 123, 129));
		panel_1.add(textField);
		btnPause.addMouseListener(new MouseAdapter() {
	
			public void mouseClicked(MouseEvent e) {
				PlayerMain.pause();
			}
		});
		btnPlay.addMouseListener(new MouseAdapter() {
	
			public void mouseClicked(MouseEvent e) {
				PlayerMain.play();
			}
		});
		btnStop.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
				
				PlayerMain.stop();
			}
		});
	}
	
	public EmbeddedMediaPlayerComponent getPlayerComponent() {
		return playerComponent;
	}
 
	public EmbeddedMediaPlayer  getMediaPlayer() {
		
		return playerComponent.getMediaPlayer();
	}
public JProgressBar getProgressBar(){
		
		return progress;
	}
	
}