package DZ4.controller;

import DZ4.data.User;

public interface IUserController <T extends User> {
    void create(String firstName, String secondName);
}