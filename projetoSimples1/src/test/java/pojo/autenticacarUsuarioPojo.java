package pojo;

public class autenticacarUsuarioPojo {
    private String usernameLogin;
    private String passwordLogin;
    public autenticacarUsuarioPojo(String usernameLogin, String passwordLogin) {
        this.usernameLogin = usernameLogin;
        this.passwordLogin = passwordLogin;
    }

    public String getUsernameLogin() {
        return usernameLogin;
    }

    public void setUsernameLogin(String usernameLogin) {
        this.usernameLogin = usernameLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }
}
