import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class NotepadApp extends JFrame implements ActionListener {

    JTextArea textArea;
    JMenuItem newFile, openFile, saveFile, exit;

    NotepadApp() {
        setTitle("Notepad");
        setSize(600, 500);

        textArea = new JTextArea();
        add(new JScrollPane(textArea));

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open");
        saveFile = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.add(exit);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        exit.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == newFile) {
                textArea.setText("");
            }

            if (e.getSource() == openFile) {
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(this);
                File f = fc.getSelectedFile();

                BufferedReader br = new BufferedReader(new FileReader(f));
                textArea.read(br, null);
                br.close();
            }

            if (e.getSource() == saveFile) {
                JFileChooser fc = new JFileChooser();
                fc.showSaveDialog(this);
                File f = fc.getSelectedFile();

                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                textArea.write(bw);
                bw.close();
            }

            if (e.getSource() == exit) {
                System.exit(0);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new NotepadApp();
    }
}