package DZ4.view;

import DZ4.data.User;

import java.util.List;

public interface UserViewInterface<T extends User> {
    public void sendOnConsole(List<T> listT);
}