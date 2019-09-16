package com.example.genuvaapp;

public class PartyModel {
    int teamimage;
    String teamname , partydate  , id , PartyFirstClass , PartySecondClass , PartyThirdClass;

    public PartyModel() {

    }

    public PartyModel(int teamimage, String teamname, String partydate, String id, String partyFirstClass, String partySecondClass, String partyThirdClass) {
        this.teamimage = teamimage;
        this.teamname = teamname;
        this.partydate = partydate;

        this.id = id;
        this.PartyFirstClass = partyFirstClass;
        this.PartySecondClass = partySecondClass;
        this.PartyThirdClass = partyThirdClass;
    }

    public int getTeamimage() {
        return teamimage;
    }

    public void setTeamimage(int teamimage) {
        this.teamimage = teamimage;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getPartydate() {
        return partydate;
    }

    public void setPartydate(String partydate) {
        this.partydate = partydate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartyFirstClass() {
        return PartyFirstClass;
    }

    public void setPartyFirstClass(String partyFirstClass) {
        PartyFirstClass = partyFirstClass;
    }

    public String getPartySecondClass() {
        return PartySecondClass;
    }

    public void setPartySecondClass(String partySecondClass) {
        PartySecondClass = partySecondClass;
    }

    public String getPartyThirdClass() {
        return PartyThirdClass;
    }

    public void setPartyThirdClass(String partyThirdClass) {
        PartyThirdClass = partyThirdClass;
    }
}
