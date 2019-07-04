
package com.educacionit.test;

import com.educacionit.students.services.INotification;

public class NotiEmail implements INotification{


    @Override
    public void send (String from, String to, String subject, String content) {

        System.out.println(from + " envía el mensaje " + subject + " con el contenido " + content + " a " + to);

        String msg = String.format ("%s envía el mensaje \"%s\" con el contenido \"%s\" a \"%s\"", from, subject, content, to);

        System.out.println (msg);
    }
}
