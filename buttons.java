package project;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class buttons extends JFrame  {  
  private JButton client_1; //список - выбрать себя
  private JButton client_2; //выбрать кому переводит
  private JButton Confirm;  // подтвердить = запрос на уменьшение счета первого
  //и увеличение счета 2го мб процедура в БД и тут ее просто вызвать
 


  
    public buttons (){
    super("Transfer"); //Заголовок окна
    setBounds(100, 100, 400, 200); //размер и положение
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при 
                                                    //закрытии окна закрывалась и программа,
                                                    //иначе она останется висеть в процессах
  }

  public static void butt () { //эта функция может быть и в другом классе
    buttons app = new buttons(); //Создаем экземпляр нашего приложения
    app.setVisible(true); 
  }
    
}
