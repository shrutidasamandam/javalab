import java.awt.*;
import java.awt.event.*;

class SampleDialog extends Dialog implements ActionListener
{
    Division div;
    SampleDialog(Frame parent, String title)
    {
        super(parent,title,false);
        div=(Division)parent;
        setLayout(new FlowLayout());
        setSize(400,150);
        add(new Label(div.msg));
        Button b;
        add(b=new Button("OK"));
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        dispose();
    }
}

public class Division extends Frame implements ActionListener
{
    String msg = "";
    String msg1 = "";
    TextField n1,n2,res;
    Button b;
    Label result = new Label("Result:",Label.RIGHT);

    public Division(){
        setLayout(new FlowLayout());
        Label num1 = new Label("Number 1 :",Label.RIGHT);
        Label num2 = new Label("Number 2 :",Label.RIGHT);
        Button div = new Button("Divide");
        n1 = new TextField(10);
        n2 = new TextField(10);
        res = new TextField(35);

        add(num1);
        add(n1);
        add(num2);
        add(n2);
        b=(Button)add(div);
        add(result);
        add(res);

        n1.addActionListener(this);
        n2.addActionListener(this);
        b.addActionListener(this);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public static void main(String args[]) {
        Division appwin = new Division();
        appwin.setSize(new Dimension(450,180));
        appwin.setTitle("Integer-Division");
        appwin.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(!(n1.getText().equals("")&&!(n2.getText().equals(""))))
        {
            try
            {
                msg1 = ""+(Integer.parseInt(n1.getText()))/Integer.parseInt(n2.getText());
                res.setText(msg1);
            }
            catch(NumberFormatException e)
            {
                msg="ERROR: Enter ONLY Integers!";
                res.setText("");
                SampleDialog d = new SampleDialog(this, "ERROR");
                d.setVisible(true);
            }
            catch(ArithmeticException e)
            {
                msg="ERROR: Division CANNOT be ZERO!";
                res.setText("");
                SampleDialog d = new SampleDialog(this, "ERROR");
                d.setVisible(true);
            }
        }
        else {
            msg = "ERROR: Number Fields should NOT be EMPTY!";
            res.setText("");
            SampleDialog d = new SampleDialog(this,"ERROR");
            d.setVisible(true);
        }
    }
}
