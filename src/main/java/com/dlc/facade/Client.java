package com.dlc.facade;

public class Client {
    public static void main(String[] args) {
        TheaterFacade theaterFacade = new TheaterFacade();
        theaterFacade.ready();
        theaterFacade.play();
    }
}
