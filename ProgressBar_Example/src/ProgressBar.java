import javax.swing.*;

public class ProgressBar extends JFrame{

private JProgressBar jb;
int i = 0;

public ProgressBar()
{
    jb = new JProgressBar(0, 2000);
    jb.setBounds(40, 40, 160, 30);
    jb.setValue(0);
    jb.setStringPainted(true);
    this.add(jb);
    this.setSize(250, 150);
    this.setLayout(null);
}
public void iterate()
{
    while (i <= 2000)
    {
        jb.setValue(i);
        i = i + 20;
        try{Thread.sleep(150);}catch(Exception e){}
    }
}
    public static void main(String[] args) throws Exception {
        ProgressBar jit = new ProgressBar();
        jit.setVisible(true);
        jit.iterate();
    }
}
