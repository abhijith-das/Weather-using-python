import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalcDemo extends JFrame implements ActionListener{
JFrame f;
JTextField box,opbox,sbox;
JButton mod,seven,four,one,c,div,eight,five,two,zero,mul,nin,six,three,dot,sub,ad,eq;
JLabel calc;
double a=0,b=0,result=0;
int operator=0,fl=0;;
CalcDemo(){
setSize(330,550);
getContentPane().setBackground(new Color(38,38,38));
calc= new JLabel(&quot;CALCULATOR&quot;);
calc.setForeground(Color.WHITE);
calc.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
calc.setBounds(100,10,200,20);
opbox = new JTextField();
opbox.setBounds(250,40,40,100);
opbox.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 35));
sbox=new JTextField();
sbox.setBounds(20,40,230,50);
sbox.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
box= new JTextField();
box.setBounds(20,90,230,50);
box.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
add(calc);
add(sbox);
add(opbox);
add(box);
mod= new JButton(&quot;%&quot;);
mod.setBounds(20,150,60,60);
mod.setBackground(Color.BLACK);
mod.setForeground(Color.WHITE);
mod.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));

mod.setBorder(BorderFactory.createLineBorder(Color.white));
add(mod);
seven= new JButton(&quot;7&quot;);
seven.setBounds(20,220,60,60);
seven.setBackground(Color.BLACK);
seven.setForeground(Color.WHITE);
seven.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
seven.setBorder(BorderFactory.createLineBorder(Color.white));
add(seven);
four= new JButton(&quot;4&quot;);
four.setBounds(20,290,60,60);
four.setBackground(Color.BLACK);
four.setForeground(Color.WHITE);
four.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
four.setBorder(BorderFactory.createLineBorder(Color.white));
add(four);
one= new JButton(&quot;1&quot;);
one.setBounds(20,360,60,60);
one.setBackground(Color.BLACK);
one.setForeground(Color.WHITE);
one.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
one.setBorder(BorderFactory.createLineBorder(Color.white));
add(one);
c= new JButton(&quot;C&quot;);
c.setBounds(20,430,60,60);
c.setBackground(Color.RED);
c.setForeground(Color.BLACK);
c.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
c.setBorder(BorderFactory.createLineBorder(Color.white));
add(c);
div= new JButton(&quot;/&quot;);
div.setBounds(90,150,60,60);
div.setBackground(Color.BLACK);
div.setForeground(Color.WHITE);
div.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
div.setBorder(BorderFactory.createLineBorder(Color.white));

add(div);
eight= new JButton(&quot;8&quot;);
eight.setBounds(90,220,60,60);
eight.setBackground(Color.BLACK);
eight.setForeground(Color.WHITE);
eight.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
eight.setBorder(BorderFactory.createLineBorder(Color.white));
add(eight);
five= new JButton(&quot;5&quot;);
five.setBounds(90,290,60,60);
five.setBackground(Color.BLACK);
five.setForeground(Color.WHITE);
five.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
five.setBorder(BorderFactory.createLineBorder(Color.white));
add(five);
two= new JButton(&quot;2&quot;);
two.setBounds(90,360,60,60);
two.setBackground(Color.BLACK);
two.setForeground(Color.WHITE);
two.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
two.setBorder(BorderFactory.createLineBorder(Color.white));
add(two);
zero= new JButton(&quot;0&quot;);
zero.setBounds(90,430,60,60);
zero.setBackground(Color.BLACK);
zero.setForeground(Color.WHITE);
zero.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
zero.setBorder(BorderFactory.createLineBorder(Color.white));
add(zero);
mul= new JButton(&quot;*&quot;);
mul.setBounds(160,150,60,60);
mul.setBackground(Color.BLACK);
mul.setForeground(Color.WHITE);
mul.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
mul.setBorder(BorderFactory.createLineBorder(Color.white));
add(mul);

nin= new JButton(&quot;9&quot;);
nin.setBounds(160,220,60,60);
nin.setBackground(Color.BLACK);
nin.setForeground(Color.WHITE);
nin.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
nin.setBorder(BorderFactory.createLineBorder(Color.white));
add(nin);
six= new JButton(&quot;6&quot;);
six.setBounds(160,290,60,60);
six.setBackground(Color.BLACK);
six.setForeground(Color.WHITE);
six.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
six.setBorder(BorderFactory.createLineBorder(Color.white));
add(six);
three= new JButton(&quot;3&quot;);
three.setBounds(160,360,60,60);
three.setBackground(Color.BLACK);
three.setForeground(Color.WHITE);
three.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
three.setBorder(BorderFactory.createLineBorder(Color.white));
add(three);
dot= new JButton(&quot;.&quot;);
dot.setBounds(160,430,60,60);
dot.setBackground(Color.BLACK);
dot.setForeground(Color.WHITE);
dot.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
dot.setBorder(BorderFactory.createLineBorder(Color.white));
add(dot);
sub= new JButton(&quot;-&quot;);
sub.setBounds(230,150,60,60);
sub.setBackground(Color.BLACK);
sub.setForeground(Color.WHITE);
sub.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
sub.setBorder(BorderFactory.createLineBorder(Color.white));
add(sub);
ad= new JButton(&quot;+&quot;);

ad.setBounds(230,220,60,130);
ad.setBackground(Color.BLACK);
ad.setForeground(Color.WHITE);
ad.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
ad.setBorder(BorderFactory.createLineBorder(Color.white));
add(ad);
eq= new JButton(&quot;=&quot;);
eq.setBounds(230,360,60,130);
eq.setBackground(new Color(17,103,152));
eq.setForeground(Color.WHITE);
eq.setFont(new Font(&quot;Verdana&quot;, Font.PLAIN, 20));
eq.setBorder(BorderFactory.createLineBorder(Color.white));
add(eq);
mod.setFocusable(false);
seven.setFocusable(false);
four.setFocusable(false);
one.setFocusable(false);
c.setFocusable(false);
div.setFocusable(false);
eight.setFocusable(false);
five.setFocusable(false);
two.setFocusable(false);
zero.setFocusable(false);
mul.setFocusable(false);
nin.setFocusable(false);
six.setFocusable(false);
three.setFocusable(false);
dot.setFocusable(false);
sub.setFocusable(false);
ad.setFocusable(false);
eq.setFocusable(false);
mod.addActionListener(this);
seven.addActionListener(this);
four.addActionListener(this);
one.addActionListener(this);
c.addActionListener(this);

div.addActionListener(this);
eight.addActionListener(this);
five.addActionListener(this);
two.addActionListener(this);
zero.addActionListener(this);
mul.addActionListener(this);
nin.addActionListener(this);
six.addActionListener(this);
three.addActionListener(this);
dot.addActionListener(this);
sub.addActionListener(this);
ad.addActionListener(this);
eq.addActionListener(this);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==seven){
box.setText(box.getText().concat(&quot;7&quot;));fl=1;
}
if(e.getSource()==four){
box.setText(box.getText().concat(&quot;4&quot;));fl=1;
}
if(e.getSource()==one){
box.setText(box.getText().concat(&quot;1&quot;));fl=1;
}
if(e.getSource()==eight){
box.setText(box.getText().concat(&quot;8&quot;));fl=1;
}
if(e.getSource()==five){
box.setText(box.getText().concat(&quot;5&quot;));fl=1;
}
if(e.getSource()==two){
box.setText(box.getText().concat(&quot;2&quot;));fl=1;

}
if(e.getSource()==zero){
box.setText(box.getText().concat(&quot;0&quot;));fl=1;
}
if(e.getSource()==nin){
box.setText(box.getText().concat(&quot;9&quot;));fl=1;
}
if(e.getSource()==six){
box.setText(box.getText().concat(&quot;6&quot;));fl=1;
}
if(e.getSource()==three){
box.setText(box.getText().concat(&quot;3&quot;));fl=1;
}
if(e.getSource()==dot){
box.setText(box.getText().concat(&quot;.&quot;));fl=1;
}
if(e.getSource()==ad)
{
a=Double.parseDouble(box.getText());
operator=1;
sbox.setText(box.getText());
opbox.setText(&quot;+&quot;);
box.setText(&quot;&quot;);
fl=1;
}
if(e.getSource()==sub)
{
if(fl==0)
box.setText(box.getText().concat(&quot;-&quot;));
else{
a=Double.parseDouble(box.getText());
operator=2;
sbox.setText(box.getText());
opbox.setText(&quot;-&quot;);
box.setText(&quot;&quot;);

fl=0;
}
}
if(e.getSource()==mul)
{
a=Double.parseDouble(box.getText());
operator=3;
fl=0;
sbox.setText(box.getText());
opbox.setText(&quot;*&quot;);
box.setText(&quot;&quot;);
}
if(e.getSource()==div)
{
a=Double.parseDouble(box.getText());
operator=4;
fl=0;
sbox.setText(box.getText());
opbox.setText(&quot;/&quot;);
box.setText(&quot;&quot;);
}
if(e.getSource()==mod)
{
a=Double.parseDouble(box.getText());
operator=5;
fl=0;
sbox.setText(box.getText());
opbox.setText(&quot;%&quot;);
box.setText(&quot;&quot;);
}
if(e.getSource()==eq)
{
try{
String r1,r2,res=&quot;&quot;;
b=Double.parseDouble(box.getText());
fl=0;

r1=Double. toString(a);
r2=Double.toString(b);
res = res.concat(r1);
res = res.concat(opbox.getText());
res = res.concat(r2);
opbox.setText(&quot;&quot;);
sbox.setText(res);
switch(operator)
{
case 1: result=a+b; break;
case 2: result=a-b; break;
case 3: result=a*b; break;
case 4: result=a/b; break;
case 5: result=a%b; break;
default: result=0;
}
box.setText(&quot;&quot;+result);
fl=1;
}catch(ArithmeticException er){box.setText(&quot;Division by 0 is not

permitted&quot;);}

catch(NumberFormatException num){box.setText(&quot;Format Error&quot;);}
catch(Exception exc){box.setText(&quot;Error&quot;);}
}
if(e.getSource()==c){
box.setText(&quot;&quot;);
sbox.setText(&quot;&quot;);
opbox.setText(&quot;&quot;);
fl=0;
}
}
public static void main(String[] args) {
CalcDemo D = new CalcDemo();
}
}