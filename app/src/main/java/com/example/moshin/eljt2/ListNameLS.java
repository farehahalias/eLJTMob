package com.example.moshin.eljt2;


public class ListNameLS {

    private String jNoLS;
    private String rNoLS;
    private String rDateLS;
    private String clientName;
    private String rAmount;

    public ListNameLS(String jNoLS, String rNoLS, String rDateLS, String clientName, String rAmount) {
        this.jNoLS = jNoLS;
        this.rNoLS = rNoLS;
        this.rDateLS = rDateLS;
        this.clientName = clientName;
        this.rAmount = rAmount;

    }

    public String getjNoLS() { return jNoLS; }

    public String getrNoLS() {return rNoLS;}

    public String getrDateLS() {
        return rDateLS;
    }

    public String getClientName() {
        return clientName;
    }

    public String getrAmount() {
        return rAmount;
    }

}
