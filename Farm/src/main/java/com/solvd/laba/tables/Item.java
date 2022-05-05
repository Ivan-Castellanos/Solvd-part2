package com.solvd.laba.tables;

public class Item {
    private int id;
    private Ticket ticket;
    private MeatCuts meatCut;
    private int kg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public MeatCuts getMeatCut() {
        return meatCut;
    }

    public void setMeatCut(MeatCuts meatCut) {
        this.meatCut = meatCut;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
}
