import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MazeGenerator
{
   public static void main(String [] arg)
   {
      JFrame hi=new JFrame("Gotcha");
      hi.setSize(600,500);
      hi.setLocation(0,200);
      hi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      hi.setContentPane(new Huh());
      hi.setVisible(true);
   }
}
class Huh extends JPanel implements MouseListener, MouseMotionListener
{
   JButton button;
   int mode=0;
   int correctmode=0;
   private Sprite bob=new Sprite(5,5,15,15);
   JButton retry;
   private Sprite rock=new Sprite(15,15,70,70);
   private Sprite ball=new Sprite(330,330,385,385);
   
   private int speed=4;//speed for bob
   int heh2color=0;
   int deaths=0;
   int wins=0;
   int won=0;
   int winner=0;
   int mode2=0;
   int counter=0;
   int passed=1000;
   int dX=1;
   int dY=1;
   

   
   private Sprite heh2=new Sprite(30,30,550,32);
   private Sprite finish=new Sprite(550,390,552,430);

   private Sprite linetwo=new Sprite(30,30,32,280);
   private Sprite linethree=new Sprite(30,280,90,282);
   private Sprite linefour=new Sprite(90,282,92,220);
   private Sprite linefive=new Sprite(60,250,62,60);
   private Sprite linesix=new Sprite (60,60,120,62);
   private Sprite lineseven=new Sprite(92,220,122,222);
   private Sprite lineeight=new Sprite(92,190,122,192);
   private Sprite linenine=new Sprite(92,160,94,190);
   private Sprite ten=new Sprite(90,90,92,120);
   private Sprite eleven=new Sprite(92,120,120,122);
   private Sprite twelve=new Sprite(92,160,120,162);
   private Sprite thirteen=new Sprite(30,310,120,312);
   private Sprite fourteen=new Sprite(120,312,122,250);
   private Sprite fifteen=new Sprite(122,250,210,252);
   private Sprite sixteen=new Sprite(210,252,212,150);
   private Sprite seventeen=new Sprite(212,150,270,152);
   private Sprite eighteen=new Sprite(240,180,242,240);
   private Sprite nineteen=new Sprite(270,152,272,285);
   private Sprite twenty=new Sprite(120,190,150,192);
   private Sprite twentyone=new Sprite(150,192,152,220);
   private Sprite twentytwo=new Sprite(180,220,182,120);
   private Sprite twentythree=new Sprite(182,120,300,122);
   private Sprite twentyfour=new Sprite(300,122,302,310);
   private Sprite twentyfive=new Sprite(150,308,302,310);
   private Sprite twentysix=new Sprite(150,282,270,280);
   private Sprite twentyseven=new Sprite(150,120,152,30);
   private Sprite twentyeight=new Sprite(120,120,150,122);
   private Sprite twentynine=new Sprite(120,60,120,62);
   private Sprite thirty=new Sprite(120,160,150,162);
   private Sprite thirtyone=new Sprite(180,120,182,60);
   private Sprite thirtytwo=new Sprite(210,90,520,92);
   private Sprite thirtythree=new Sprite(340,120,580,122);
   private Sprite thirtyfour=new Sprite(180,60,550,62);
   private Sprite thirtyfive=new Sprite(210,92,212,122);
   private Sprite thirtysix=new Sprite(338,120,340,180);
   private Sprite thirtyseven=new Sprite(338,180,398,182);
   private Sprite thirtyeight=new Sprite(368,150,428,152);
   private Sprite thirtynine=new Sprite(428,152,430,212);
   private Sprite fourty=new Sprite(340,210,430,212);
   private Sprite fourtyone=new Sprite(340,240,460,242);
   private Sprite fourtytwo=new Sprite(458,240,460,150);
   private Sprite fourtythree=new Sprite(460,150,550,152);
   private Sprite fourtyfour=new Sprite(550,152,552,212);
   private Sprite fourtyfive=new Sprite(522,210,552,212);
   private Sprite fourtysix=new Sprite(520,180,522,210);
   private Sprite fourtyseven=new Sprite(300,210,340,212);
   private Sprite fourtyeight=new Sprite(490,180,492,300);
  // private Sprite fourtynine=new Sprite(490,180,520,182);
   private Sprite fifty=new Sprite(60,60,62,250);
   private Sprite fiftyone=new Sprite(90,220,92,250);
   private Sprite fiftytwo=new Sprite(90,90,180,92);
   private Sprite fiftythree=new Sprite(210,150,212,210);  
   private Sprite fiftyfour=new Sprite(180,120,182,210);
   private Sprite fiftyfive=new Sprite(340,240,342,345);
   private Sprite fiftysix=new Sprite(0,345,342,347);
   private Sprite fiftyseven=new Sprite(455,240,457,330);
   private Sprite fiftyeight=new Sprite(457,330,550,332);
   private Sprite fiftynine=new Sprite(490,300,600,302);
   private Sprite sixty=new Sprite(550,210,552,270);
   private Sprite sixtyone=new Sprite(520,240,522,300);
   private Sprite sixtytwo=new Sprite(550,332,552,392);
   private Sprite sixtythree=new Sprite(520,390,550,392);
   
   private Sprite sixtyfour=new Sprite(370,270,372,390);
   private Sprite sixtyfive=new Sprite(400,240,402,350);
   private Sprite seventy=new Sprite(430,270,432,390);
   private Sprite seventyone=new Sprite(460,390,540,392);
   private Sprite seventytwo=new Sprite(430,360,510,362);
   private Sprite seventythree=new Sprite(370,390,430,392);
   private Sprite seventyfour=new Sprite(515,430,517,460);
   private Sprite seventyfive=new Sprite(485,390,487,430);
   private Sprite seventysix=new Sprite(430,390,432,460);
   private Sprite seventyseven=new Sprite(30,370,370,372);
   private Sprite seventyeight=new Sprite(0,395,340,397);
   private Sprite seventynine=new Sprite(30,425,400,427);
   private Sprite eighty=new Sprite(340,397,342,425);
   private Sprite eightyone=new Sprite(397,310,425,339);
   private Sprite eightytwo=new Sprite(390,210,392,240);
   
   private Sprite sixtysix=new Sprite(-2,0,0,460);//perimeters of the maze
   private Sprite sixtyseven=new Sprite(0,-2,0,585);
   private Sprite sixtyeight=new Sprite(585,0,587,500);
   private Sprite sixtynine=new Sprite(0,460,584,462);
   
   private Timer timer;
   private int timepassed;
   
   int x=3;
   int y=3;
   
   public Huh()
   {
      setFocusable(true);//panel must be focused to listen to key events
      requestFocusInWindow();//takes focus when window is selected
      rock.setImage("halo.png");//initialize rock
      ball.setImage("ball.png");
      ball.setdX(x);
      ball.setdY(y);
      rock.setdX(x);
      rock.setdY(y);
      addKeyListener(
         new KeyAdapter(){
            public void keyPressed(KeyEvent event) {
            
               if(event.getKeyCode()==KeyEvent.VK_LEFT)//if left arrow pressed, myicon moves to the left
               {
                  bob.setdY(-speed);
               }
               else if(event.getKeyCode()==KeyEvent.VK_RIGHT)
               {
                  bob.setdY(speed);
               }
               else if(event.getKeyCode()==KeyEvent.VK_UP)
               {
                  bob.setdX(-speed);
               }
               else if(event.getKeyCode()==KeyEvent.VK_DOWN)
               {
                  bob.setdX(speed);
               }
               
              
            }
            public void keyReleased(KeyEvent event)
            {
               if(event.getKeyCode()==KeyEvent.VK_LEFT || event.getKeyCode()==KeyEvent.VK_RIGHT)
               {
                  bob.setdY(0);
               }
               if(event.getKeyCode()==KeyEvent.VK_UP ||event.getKeyCode()==KeyEvent.VK_DOWN)
               {
                  bob.setdX(0);
               }
               
            }
         }
         );
                       
      setLayout(new FlowLayout());
   
      button=new JButton("PLAY");
      button.addActionListener(new HardListener());
      add(button);
      
      timer=new Timer(1000,new TimerListener());
   
      retry=new JButton("Retry?");
      retry.addActionListener(new RetryListener());
      add(retry);
     
      repaint();
   }
   
   {
      addMouseListener(this);//adds reactions to mouse, for example when moving mouse
      addMouseMotionListener(this);//handles mouse click related events, as well as movement
   }
   @Override public void mousePressed(MouseEvent e){}
   @Override public void mouseReleased(MouseEvent e){}
   @Override public void mouseClicked(MouseEvent e){
      if(e.getClickCount()==2&&finish.contains(e.getX(),e.getY(),400,550,430,552))
      {
         finish.bigger(3,finish);
      }
      else if(e.getClickCount()==2&&lineseven.contains(e.getX(),e.getY(),220,92,222,122))
      {
         lineseven.bigger(3,lineseven);
      }
      if(e.getButton()==MouseEvent.BUTTON1 && bob.contains(e.getX(),e.getY()))
      {
         bob.bigger(5,bob);
      }
      if(e.getButton()==MouseEvent.BUTTON3 && bob.contains(e.getX(),e.getY()))
      {
         speed=speed+2;
         if(speed>12)
         {
            speed=12;
         }
      }
   }
   @Override public void mouseEntered(MouseEvent e){}
   @Override public void mouseExited(MouseEvent e){}
   @Override public void mouseDragged(MouseEvent e){}
   public void mouseMoved(MouseEvent e){}


   
   
   
   public void paintComponent(Graphics g)
   {
     
      if(mode==0)
      {
         g.setColor(Color.BLACK);
         g.fillRect(0,0,getWidth(),getHeight());
         g.setColor(Color.WHITE);
         g.setFont(new Font("Courier",Font.BOLD|Font.ITALIC,80));
         g.drawString("GoTcHa",150,200);
         g.setFont(new Font("Courier",Font.BOLD|Font.ITALIC,20));
         g.drawString("Wins: "+winner,250,250);
         g.drawString("Deaths: "+deaths,235,270);
         if (timepassed==0)
         {
            g.drawString("Time for Run: NA ",195,290);
         }
         else
         {
            g.drawString("Time for Run: "+timepassed,195,290);
         }
         retry.setVisible(false);
         timer.stop();
      }
      if(mode==1)
      {
         if(mode2==0)
         {
            g.setColor(new Color(245, 114, 100));
            g.fillRect(0,0,getWidth(),getHeight());
            g.setColor(Color.BLACK);
            g.setFont(new Font("Courier",Font.BOLD|Font.ITALIC,30));
            g.drawString("3",(int)(getWidth()*.4999),(int)(getHeight()*.4));
            g.setFont((new Font("Courier",Font.BOLD|Font.ITALIC,20)));
            g.drawString("You can use the mouse to win faster",(int)(getWidth()*.2),(int)(getHeight()*.51));
         
            if(counter++>=20)
               mode2++;
               
            try{Thread.sleep(50);}
            catch(Exception e){}
            repaint();
         }
         else if(mode2==1)
         {
            g.setColor(new Color(245, 177, 100));
            g.fillRect(0,0,getWidth(),getHeight());
            g.setColor(Color.BLACK);
            g.setFont(new Font("Courier",Font.BOLD|Font.ITALIC,30));
            g.drawString("2",(int)(getWidth()*.4999),(int)(getHeight()*.4));
            g.setFont((new Font("Courier",Font.BOLD|Font.ITALIC,20)));
            g.drawString("Use the arrow keys to move",(int)(getWidth()*.23),(int)(getHeight()*.51));
            if(counter++>=40)
               mode2++;
               
            try{Thread.sleep(50);}
            catch(Exception e){}
            repaint();
         }
         else if(mode2==2)
         {g.setColor(new Color(137, 232, 148));
            g.fillRect(0,0,getWidth(),getHeight());
            g.setColor(Color.BLACK);
            g.setFont(new Font("Courier",Font.BOLD|Font.ITALIC,30));
            g.drawString("1",(int)(getWidth()*.4999),(int)(getHeight()*.4));
            g.setFont((new Font("Courier",Font.BOLD|Font.ITALIC,20)));
            g.drawString("Get to the green box!",(int)(getWidth()*.27),(int)(getHeight()*.51));
            
            if(counter++>=60)
               mode2++;
               
            try{Thread.sleep(50);}
            catch(Exception e){}
            repaint();
         }
         else if(mode2==3)
         {
            timer.start();
            
            if (bob.intersects(30,30,32,280)||bob.intersects(30,30,280,32)||bob.intersects(280,30,282,90)||bob.intersects(282,90,220,92)||bob.intersects(-2,0,0,460))
            {
               wins++;
               deaths++;
            }
            else if(bob.intersects(250,60,60,62)||bob.intersects(60,60,62,120)||bob.intersects(190,92,192,122)||bob.intersects(160,92,190,94)||bob.intersects(90,90,120,92)||bob.intersects(120,92,122,120)||bob.intersects(160,92,162,120)||bob.intersects(310,30,312,120)||bob.intersects(312,120,250,122)||bob.intersects(250,122,252,210)||bob.intersects(252,210,150,212)||bob.intersects(150,212,152,270)||bob.intersects(180,240,240,242)||bob.intersects(152,270,285,272)||bob.intersects(190,120,192,150)||bob.intersects(192,150,220,152)||bob.intersects(220,180,120,182)||bob.intersects(120,182,122,300)||bob.intersects(122,300,310,302)||bob.intersects(308,150,310,302)||bob.intersects(120,150,30,152)||bob.intersects(120,120,122,150)||bob.intersects(60,120,62,120)||bob.intersects(160,120,162,150)||bob.intersects(120,180,60,182)||bob.intersects(90,210,92,520)||bob.intersects(120,340,122,580)||bob.intersects(60,180,62,550)||bob.intersects(92,210,122,212)||bob.intersects(120,338,180,340)||bob.intersects(180,338,182,398)||bob.intersects(150,368,152,428)||bob.intersects(152,428,212,430)||bob.intersects(210,340,212,430)||bob.intersects(240,340,242,460)||bob.intersects(240,458,150,460)||bob.intersects(150,460,152,550)||bob.intersects(152,550,212,552)||bob.intersects(210,522,212,552)||bob.intersects(180,520,210,522)||bob.intersects(210,300,212,340)||bob.intersects(180,490,300,492)||bob.intersects(60,60,250,62)||bob.intersects(220,90,250,92)||bob.intersects(90,90,92,180)||bob.intersects(150,210,210,212)||bob.intersects(120,180,210,182)||bob.intersects(240,340,345,342)||bob.intersects(345,0,347,342)||bob.intersects(240,455,330,457)||bob.intersects(330,457,332,550)||bob.intersects(300,490,302,600)||bob.intersects(210,550,270,552)||bob.intersects(240,520,300,522)||bob.intersects(332,550,392,552)||bob.intersects(390,520,392,550))
            {
               wins++;
               deaths++;
            }
            else if(bob.intersects(0,585,500,587)||bob.intersects(460,0,462,584)||bob.intersects(270,370,390,372)||bob.intersects(240,400,350,402)||bob.intersects(270,430,390,432)||bob.intersects(390,460,392,540)||bob.intersects(360,430,362,510)||bob.intersects(390,370,392,430)||bob.intersects(430,515,460,517)||bob.intersects(390,485,430,487)||bob.intersects(390,430,460,432)||bob.intersects(370,30,372,370)||bob.intersects(395,0,397,340)||bob.intersects(425,30,427,400)||bob.intersects(397,340,425,342)||bob.intersects(0,-2,460,0)||bob.intersects(-2,0,585,0)||bob.intersects(210,390,240,392))
            {
               wins++;
               deaths++;
            }
            if(bob.intersects(400,550,430,552)||bob.intersects(220,92,222,122)||bob.intersects(397,310,425,339))
            {
               won++;
               winner++;
            }
            
            if(bob.intersects((float)rock.left,(float)rock.top,(float)rock.right,(float)rock.bottom)||rock.intersects((float)bob.left,(float)bob.top,(float)bob.right,(float)bob.bottom))
            {
               wins++;
               deaths++;
            }
            if(ball.intersects((float)bob.left,(float)bob.top,(float)bob.right,(float)bob.bottom)||bob.intersects((float)ball.left,(float)ball.top,(float)ball.right,(float)ball.bottom))
            {
               wins++;
               deaths++;
            }
            rock.update(0,0,getWidth(),getHeight());
            ball.update(0,0,getWidth(),getHeight());
            
            //update();
            
            g.setColor(Color.WHITE);
            g.fillRect(100,200,300,400);
            g.setColor(Color.BLACK);
            g.fillRect(0,0,getWidth(),getHeight());
            g.setColor(Color.WHITE);
            g.fillRect((int)bob.top,(int)bob.left,(int)bob.getWidth(),(int)bob.getHeight());
            bob.update();
            g.setColor(new Color(137, 232, 148));
            g.fillRect((int)eightyone.top,(int)eightyone.left,(int)eightyone.getWidth(),(int)eightyone.getHeight());
            g.setColor(Color.WHITE);
            finish.draw(g);
         
            rock.draw(g);
            ball.draw(g);
            heh2.draw(g);
            linetwo.draw(g);
            linethree.draw(g);
            linefour.draw(g);
            linefive.draw(g);
            linesix.draw(g);
            lineseven.draw(g);
            lineeight.draw(g);
            linenine.draw(g);
            ten.draw(g);
            eleven.draw(g);
            twelve.draw(g);
            thirteen.draw(g);
            fourteen.draw(g);
            fifteen.draw(g);
            sixteen.draw(g);
            seventeen.draw(g);
            eighteen.draw(g);
            nineteen.draw(g);
            twenty.draw(g);
            twentyone.draw(g);
            twentytwo.draw(g);
            twentythree.draw(g);
            twentyfour.draw(g);
            twentyfive.draw(g);
            twentysix.draw(g);
            twentyseven.draw(g);
            twentyeight.draw(g);
            twentynine.draw(g);
            thirty.draw(g);
            thirtyone.draw(g);
            thirtytwo.draw(g);
            thirtythree.draw(g);
            thirtyfour.draw(g);
            thirtyfive.draw(g);
            thirtysix.draw(g);
            thirtyseven.draw(g);
            thirtyeight.draw(g);
            thirtynine.draw(g);
            fourty.draw(g);
            fourtyone.draw(g);
            fourtytwo.draw(g);
            fourtythree.draw(g);
            fourtyfour.draw(g);
            fourtyfive.draw(g);
            fourtysix.draw(g);
            fourtyseven.draw(g);
            fourtyeight.draw(g);
          //  fourtynine.draw(g);
            fifty.draw(g);
            fiftyone.draw(g);
            fiftytwo.draw(g);
            fiftythree.draw(g);
            fiftyfour.draw(g);
            fiftyfive.draw(g);
            fiftysix.draw(g);
            fiftyseven.draw(g);
            fiftyeight.draw(g);
            fiftynine.draw(g);
            sixty.draw(g);
            sixtyone.draw(g);
            sixtytwo.draw(g);
            sixtythree.draw(g);
            sixtyfour.draw(g);
            sixtyfive.draw(g);
            sixtysix.draw(g);
            sixtyseven.draw(g);
            sixtyeight.draw(g);
            sixtynine.draw(g);
            seventy.draw(g);
            seventyone.draw(g);
            seventytwo.draw(g);
            seventythree.draw(g);
            seventyfour.draw(g);
            seventyfive.draw(g);
            seventysix.draw(g);
            seventyseven.draw(g);
            seventyeight.draw(g);
            seventynine.draw(g);
            eighty.draw(g);
            eightytwo.draw(g);
            
            if(wins>0)
            {
               g.setColor(Color.RED);
               g.fillRect(0,0,getWidth(),getHeight());
               g.setColor(Color.BLACK);
               g.setFont(new Font("Courtier",Font.BOLD|Font.ITALIC,50));
               g.drawString("YOU DIED",190,250);
               retry.setVisible(true);
               bob.set(5,5,15,15);
               lineseven.set(92,220,122,222);
               finish.set(550,390,552,430);
               timepassed=0;
               passed=timepassed;
            }
            
            if(won>0)
            {
               g.setColor(new Color(137, 232, 148));
               g.fillRect(0,0,getWidth(),getHeight());
               g.setColor(Color.BLACK);
               g.setFont(new Font("Courtier",Font.ITALIC,30));
               g.drawString("WINNER!",230,250);
               retry.setVisible(true);
               bob.set(5,5,15,15);
               lineseven.set(92,220,122,222);
               finish.set(550,390,552,430);
            }
            try{Thread.sleep(40);}
            catch(Exception e){}
            repaint();
         }
      }
   }
   /*public void update()
   {
      if(rock.top-1<0 || rock.bottom+1>getHeight())//jump from left to right boundaries
      {
         x*=-1;
      }
      if(rock.right+1<=0)
      {
         rock.left+=getWidth();
         rock.right+=getWidth();
      }
      if(rock.left+1>=getWidth())
      {//top and right boundaries
         rock.left-=getWidth();
         rock.right-=getWidth();
      }
            //handle boundary conditions (bounce off walls by multiply speed by -1)
            if(x + 200 + dX>getWidth()||x+dX<0){  //check left and right boundaries
               x = -x;                          //invert horizontal speed
            }
            if(y + 200 + dY>getHeight()||y+dY<0){ //check top and bottom boundaries
               y *= -1;                          //invert vertical speed
            }
      try{//so animation happens
         Thread.sleep(30);
      } catch(Exception e){}
      repaint();
   }
//*/

   
   class RetryListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         mode=0;
         button.setVisible(true);
         retry.setVisible(false);
      }
   }
   class HardListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         mode++;
         button.setVisible(false);
         wins=0;
         won=0;
         speed=5;
         heh2color--;
         mode2=0;
         counter=0;
         timepassed=0;
      }
   }
   
   class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         timepassed++;
         repaint();
      }
   }
}