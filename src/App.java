import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class App extends JFrame{
    private JPanel mainPanel;
    private JTextArea textArea;
    private JButton attachButton;
    private JButton startButton;
    private String textFile;

    private Automaton automaton ;
    public App(String title){
        super(title);
        DefaultCaret caret = (DefaultCaret)textArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.setPreferredSize(new Dimension(600, 800));
        this.setContentPane(mainPanel);
        this.pack();
        startButton.setEnabled(false);
        attachButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt", "text");
            fileChooser.setFileFilter(filter);
            int option = fileChooser.showOpenDialog(this);
            if(option == JFileChooser.APPROVE_OPTION){
                textFile = "";
               startButton.setEnabled(true);
               File file = fileChooser.getSelectedFile();
               textArea.setText("File Selected: " + file.getName()+"\n\n");
                Scanner sc ;
                try {
                    sc = new Scanner(file);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    if(line.length() > 0) {
                        textFile += line+"\n";
                    }
                }
                textArea.append(textFile);
            }else{
               textArea.setText("Open command canceled");
            }
        });
        startButton.addActionListener(e -> {
            automaton = new Automaton(textFile,textArea);
        });
    }




    public static void main(String[] args) {
        JFrame frame = new App("Proyecto Automatas");
        frame.setVisible(true);
    }
}
