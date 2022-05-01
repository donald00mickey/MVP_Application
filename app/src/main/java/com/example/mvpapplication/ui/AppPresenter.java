package com.example.mvpapplication.ui;

import com.example.mvpapplication.util.MyModel;

public class AppPresenter {
    AppInterface appInterface;

    public AppPresenter(AppInterface appInterface) {
        this.appInterface = appInterface;
    }

    public MyModel getMeName(){
        return new MyModel ( "Hii, This is Piyush here..." );
    }

    public void getMeNewName(){
        appInterface.getMeName ( getMeName ().getName () );
    }
}
