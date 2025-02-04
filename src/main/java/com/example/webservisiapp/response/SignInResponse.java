package com.example.webservisiapp.response;

public class SignInResponse {

    String message;
    Boolean status;

    public SignInResponse() {}
    public SignInResponse(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "SignInResponse [message = " + message + ", status = " + status + "]";
    }
    

}
