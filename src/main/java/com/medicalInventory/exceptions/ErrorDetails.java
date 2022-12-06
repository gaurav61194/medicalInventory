package com.medicalInventory.exceptions;

import java.time.LocalDateTime;

public class ErrorDetails {
    
    private LocalDateTime date;
    private String message;
    private String details;
    
    public ErrorDetails(LocalDateTime date, String message, String details) {
        super();
        this.date = date;
        this.message = message;
        this.details = details;
    }



   public LocalDateTime getdate() {
        return date;
    }



   public void setdate(LocalDateTime date) {
        this.date = date;
    }



   public String getMessage() {
        return message;
    }



   public void setMessage(String message) {
        this.message = message;
    }



   public String getDetails() {
        return details;
    }



   public void setDetails(String details) {
        this.details = details;
    }
    
    
    



}
