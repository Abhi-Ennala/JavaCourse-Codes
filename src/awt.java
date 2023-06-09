import java.awt.*;

public class awt extends Frame

{
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawRect(235,324,120,170);
        g.setColor(Color.red);
        g.drawLine(30,40,50,60);
        g.fillOval(30,40,20,50);

        g.drawOval(60,40,50,80);
        Font fnt=new Font("Arial",Font.BOLD,40);
        g.setFont(fnt);
        g.drawString("bhavitha",50,70);
    }
    public static void main(String[] args)
    {
        awt gr=new awt();
        gr.setSize(300,400);
        gr.setVisible(true);

}
}