package week7.Task7;

public class Account {
    private String token;

    private String userId;

    private Account(){}

    public String getToken() {
        return token;
    }

    public String getUserId() {
        return userId;
    }

    public static Builder newBuilder(){
        return new Account(). new Builder();
    }

    public class Builder{
        private Builder(){}

        public Builder setUserId(String userId){
            Account.this.userId = userId;
            return this;
        }
        public Builder setToken(String token){
            Account.this.token = token;
            return this;
        }
        public Account build(){
            return Account.this;
        }
    }
}
