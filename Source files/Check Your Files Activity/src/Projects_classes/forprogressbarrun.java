/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects_classes;

/**
 *
 * @author Sompod_Programmer
 */
public class forprogressbarrun {
    
    public static void main(String[] args) {
        Main_JFrame main_JFrame = new Main_JFrame();
        main_JFrame.setVisible(true);
                try{
            for(int i =10 ; i<=100 ; i+=10){
              main_JFrame.jProgressBar1.setValue(i);
                Thread.sleep(300);
                if(i==100){
                    main_JFrame.setVisible(false);
                    new User_JFrame().setVisible(true);
                }
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
