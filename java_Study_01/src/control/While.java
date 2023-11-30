package control;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class While {


	public static void main(String[] args) throws IOException {
		// while vs for
		// 무한 반복에서 많이 사용
		// 유한 반복에서 많이 사용
		int i = 1;

		while (i <= 15) {

			System.out.println(i++ + "번 넘어가노오오오오");
			System.out.println("나무 존나게 아프노!!");

		}

		System.out.println("나무가 졸라게 넘어갔습니다.");
		
		// JLabel.setIcon() 을 이용해서 나무 사진 출력하기
		// 나무사진 다운 받아서 불러줘야함!! 경로는 사람 마다 다룸
		File file = new File("C:\\Users\\user\\Desktop\\java_Study\\java_Study_01\\src\\java_Basic\\나무.png");
        BufferedImage bufferedImage = ImageIO.read(file);

        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout());
        
        jFrame.setSize(500, 500);
        JLabel jLabel = new JLabel();

        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
