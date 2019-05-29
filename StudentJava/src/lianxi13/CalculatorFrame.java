package lianxi13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculatorFrame extends JFrame {

	String[][] buttomArea = { { "1", "2", "3", " + " }, { "4", "5", "6", " - " }, { "7", "8", "9", " * " },
			{ ".", "0", " = ", " / " } };
	TextField textField;

	public CalculatorFrame() {
		super();
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = super.getContentPane();
		BorderLayout borderLayout = new BorderLayout();
		// 设置头部的JPanel属性
		JPanel jp_top = new JPanel();
		textField = new TextField("0", 30);
		textField.setEditable(false);
		jp_top.add(textField);
		container.setLayout(borderLayout);
		container.add(jp_top, BorderLayout.NORTH);
		// 设置中部的JPanel属性
		JPanel jp_center = new JPanel();
		jp_center.setLayout(new BorderLayout());
		JPanel jp_center_top = new JPanel();
		JPanel jp_center_center = new JPanel();
		jp_center_center.setBackground(Color.black);
		String[] area = { " <--   ", "  CE  ", "  C  " };
		int i = 0;
		for (String string : area) {
			JButton jButton = new JButton(string);
			jButton.setName(++i + "");
			jButton.addActionListener(new OperationAction());
			jp_center_top.add(jButton);
		}
		jp_center_center.setLayout(new GridLayout(4, 4));
		for (String[] strings : buttomArea) {
			for (String string : strings) {
				JButton jButton = new JButton(string);
				jButton.setName(string);
				jButton.addActionListener(new ButtomAction());
				jp_center_center.add(jButton);
			}
		}
		jp_center.add(jp_center_top, BorderLayout.NORTH);
		jp_center.add(jp_center_center, BorderLayout.CENTER);
		container.add(jp_center, BorderLayout.CENTER);
		jp_center.setBackground(Color.blue);
		super.setTitle("计算器");
		super.setBounds(100, 100, 250, 350);
	}

	public static void main(String[] args) {

		CalculatorFrame calculatorFrame = new CalculatorFrame();

		calculatorFrame.setVisible(true);

	}

	StringBuffer stringBuffer = new StringBuffer();

	// 数字，操作符的按钮监听
	class ButtomAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton clickBtn = (JButton) e.getSource();
			String name = clickBtn.getName();
			if(name.equals(" = ")) {
				String[] ch = stringBuffer.toString().split(" ");
				stringBuffer.setLength(0);
				if(ch.length!=3) { textField.setText("输入格式错误");return;}
				if(!ch[0].matches("^[-+]?\\d+(\\.\\d+)?$")) { textField.setText("输入操作数必须是数字");return;}
				if(!ch[0].matches("^[-+]?\\d+(\\.\\d+)?$")) { textField.setText("输入操作数必须是数字");return;}
				double num1 = Double.parseDouble(ch[0]);
				double num2 = Double.parseDouble(ch[2]);
				switch (ch[1]) {
				case "+":
                    stringBuffer.append(num1+num2);
					break;
				case "-":
					stringBuffer.append(num1-num2);
					break;
				case "*":
					stringBuffer.append(num1*num2);
					break;
				case "/":
					stringBuffer.append(num1/num2);
					break;

				default:
					break;
				}
			}
			else {
				stringBuffer.append(name);
			}
			textField.setText(stringBuffer.toString());
		}

	}

	// 操作按钮监听
	class OperationAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton operation = (JButton) e.getSource();
			String op = operation.getName();
			switch (op) {
			case "1":
				if (stringBuffer.length() > 0)
					stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
				break;
			case "2":

				stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
				break;
			case "3":
				stringBuffer.setLength(0);
				break;
			default:
				break;
			}
			textField.setText(stringBuffer.toString());
		}

	}
}
