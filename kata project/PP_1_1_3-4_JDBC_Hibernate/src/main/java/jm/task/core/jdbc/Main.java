package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.saveUser("Иса","Амирханов", (byte) 18);
        userService.saveUser("Александр", "Пушкин", (byte) 35);
        userService.saveUser("Лев", "Толстой", (byte) 90);
        userService.saveUser("Арнольд","Шварцнегер", (byte) 70);

        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
