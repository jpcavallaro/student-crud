package com.educacionit.students.services;

public interface INotification {

    void send (String from, String to, String subject, String content);
}
