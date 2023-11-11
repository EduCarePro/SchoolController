package io.pro.educare.notifications;


import java.util.ArrayList;
import java.util.List;

public class NotificationHandler implements Notification {
    private final List<Exception> exceptionList = new ArrayList<>();

    public static void create(Exception exception) {
        new NotificationHandler().addNotification(new Exception(exception.getMessage()));
    }

    public static void create() {
        new NotificationHandler();
    }

    @Override
    public void addNotification(Exception exception) {
        exceptionList.add(exception);
    }

    @Override
    public void addNotification(List<Exception> exception) {
        exception.addAll(exception);
    }

    @Override
    public boolean hasNotification() {
        return !exceptionList.isEmpty();
    }

    @Override
    public List<Exception> getException() {
        return exceptionList;
    }


    @Override
    public Exception getException(int exception) {
        return exceptionList.get(exception);
    }

    public static NotificationHandler create(Throwable throwable) {
        return new NotificationHandler();
    }
}
