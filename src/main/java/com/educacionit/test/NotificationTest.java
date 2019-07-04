
package com.educacionit.test;

import com.educacionit.students.services.INotification;

public class NotificationTest {

    public static void main (String[] args){

    INotification n1 = new NotiEmail ();
    n1.send("Homer Simpson", "Apu","Quiero una Dona","Voy a comprar una Dona!" );
    }
}
