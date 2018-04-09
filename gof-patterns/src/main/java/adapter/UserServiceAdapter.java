package adapter;

public class UserServiceAdapter extends UserService {
    private UserExtAdaptee userExtAdaptee;

    UserServiceAdapter(UserExtAdaptee userExtAdaptee) {
        this.userExtAdaptee = userExtAdaptee;
    }

    @Override
    public void getUser() {
        userExtAdaptee.getUserExt();
    }
}
