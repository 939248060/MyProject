package lianxi13;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageFrame extends JFrame{

	private JButton nullButton;
	private JPanel jPanelButtom;
    public ImageFrame() {
    	super();
		BorderLayout borderLayout = new BorderLayout();
		GridLayout gridLayout = new GridLayout(3,3);
		JPanel jPanelTop = new JPanel();
		jPanelTop.setLayout(new BorderLayout());
		jPanelTop.setBounds(0, 0, 300, 100);
		jPanelTop.setBackground(Color.RED);
		JLabel modelLabel = new JLabel();
		modelLabel.setSize(100, 100);
		
		
		modelLabel.setIcon(new ImageIcon("./image/image01.jpg"));
		jPanelTop.add(modelLabel,BorderLayout.WEST);
		JButton nextButton = new JButton("下一局");
		nextButton.setName("next");
		nextButton.addActionListener(new ImageButtonAction());
		nextButton.setMargin(new Insets(0, 0, 0, 0));
		jPanelTop.add(nextButton,BorderLayout.CENTER);
	    jPanelButtom = new JPanel();
		jPanelButtom.setBounds(0, 0, 300, 400);
		jPanelButtom.setBackground(Color.blue);
		jPanelButtom.setLayout(gridLayout);
	    String[][] images = reorder();
	    for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				JButton jButton = new JButton();
				jButton.setName(i+""+j);
				if(images[i][j].equals("00.gif"))
					nullButton = jButton;
				jButton.setIcon(new ImageIcon("./image/"+images[i][j]));
				jButton.addActionListener(new ImageButtonAction());
				jPanelButtom.add(jButton);
				
			}
		}
		//Container 主窗体的对象
		Container container =  super.getContentPane();
		super.setTitle("拼图游戏");
		super.setResizable(false);
		super.setBounds(100, 100, 240, 470);
		container.setLayout(borderLayout);
		container.add(jPanelTop,BorderLayout.NORTH);
		container.add(jPanelButtom,BorderLayout.CENTER);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    //产生随机图片序列
	private String[][] reorder(){
		//创建一个正确序列的二维数组
		String exactnessOrder[][] = new String[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				exactnessOrder[i][j]=""+i+""+j+".gif";
			}
		}
		//创建一个打乱后序列的二维数组，把打乱后的二维数组返回
		String[][] stochasticOrder = new String[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				while (stochasticOrder[i][j]==null) {
					int r = (int)(Math.random()*3);
					int c = (int)(Math.random()*3);
					if(exactnessOrder[r][c]!=null) {
						stochasticOrder[i][j] = exactnessOrder[r][c];
						exactnessOrder[r][c]=null;
					}
				}
			}
		}
		return stochasticOrder;
	}
	public static void main(String[] args) {
		
		ImageFrame imageFrame = new ImageFrame();
		imageFrame.setVisible(true);
	}
    //监听类，监听按钮的点击事件
	class ImageButtonAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton clickButton = (JButton) e.getSource();
			//判断是否点击了下一局按钮
			if(clickButton.getName().equals("next")) {
				String[][] images = reorder();
				int l = 0;
			    for (int i=0;i<3;i++) {
					for (int j=0;j<3;j++) {
						//获取jPanelButtom已经存在的按钮，进行修改里的属性，在这里可以避免重复创建JButton对象
						JButton jButton = (JButton) jPanelButtom.getComponent(l++);
						if(images[i][j].equals("00.gif"))
							nullButton = jButton;
						jButton.setIcon(new ImageIcon("./image/"+images[i][j]));
						
					}
				}
			}else {
			
			String nullButtonName = nullButton.getName();
			char nr = nullButtonName.charAt(0);
			char nc = nullButtonName.charAt(1);
			
			String clickButtonName = clickButton.getName();
			char cr = clickButtonName.charAt(0);
			char cc = clickButtonName.charAt(1);
			if(Math.abs(cr-nr)+Math.abs(cc-nc) == 1) {
				nullButton.setIcon(clickButton.getIcon());
				clickButton.setIcon(new ImageIcon("./image/00.gif"));
				nullButton = clickButton;
			}
			}
			
		}
	}	
}

