
    class LoginD {
    void login(String username) {
        System.out.println("Username: " + username);
    }

    void login(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    void login(String username, String password, int otp) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("OTP: " + otp);
    }


class SecureLogin extends LoginD {
    @Override
    void login(String username) {
        System.out.println("Secure login for: " + username);
    }
}


    public static void main(String[] args) {
        LoginD l = new LoginD();

        l.login("Shrihari");
        l.login("Shrihari", "pass123");
        l.login("Shrihari", "pass123", 123456);
    
        SecureLogin s = new SecureLogin();
        s.login("Shrihari");
    }
}
