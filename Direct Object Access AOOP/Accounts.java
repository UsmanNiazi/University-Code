package dao;

import java.util.Date;

public class Accounts {
    private String date;
    private int Tid;
    private int Accountno;
    private String Tfselected;
    private int Tamount;
    private String Tfserved;

    public void setTid(int Tid) {
        this.Tid = Tid;
    }

    public int getTid() {
        return Tid;
    }

    public void setAccountno(int Accountno) {
        this.Accountno = Accountno;
    }

    public int getAccountno() {
        return Accountno;
    }

    public void setTamount(int Tamount) {
        this.Tamount = Tamount;
    }

    public int getTamount() {
        return Tamount;
    }

    public void setTfselected(String Tfselected) {
        this.Tfselected = Tfselected;
    }

    public String getTfselected() {
        return Tfselected;
    }

    public void SetTfserved(String Tfserved) {
        this.Tfserved = Tfserved;
    }

    public String getTfserved() {
        return Tfserved;
    }
    public void setdate(String date) {
        this.date = date;
    }
    public String getdate() {
        return date;
    }

}
