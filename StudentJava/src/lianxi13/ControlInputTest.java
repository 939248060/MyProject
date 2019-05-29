package lianxi13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlInputTest extends JFrame{

	JTextField textField;
	public ControlInputTest() {
		super();
		JPanel jPanel = new JPanel();
		textField = new JTextField(30);
		textField.setText("请输入身份证号码");
		textField.setToolTipText("身份证号码只能是15位或者18位数字组成！");
		textField.addFocusListener(new MyFocus());
		textField.addKeyListener(new MyKey());
		JButton jButton = new JButton("确定");
		JLabel jLabel = new JLabel("身份证号码");
		jPanel.add(jLabel);
		jPanel.add(textField);
		jPanel.add(jButton);
		//jPanel.setBackground(Color.red);
		Container container = getContentPane();
		container.add(jPanel,BorderLayout.CENTER);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setTitle("数据验证");
		super.setBounds(100, 100, 500, 150);
		
	}
	public static void main(String[] args) {
        ControlInputTest controlInputTest = new ControlInputTest();
	}
    class MyFocus implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
		   textField.setText("");
		}

		@Override
		public void focusLost(FocusEvent e) {
			String text = textField.getText().trim();
			if(text.length()==0) {
				textField.setText("请输入身份证！");
			}
		}
    	
    }
    class MyKey implements KeyListener{

    	private int length = 0;
    	private int keyCode = 0;
    	private final int VK_0 = KeyEvent.VK_0;
    	private final int VK_9 = KeyEvent.VK_9;
    	private final int VK_NUMPAD0 = KeyEvent.VK_NUMPAD0;
    	private final int VK_NUMPAD9 = KeyEvent.VK_NUMPAD9;
		@Override
		public void keyTyped(KeyEvent e) {
			if(length<18) {
				if(keyCode<VK_0)
					e.consume();
				else if(keyCode>VK_9 && keyCode<VK_NUMPAD0)
					e.consume();
				else if(keyCode>VK_NUMPAD9)
					e.consume();
			}else {
				e.consume();
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			keyCode = e.getKeyCode();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			  length = textField.getText().trim().length();
		}
    	
    }
}
