package player;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.SwingWorker;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
 
public class PlayerMain {
	static View frame;
 
	public void  init(String path,String name) {
 
		 NativeLibrary.addSearchPath(  
				    RuntimeUtil.getLibVlcLibraryName(), "d:\\VLC\\sdk\\lib"); 
		 System.out.println(RuntimeUtil.getLibVlcLibraryName());
		 Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(),LibVlc.class);  
				  
				  EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								frame = new View();
								frame.setVisible(true);
								
								frame.getMediaPlayer().prepareMedia(path);
								frame.textField.setText("                              "+name+"                              ");
								new SwingWorker<String , Integer>() {
 
									@Override
									protected String doInBackground() throws Exception {
										while(true){
										long total = frame.getMediaPlayer().getLength();
										long curr = frame.getMediaPlayer().getTime();
										float percent = (float)curr/total;
										publish((int)(percent*100));
										Thread.sleep(100);
										}
									}
									
									protected void process(java.util.List<Integer> chunks) {
										
										for (int v:chunks) {
											frame.getProgressBar().setValue(v);
										}
									};
 
								}.execute();
								
								play();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
	}
	//鎾斁鎸夐挳
	public static void play(){
		
		frame.getMediaPlayer().play();
	}
	//鏆傚仠鎸夐挳
	public  static void  pause() {
		frame.getMediaPlayer().pause();
	}
	//鍋滄鎸夐挳
	public static void stop(){
		frame.getMediaPlayer().stop();
	}
	//璺宠浆鎸夐挳
	public static void jumpTo(float to){
		frame.getMediaPlayer().setTime((long)(to*frame.getMediaPlayer().getLength()));
	}
	//闊抽噺鎸夐挳
	public static void setvol(int v){
		frame.getMediaPlayer().setVolume(v);
	}
	//鎵撳紑鏂囦欢
	public static void openVideo(){
		JFileChooser chooser = new JFileChooser();
		int v = chooser.showOpenDialog(null);
		if (v== JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			frame.getMediaPlayer().playMedia(file.getAbsolutePath());
		}
	}
	//閫�鍑�
	public static void exit(){
		frame.getMediaPlayer().release();
		System.exit(0);
	}
}