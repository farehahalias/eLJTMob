package com.example.moshin.eljt2;


public class ListNameEFT {

    private String VoucherNo;
    private String VoucherDate;
    private String IssueTo;
    private String LLSNo;
    private String llsName;
    private String PracticeName;
    private String amount;


    public ListNameEFT(String VoucherNo, String VoucherDate, String IssueTo, String LLSNo, String llsName, String PracticeName, String amount) {
        this.VoucherNo = VoucherNo;
        this.VoucherDate = VoucherDate;
        this.IssueTo = IssueTo;
        this.LLSNo = LLSNo;
        this.llsName = llsName;
        this.PracticeName = PracticeName;
        this.amount = amount;

    }

    public String getVoucherNo() { return VoucherNo; }

    public String getVoucherDate() {return VoucherDate;}

    public String getIssueTo() {
        return IssueTo;
    }

    public String getLLSNo() {
        return LLSNo;
    }

    public String getLlsName() {
        return llsName;
    }

    public String getPracticeName() {
        return PracticeName;
    }

    public String getAmount() {return amount;
    }

}
