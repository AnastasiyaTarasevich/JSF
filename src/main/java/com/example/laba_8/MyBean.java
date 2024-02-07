package com.example.laba_8;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@ManagedBean
@RequestScoped
public class MyBean
{
    public MyBean() {
    }
    private String name;

    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void click() {
        if (name.length() >= 3 && name.length() <= 20 && name.matches("[a-zA-Z]+")
                && surname.length() >= 3 && surname.length() <= 20 && surname.matches("[a-zA-Z]+")) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "All fields are filled correctly.", null));
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Please enter valid values for all fields.", null));
        }
    }
}
