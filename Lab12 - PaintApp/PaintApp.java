import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PaintApp extends JFrame {

    ArrayList<Point> points = new ArrayList<>();

    PaintApp() {
        setTitle("Simple Paint");
        setSize(600, 500);

        JPanel panel = new JPanel() {

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                for (int i = 1; i < points.size(); i++) {
                    Point p1 = points.get(i - 1);
                    Point p2 = points.get(i);

                    // Avoid drawing line when mouse is released
                    if (p1 != null && p2 != null) {
                        g.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }
            }
        };

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }
        });

        panel.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                points.add(null); // break line
            }
        });

        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintApp();
    }
}