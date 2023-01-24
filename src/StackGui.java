import javax.swing.*;

public class StackGui extends JFrame {

    Stack stack = new Stack(5);
    JLabel stackLabel = new JLabel("Stack");
    JLabel[] label = new JLabel[5];
    JTextField textField;

    JButton insertBtn,deleteBtn,updateBtn;

    StackGui() {

        stackLabel.setBounds(790,100,100,30);


        deleteBtn = new JButton("DELETE");
        deleteBtn.setBounds(510,10,80,30);

        updateBtn = new JButton("UPDATE");
        updateBtn.setBounds(600,10,80,30);

        insertBtn = new JButton("INSERT");
        insertBtn.setBounds(10,10,80,30);

        textField = new JTextField();
        textField.setBounds(100,10,400,30);

        int y=300;
        for (int i = 0; i < label.length; i++) {
            label[i]= new JLabel();
            label[i].setBounds(800,y,100,30);
            this.add(label[i]);
            y-=40;
        }
        insertBtn.addActionListener(e ->{
                stack.push(Integer.parseInt(textField.getText()));
                label[stack.top].setText(textField.getText());
                textField.setText("");
        });

        updateBtn.addActionListener(e ->{
            stack.pop();
            stack.push(Integer.parseInt(textField.getText()));
            label[stack.top].setText(textField.getText());
            textField.setText("");
        });

        deleteBtn.addActionListener(e ->{
            label[stack.top].setText("");
            stack.pop();
        });

//      _______________JFrame_______________
        this.setSize(1000,600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(stackLabel);
        this.add(textField);
        this.add(insertBtn);
        this.add(deleteBtn);
        this.add(updateBtn);

    }

}