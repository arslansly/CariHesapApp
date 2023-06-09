package com.arslan.dnetcarihesapapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Item{
    @JsonProperty("Meta")
    public Meta meta;
    @JsonProperty("INTERNAL_REFERENCE")
    public int iNTERNAL_REFERENCE;
    @JsonProperty("RECORD_STATUS")
    public int rECORD_STATUS;
    @JsonProperty("ACCOUNT_TYPE")
    public int aCCOUNT_TYPE;
    @JsonProperty("CODE")
    public String cODE;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public int getiNTERNAL_REFERENCE() {
        return iNTERNAL_REFERENCE;
    }

    public void setiNTERNAL_REFERENCE(int iNTERNAL_REFERENCE) {
        this.iNTERNAL_REFERENCE = iNTERNAL_REFERENCE;
    }

    public int getrECORD_STATUS() {
        return rECORD_STATUS;
    }

    public void setrECORD_STATUS(int rECORD_STATUS) {
        this.rECORD_STATUS = rECORD_STATUS;
    }

    public int getaCCOUNT_TYPE() {
        return aCCOUNT_TYPE;
    }

    public void setaCCOUNT_TYPE(int aCCOUNT_TYPE) {
        this.aCCOUNT_TYPE = aCCOUNT_TYPE;
    }

    public String getcODE() {
        return cODE;
    }

    public void setcODE(String cODE) {
        this.cODE = cODE;
    }

    public String gettITLE() {
        return tITLE;
    }

    public void settITLE(String tITLE) {
        this.tITLE = tITLE;
    }

    public String getaUXIL_CODE() {
        return aUXIL_CODE;
    }

    public void setaUXIL_CODE(String aUXIL_CODE) {
        this.aUXIL_CODE = aUXIL_CODE;
    }

    public String getaUTH_CODE() {
        return aUTH_CODE;
    }

    public void setaUTH_CODE(String aUTH_CODE) {
        this.aUTH_CODE = aUTH_CODE;
    }

    public String getaDDRESS1() {
        return aDDRESS1;
    }

    public void setaDDRESS1(String aDDRESS1) {
        this.aDDRESS1 = aDDRESS1;
    }

    public String getaDDRESS2() {
        return aDDRESS2;
    }

    public void setaDDRESS2(String aDDRESS2) {
        this.aDDRESS2 = aDDRESS2;
    }

    public String getdISTRICT_CODE() {
        return dISTRICT_CODE;
    }

    public void setdISTRICT_CODE(String dISTRICT_CODE) {
        this.dISTRICT_CODE = dISTRICT_CODE;
    }

    public String getdISTRICT() {
        return dISTRICT;
    }

    public void setdISTRICT(String dISTRICT) {
        this.dISTRICT = dISTRICT;
    }

    public String gettOWN_CODE() {
        return tOWN_CODE;
    }

    public void settOWN_CODE(String tOWN_CODE) {
        this.tOWN_CODE = tOWN_CODE;
    }

    public String gettOWN() {
        return tOWN;
    }

    public void settOWN(String tOWN) {
        this.tOWN = tOWN;
    }

    public String getcITY_CODE() {
        return cITY_CODE;
    }

    public void setcITY_CODE(String cITY_CODE) {
        this.cITY_CODE = cITY_CODE;
    }

    public String getcITY() {
        return cITY;
    }

    public void setcITY(String cITY) {
        this.cITY = cITY;
    }

    public String getcOUNTRY_CODE() {
        return cOUNTRY_CODE;
    }

    public void setcOUNTRY_CODE(String cOUNTRY_CODE) {
        this.cOUNTRY_CODE = cOUNTRY_CODE;
    }

    public String getcOUNTRY() {
        return cOUNTRY;
    }

    public void setcOUNTRY(String cOUNTRY) {
        this.cOUNTRY = cOUNTRY;
    }

    public String getpOSTAL_CODE() {
        return pOSTAL_CODE;
    }

    public void setpOSTAL_CODE(String pOSTAL_CODE) {
        this.pOSTAL_CODE = pOSTAL_CODE;
    }

    public String gettELEPHONE1() {
        return tELEPHONE1;
    }

    public void settELEPHONE1(String tELEPHONE1) {
        this.tELEPHONE1 = tELEPHONE1;
    }

    public String gettELEPHONE1_CODE() {
        return tELEPHONE1_CODE;
    }

    public void settELEPHONE1_CODE(String tELEPHONE1_CODE) {
        this.tELEPHONE1_CODE = tELEPHONE1_CODE;
    }

    public String gettELEPHONE2() {
        return tELEPHONE2;
    }

    public void settELEPHONE2(String tELEPHONE2) {
        this.tELEPHONE2 = tELEPHONE2;
    }

    public String gettELEPHONE2_CODE() {
        return tELEPHONE2_CODE;
    }

    public void settELEPHONE2_CODE(String tELEPHONE2_CODE) {
        this.tELEPHONE2_CODE = tELEPHONE2_CODE;
    }

    public String getfAX() {
        return fAX;
    }

    public void setfAX(String fAX) {
        this.fAX = fAX;
    }

    public String getfAX_CODE() {
        return fAX_CODE;
    }

    public void setfAX_CODE(String fAX_CODE) {
        this.fAX_CODE = fAX_CODE;
    }

    public String gettAX_ID() {
        return tAX_ID;
    }

    public void settAX_ID(String tAX_ID) {
        this.tAX_ID = tAX_ID;
    }

    public String gettAX_OFFICE() {
        return tAX_OFFICE;
    }

    public void settAX_OFFICE(String tAX_OFFICE) {
        this.tAX_OFFICE = tAX_OFFICE;
    }

    public String gettAX_OFFICE_CODE() {
        return tAX_OFFICE_CODE;
    }

    public void settAX_OFFICE_CODE(String tAX_OFFICE_CODE) {
        this.tAX_OFFICE_CODE = tAX_OFFICE_CODE;
    }

    public String getcONTACT() {
        return cONTACT;
    }

    public void setcONTACT(String cONTACT) {
        this.cONTACT = cONTACT;
    }

    public double getdISCOUNT_RATE() {
        return dISCOUNT_RATE;
    }

    public void setdISCOUNT_RATE(double dISCOUNT_RATE) {
        this.dISCOUNT_RATE = dISCOUNT_RATE;
    }

    public int geteXTENREF() {
        return eXTENREF;
    }

    public void seteXTENREF(int eXTENREF) {
        this.eXTENREF = eXTENREF;
    }

    public String getpAYMENT_CODE() {
        return pAYMENT_CODE;
    }

    public void setpAYMENT_CODE(String pAYMENT_CODE) {
        this.pAYMENT_CODE = pAYMENT_CODE;
    }

    public int getpAYMENTREF() {
        return pAYMENTREF;
    }

    public void setpAYMENTREF(int pAYMENTREF) {
        this.pAYMENTREF = pAYMENTREF;
    }

    public String getE_MAIL() {
        return e_MAIL;
    }

    public void setE_MAIL(String e_MAIL) {
        this.e_MAIL = e_MAIL;
    }

    public String getwEB_URL() {
        return wEB_URL;
    }

    public void setwEB_URL(String wEB_URL) {
        this.wEB_URL = wEB_URL;
    }

    public String getfACEBOOK_URL() {
        return fACEBOOK_URL;
    }

    public void setfACEBOOK_URL(String fACEBOOK_URL) {
        this.fACEBOOK_URL = fACEBOOK_URL;
    }

    public String gettWITTER_URL() {
        return tWITTER_URL;
    }

    public void settWITTER_URL(String tWITTER_URL) {
        this.tWITTER_URL = tWITTER_URL;
    }

    public String getaPPLE_ID() {
        return aPPLE_ID;
    }

    public void setaPPLE_ID(String aPPLE_ID) {
        this.aPPLE_ID = aPPLE_ID;
    }

    public String getsKYPE_ID() {
        return sKYPE_ID;
    }

    public void setsKYPE_ID(String sKYPE_ID) {
        this.sKYPE_ID = sKYPE_ID;
    }

    public int getrEMINDER_TYPE() {
        return rEMINDER_TYPE;
    }

    public void setrEMINDER_TYPE(int rEMINDER_TYPE) {
        this.rEMINDER_TYPE = rEMINDER_TYPE;
    }

    public String getrEMINDER_EMAIL() {
        return rEMINDER_EMAIL;
    }

    public void setrEMINDER_EMAIL(String rEMINDER_EMAIL) {
        this.rEMINDER_EMAIL = rEMINDER_EMAIL;
    }

    public String getrEMINDER_FAX() {
        return rEMINDER_FAX;
    }

    public void setrEMINDER_FAX(String rEMINDER_FAX) {
        this.rEMINDER_FAX = rEMINDER_FAX;
    }

    public int getcORRESP_LANG() {
        return cORRESP_LANG;
    }

    public void setcORRESP_LANG(int cORRESP_LANG) {
        this.cORRESP_LANG = cORRESP_LANG;
    }

    public String getvAT_ID() {
        return vAT_ID;
    }

    public void setvAT_ID(String vAT_ID) {
        this.vAT_ID = vAT_ID;
    }

    public int getbLOCKED() {
        return bLOCKED;
    }

    public void setbLOCKED(int bLOCKED) {
        this.bLOCKED = bLOCKED;
    }

    public String getbANK_ID1() {
        return bANK_ID1;
    }

    public void setbANK_ID1(String bANK_ID1) {
        this.bANK_ID1 = bANK_ID1;
    }

    public String getbANK_ID2() {
        return bANK_ID2;
    }

    public void setbANK_ID2(String bANK_ID2) {
        this.bANK_ID2 = bANK_ID2;
    }

    public String getbANK_ID3() {
        return bANK_ID3;
    }

    public void setbANK_ID3(String bANK_ID3) {
        this.bANK_ID3 = bANK_ID3;
    }

    public String getbANK_ID4() {
        return bANK_ID4;
    }

    public void setbANK_ID4(String bANK_ID4) {
        this.bANK_ID4 = bANK_ID4;
    }

    public String getbANK_ID5() {
        return bANK_ID5;
    }

    public void setbANK_ID5(String bANK_ID5) {
        this.bANK_ID5 = bANK_ID5;
    }

    public String getbANK_ID6() {
        return bANK_ID6;
    }

    public void setbANK_ID6(String bANK_ID6) {
        this.bANK_ID6 = bANK_ID6;
    }

    public String getbANK_ID7() {
        return bANK_ID7;
    }

    public void setbANK_ID7(String bANK_ID7) {
        this.bANK_ID7 = bANK_ID7;
    }

    public String getbANK_NAME1() {
        return bANK_NAME1;
    }

    public void setbANK_NAME1(String bANK_NAME1) {
        this.bANK_NAME1 = bANK_NAME1;
    }

    public String getbANK_NAME2() {
        return bANK_NAME2;
    }

    public void setbANK_NAME2(String bANK_NAME2) {
        this.bANK_NAME2 = bANK_NAME2;
    }

    public String getbANK_NAME3() {
        return bANK_NAME3;
    }

    public void setbANK_NAME3(String bANK_NAME3) {
        this.bANK_NAME3 = bANK_NAME3;
    }

    public String getbANK_NAME4() {
        return bANK_NAME4;
    }

    public void setbANK_NAME4(String bANK_NAME4) {
        this.bANK_NAME4 = bANK_NAME4;
    }

    public String getbANK_NAME5() {
        return bANK_NAME5;
    }

    public void setbANK_NAME5(String bANK_NAME5) {
        this.bANK_NAME5 = bANK_NAME5;
    }

    public String getbANK_NAME6() {
        return bANK_NAME6;
    }

    public void setbANK_NAME6(String bANK_NAME6) {
        this.bANK_NAME6 = bANK_NAME6;
    }

    public String getbANK_NAME7() {
        return bANK_NAME7;
    }

    public void setbANK_NAME7(String bANK_NAME7) {
        this.bANK_NAME7 = bANK_NAME7;
    }

    public String getbANK_ACCOUNT1() {
        return bANK_ACCOUNT1;
    }

    public void setbANK_ACCOUNT1(String bANK_ACCOUNT1) {
        this.bANK_ACCOUNT1 = bANK_ACCOUNT1;
    }

    public String getbANK_ACCOUNT2() {
        return bANK_ACCOUNT2;
    }

    public void setbANK_ACCOUNT2(String bANK_ACCOUNT2) {
        this.bANK_ACCOUNT2 = bANK_ACCOUNT2;
    }

    public String getbANK_ACCOUNT3() {
        return bANK_ACCOUNT3;
    }

    public void setbANK_ACCOUNT3(String bANK_ACCOUNT3) {
        this.bANK_ACCOUNT3 = bANK_ACCOUNT3;
    }

    public String getbANK_ACCOUNT4() {
        return bANK_ACCOUNT4;
    }

    public void setbANK_ACCOUNT4(String bANK_ACCOUNT4) {
        this.bANK_ACCOUNT4 = bANK_ACCOUNT4;
    }

    public String getbANK_ACCOUNT5() {
        return bANK_ACCOUNT5;
    }

    public void setbANK_ACCOUNT5(String bANK_ACCOUNT5) {
        this.bANK_ACCOUNT5 = bANK_ACCOUNT5;
    }

    public String getbANK_ACCOUNT6() {
        return bANK_ACCOUNT6;
    }

    public void setbANK_ACCOUNT6(String bANK_ACCOUNT6) {
        this.bANK_ACCOUNT6 = bANK_ACCOUNT6;
    }

    public String getbANK_ACCOUNT7() {
        return bANK_ACCOUNT7;
    }

    public void setbANK_ACCOUNT7(String bANK_ACCOUNT7) {
        this.bANK_ACCOUNT7 = bANK_ACCOUNT7;
    }

    public String getdELIVERY_METHOD() {
        return dELIVERY_METHOD;
    }

    public void setdELIVERY_METHOD(String dELIVERY_METHOD) {
        this.dELIVERY_METHOD = dELIVERY_METHOD;
    }

    public String getsHIPMENT_AGENT() {
        return sHIPMENT_AGENT;
    }

    public void setsHIPMENT_AGENT(String sHIPMENT_AGENT) {
        this.sHIPMENT_AGENT = sHIPMENT_AGENT;
    }

    public int getcURRENCY() {
        return cURRENCY;
    }

    public void setcURRENCY(int cURRENCY) {
        this.cURRENCY = cURRENCY;
    }

    public int gettEXTINC() {
        return tEXTINC;
    }

    public void settEXTINC(int tEXTINC) {
        this.tEXTINC = tEXTINC;
    }

    public int getdATA_SITEID() {
        return dATA_SITEID;
    }

    public void setdATA_SITEID(int dATA_SITEID) {
        this.dATA_SITEID = dATA_SITEID;
    }

    public int getdATA_REFERENCE() {
        return dATA_REFERENCE;
    }

    public void setdATA_REFERENCE(int dATA_REFERENCE) {
        this.dATA_REFERENCE = dATA_REFERENCE;
    }

    public String getE_COMM_ID() {
        return e_COMM_ID;
    }

    public void setE_COMM_ID(String e_COMM_ID) {
        this.e_COMM_ID = e_COMM_ID;
    }

    public String gettRADING_GRP() {
        return tRADING_GRP;
    }

    public void settRADING_GRP(String tRADING_GRP) {
        this.tRADING_GRP = tRADING_GRP;
    }

    public int getcREATED_BY() {
        return cREATED_BY;
    }

    public void setcREATED_BY(int cREATED_BY) {
        this.cREATED_BY = cREATED_BY;
    }

    public Date getdATE_CREATED() {
        return dATE_CREATED;
    }

    public void setdATE_CREATED(Date dATE_CREATED) {
        this.dATE_CREATED = dATE_CREATED;
    }

    public int gethOUR_CREATED() {
        return hOUR_CREATED;
    }

    public void sethOUR_CREATED(int hOUR_CREATED) {
        this.hOUR_CREATED = hOUR_CREATED;
    }

    public int getmIN_CREATED() {
        return mIN_CREATED;
    }

    public void setmIN_CREATED(int mIN_CREATED) {
        this.mIN_CREATED = mIN_CREATED;
    }

    public int getsEC_CREATED() {
        return sEC_CREATED;
    }

    public void setsEC_CREATED(int sEC_CREATED) {
        this.sEC_CREATED = sEC_CREATED;
    }

    public int getmODIFIED_BY() {
        return mODIFIED_BY;
    }

    public void setmODIFIED_BY(int mODIFIED_BY) {
        this.mODIFIED_BY = mODIFIED_BY;
    }

    public Date getdATE_MODIFIED() {
        return dATE_MODIFIED;
    }

    public void setdATE_MODIFIED(Date dATE_MODIFIED) {
        this.dATE_MODIFIED = dATE_MODIFIED;
    }

    public int gethOUR_MODIFIED() {
        return hOUR_MODIFIED;
    }

    public void sethOUR_MODIFIED(int hOUR_MODIFIED) {
        this.hOUR_MODIFIED = hOUR_MODIFIED;
    }

    public int getmIN_MODIFIED() {
        return mIN_MODIFIED;
    }

    public void setmIN_MODIFIED(int mIN_MODIFIED) {
        this.mIN_MODIFIED = mIN_MODIFIED;
    }

    public int getsEC_MODIFIED() {
        return sEC_MODIFIED;
    }

    public void setsEC_MODIFIED(int sEC_MODIFIED) {
        this.sEC_MODIFIED = sEC_MODIFIED;
    }

    public int getdEBT_TRCK_TYPE() {
        return dEBT_TRCK_TYPE;
    }

    public void setdEBT_TRCK_TYPE(int dEBT_TRCK_TYPE) {
        this.dEBT_TRCK_TYPE = dEBT_TRCK_TYPE;
    }

    public int getxRTDIF_TYPE() {
        return xRTDIF_TYPE;
    }

    public void setxRTDIF_TYPE(int xRTDIF_TYPE) {
        this.xRTDIF_TYPE = xRTDIF_TYPE;
    }

    public NOTES getnOTES() {
        return nOTES;
    }

    public void setnOTES(NOTES nOTES) {
        this.nOTES = nOTES;
    }

    public int getcREDIT_TYPE() {
        return cREDIT_TYPE;
    }

    public void setcREDIT_TYPE(int cREDIT_TYPE) {
        this.cREDIT_TYPE = cREDIT_TYPE;
    }

    public double getcREDIT_LIMIT() {
        return cREDIT_LIMIT;
    }

    public void setcREDIT_LIMIT(double cREDIT_LIMIT) {
        this.cREDIT_LIMIT = cREDIT_LIMIT;
    }

    public double getcREDIT_BALANCED() {
        return cREDIT_BALANCED;
    }

    public void setcREDIT_BALANCED(double cREDIT_BALANCED) {
        this.cREDIT_BALANCED = cREDIT_BALANCED;
    }

    public double getrISKFACT_CHQ() {
        return rISKFACT_CHQ;
    }

    public void setrISKFACT_CHQ(double rISKFACT_CHQ) {
        this.rISKFACT_CHQ = rISKFACT_CHQ;
    }

    public double getrISKFACT_PROMNT() {
        return rISKFACT_PROMNT;
    }

    public void setrISKFACT_PROMNT(double rISKFACT_PROMNT) {
        this.rISKFACT_PROMNT = rISKFACT_PROMNT;
    }

    public int getaCTION_CREDHOLD() {
        return aCTION_CREDHOLD;
    }

    public void setaCTION_CREDHOLD(int aCTION_CREDHOLD) {
        this.aCTION_CREDHOLD = aCTION_CREDHOLD;
    }

    public String getgL_CODE() {
        return gL_CODE;
    }

    public void setgL_CODE(String gL_CODE) {
        this.gL_CODE = gL_CODE;
    }

    public int getaCCOUNTREF() {
        return aCCOUNTREF;
    }

    public void setaCCOUNTREF(int aCCOUNTREF) {
        this.aCCOUNTREF = aCCOUNTREF;
    }

    public String getoHP_CODE() {
        return oHP_CODE;
    }

    public void setoHP_CODE(String oHP_CODE) {
        this.oHP_CODE = oHP_CODE;
    }

    public int getcENTERREF() {
        return cENTERREF;
    }

    public void setcENTERREF(int cENTERREF) {
        this.cENTERREF = cENTERREF;
    }

    public String getpROJECT_CODE() {
        return pROJECT_CODE;
    }

    public void setpROJECT_CODE(String pROJECT_CODE) {
        this.pROJECT_CODE = pROJECT_CODE;
    }

    public int getpROJECTREF() {
        return pROJECTREF;
    }

    public void setpROJECTREF(int pROJECTREF) {
        this.pROJECTREF = pROJECTREF;
    }

    public String getpP_GROUP_CODE() {
        return pP_GROUP_CODE;
    }

    public void setpP_GROUP_CODE(String pP_GROUP_CODE) {
        this.pP_GROUP_CODE = pP_GROUP_CODE;
    }

    public int getxML_ATTRIBUTE() {
        return xML_ATTRIBUTE;
    }

    public void setxML_ATTRIBUTE(int xML_ATTRIBUTE) {
        this.xML_ATTRIBUTE = xML_ATTRIBUTE;
    }

    public int getuSE_REP_RISK() {
        return uSE_REP_RISK;
    }

    public void setuSE_REP_RISK(int uSE_REP_RISK) {
        this.uSE_REP_RISK = uSE_REP_RISK;
    }

    public double getrISK_LIMIT() {
        return rISK_LIMIT;
    }

    public void setrISK_LIMIT(double rISK_LIMIT) {
        this.rISK_LIMIT = rISK_LIMIT;
    }

    public double getrISK_BALANCED() {
        return rISK_BALANCED;
    }

    public void setrISK_BALANCED(double rISK_BALANCED) {
        this.rISK_BALANCED = rISK_BALANCED;
    }

    public int getoRD_SEND_METHOD() {
        return oRD_SEND_METHOD;
    }

    public void setoRD_SEND_METHOD(int oRD_SEND_METHOD) {
        this.oRD_SEND_METHOD = oRD_SEND_METHOD;
    }

    public String getoRD_SEND_EMAIL() {
        return oRD_SEND_EMAIL;
    }

    public void setoRD_SEND_EMAIL(String oRD_SEND_EMAIL) {
        this.oRD_SEND_EMAIL = oRD_SEND_EMAIL;
    }

    public String getoRD_SEND_FAX() {
        return oRD_SEND_FAX;
    }

    public void setoRD_SEND_FAX(String oRD_SEND_FAX) {
        this.oRD_SEND_FAX = oRD_SEND_FAX;
    }

    public int getdSP_SEND_METHOD() {
        return dSP_SEND_METHOD;
    }

    public void setdSP_SEND_METHOD(int dSP_SEND_METHOD) {
        this.dSP_SEND_METHOD = dSP_SEND_METHOD;
    }

    public String getdSP_SEND_EMAIL() {
        return dSP_SEND_EMAIL;
    }

    public void setdSP_SEND_EMAIL(String dSP_SEND_EMAIL) {
        this.dSP_SEND_EMAIL = dSP_SEND_EMAIL;
    }

    public String getdSP_SEND_FAX() {
        return dSP_SEND_FAX;
    }

    public void setdSP_SEND_FAX(String dSP_SEND_FAX) {
        this.dSP_SEND_FAX = dSP_SEND_FAX;
    }

    public int getiNV_SEND_METHOD() {
        return iNV_SEND_METHOD;
    }

    public void setiNV_SEND_METHOD(int iNV_SEND_METHOD) {
        this.iNV_SEND_METHOD = iNV_SEND_METHOD;
    }

    public String getiNV_SEND_EMAIL() {
        return iNV_SEND_EMAIL;
    }

    public void setiNV_SEND_EMAIL(String iNV_SEND_EMAIL) {
        this.iNV_SEND_EMAIL = iNV_SEND_EMAIL;
    }

    public String getiNV_SEND_FAX() {
        return iNV_SEND_FAX;
    }

    public void setiNV_SEND_FAX(String iNV_SEND_FAX) {
        this.iNV_SEND_FAX = iNV_SEND_FAX;
    }

    public int getsUBSCRIBER_STATUS() {
        return sUBSCRIBER_STATUS;
    }

    public void setsUBSCRIBER_STATUS(int sUBSCRIBER_STATUS) {
        this.sUBSCRIBER_STATUS = sUBSCRIBER_STATUS;
    }

    public String getsUBSCRIBER_EXT() {
        return sUBSCRIBER_EXT;
    }

    public void setsUBSCRIBER_EXT(String sUBSCRIBER_EXT) {
        this.sUBSCRIBER_EXT = sUBSCRIBER_EXT;
    }

    public String getaUTO_PAID_BANK() {
        return aUTO_PAID_BANK;
    }

    public void setaUTO_PAID_BANK(String aUTO_PAID_BANK) {
        this.aUTO_PAID_BANK = aUTO_PAID_BANK;
    }

    public int getpAYMENT_TYPE() {
        return pAYMENT_TYPE;
    }

    public void setpAYMENT_TYPE(int pAYMENT_TYPE) {
        this.pAYMENT_TYPE = pAYMENT_TYPE;
    }

    public int getlAST_SEND_REM_LEV() {
        return lAST_SEND_REM_LEV;
    }

    public void setlAST_SEND_REM_LEV(int lAST_SEND_REM_LEV) {
        this.lAST_SEND_REM_LEV = lAST_SEND_REM_LEV;
    }

    public int geteXT_ACC_FLAGS() {
        return eXT_ACC_FLAGS;
    }

    public void seteXT_ACC_FLAGS(int eXT_ACC_FLAGS) {
        this.eXT_ACC_FLAGS = eXT_ACC_FLAGS;
    }

    public int getoRD_SEND_FORMAT() {
        return oRD_SEND_FORMAT;
    }

    public void setoRD_SEND_FORMAT(int oRD_SEND_FORMAT) {
        this.oRD_SEND_FORMAT = oRD_SEND_FORMAT;
    }

    public int getdSP_SEND_FORMAT() {
        return dSP_SEND_FORMAT;
    }

    public void setdSP_SEND_FORMAT(int dSP_SEND_FORMAT) {
        this.dSP_SEND_FORMAT = dSP_SEND_FORMAT;
    }

    public int getiNV_SEND_FORMAT() {
        return iNV_SEND_FORMAT;
    }

    public void setiNV_SEND_FORMAT(int iNV_SEND_FORMAT) {
        this.iNV_SEND_FORMAT = iNV_SEND_FORMAT;
    }

    public int getrEM_SEND_FORMAT() {
        return rEM_SEND_FORMAT;
    }

    public void setrEM_SEND_FORMAT(int rEM_SEND_FORMAT) {
        this.rEM_SEND_FORMAT = rEM_SEND_FORMAT;
    }

    public String getsTORE_CREDIT_CARD_NO() {
        return sTORE_CREDIT_CARD_NO;
    }

    public void setsTORE_CREDIT_CARD_NO(String sTORE_CREDIT_CARD_NO) {
        this.sTORE_CREDIT_CARD_NO = sTORE_CREDIT_CARD_NO;
    }

    public int getcL_ORD_FREQ() {
        return cL_ORD_FREQ;
    }

    public void setcL_ORD_FREQ(int cL_ORD_FREQ) {
        this.cL_ORD_FREQ = cL_ORD_FREQ;
    }

    public int getoRD_DAY() {
        return oRD_DAY;
    }

    public void setoRD_DAY(int oRD_DAY) {
        this.oRD_DAY = oRD_DAY;
    }

    public String getlOGOID() {
        return lOGOID;
    }

    public void setlOGOID(String lOGOID) {
        this.lOGOID = lOGOID;
    }

    public int getlID_Confirmed() {
        return lID_Confirmed;
    }

    public void setlID_Confirmed(int lID_Confirmed) {
        this.lID_Confirmed = lID_Confirmed;
    }

    public int getE_BSNS_SEND_TYPE() {
        return e_BSNS_SEND_TYPE;
    }

    public void setE_BSNS_SEND_TYPE(int e_BSNS_SEND_TYPE) {
        this.e_BSNS_SEND_TYPE = e_BSNS_SEND_TYPE;
    }

    public int getlDX_DEF_ORDER_STAT() {
        return lDX_DEF_ORDER_STAT;
    }

    public void setlDX_DEF_ORDER_STAT(int lDX_DEF_ORDER_STAT) {
        this.lDX_DEF_ORDER_STAT = lDX_DEF_ORDER_STAT;
    }

    public int getlDX_DEF_ORDER_PRC() {
        return lDX_DEF_ORDER_PRC;
    }

    public void setlDX_DEF_ORDER_PRC(int lDX_DEF_ORDER_PRC) {
        this.lDX_DEF_ORDER_PRC = lDX_DEF_ORDER_PRC;
    }

    public int getiTR_SEND_METHOD() {
        return iTR_SEND_METHOD;
    }

    public void setiTR_SEND_METHOD(int iTR_SEND_METHOD) {
        this.iTR_SEND_METHOD = iTR_SEND_METHOD;
    }

    public String getiTR_SEND_MAIL_ADR() {
        return iTR_SEND_MAIL_ADR;
    }

    public void setiTR_SEND_MAIL_ADR(String iTR_SEND_MAIL_ADR) {
        this.iTR_SEND_MAIL_ADR = iTR_SEND_MAIL_ADR;
    }

    public String getiTR_SEND_FAX() {
        return iTR_SEND_FAX;
    }

    public void setiTR_SEND_FAX(String iTR_SEND_FAX) {
        this.iTR_SEND_FAX = iTR_SEND_FAX;
    }

    public int getiTR_SEND_FORMAT() {
        return iTR_SEND_FORMAT;
    }

    public void setiTR_SEND_FORMAT(int iTR_SEND_FORMAT) {
        this.iTR_SEND_FORMAT = iTR_SEND_FORMAT;
    }

    public int getiMG2INC() {
        return iMG2INC;
    }

    public void setiMG2INC(int iMG2INC) {
        this.iMG2INC = iMG2INC;
    }

    public int getiNVOICE_PRNT_CNT() {
        return iNVOICE_PRNT_CNT;
    }

    public void setiNVOICE_PRNT_CNT(int iNVOICE_PRNT_CNT) {
        this.iNVOICE_PRNT_CNT = iNVOICE_PRNT_CNT;
    }

    public GENIUSFLDSLIST getgENIUSFLDSLIST() {
        return gENIUSFLDSLIST;
    }

    public void setgENIUSFLDSLIST(GENIUSFLDSLIST gENIUSFLDSLIST) {
        this.gENIUSFLDSLIST = gENIUSFLDSLIST;
    }

    public DEFNFLDSLIST getdEFNFLDSLIST() {
        return dEFNFLDSLIST;
    }

    public void setdEFNFLDSLIST(DEFNFLDSLIST dEFNFLDSLIST) {
        this.dEFNFLDSLIST = dEFNFLDSLIST;
    }

    public int getwFLOWCARDREF() {
        return wFLOWCARDREF;
    }

    public void setwFLOWCARDREF(int wFLOWCARDREF) {
        this.wFLOWCARDREF = wFLOWCARDREF;
    }

    public String getpARENTCLCODE() {
        return pARENTCLCODE;
    }

    public void setpARENTCLCODE(String pARENTCLCODE) {
        this.pARENTCLCODE = pARENTCLCODE;
    }

    public int getpARENTCLREF() {
        return pARENTCLREF;
    }

    public void setpARENTCLREF(int pARENTCLREF) {
        this.pARENTCLREF = pARENTCLREF;
    }

    public int getcODE_CHANGED() {
        return cODE_CHANGED;
    }

    public void setcODE_CHANGED(int cODE_CHANGED) {
        this.cODE_CHANGED = cODE_CHANGED;
    }

    public int getcOLLECTINV() {
        return cOLLECTINV;
    }

    public void setcOLLECTINV(int cOLLECTINV) {
        this.cOLLECTINV = cOLLECTINV;
    }

    public int getpIECEORDINFLICT() {
        return pIECEORDINFLICT;
    }

    public void setpIECEORDINFLICT(int pIECEORDINFLICT) {
        this.pIECEORDINFLICT = pIECEORDINFLICT;
    }

    public String getoRGLOGOID() {
        return oRGLOGOID;
    }

    public void setoRGLOGOID(String oRGLOGOID) {
        this.oRGLOGOID = oRGLOGOID;
    }

    public int getpURCHBRWS() {
        return pURCHBRWS;
    }

    public void setpURCHBRWS(int pURCHBRWS) {
        this.pURCHBRWS = pURCHBRWS;
    }

    public int getsALESBRWS() {
        return sALESBRWS;
    }

    public void setsALESBRWS(int sALESBRWS) {
        this.sALESBRWS = sALESBRWS;
    }

    public int getiMPBRWS() {
        return iMPBRWS;
    }

    public void setiMPBRWS(int iMPBRWS) {
        this.iMPBRWS = iMPBRWS;
    }

    public int geteXPBRWS() {
        return eXPBRWS;
    }

    public void seteXPBRWS(int eXPBRWS) {
        this.eXPBRWS = eXPBRWS;
    }

    public int getfINBRWS() {
        return fINBRWS;
    }

    public void setfINBRWS(int fINBRWS) {
        this.fINBRWS = fINBRWS;
    }

    public int getcOLLATRLRISK_TYPE() {
        return cOLLATRLRISK_TYPE;
    }

    public void setcOLLATRLRISK_TYPE(int cOLLATRLRISK_TYPE) {
        this.cOLLATRLRISK_TYPE = cOLLATRLRISK_TYPE;
    }

    public int getcOLLRISK_OVER() {
        return cOLLRISK_OVER;
    }

    public void setcOLLRISK_OVER(int cOLLRISK_OVER) {
        this.cOLLRISK_OVER = cOLLRISK_OVER;
    }

    public int getcOLLRISK_ORD_RISK_OVER() {
        return cOLLRISK_ORD_RISK_OVER;
    }

    public void setcOLLRISK_ORD_RISK_OVER(int cOLLRISK_ORD_RISK_OVER) {
        this.cOLLRISK_ORD_RISK_OVER = cOLLRISK_ORD_RISK_OVER;
    }

    public int getcOLLRISK_DESP_RISK_OVER() {
        return cOLLRISK_DESP_RISK_OVER;
    }

    public void setcOLLRISK_DESP_RISK_OVER(int cOLLRISK_DESP_RISK_OVER) {
        this.cOLLRISK_DESP_RISK_OVER = cOLLRISK_DESP_RISK_OVER;
    }

    public int getcOLLRISK_USE_REP_RISK() {
        return cOLLRISK_USE_REP_RISK;
    }

    public void setcOLLRISK_USE_REP_RISK(int cOLLRISK_USE_REP_RISK) {
        this.cOLLRISK_USE_REP_RISK = cOLLRISK_USE_REP_RISK;
    }

    public double getcOLLRISK_PCOLLATRL_TOTAL() {
        return cOLLRISK_PCOLLATRL_TOTAL;
    }

    public void setcOLLRISK_PCOLLATRL_TOTAL(double cOLLRISK_PCOLLATRL_TOTAL) {
        this.cOLLRISK_PCOLLATRL_TOTAL = cOLLRISK_PCOLLATRL_TOTAL;
    }

    public double getcOLLRISK_REP_PCOLLATRL_TOT() {
        return cOLLRISK_REP_PCOLLATRL_TOT;
    }

    public void setcOLLRISK_REP_PCOLLATRL_TOT(double cOLLRISK_REP_PCOLLATRL_TOT) {
        this.cOLLRISK_REP_PCOLLATRL_TOT = cOLLRISK_REP_PCOLLATRL_TOT;
    }

    public double getcOLLRISK_SCOLLATRL_TOTAL() {
        return cOLLRISK_SCOLLATRL_TOTAL;
    }

    public void setcOLLRISK_SCOLLATRL_TOTAL(double cOLLRISK_SCOLLATRL_TOTAL) {
        this.cOLLRISK_SCOLLATRL_TOTAL = cOLLRISK_SCOLLATRL_TOTAL;
    }

    public double getcOLLRISK_TOTAL() {
        return cOLLRISK_TOTAL;
    }

    public void setcOLLRISK_TOTAL(double cOLLRISK_TOTAL) {
        this.cOLLRISK_TOTAL = cOLLRISK_TOTAL;
    }

    public double getcOLLRISK_REP_RISK_TOTAL() {
        return cOLLRISK_REP_RISK_TOTAL;
    }

    public void setcOLLRISK_REP_RISK_TOTAL(double cOLLRISK_REP_RISK_TOTAL) {
        this.cOLLRISK_REP_RISK_TOTAL = cOLLRISK_REP_RISK_TOTAL;
    }

    public double getcOLLRISK_DESP_TOTAL() {
        return cOLLRISK_DESP_TOTAL;
    }

    public void setcOLLRISK_DESP_TOTAL(double cOLLRISK_DESP_TOTAL) {
        this.cOLLRISK_DESP_TOTAL = cOLLRISK_DESP_TOTAL;
    }

    public double getcOLLRISK_REP_DESP_RISK_TOT() {
        return cOLLRISK_REP_DESP_RISK_TOT;
    }

    public void setcOLLRISK_REP_DESP_RISK_TOT(double cOLLRISK_REP_DESP_RISK_TOT) {
        this.cOLLRISK_REP_DESP_RISK_TOT = cOLLRISK_REP_DESP_RISK_TOT;
    }

    public double getcOLLRISK_LIMIT() {
        return cOLLRISK_LIMIT;
    }

    public void setcOLLRISK_LIMIT(double cOLLRISK_LIMIT) {
        this.cOLLRISK_LIMIT = cOLLRISK_LIMIT;
    }

    public double getcOLLRISK_REP_LIMIT() {
        return cOLLRISK_REP_LIMIT;
    }

    public void setcOLLRISK_REP_LIMIT(double cOLLRISK_REP_LIMIT) {
        this.cOLLRISK_REP_LIMIT = cOLLRISK_REP_LIMIT;
    }

    public double getcOLLRISK_BALANCED() {
        return cOLLRISK_BALANCED;
    }

    public void setcOLLRISK_BALANCED(double cOLLRISK_BALANCED) {
        this.cOLLRISK_BALANCED = cOLLRISK_BALANCED;
    }

    public double getcOLLRISK_REP_BALANCED() {
        return cOLLRISK_REP_BALANCED;
    }

    public void setcOLLRISK_REP_BALANCED(double cOLLRISK_REP_BALANCED) {
        this.cOLLRISK_REP_BALANCED = cOLLRISK_REP_BALANCED;
    }

    public double getcOLLRISK_ORD_RISK_TOTAL() {
        return cOLLRISK_ORD_RISK_TOTAL;
    }

    public void setcOLLRISK_ORD_RISK_TOTAL(double cOLLRISK_ORD_RISK_TOTAL) {
        this.cOLLRISK_ORD_RISK_TOTAL = cOLLRISK_ORD_RISK_TOTAL;
    }

    public double getcOLLRISK_REP_ORD_RISK_TOT() {
        return cOLLRISK_REP_ORD_RISK_TOT;
    }

    public void setcOLLRISK_REP_ORD_RISK_TOT(double cOLLRISK_REP_ORD_RISK_TOT) {
        this.cOLLRISK_REP_ORD_RISK_TOT = cOLLRISK_REP_ORD_RISK_TOT;
    }

    public double getcOLLRISK_ORD_RISK_TOT_SUGG() {
        return cOLLRISK_ORD_RISK_TOT_SUGG;
    }

    public void setcOLLRISK_ORD_RISK_TOT_SUGG(double cOLLRISK_ORD_RISK_TOT_SUGG) {
        this.cOLLRISK_ORD_RISK_TOT_SUGG = cOLLRISK_ORD_RISK_TOT_SUGG;
    }

    public double getcOLLRISK_REP_ORD_RISK_TOT_SUG() {
        return cOLLRISK_REP_ORD_RISK_TOT_SUG;
    }

    public void setcOLLRISK_REP_ORD_RISK_TOT_SUG(double cOLLRISK_REP_ORD_RISK_TOT_SUG) {
        this.cOLLRISK_REP_ORD_RISK_TOT_SUG = cOLLRISK_REP_ORD_RISK_TOT_SUG;
    }

    public int getcOLLRISK_SEP_CS_RISK_TOT() {
        return cOLLRISK_SEP_CS_RISK_TOT;
    }

    public void setcOLLRISK_SEP_CS_RISK_TOT(int cOLLRISK_SEP_CS_RISK_TOT) {
        this.cOLLRISK_SEP_CS_RISK_TOT = cOLLRISK_SEP_CS_RISK_TOT;
    }

    public int getcOLLRISK_CS_RISK_OVER() {
        return cOLLRISK_CS_RISK_OVER;
    }

    public void setcOLLRISK_CS_RISK_OVER(int cOLLRISK_CS_RISK_OVER) {
        this.cOLLRISK_CS_RISK_OVER = cOLLRISK_CS_RISK_OVER;
    }

    public double getcOLLRISK_CS_RISK_TOTAL() {
        return cOLLRISK_CS_RISK_TOTAL;
    }

    public void setcOLLRISK_CS_RISK_TOTAL(double cOLLRISK_CS_RISK_TOTAL) {
        this.cOLLRISK_CS_RISK_TOTAL = cOLLRISK_CS_RISK_TOTAL;
    }

    public double getcOLLRISK_REP_CS_RISK_TOT() {
        return cOLLRISK_REP_CS_RISK_TOT;
    }

    public void setcOLLRISK_REP_CS_RISK_TOT(double cOLLRISK_REP_CS_RISK_TOT) {
        this.cOLLRISK_REP_CS_RISK_TOT = cOLLRISK_REP_CS_RISK_TOT;
    }

    public int getgRPFIRMNR() {
        return gRPFIRMNR;
    }

    public void setgRPFIRMNR(int gRPFIRMNR) {
        this.gRPFIRMNR = gRPFIRMNR;
    }

    public int getcONSCODEREF() {
        return cONSCODEREF;
    }

    public void setcONSCODEREF(int cONSCODEREF) {
        this.cONSCODEREF = cONSCODEREF;
    }

    public String getcONSCODE() {
        return cONSCODE;
    }

    public void setcONSCODE(String cONSCODE) {
        this.cONSCODE = cONSCODE;
    }

    public String getaUXIL_CODE2() {
        return aUXIL_CODE2;
    }

    public void setaUXIL_CODE2(String aUXIL_CODE2) {
        this.aUXIL_CODE2 = aUXIL_CODE2;
    }

    public String getaUXIL_CODE3() {
        return aUXIL_CODE3;
    }

    public void setaUXIL_CODE3(String aUXIL_CODE3) {
        this.aUXIL_CODE3 = aUXIL_CODE3;
    }

    public String getaUXIL_CODE4() {
        return aUXIL_CODE4;
    }

    public void setaUXIL_CODE4(String aUXIL_CODE4) {
        this.aUXIL_CODE4 = aUXIL_CODE4;
    }

    public String getaUXIL_CODE5() {
        return aUXIL_CODE5;
    }

    public void setaUXIL_CODE5(String aUXIL_CODE5) {
        this.aUXIL_CODE5 = aUXIL_CODE5;
    }

    public int geteBANKCODE() {
        return eBANKCODE;
    }

    public void seteBANKCODE(int eBANKCODE) {
        this.eBANKCODE = eBANKCODE;
    }

    public int getoFF_SEND_METHOD() {
        return oFF_SEND_METHOD;
    }

    public void setoFF_SEND_METHOD(int oFF_SEND_METHOD) {
        this.oFF_SEND_METHOD = oFF_SEND_METHOD;
    }

    public String getoFF_SEND_MAIL_ADDR() {
        return oFF_SEND_MAIL_ADDR;
    }

    public void setoFF_SEND_MAIL_ADDR(String oFF_SEND_MAIL_ADDR) {
        this.oFF_SEND_MAIL_ADDR = oFF_SEND_MAIL_ADDR;
    }

    public String getoFF_SEND_FAX() {
        return oFF_SEND_FAX;
    }

    public void setoFF_SEND_FAX(String oFF_SEND_FAX) {
        this.oFF_SEND_FAX = oFF_SEND_FAX;
    }

    public int getoFF_SEND_FORMAT() {
        return oFF_SEND_FORMAT;
    }

    public void setoFF_SEND_FORMAT(int oFF_SEND_FORMAT) {
        this.oFF_SEND_FORMAT = oFF_SEND_FORMAT;
    }

    public int getrISK_TYPE1() {
        return rISK_TYPE1;
    }

    public void setrISK_TYPE1(int rISK_TYPE1) {
        this.rISK_TYPE1 = rISK_TYPE1;
    }

    public int getrISK_TYPE2() {
        return rISK_TYPE2;
    }

    public void setrISK_TYPE2(int rISK_TYPE2) {
        this.rISK_TYPE2 = rISK_TYPE2;
    }

    public int getrISK_TYPE3() {
        return rISK_TYPE3;
    }

    public void setrISK_TYPE3(int rISK_TYPE3) {
        this.rISK_TYPE3 = rISK_TYPE3;
    }

    public int getrISK_TYPE4() {
        return rISK_TYPE4;
    }

    public void setrISK_TYPE4(int rISK_TYPE4) {
        this.rISK_TYPE4 = rISK_TYPE4;
    }

    public int getrISK_TYPE5() {
        return rISK_TYPE5;
    }

    public void setrISK_TYPE5(int rISK_TYPE5) {
        this.rISK_TYPE5 = rISK_TYPE5;
    }

    public int getrISK_TYPE6() {
        return rISK_TYPE6;
    }

    public void setrISK_TYPE6(int rISK_TYPE6) {
        this.rISK_TYPE6 = rISK_TYPE6;
    }

    public int getrISK_TYPE7() {
        return rISK_TYPE7;
    }

    public void setrISK_TYPE7(int rISK_TYPE7) {
        this.rISK_TYPE7 = rISK_TYPE7;
    }

    public int getrISK_TYPE8() {
        return rISK_TYPE8;
    }

    public void setrISK_TYPE8(int rISK_TYPE8) {
        this.rISK_TYPE8 = rISK_TYPE8;
    }

    public int getrISK_TYPE9() {
        return rISK_TYPE9;
    }

    public void setrISK_TYPE9(int rISK_TYPE9) {
        this.rISK_TYPE9 = rISK_TYPE9;
    }

    public int getrISK_TYPE10() {
        return rISK_TYPE10;
    }

    public void setrISK_TYPE10(int rISK_TYPE10) {
        this.rISK_TYPE10 = rISK_TYPE10;
    }

    public int getrISK_TYPE11() {
        return rISK_TYPE11;
    }

    public void setrISK_TYPE11(int rISK_TYPE11) {
        this.rISK_TYPE11 = rISK_TYPE11;
    }

    public int getrISK_TYPE12() {
        return rISK_TYPE12;
    }

    public void setrISK_TYPE12(int rISK_TYPE12) {
        this.rISK_TYPE12 = rISK_TYPE12;
    }

    public int getrISK_TYPE13() {
        return rISK_TYPE13;
    }

    public void setrISK_TYPE13(int rISK_TYPE13) {
        this.rISK_TYPE13 = rISK_TYPE13;
    }

    public int getrISK_TYPE14() {
        return rISK_TYPE14;
    }

    public void setrISK_TYPE14(int rISK_TYPE14) {
        this.rISK_TYPE14 = rISK_TYPE14;
    }

    public int getrISK_TYPE15() {
        return rISK_TYPE15;
    }

    public void setrISK_TYPE15(int rISK_TYPE15) {
        this.rISK_TYPE15 = rISK_TYPE15;
    }

    public double getcST_CEK_RISK_FACTOR() {
        return cST_CEK_RISK_FACTOR;
    }

    public void setcST_CEK_RISK_FACTOR(double cST_CEK_RISK_FACTOR) {
        this.cST_CEK_RISK_FACTOR = cST_CEK_RISK_FACTOR;
    }

    public double getcST_SENET_RISK_FACTOR() {
        return cST_SENET_RISK_FACTOR;
    }

    public void setcST_SENET_RISK_FACTOR(double cST_SENET_RISK_FACTOR) {
        this.cST_SENET_RISK_FACTOR = cST_SENET_RISK_FACTOR;
    }

    public int getrISK_GRP_CONTROL() {
        return rISK_GRP_CONTROL;
    }

    public void setrISK_GRP_CONTROL(int rISK_GRP_CONTROL) {
        this.rISK_GRP_CONTROL = rISK_GRP_CONTROL;
    }

    public int getaCTION_CREDHOLD_ORD() {
        return aCTION_CREDHOLD_ORD;
    }

    public void setaCTION_CREDHOLD_ORD(int aCTION_CREDHOLD_ORD) {
        this.aCTION_CREDHOLD_ORD = aCTION_CREDHOLD_ORD;
    }

    public int getaCTION_CREDHOLD_DESP() {
        return aCTION_CREDHOLD_DESP;
    }

    public void setaCTION_CREDHOLD_DESP(int aCTION_CREDHOLD_DESP) {
        this.aCTION_CREDHOLD_DESP = aCTION_CREDHOLD_DESP;
    }

    public int getaCTION_CREDHOLD_ACC() {
        return aCTION_CREDHOLD_ACC;
    }

    public void setaCTION_CREDHOLD_ACC(int aCTION_CREDHOLD_ACC) {
        this.aCTION_CREDHOLD_ACC = aCTION_CREDHOLD_ACC;
    }

    public int getaCTION_CREDHOLD_CST_CS() {
        return aCTION_CREDHOLD_CST_CS;
    }

    public void setaCTION_CREDHOLD_CST_CS(int aCTION_CREDHOLD_CST_CS) {
        this.aCTION_CREDHOLD_CST_CS = aCTION_CREDHOLD_CST_CS;
    }

    public int getaCTION_CREDHOLD_MY_CS() {
        return aCTION_CREDHOLD_MY_CS;
    }

    public void setaCTION_CREDHOLD_MY_CS(int aCTION_CREDHOLD_MY_CS) {
        this.aCTION_CREDHOLD_MY_CS = aCTION_CREDHOLD_MY_CS;
    }

    public int getrISK_CTRL_TYPE() {
        return rISK_CTRL_TYPE;
    }

    public void setrISK_CTRL_TYPE(int rISK_CTRL_TYPE) {
        this.rISK_CTRL_TYPE = rISK_CTRL_TYPE;
    }

    public double getaCC_RISK_TOTAL() {
        return aCC_RISK_TOTAL;
    }

    public void setaCC_RISK_TOTAL(double aCC_RISK_TOTAL) {
        this.aCC_RISK_TOTAL = aCC_RISK_TOTAL;
    }

    public double getrEP_ACC_RISK_TOTAL() {
        return rEP_ACC_RISK_TOTAL;
    }

    public void setrEP_ACC_RISK_TOTAL(double rEP_ACC_RISK_TOTAL) {
        this.rEP_ACC_RISK_TOTAL = rEP_ACC_RISK_TOTAL;
    }

    public double getcST_CS_RISK_TOTAL() {
        return cST_CS_RISK_TOTAL;
    }

    public void setcST_CS_RISK_TOTAL(double cST_CS_RISK_TOTAL) {
        this.cST_CS_RISK_TOTAL = cST_CS_RISK_TOTAL;
    }

    public double getrEP_CST_CS_RISK_TOTAL() {
        return rEP_CST_CS_RISK_TOTAL;
    }

    public void setrEP_CST_CS_RISK_TOTAL(double rEP_CST_CS_RISK_TOTAL) {
        this.rEP_CST_CS_RISK_TOTAL = rEP_CST_CS_RISK_TOTAL;
    }

    public double getmY_CS_RISK_TOTAL() {
        return mY_CS_RISK_TOTAL;
    }

    public void setmY_CS_RISK_TOTAL(double mY_CS_RISK_TOTAL) {
        this.mY_CS_RISK_TOTAL = mY_CS_RISK_TOTAL;
    }

    public double getrEP_MY_CS_RISK_TOTAL() {
        return rEP_MY_CS_RISK_TOTAL;
    }

    public void setrEP_MY_CS_RISK_TOTAL(double rEP_MY_CS_RISK_TOTAL) {
        this.rEP_MY_CS_RISK_TOTAL = rEP_MY_CS_RISK_TOTAL;
    }

    public double getoRD_RISK_TOTAL() {
        return oRD_RISK_TOTAL;
    }

    public void setoRD_RISK_TOTAL(double oRD_RISK_TOTAL) {
        this.oRD_RISK_TOTAL = oRD_RISK_TOTAL;
    }

    public double getrEP_ORD_RISK_TOTAL() {
        return rEP_ORD_RISK_TOTAL;
    }

    public void setrEP_ORD_RISK_TOTAL(double rEP_ORD_RISK_TOTAL) {
        this.rEP_ORD_RISK_TOTAL = rEP_ORD_RISK_TOTAL;
    }

    public double getoRD_RISK_TOTAL_SUGG() {
        return oRD_RISK_TOTAL_SUGG;
    }

    public void setoRD_RISK_TOTAL_SUGG(double oRD_RISK_TOTAL_SUGG) {
        this.oRD_RISK_TOTAL_SUGG = oRD_RISK_TOTAL_SUGG;
    }

    public double getrEP_ORD_RISK_TOTAL_SUGG() {
        return rEP_ORD_RISK_TOTAL_SUGG;
    }

    public void setrEP_ORD_RISK_TOTAL_SUGG(double rEP_ORD_RISK_TOTAL_SUGG) {
        this.rEP_ORD_RISK_TOTAL_SUGG = rEP_ORD_RISK_TOTAL_SUGG;
    }

    public double getdESP_RISK_TOTAL() {
        return dESP_RISK_TOTAL;
    }

    public void setdESP_RISK_TOTAL(double dESP_RISK_TOTAL) {
        this.dESP_RISK_TOTAL = dESP_RISK_TOTAL;
    }

    public double getrEP_DESP_RISK_TOTAL() {
        return rEP_DESP_RISK_TOTAL;
    }

    public void setrEP_DESP_RISK_TOTAL(double rEP_DESP_RISK_TOTAL) {
        this.rEP_DESP_RISK_TOTAL = rEP_DESP_RISK_TOTAL;
    }

    public double getaCC_RISK_LIMIT() {
        return aCC_RISK_LIMIT;
    }

    public void setaCC_RISK_LIMIT(double aCC_RISK_LIMIT) {
        this.aCC_RISK_LIMIT = aCC_RISK_LIMIT;
    }

    public double getrEP_ACC_RISK_LIMIT() {
        return rEP_ACC_RISK_LIMIT;
    }

    public void setrEP_ACC_RISK_LIMIT(double rEP_ACC_RISK_LIMIT) {
        this.rEP_ACC_RISK_LIMIT = rEP_ACC_RISK_LIMIT;
    }

    public double getcST_CS_RISK_LIMIT() {
        return cST_CS_RISK_LIMIT;
    }

    public void setcST_CS_RISK_LIMIT(double cST_CS_RISK_LIMIT) {
        this.cST_CS_RISK_LIMIT = cST_CS_RISK_LIMIT;
    }

    public double getrEP_CST_CS_RISK_LIMIT() {
        return rEP_CST_CS_RISK_LIMIT;
    }

    public void setrEP_CST_CS_RISK_LIMIT(double rEP_CST_CS_RISK_LIMIT) {
        this.rEP_CST_CS_RISK_LIMIT = rEP_CST_CS_RISK_LIMIT;
    }

    public double getmY_CS_RISK_LIMIT() {
        return mY_CS_RISK_LIMIT;
    }

    public void setmY_CS_RISK_LIMIT(double mY_CS_RISK_LIMIT) {
        this.mY_CS_RISK_LIMIT = mY_CS_RISK_LIMIT;
    }

    public double getrEP_MY_CS_RISK_LIMIT() {
        return rEP_MY_CS_RISK_LIMIT;
    }

    public void setrEP_MY_CS_RISK_LIMIT(double rEP_MY_CS_RISK_LIMIT) {
        this.rEP_MY_CS_RISK_LIMIT = rEP_MY_CS_RISK_LIMIT;
    }

    public double getdESP_RISK_LIMIT() {
        return dESP_RISK_LIMIT;
    }

    public void setdESP_RISK_LIMIT(double dESP_RISK_LIMIT) {
        this.dESP_RISK_LIMIT = dESP_RISK_LIMIT;
    }

    public double getrEP_DESP_RISK_LIMIT() {
        return rEP_DESP_RISK_LIMIT;
    }

    public void setrEP_DESP_RISK_LIMIT(double rEP_DESP_RISK_LIMIT) {
        this.rEP_DESP_RISK_LIMIT = rEP_DESP_RISK_LIMIT;
    }

    public double getoRD_RISK_LIMIT() {
        return oRD_RISK_LIMIT;
    }

    public void setoRD_RISK_LIMIT(double oRD_RISK_LIMIT) {
        this.oRD_RISK_LIMIT = oRD_RISK_LIMIT;
    }

    public double getrEP_ORD_RISK_LIMIT() {
        return rEP_ORD_RISK_LIMIT;
    }

    public void setrEP_ORD_RISK_LIMIT(double rEP_ORD_RISK_LIMIT) {
        this.rEP_ORD_RISK_LIMIT = rEP_ORD_RISK_LIMIT;
    }

    public double getoRD_RISK_LIMIT_SUGG() {
        return oRD_RISK_LIMIT_SUGG;
    }

    public void setoRD_RISK_LIMIT_SUGG(double oRD_RISK_LIMIT_SUGG) {
        this.oRD_RISK_LIMIT_SUGG = oRD_RISK_LIMIT_SUGG;
    }

    public double getrEP_ORD_SIRK_LIMIT_SUGG() {
        return rEP_ORD_SIRK_LIMIT_SUGG;
    }

    public void setrEP_ORD_SIRK_LIMIT_SUGG(double rEP_ORD_SIRK_LIMIT_SUGG) {
        this.rEP_ORD_SIRK_LIMIT_SUGG = rEP_ORD_SIRK_LIMIT_SUGG;
    }

    public double getaCC_RISK_BALANCED() {
        return aCC_RISK_BALANCED;
    }

    public void setaCC_RISK_BALANCED(double aCC_RISK_BALANCED) {
        this.aCC_RISK_BALANCED = aCC_RISK_BALANCED;
    }

    public double getrEP_ACC_RISK_BALANCED() {
        return rEP_ACC_RISK_BALANCED;
    }

    public void setrEP_ACC_RISK_BALANCED(double rEP_ACC_RISK_BALANCED) {
        this.rEP_ACC_RISK_BALANCED = rEP_ACC_RISK_BALANCED;
    }

    public double getcST_CS_RISK_BALANCED() {
        return cST_CS_RISK_BALANCED;
    }

    public void setcST_CS_RISK_BALANCED(double cST_CS_RISK_BALANCED) {
        this.cST_CS_RISK_BALANCED = cST_CS_RISK_BALANCED;
    }

    public double getrEP_CST_CS_RISK_BALANCED() {
        return rEP_CST_CS_RISK_BALANCED;
    }

    public void setrEP_CST_CS_RISK_BALANCED(double rEP_CST_CS_RISK_BALANCED) {
        this.rEP_CST_CS_RISK_BALANCED = rEP_CST_CS_RISK_BALANCED;
    }

    public double getmY_CS_RISK_BALANCED() {
        return mY_CS_RISK_BALANCED;
    }

    public void setmY_CS_RISK_BALANCED(double mY_CS_RISK_BALANCED) {
        this.mY_CS_RISK_BALANCED = mY_CS_RISK_BALANCED;
    }

    public double getrEP_MY_CS_RISK_BALANCED() {
        return rEP_MY_CS_RISK_BALANCED;
    }

    public void setrEP_MY_CS_RISK_BALANCED(double rEP_MY_CS_RISK_BALANCED) {
        this.rEP_MY_CS_RISK_BALANCED = rEP_MY_CS_RISK_BALANCED;
    }

    public double getdESP_RISK_BALANCED() {
        return dESP_RISK_BALANCED;
    }

    public void setdESP_RISK_BALANCED(double dESP_RISK_BALANCED) {
        this.dESP_RISK_BALANCED = dESP_RISK_BALANCED;
    }

    public double getrEP_DESP_RISK_BALANCED() {
        return rEP_DESP_RISK_BALANCED;
    }

    public void setrEP_DESP_RISK_BALANCED(double rEP_DESP_RISK_BALANCED) {
        this.rEP_DESP_RISK_BALANCED = rEP_DESP_RISK_BALANCED;
    }

    public double getoRD_RISK_BALANCED() {
        return oRD_RISK_BALANCED;
    }

    public void setoRD_RISK_BALANCED(double oRD_RISK_BALANCED) {
        this.oRD_RISK_BALANCED = oRD_RISK_BALANCED;
    }

    public double getrEP_ORD_RISK_BALANCED() {
        return rEP_ORD_RISK_BALANCED;
    }

    public void setrEP_ORD_RISK_BALANCED(double rEP_ORD_RISK_BALANCED) {
        this.rEP_ORD_RISK_BALANCED = rEP_ORD_RISK_BALANCED;
    }

    public double getoRD_RISK_BALANCED_SUGG() {
        return oRD_RISK_BALANCED_SUGG;
    }

    public void setoRD_RISK_BALANCED_SUGG(double oRD_RISK_BALANCED_SUGG) {
        this.oRD_RISK_BALANCED_SUGG = oRD_RISK_BALANCED_SUGG;
    }

    public double getrEP_ORD_RISK_BALANCED_SUGG() {
        return rEP_ORD_RISK_BALANCED_SUGG;
    }

    public void setrEP_ORD_RISK_BALANCED_SUGG(double rEP_ORD_RISK_BALANCED_SUGG) {
        this.rEP_ORD_RISK_BALANCED_SUGG = rEP_ORD_RISK_BALANCED_SUGG;
    }

    public int getlOAN_GRP_CTRL() {
        return lOAN_GRP_CTRL;
    }

    public void setlOAN_GRP_CTRL(int lOAN_GRP_CTRL) {
        this.lOAN_GRP_CTRL = lOAN_GRP_CTRL;
    }

    public int geteBUS_DATA_SEND_TYPE() {
        return eBUS_DATA_SEND_TYPE;
    }

    public void seteBUS_DATA_SEND_TYPE(int eBUS_DATA_SEND_TYPE) {
        this.eBUS_DATA_SEND_TYPE = eBUS_DATA_SEND_TYPE;
    }

    public int getiNI_STATUS_FLAGS() {
        return iNI_STATUS_FLAGS;
    }

    public void setiNI_STATUS_FLAGS(int iNI_STATUS_FLAGS) {
        this.iNI_STATUS_FLAGS = iNI_STATUS_FLAGS;
    }

    public int getsLS_ORDER_STATUS() {
        return sLS_ORDER_STATUS;
    }

    public void setsLS_ORDER_STATUS(int sLS_ORDER_STATUS) {
        this.sLS_ORDER_STATUS = sLS_ORDER_STATUS;
    }

    public int getsLS_ORDER_PRICE() {
        return sLS_ORDER_PRICE;
    }

    public void setsLS_ORDER_PRICE(int sLS_ORDER_PRICE) {
        this.sLS_ORDER_PRICE = sLS_ORDER_PRICE;
    }

    public int getsAME_ITEM_CODE_USE() {
        return sAME_ITEM_CODE_USE;
    }

    public void setsAME_ITEM_CODE_USE(int sAME_ITEM_CODE_USE) {
        this.sAME_ITEM_CODE_USE = sAME_ITEM_CODE_USE;
    }

    public int getiMAGE_SIZE() {
        return iMAGE_SIZE;
    }

    public void setiMAGE_SIZE(int iMAGE_SIZE) {
        this.iMAGE_SIZE = iMAGE_SIZE;
    }

    public String getmAP_ID() {
        return mAP_ID;
    }

    public void setmAP_ID(String mAP_ID) {
        this.mAP_ID = mAP_ID;
    }

    public String getlONGITUDE() {
        return lONGITUDE;
    }

    public void setlONGITUDE(String lONGITUDE) {
        this.lONGITUDE = lONGITUDE;
    }

    public String getlATITUDE() {
        return lATITUDE;
    }

    public void setlATITUDE(String lATITUDE) {
        this.lATITUDE = lATITUDE;
    }

    public String getcITY_ID() {
        return cITY_ID;
    }

    public void setcITY_ID(String cITY_ID) {
        this.cITY_ID = cITY_ID;
    }

    public String gettOWN_ID() {
        return tOWN_ID;
    }

    public void settOWN_ID(String tOWN_ID) {
        this.tOWN_ID = tOWN_ID;
    }

    public String getbANK_IBAN1() {
        return bANK_IBAN1;
    }

    public void setbANK_IBAN1(String bANK_IBAN1) {
        this.bANK_IBAN1 = bANK_IBAN1;
    }

    public String getbANK_IBAN2() {
        return bANK_IBAN2;
    }

    public void setbANK_IBAN2(String bANK_IBAN2) {
        this.bANK_IBAN2 = bANK_IBAN2;
    }

    public String getbANK_IBAN3() {
        return bANK_IBAN3;
    }

    public void setbANK_IBAN3(String bANK_IBAN3) {
        this.bANK_IBAN3 = bANK_IBAN3;
    }

    public String getbANK_IBAN4() {
        return bANK_IBAN4;
    }

    public void setbANK_IBAN4(String bANK_IBAN4) {
        this.bANK_IBAN4 = bANK_IBAN4;
    }

    public String getbANK_IBAN5() {
        return bANK_IBAN5;
    }

    public void setbANK_IBAN5(String bANK_IBAN5) {
        this.bANK_IBAN5 = bANK_IBAN5;
    }

    public String getbANK_IBAN6() {
        return bANK_IBAN6;
    }

    public void setbANK_IBAN6(String bANK_IBAN6) {
        this.bANK_IBAN6 = bANK_IBAN6;
    }

    public String getbANK_IBAN7() {
        return bANK_IBAN7;
    }

    public void setbANK_IBAN7(String bANK_IBAN7) {
        this.bANK_IBAN7 = bANK_IBAN7;
    }

    public String getbANK_BIC1() {
        return bANK_BIC1;
    }

    public void setbANK_BIC1(String bANK_BIC1) {
        this.bANK_BIC1 = bANK_BIC1;
    }

    public String getbANK_BIC2() {
        return bANK_BIC2;
    }

    public void setbANK_BIC2(String bANK_BIC2) {
        this.bANK_BIC2 = bANK_BIC2;
    }

    public String getbANK_BIC3() {
        return bANK_BIC3;
    }

    public void setbANK_BIC3(String bANK_BIC3) {
        this.bANK_BIC3 = bANK_BIC3;
    }

    public String getbANK_BIC4() {
        return bANK_BIC4;
    }

    public void setbANK_BIC4(String bANK_BIC4) {
        this.bANK_BIC4 = bANK_BIC4;
    }

    public String getbANK_BIC5() {
        return bANK_BIC5;
    }

    public void setbANK_BIC5(String bANK_BIC5) {
        this.bANK_BIC5 = bANK_BIC5;
    }

    public String getbANK_BIC6() {
        return bANK_BIC6;
    }

    public void setbANK_BIC6(String bANK_BIC6) {
        this.bANK_BIC6 = bANK_BIC6;
    }

    public String getbANK_BIC7() {
        return bANK_BIC7;
    }

    public void setbANK_BIC7(String bANK_BIC7) {
        this.bANK_BIC7 = bANK_BIC7;
    }

    public int getpERSCOMPANY() {
        return pERSCOMPANY;
    }

    public void setpERSCOMPANY(int pERSCOMPANY) {
        this.pERSCOMPANY = pERSCOMPANY;
    }

    public String gettCKNO() {
        return tCKNO;
    }

    public void settCKNO(String tCKNO) {
        this.tCKNO = tCKNO;
    }

    public int geteXT_SEND_METHOD() {
        return eXT_SEND_METHOD;
    }

    public void seteXT_SEND_METHOD(int eXT_SEND_METHOD) {
        this.eXT_SEND_METHOD = eXT_SEND_METHOD;
    }

    public String geteXT_SEND_EMAIL() {
        return eXT_SEND_EMAIL;
    }

    public void seteXT_SEND_EMAIL(String eXT_SEND_EMAIL) {
        this.eXT_SEND_EMAIL = eXT_SEND_EMAIL;
    }

    public String geteXT_SEND_FAX() {
        return eXT_SEND_FAX;
    }

    public void seteXT_SEND_FAX(String eXT_SEND_FAX) {
        this.eXT_SEND_FAX = eXT_SEND_FAX;
    }

    public int geteXT_SEND_FORMAT() {
        return eXT_SEND_FORMAT;
    }

    public void seteXT_SEND_FORMAT(int eXT_SEND_FORMAT) {
        this.eXT_SEND_FORMAT = eXT_SEND_FORMAT;
    }

    public int getaDDTOREFLIST() {
        return aDDTOREFLIST;
    }

    public void setaDDTOREFLIST(int aDDTOREFLIST) {
        this.aDDTOREFLIST = aDDTOREFLIST;
    }

    public int getoRD_RISK_OVER_SUGG() {
        return oRD_RISK_OVER_SUGG;
    }

    public void setoRD_RISK_OVER_SUGG(int oRD_RISK_OVER_SUGG) {
        this.oRD_RISK_OVER_SUGG = oRD_RISK_OVER_SUGG;
    }

    public String getcASH_CODE() {
        return cASH_CODE;
    }

    public void setcASH_CODE(String cASH_CODE) {
        this.cASH_CODE = cASH_CODE;
    }

    public int getcASHREF() {
        return cASHREF;
    }

    public void setcASHREF(int cASHREF) {
        this.cASHREF = cASHREF;
    }

    public int getuSED_IN_PERIODS() {
        return uSED_IN_PERIODS;
    }

    public void setuSED_IN_PERIODS(int uSED_IN_PERIODS) {
        this.uSED_IN_PERIODS = uSED_IN_PERIODS;
    }

    public String getcONTACT2() {
        return cONTACT2;
    }

    public void setcONTACT2(String cONTACT2) {
        this.cONTACT2 = cONTACT2;
    }

    public String getcONTACT3() {
        return cONTACT3;
    }

    public void setcONTACT3(String cONTACT3) {
        this.cONTACT3 = cONTACT3;
    }

    public String getE_MAIL2() {
        return e_MAIL2;
    }

    public void setE_MAIL2(String e_MAIL2) {
        this.e_MAIL2 = e_MAIL2;
    }

    public String getE_MAIL3() {
        return e_MAIL3;
    }

    public void setE_MAIL3(String e_MAIL3) {
        this.e_MAIL3 = e_MAIL3;
    }

    public String getcONTACT1_TEL_CODE() {
        return cONTACT1_TEL_CODE;
    }

    public void setcONTACT1_TEL_CODE(String cONTACT1_TEL_CODE) {
        this.cONTACT1_TEL_CODE = cONTACT1_TEL_CODE;
    }

    public String getcONTACT2_TEL_CODE() {
        return cONTACT2_TEL_CODE;
    }

    public void setcONTACT2_TEL_CODE(String cONTACT2_TEL_CODE) {
        this.cONTACT2_TEL_CODE = cONTACT2_TEL_CODE;
    }

    public String getcONTACT3_TEL_CODE() {
        return cONTACT3_TEL_CODE;
    }

    public void setcONTACT3_TEL_CODE(String cONTACT3_TEL_CODE) {
        this.cONTACT3_TEL_CODE = cONTACT3_TEL_CODE;
    }

    public String getcONTACT1_TEL() {
        return cONTACT1_TEL;
    }

    public void setcONTACT1_TEL(String cONTACT1_TEL) {
        this.cONTACT1_TEL = cONTACT1_TEL;
    }

    public String getcONTACT2_TEL() {
        return cONTACT2_TEL;
    }

    public void setcONTACT2_TEL(String cONTACT2_TEL) {
        this.cONTACT2_TEL = cONTACT2_TEL;
    }

    public String getcONTACT3_TEL() {
        return cONTACT3_TEL;
    }

    public void setcONTACT3_TEL(String cONTACT3_TEL) {
        this.cONTACT3_TEL = cONTACT3_TEL;
    }

    public String getcONTACT1_TEL_EXT() {
        return cONTACT1_TEL_EXT;
    }

    public void setcONTACT1_TEL_EXT(String cONTACT1_TEL_EXT) {
        this.cONTACT1_TEL_EXT = cONTACT1_TEL_EXT;
    }

    public String getcONTACT2_TEL_EXT() {
        return cONTACT2_TEL_EXT;
    }

    public void setcONTACT2_TEL_EXT(String cONTACT2_TEL_EXT) {
        this.cONTACT2_TEL_EXT = cONTACT2_TEL_EXT;
    }

    public String getcONTACT3_TEL_EXT() {
        return cONTACT3_TEL_EXT;
    }

    public void setcONTACT3_TEL_EXT(String cONTACT3_TEL_EXT) {
        this.cONTACT3_TEL_EXT = cONTACT3_TEL_EXT;
    }

    public int getrSKLIM_CNTRL() {
        return rSKLIM_CNTRL;
    }

    public void setrSKLIM_CNTRL(int rSKLIM_CNTRL) {
        this.rSKLIM_CNTRL = rSKLIM_CNTRL;
    }

    public int getdUEDATE_CNTRL() {
        return dUEDATE_CNTRL;
    }

    public void setdUEDATE_CNTRL(int dUEDATE_CNTRL) {
        this.dUEDATE_CNTRL = dUEDATE_CNTRL;
    }

    public int getaGING_CNTRL() {
        return aGING_CNTRL;
    }

    public void setaGING_CNTRL(int aGING_CNTRL) {
        this.aGING_CNTRL = aGING_CNTRL;
    }

    public int getaGING_DAY() {
        return aGING_DAY;
    }

    public void setaGING_DAY(int aGING_DAY) {
        this.aGING_DAY = aGING_DAY;
    }

    public int getoRD_PRIORITY() {
        return oRD_PRIORITY;
    }

    public void setoRD_PRIORITY(int oRD_PRIORITY) {
        this.oRD_PRIORITY = oRD_PRIORITY;
    }

    public int getaCCEPT_EINV() {
        return aCCEPT_EINV;
    }

    public void setaCCEPT_EINV(int aCCEPT_EINV) {
        this.aCCEPT_EINV = aCCEPT_EINV;
    }

    public String geteIVOICEID() {
        return eIVOICEID;
    }

    public void seteIVOICEID(String eIVOICEID) {
        this.eIVOICEID = eIVOICEID;
    }

    public int getpROFILE_ID() {
        return pROFILE_ID;
    }

    public void setpROFILE_ID(int pROFILE_ID) {
        this.pROFILE_ID = pROFILE_ID;
    }

    public int getpURC_ORDER_STATUS() {
        return pURC_ORDER_STATUS;
    }

    public void setpURC_ORDER_STATUS(int pURC_ORDER_STATUS) {
        this.pURC_ORDER_STATUS = pURC_ORDER_STATUS;
    }

    public int getpURC_ORDER_PRICE() {
        return pURC_ORDER_PRICE;
    }

    public void setpURC_ORDER_PRICE(int pURC_ORDER_PRICE) {
        this.pURC_ORDER_PRICE = pURC_ORDER_PRICE;
    }

    public String getbANK_CURR1() {
        return bANK_CURR1;
    }

    public void setbANK_CURR1(String bANK_CURR1) {
        this.bANK_CURR1 = bANK_CURR1;
    }

    public String getbANK_CURR2() {
        return bANK_CURR2;
    }

    public void setbANK_CURR2(String bANK_CURR2) {
        this.bANK_CURR2 = bANK_CURR2;
    }

    public String getbANK_CURR3() {
        return bANK_CURR3;
    }

    public void setbANK_CURR3(String bANK_CURR3) {
        this.bANK_CURR3 = bANK_CURR3;
    }

    public String getbANK_CURR4() {
        return bANK_CURR4;
    }

    public void setbANK_CURR4(String bANK_CURR4) {
        this.bANK_CURR4 = bANK_CURR4;
    }

    public String getbANK_CURR5() {
        return bANK_CURR5;
    }

    public void setbANK_CURR5(String bANK_CURR5) {
        this.bANK_CURR5 = bANK_CURR5;
    }

    public String getbANK_CURR6() {
        return bANK_CURR6;
    }

    public void setbANK_CURR6(String bANK_CURR6) {
        this.bANK_CURR6 = bANK_CURR6;
    }

    public String getbANK_CURR7() {
        return bANK_CURR7;
    }

    public void setbANK_CURR7(String bANK_CURR7) {
        this.bANK_CURR7 = bANK_CURR7;
    }

    public int getcS_DOWNS_RISK() {
        return cS_DOWNS_RISK;
    }

    public void setcS_DOWNS_RISK(int cS_DOWNS_RISK) {
        this.cS_DOWNS_RISK = cS_DOWNS_RISK;
    }

    public int getcST_CS_CIRO_RISK_OVER() {
        return cST_CS_CIRO_RISK_OVER;
    }

    public void setcST_CS_CIRO_RISK_OVER(int cST_CS_CIRO_RISK_OVER) {
        this.cST_CS_CIRO_RISK_OVER = cST_CS_CIRO_RISK_OVER;
    }

    public double getcST_CIRO_CEK_RISK_FAC() {
        return cST_CIRO_CEK_RISK_FAC;
    }

    public void setcST_CIRO_CEK_RISK_FAC(double cST_CIRO_CEK_RISK_FAC) {
        this.cST_CIRO_CEK_RISK_FAC = cST_CIRO_CEK_RISK_FAC;
    }

    public double getcST_CIRO_SENET_RISK_FAC() {
        return cST_CIRO_SENET_RISK_FAC;
    }

    public void setcST_CIRO_SENET_RISK_FAC(double cST_CIRO_SENET_RISK_FAC) {
        this.cST_CIRO_SENET_RISK_FAC = cST_CIRO_SENET_RISK_FAC;
    }

    public int getcS_CIRO_DOWNS_RISK() {
        return cS_CIRO_DOWNS_RISK;
    }

    public void setcS_CIRO_DOWNS_RISK(int cS_CIRO_DOWNS_RISK) {
        this.cS_CIRO_DOWNS_RISK = cS_CIRO_DOWNS_RISK;
    }

    public double getcST_CS_CIRO_RISK_LIMIT() {
        return cST_CS_CIRO_RISK_LIMIT;
    }

    public void setcST_CS_CIRO_RISK_LIMIT(double cST_CS_CIRO_RISK_LIMIT) {
        this.cST_CS_CIRO_RISK_LIMIT = cST_CS_CIRO_RISK_LIMIT;
    }

    public double getrEP_CST_CS_CIRO_RISK_LIMIT() {
        return rEP_CST_CS_CIRO_RISK_LIMIT;
    }

    public void setrEP_CST_CS_CIRO_RISK_LIMIT(double rEP_CST_CS_CIRO_RISK_LIMIT) {
        this.rEP_CST_CS_CIRO_RISK_LIMIT = rEP_CST_CS_CIRO_RISK_LIMIT;
    }

    public double getcST_CS_CIRO_RISK_BALANCED() {
        return cST_CS_CIRO_RISK_BALANCED;
    }

    public void setcST_CS_CIRO_RISK_BALANCED(double cST_CS_CIRO_RISK_BALANCED) {
        this.cST_CS_CIRO_RISK_BALANCED = cST_CS_CIRO_RISK_BALANCED;
    }

    public double getrEP_CST_CS_CIRO_RISK_BALANCED() {
        return rEP_CST_CS_CIRO_RISK_BALANCED;
    }

    public void setrEP_CST_CS_CIRO_RISK_BALANCED(double rEP_CST_CS_CIRO_RISK_BALANCED) {
        this.rEP_CST_CS_CIRO_RISK_BALANCED = rEP_CST_CS_CIRO_RISK_BALANCED;
    }

    public double getcST_CS_OWN_RISK_TOTAL() {
        return cST_CS_OWN_RISK_TOTAL;
    }

    public void setcST_CS_OWN_RISK_TOTAL(double cST_CS_OWN_RISK_TOTAL) {
        this.cST_CS_OWN_RISK_TOTAL = cST_CS_OWN_RISK_TOTAL;
    }

    public double getrEP_CST_CS_OWN_RISK_TOTAL() {
        return rEP_CST_CS_OWN_RISK_TOTAL;
    }

    public void setrEP_CST_CS_OWN_RISK_TOTAL(double rEP_CST_CS_OWN_RISK_TOTAL) {
        this.rEP_CST_CS_OWN_RISK_TOTAL = rEP_CST_CS_OWN_RISK_TOTAL;
    }

    public double getcST_CS_CIRO_RISK_TOTAL() {
        return cST_CS_CIRO_RISK_TOTAL;
    }

    public void setcST_CS_CIRO_RISK_TOTAL(double cST_CS_CIRO_RISK_TOTAL) {
        this.cST_CS_CIRO_RISK_TOTAL = cST_CS_CIRO_RISK_TOTAL;
    }

    public double getrEP_CST_CS_CIRO_RISK_TOTAL() {
        return rEP_CST_CS_CIRO_RISK_TOTAL;
    }

    public void setrEP_CST_CS_CIRO_RISK_TOTAL(double rEP_CST_CS_CIRO_RISK_TOTAL) {
        this.rEP_CST_CS_CIRO_RISK_TOTAL = rEP_CST_CS_CIRO_RISK_TOTAL;
    }

    public int getdESP_RISK_OVER_SUGG() {
        return dESP_RISK_OVER_SUGG;
    }

    public void setdESP_RISK_OVER_SUGG(int dESP_RISK_OVER_SUGG) {
        this.dESP_RISK_OVER_SUGG = dESP_RISK_OVER_SUGG;
    }

    public double getdESP_RISK_LIMIT_SUGG() {
        return dESP_RISK_LIMIT_SUGG;
    }

    public void setdESP_RISK_LIMIT_SUGG(double dESP_RISK_LIMIT_SUGG) {
        this.dESP_RISK_LIMIT_SUGG = dESP_RISK_LIMIT_SUGG;
    }

    public double getrEP_DESP_RISK_LIMIT_SUGG() {
        return rEP_DESP_RISK_LIMIT_SUGG;
    }

    public void setrEP_DESP_RISK_LIMIT_SUGG(double rEP_DESP_RISK_LIMIT_SUGG) {
        this.rEP_DESP_RISK_LIMIT_SUGG = rEP_DESP_RISK_LIMIT_SUGG;
    }

    public double getdESP_RISK_TOTAL_SUGG() {
        return dESP_RISK_TOTAL_SUGG;
    }

    public void setdESP_RISK_TOTAL_SUGG(double dESP_RISK_TOTAL_SUGG) {
        this.dESP_RISK_TOTAL_SUGG = dESP_RISK_TOTAL_SUGG;
    }

    public double getrEP_DESP_RISK_TOTAL_SUGG() {
        return rEP_DESP_RISK_TOTAL_SUGG;
    }

    public void setrEP_DESP_RISK_TOTAL_SUGG(double rEP_DESP_RISK_TOTAL_SUGG) {
        this.rEP_DESP_RISK_TOTAL_SUGG = rEP_DESP_RISK_TOTAL_SUGG;
    }

    public double getdESP_RISK_BALANCED_SUGG() {
        return dESP_RISK_BALANCED_SUGG;
    }

    public void setdESP_RISK_BALANCED_SUGG(double dESP_RISK_BALANCED_SUGG) {
        this.dESP_RISK_BALANCED_SUGG = dESP_RISK_BALANCED_SUGG;
    }

    public double getrEP_DESP_RISK_BALANCED_SUGG() {
        return rEP_DESP_RISK_BALANCED_SUGG;
    }

    public void setrEP_DESP_RISK_BALANCED_SUGG(double rEP_DESP_RISK_BALANCED_SUGG) {
        this.rEP_DESP_RISK_BALANCED_SUGG = rEP_DESP_RISK_BALANCED_SUGG;
    }

    public double getdBS_LIMIT1() {
        return dBS_LIMIT1;
    }

    public void setdBS_LIMIT1(double dBS_LIMIT1) {
        this.dBS_LIMIT1 = dBS_LIMIT1;
    }

    public double getdBS_LIMIT2() {
        return dBS_LIMIT2;
    }

    public void setdBS_LIMIT2(double dBS_LIMIT2) {
        this.dBS_LIMIT2 = dBS_LIMIT2;
    }

    public double getdBS_LIMIT3() {
        return dBS_LIMIT3;
    }

    public void setdBS_LIMIT3(double dBS_LIMIT3) {
        this.dBS_LIMIT3 = dBS_LIMIT3;
    }

    public double getdBS_LIMIT4() {
        return dBS_LIMIT4;
    }

    public void setdBS_LIMIT4(double dBS_LIMIT4) {
        this.dBS_LIMIT4 = dBS_LIMIT4;
    }

    public double getdBS_LIMIT5() {
        return dBS_LIMIT5;
    }

    public void setdBS_LIMIT5(double dBS_LIMIT5) {
        this.dBS_LIMIT5 = dBS_LIMIT5;
    }

    public double getdBS_LIMIT6() {
        return dBS_LIMIT6;
    }

    public void setdBS_LIMIT6(double dBS_LIMIT6) {
        this.dBS_LIMIT6 = dBS_LIMIT6;
    }

    public double getdBS_LIMIT7() {
        return dBS_LIMIT7;
    }

    public void setdBS_LIMIT7(double dBS_LIMIT7) {
        this.dBS_LIMIT7 = dBS_LIMIT7;
    }

    public double getdBS_TOTAL1() {
        return dBS_TOTAL1;
    }

    public void setdBS_TOTAL1(double dBS_TOTAL1) {
        this.dBS_TOTAL1 = dBS_TOTAL1;
    }

    public double getdBS_TOTAL2() {
        return dBS_TOTAL2;
    }

    public void setdBS_TOTAL2(double dBS_TOTAL2) {
        this.dBS_TOTAL2 = dBS_TOTAL2;
    }

    public double getdBS_TOTAL3() {
        return dBS_TOTAL3;
    }

    public void setdBS_TOTAL3(double dBS_TOTAL3) {
        this.dBS_TOTAL3 = dBS_TOTAL3;
    }

    public double getdBS_TOTAL4() {
        return dBS_TOTAL4;
    }

    public void setdBS_TOTAL4(double dBS_TOTAL4) {
        this.dBS_TOTAL4 = dBS_TOTAL4;
    }

    public double getdBS_TOTAL5() {
        return dBS_TOTAL5;
    }

    public void setdBS_TOTAL5(double dBS_TOTAL5) {
        this.dBS_TOTAL5 = dBS_TOTAL5;
    }

    public double getdBS_TOTAL6() {
        return dBS_TOTAL6;
    }

    public void setdBS_TOTAL6(double dBS_TOTAL6) {
        this.dBS_TOTAL6 = dBS_TOTAL6;
    }

    public double getdBS_TOTAL7() {
        return dBS_TOTAL7;
    }

    public void setdBS_TOTAL7(double dBS_TOTAL7) {
        this.dBS_TOTAL7 = dBS_TOTAL7;
    }

    public int getdBS_BANKNO1() {
        return dBS_BANKNO1;
    }

    public void setdBS_BANKNO1(int dBS_BANKNO1) {
        this.dBS_BANKNO1 = dBS_BANKNO1;
    }

    public int getdBS_BANKNO2() {
        return dBS_BANKNO2;
    }

    public void setdBS_BANKNO2(int dBS_BANKNO2) {
        this.dBS_BANKNO2 = dBS_BANKNO2;
    }

    public int getdBS_BANKNO3() {
        return dBS_BANKNO3;
    }

    public void setdBS_BANKNO3(int dBS_BANKNO3) {
        this.dBS_BANKNO3 = dBS_BANKNO3;
    }

    public int getdBS_BANKNO4() {
        return dBS_BANKNO4;
    }

    public void setdBS_BANKNO4(int dBS_BANKNO4) {
        this.dBS_BANKNO4 = dBS_BANKNO4;
    }

    public int getdBS_BANKNO5() {
        return dBS_BANKNO5;
    }

    public void setdBS_BANKNO5(int dBS_BANKNO5) {
        this.dBS_BANKNO5 = dBS_BANKNO5;
    }

    public int getdBS_BANKNO6() {
        return dBS_BANKNO6;
    }

    public void setdBS_BANKNO6(int dBS_BANKNO6) {
        this.dBS_BANKNO6 = dBS_BANKNO6;
    }

    public int getdBS_BANKNO7() {
        return dBS_BANKNO7;
    }

    public void setdBS_BANKNO7(int dBS_BANKNO7) {
        this.dBS_BANKNO7 = dBS_BANKNO7;
    }

    public int getdBS_RSKCTRL1() {
        return dBS_RSKCTRL1;
    }

    public void setdBS_RSKCTRL1(int dBS_RSKCTRL1) {
        this.dBS_RSKCTRL1 = dBS_RSKCTRL1;
    }

    public int getdBS_RSKCTRL2() {
        return dBS_RSKCTRL2;
    }

    public void setdBS_RSKCTRL2(int dBS_RSKCTRL2) {
        this.dBS_RSKCTRL2 = dBS_RSKCTRL2;
    }

    public int getdBS_RSKCTRL3() {
        return dBS_RSKCTRL3;
    }

    public void setdBS_RSKCTRL3(int dBS_RSKCTRL3) {
        this.dBS_RSKCTRL3 = dBS_RSKCTRL3;
    }

    public int getdBS_RSKCTRL4() {
        return dBS_RSKCTRL4;
    }

    public void setdBS_RSKCTRL4(int dBS_RSKCTRL4) {
        this.dBS_RSKCTRL4 = dBS_RSKCTRL4;
    }

    public int getdBS_RSKCTRL5() {
        return dBS_RSKCTRL5;
    }

    public void setdBS_RSKCTRL5(int dBS_RSKCTRL5) {
        this.dBS_RSKCTRL5 = dBS_RSKCTRL5;
    }

    public int getdBS_RSKCTRL6() {
        return dBS_RSKCTRL6;
    }

    public void setdBS_RSKCTRL6(int dBS_RSKCTRL6) {
        this.dBS_RSKCTRL6 = dBS_RSKCTRL6;
    }

    public int getdBS_RSKCTRL7() {
        return dBS_RSKCTRL7;
    }

    public void setdBS_RSKCTRL7(int dBS_RSKCTRL7) {
        this.dBS_RSKCTRL7 = dBS_RSKCTRL7;
    }

    public int getdBS_CURR1() {
        return dBS_CURR1;
    }

    public void setdBS_CURR1(int dBS_CURR1) {
        this.dBS_CURR1 = dBS_CURR1;
    }

    public int getdBS_CURR2() {
        return dBS_CURR2;
    }

    public void setdBS_CURR2(int dBS_CURR2) {
        this.dBS_CURR2 = dBS_CURR2;
    }

    public int getdBS_CURR3() {
        return dBS_CURR3;
    }

    public void setdBS_CURR3(int dBS_CURR3) {
        this.dBS_CURR3 = dBS_CURR3;
    }

    public int getdBS_CURR4() {
        return dBS_CURR4;
    }

    public void setdBS_CURR4(int dBS_CURR4) {
        this.dBS_CURR4 = dBS_CURR4;
    }

    public int getdBS_CURR5() {
        return dBS_CURR5;
    }

    public void setdBS_CURR5(int dBS_CURR5) {
        this.dBS_CURR5 = dBS_CURR5;
    }

    public int getdBS_CURR6() {
        return dBS_CURR6;
    }

    public void setdBS_CURR6(int dBS_CURR6) {
        this.dBS_CURR6 = dBS_CURR6;
    }

    public int getdBS_CURR7() {
        return dBS_CURR7;
    }

    public void setdBS_CURR7(int dBS_CURR7) {
        this.dBS_CURR7 = dBS_CURR7;
    }

    public String getbANK_CORRP_ACC1() {
        return bANK_CORRP_ACC1;
    }

    public void setbANK_CORRP_ACC1(String bANK_CORRP_ACC1) {
        this.bANK_CORRP_ACC1 = bANK_CORRP_ACC1;
    }

    public String getbANK_CORRP_ACC2() {
        return bANK_CORRP_ACC2;
    }

    public void setbANK_CORRP_ACC2(String bANK_CORRP_ACC2) {
        this.bANK_CORRP_ACC2 = bANK_CORRP_ACC2;
    }

    public String getbANK_CORRP_ACC3() {
        return bANK_CORRP_ACC3;
    }

    public void setbANK_CORRP_ACC3(String bANK_CORRP_ACC3) {
        this.bANK_CORRP_ACC3 = bANK_CORRP_ACC3;
    }

    public String getbANK_CORRP_ACC4() {
        return bANK_CORRP_ACC4;
    }

    public void setbANK_CORRP_ACC4(String bANK_CORRP_ACC4) {
        this.bANK_CORRP_ACC4 = bANK_CORRP_ACC4;
    }

    public String getbANK_CORRP_ACC5() {
        return bANK_CORRP_ACC5;
    }

    public void setbANK_CORRP_ACC5(String bANK_CORRP_ACC5) {
        this.bANK_CORRP_ACC5 = bANK_CORRP_ACC5;
    }

    public String getbANK_CORRP_ACC6() {
        return bANK_CORRP_ACC6;
    }

    public void setbANK_CORRP_ACC6(String bANK_CORRP_ACC6) {
        this.bANK_CORRP_ACC6 = bANK_CORRP_ACC6;
    }

    public String getbANK_CORRP_ACC7() {
        return bANK_CORRP_ACC7;
    }

    public void setbANK_CORRP_ACC7(String bANK_CORRP_ACC7) {
        this.bANK_CORRP_ACC7 = bANK_CORRP_ACC7;
    }

    public String getbANK_VOEN1() {
        return bANK_VOEN1;
    }

    public void setbANK_VOEN1(String bANK_VOEN1) {
        this.bANK_VOEN1 = bANK_VOEN1;
    }

    public String getbANK_VOEN2() {
        return bANK_VOEN2;
    }

    public void setbANK_VOEN2(String bANK_VOEN2) {
        this.bANK_VOEN2 = bANK_VOEN2;
    }

    public String getbANK_VOEN3() {
        return bANK_VOEN3;
    }

    public void setbANK_VOEN3(String bANK_VOEN3) {
        this.bANK_VOEN3 = bANK_VOEN3;
    }

    public String getbANK_VOEN4() {
        return bANK_VOEN4;
    }

    public void setbANK_VOEN4(String bANK_VOEN4) {
        this.bANK_VOEN4 = bANK_VOEN4;
    }

    public String getbANK_VOEN5() {
        return bANK_VOEN5;
    }

    public void setbANK_VOEN5(String bANK_VOEN5) {
        this.bANK_VOEN5 = bANK_VOEN5;
    }

    public String getbANK_VOEN6() {
        return bANK_VOEN6;
    }

    public void setbANK_VOEN6(String bANK_VOEN6) {
        this.bANK_VOEN6 = bANK_VOEN6;
    }

    public String getbANK_VOEN7() {
        return bANK_VOEN7;
    }

    public void setbANK_VOEN7(String bANK_VOEN7) {
        this.bANK_VOEN7 = bANK_VOEN7;
    }

    public int geteINVOICE_TYPE() {
        return eINVOICE_TYPE;
    }

    public void seteINVOICE_TYPE(int eINVOICE_TYPE) {
        this.eINVOICE_TYPE = eINVOICE_TYPE;
    }

    public int geteARCHIVE_SEND_MODE() {
        return eARCHIVE_SEND_MODE;
    }

    public void seteARCHIVE_SEND_MODE(int eARCHIVE_SEND_MODE) {
        this.eARCHIVE_SEND_MODE = eARCHIVE_SEND_MODE;
    }

    public int geteARCHIVE_IS_RETAIL_AR_AP() {
        return eARCHIVE_IS_RETAIL_AR_AP;
    }

    public void seteARCHIVE_IS_RETAIL_AR_AP(int eARCHIVE_IS_RETAIL_AR_AP) {
        this.eARCHIVE_IS_RETAIL_AR_AP = eARCHIVE_IS_RETAIL_AR_AP;
    }

    public String gettITLE2() {
        return tITLE2;
    }

    public void settITLE2(String tITLE2) {
        this.tITLE2 = tITLE2;
    }

    public String gettELEPHONE_EXTENSION1() {
        return tELEPHONE_EXTENSION1;
    }

    public void settELEPHONE_EXTENSION1(String tELEPHONE_EXTENSION1) {
        this.tELEPHONE_EXTENSION1 = tELEPHONE_EXTENSION1;
    }

    public String gettELEPHONE_EXTENSION2() {
        return tELEPHONE_EXTENSION2;
    }

    public void settELEPHONE_EXTENSION2(String tELEPHONE_EXTENSION2) {
        this.tELEPHONE_EXTENSION2 = tELEPHONE_EXTENSION2;
    }

    public String getfAX_EXTENSION() {
        return fAX_EXTENSION;
    }

    public void setfAX_EXTENSION(String fAX_EXTENSION) {
        this.fAX_EXTENSION = fAX_EXTENSION;
    }

    public String getgLOBAL_ID() {
        return gLOBAL_ID;
    }

    public void setgLOBAL_ID(String gLOBAL_ID) {
        this.gLOBAL_ID = gLOBAL_ID;
    }

    public int getiSFOREIGN() {
        return iSFOREIGN;
    }

    public void setiSFOREIGN(int iSFOREIGN) {
        this.iSFOREIGN = iSFOREIGN;
    }

    public String getpOST_LABEL() {
        return pOST_LABEL;
    }

    public void setpOST_LABEL(String pOST_LABEL) {
        this.pOST_LABEL = pOST_LABEL;
    }

    public String getsENDER_LABEL() {
        return sENDER_LABEL;
    }

    public void setsENDER_LABEL(String sENDER_LABEL) {
        this.sENDER_LABEL = sENDER_LABEL;
    }

    public int getdEG_ACTIVE() {
        return dEG_ACTIVE;
    }

    public void setdEG_ACTIVE(int dEG_ACTIVE) {
        this.dEG_ACTIVE = dEG_ACTIVE;
    }

    public int getdEG_CURR() {
        return dEG_CURR;
    }

    public void setdEG_CURR(int dEG_CURR) {
        this.dEG_CURR = dEG_CURR;
    }

    public String getnAME() {
        return nAME;
    }

    public void setnAME(String nAME) {
        this.nAME = nAME;
    }

    public String getsURNAME() {
        return sURNAME;
    }

    public void setsURNAME(String sURNAME) {
        this.sURNAME = sURNAME;
    }

    public int getlABEL_INFO() {
        return lABEL_INFO;
    }

    public void setlABEL_INFO(int lABEL_INFO) {
        this.lABEL_INFO = lABEL_INFO;
    }

    public int getdUE_DATE_CONTOL1() {
        return dUE_DATE_CONTOL1;
    }

    public void setdUE_DATE_CONTOL1(int dUE_DATE_CONTOL1) {
        this.dUE_DATE_CONTOL1 = dUE_DATE_CONTOL1;
    }

    public int getdUE_DATE_CONTOL2() {
        return dUE_DATE_CONTOL2;
    }

    public void setdUE_DATE_CONTOL2(int dUE_DATE_CONTOL2) {
        this.dUE_DATE_CONTOL2 = dUE_DATE_CONTOL2;
    }

    public int getdUE_DATE_CONTOL3() {
        return dUE_DATE_CONTOL3;
    }

    public void setdUE_DATE_CONTOL3(int dUE_DATE_CONTOL3) {
        this.dUE_DATE_CONTOL3 = dUE_DATE_CONTOL3;
    }

    public int getdUE_DATE_CONTOL4() {
        return dUE_DATE_CONTOL4;
    }

    public void setdUE_DATE_CONTOL4(int dUE_DATE_CONTOL4) {
        this.dUE_DATE_CONTOL4 = dUE_DATE_CONTOL4;
    }

    public int getdUE_DATE_CONTOL5() {
        return dUE_DATE_CONTOL5;
    }

    public void setdUE_DATE_CONTOL5(int dUE_DATE_CONTOL5) {
        this.dUE_DATE_CONTOL5 = dUE_DATE_CONTOL5;
    }

    public int getdUE_DATE_CONTOL6() {
        return dUE_DATE_CONTOL6;
    }

    public void setdUE_DATE_CONTOL6(int dUE_DATE_CONTOL6) {
        this.dUE_DATE_CONTOL6 = dUE_DATE_CONTOL6;
    }

    public int getdUE_DATE_CONTOL7() {
        return dUE_DATE_CONTOL7;
    }

    public void setdUE_DATE_CONTOL7(int dUE_DATE_CONTOL7) {
        this.dUE_DATE_CONTOL7 = dUE_DATE_CONTOL7;
    }

    public int getdUE_DATE_CONTOL8() {
        return dUE_DATE_CONTOL8;
    }

    public void setdUE_DATE_CONTOL8(int dUE_DATE_CONTOL8) {
        this.dUE_DATE_CONTOL8 = dUE_DATE_CONTOL8;
    }

    public int getdUE_DATE_CONTOL9() {
        return dUE_DATE_CONTOL9;
    }

    public void setdUE_DATE_CONTOL9(int dUE_DATE_CONTOL9) {
        this.dUE_DATE_CONTOL9 = dUE_DATE_CONTOL9;
    }

    public int getdUE_DATE_CONTOL10() {
        return dUE_DATE_CONTOL10;
    }

    public void setdUE_DATE_CONTOL10(int dUE_DATE_CONTOL10) {
        this.dUE_DATE_CONTOL10 = dUE_DATE_CONTOL10;
    }

    public int getdUE_DATE_CONTOL11() {
        return dUE_DATE_CONTOL11;
    }

    public void setdUE_DATE_CONTOL11(int dUE_DATE_CONTOL11) {
        this.dUE_DATE_CONTOL11 = dUE_DATE_CONTOL11;
    }

    public int getdUE_DATE_CONTOL12() {
        return dUE_DATE_CONTOL12;
    }

    public void setdUE_DATE_CONTOL12(int dUE_DATE_CONTOL12) {
        this.dUE_DATE_CONTOL12 = dUE_DATE_CONTOL12;
    }

    public int getdUE_DATE_CONTOL13() {
        return dUE_DATE_CONTOL13;
    }

    public void setdUE_DATE_CONTOL13(int dUE_DATE_CONTOL13) {
        this.dUE_DATE_CONTOL13 = dUE_DATE_CONTOL13;
    }

    public int getdUE_DATE_CONTOL14() {
        return dUE_DATE_CONTOL14;
    }

    public void setdUE_DATE_CONTOL14(int dUE_DATE_CONTOL14) {
        this.dUE_DATE_CONTOL14 = dUE_DATE_CONTOL14;
    }

    public int getdUE_DATE_CONTOL15() {
        return dUE_DATE_CONTOL15;
    }

    public void setdUE_DATE_CONTOL15(int dUE_DATE_CONTOL15) {
        this.dUE_DATE_CONTOL15 = dUE_DATE_CONTOL15;
    }

    public int getdUE_DATE_COUNT() {
        return dUE_DATE_COUNT;
    }

    public void setdUE_DATE_COUNT(int dUE_DATE_COUNT) {
        this.dUE_DATE_COUNT = dUE_DATE_COUNT;
    }

    public double getdUE_DATE_LIMIT() {
        return dUE_DATE_LIMIT;
    }

    public void setdUE_DATE_LIMIT(double dUE_DATE_LIMIT) {
        this.dUE_DATE_LIMIT = dUE_DATE_LIMIT;
    }

    public int getdUE_DATE_TRACK() {
        return dUE_DATE_TRACK;
    }

    public void setdUE_DATE_TRACK(int dUE_DATE_TRACK) {
        this.dUE_DATE_TRACK = dUE_DATE_TRACK;
    }

    public int getcLOSE_DATE_COUNT() {
        return cLOSE_DATE_COUNT;
    }

    public void setcLOSE_DATE_COUNT(int cLOSE_DATE_COUNT) {
        this.cLOSE_DATE_COUNT = cLOSE_DATE_COUNT;
    }

    public int getcLOSE_DATE_TRACK() {
        return cLOSE_DATE_TRACK;
    }

    public void setcLOSE_DATE_TRACK(int cLOSE_DATE_TRACK) {
        this.cLOSE_DATE_TRACK = cLOSE_DATE_TRACK;
    }

    public int getdEFBNACCREF() {
        return dEFBNACCREF;
    }

    public void setdEFBNACCREF(int dEFBNACCREF) {
        this.dEFBNACCREF = dEFBNACCREF;
    }

    public String getdEFAULT_BANKACC_CODE() {
        return dEFAULT_BANKACC_CODE;
    }

    public void setdEFAULT_BANKACC_CODE(String dEFAULT_BANKACC_CODE) {
        this.dEFAULT_BANKACC_CODE = dEFAULT_BANKACC_CODE;
    }

    public int getcURR_RATE_TYPE() {
        return cURR_RATE_TYPE;
    }

    public void setcURR_RATE_TYPE(int cURR_RATE_TYPE) {
        this.cURR_RATE_TYPE = cURR_RATE_TYPE;
    }

    public int getiNSTEAD_OF_DISPATCH() {
        return iNSTEAD_OF_DISPATCH;
    }

    public void setiNSTEAD_OF_DISPATCH(int iNSTEAD_OF_DISPATCH) {
        this.iNSTEAD_OF_DISPATCH = iNSTEAD_OF_DISPATCH;
    }

    public int geteINV_EARC_TYPE() {
        return eINV_EARC_TYPE;
    }

    public void seteINV_EARC_TYPE(int eINV_EARC_TYPE) {
        this.eINV_EARC_TYPE = eINV_EARC_TYPE;
    }

    public String getaDDRESS_NO() {
        return aDDRESS_NO;
    }

    public void setaDDRESS_NO(String aDDRESS_NO) {
        this.aDDRESS_NO = aDDRESS_NO;
    }

    public int getfBS_SEND_METHOD() {
        return fBS_SEND_METHOD;
    }

    public void setfBS_SEND_METHOD(int fBS_SEND_METHOD) {
        this.fBS_SEND_METHOD = fBS_SEND_METHOD;
    }

    public String getfBS_SEND_EMAILADDR() {
        return fBS_SEND_EMAILADDR;
    }

    public void setfBS_SEND_EMAILADDR(String fBS_SEND_EMAILADDR) {
        this.fBS_SEND_EMAILADDR = fBS_SEND_EMAILADDR;
    }

    public int getfBS_SEND_FORMAT() {
        return fBS_SEND_FORMAT;
    }

    public void setfBS_SEND_FORMAT(int fBS_SEND_FORMAT) {
        this.fBS_SEND_FORMAT = fBS_SEND_FORMAT;
    }

    public String getfBS_SEND_FAXNR() {
        return fBS_SEND_FAXNR;
    }

    public void setfBS_SEND_FAXNR(String fBS_SEND_FAXNR) {
        this.fBS_SEND_FAXNR = fBS_SEND_FAXNR;
    }

    public int getfBA_SEND_METHOD() {
        return fBA_SEND_METHOD;
    }

    public void setfBA_SEND_METHOD(int fBA_SEND_METHOD) {
        this.fBA_SEND_METHOD = fBA_SEND_METHOD;
    }

    public String getfBA_SEND_EMAILADDR() {
        return fBA_SEND_EMAILADDR;
    }

    public void setfBA_SEND_EMAILADDR(String fBA_SEND_EMAILADDR) {
        this.fBA_SEND_EMAILADDR = fBA_SEND_EMAILADDR;
    }

    public int getfBA_SEND_FORMAT() {
        return fBA_SEND_FORMAT;
    }

    public void setfBA_SEND_FORMAT(int fBA_SEND_FORMAT) {
        this.fBA_SEND_FORMAT = fBA_SEND_FORMAT;
    }

    public String getfBA_SEND_FAXNR() {
        return fBA_SEND_FAXNR;
    }

    public void setfBA_SEND_FAXNR(String fBA_SEND_FAXNR) {
        this.fBA_SEND_FAXNR = fBA_SEND_FAXNR;
    }

    public int getsECTOR_MAIN_REF() {
        return sECTOR_MAIN_REF;
    }

    public void setsECTOR_MAIN_REF(int sECTOR_MAIN_REF) {
        this.sECTOR_MAIN_REF = sECTOR_MAIN_REF;
    }

    public String getsECTOR_MAIN_CODE() {
        return sECTOR_MAIN_CODE;
    }

    public void setsECTOR_MAIN_CODE(String sECTOR_MAIN_CODE) {
        this.sECTOR_MAIN_CODE = sECTOR_MAIN_CODE;
    }

    public int getsECTOR_SUB_REF() {
        return sECTOR_SUB_REF;
    }

    public void setsECTOR_SUB_REF(int sECTOR_SUB_REF) {
        this.sECTOR_SUB_REF = sECTOR_SUB_REF;
    }

    public String getsECTOR_SUB_CODE() {
        return sECTOR_SUB_CODE;
    }

    public void setsECTOR_SUB_CODE(String sECTOR_SUB_CODE) {
        this.sECTOR_SUB_CODE = sECTOR_SUB_CODE;
    }

    public int getpERSONEL_COSTS() {
        return pERSONEL_COSTS;
    }

    public void setpERSONEL_COSTS(int pERSONEL_COSTS) {
        this.pERSONEL_COSTS = pERSONEL_COSTS;
    }

    public String geteARC_EMAIL_ADDRESS1() {
        return eARC_EMAIL_ADDRESS1;
    }

    public void seteARC_EMAIL_ADDRESS1(String eARC_EMAIL_ADDRESS1) {
        this.eARC_EMAIL_ADDRESS1 = eARC_EMAIL_ADDRESS1;
    }

    public String geteARC_EMAIL_ADDRESS2() {
        return eARC_EMAIL_ADDRESS2;
    }

    public void seteARC_EMAIL_ADDRESS2(String eARC_EMAIL_ADDRESS2) {
        this.eARC_EMAIL_ADDRESS2 = eARC_EMAIL_ADDRESS2;
    }

    public String geteARC_EMAIL_ADDRESS3() {
        return eARC_EMAIL_ADDRESS3;
    }

    public void seteARC_EMAIL_ADDRESS3(String eARC_EMAIL_ADDRESS3) {
        this.eARC_EMAIL_ADDRESS3 = eARC_EMAIL_ADDRESS3;
    }

    public int getfACTORY_DIV_NR() {
        return fACTORY_DIV_NR;
    }

    public void setfACTORY_DIV_NR(int fACTORY_DIV_NR) {
        this.fACTORY_DIV_NR = fACTORY_DIV_NR;
    }

    public int getfACTORY_NR() {
        return fACTORY_NR;
    }

    public void setfACTORY_NR(int fACTORY_NR) {
        this.fACTORY_NR = fACTORY_NR;
    }

    public int getiN_INVEN_NR() {
        return iN_INVEN_NR;
    }

    public void setiN_INVEN_NR(int iN_INVEN_NR) {
        this.iN_INVEN_NR = iN_INVEN_NR;
    }

    public int getoUT_INVEN_NR() {
        return oUT_INVEN_NR;
    }

    public void setoUT_INVEN_NR(int oUT_INVEN_NR) {
        this.oUT_INVEN_NR = oUT_INVEN_NR;
    }

    public double getqTY_DEP_DURATION() {
        return qTY_DEP_DURATION;
    }

    public void setqTY_DEP_DURATION(double qTY_DEP_DURATION) {
        this.qTY_DEP_DURATION = qTY_DEP_DURATION;
    }

    public double getqTY_IN_DEP_DURATION() {
        return qTY_IN_DEP_DURATION;
    }

    public void setqTY_IN_DEP_DURATION(double qTY_IN_DEP_DURATION) {
        this.qTY_IN_DEP_DURATION = qTY_IN_DEP_DURATION;
    }

    public int getoVER_LAP_TYPE() {
        return oVER_LAP_TYPE;
    }

    public void setoVER_LAP_TYPE(int oVER_LAP_TYPE) {
        this.oVER_LAP_TYPE = oVER_LAP_TYPE;
    }

    public double getoVER_LAP_AMOUNT() {
        return oVER_LAP_AMOUNT;
    }

    public void setoVER_LAP_AMOUNT(double oVER_LAP_AMOUNT) {
        this.oVER_LAP_AMOUNT = oVER_LAP_AMOUNT;
    }

    public double getoVER_LAP_PERC() {
        return oVER_LAP_PERC;
    }

    public void setoVER_LAP_PERC(double oVER_LAP_PERC) {
        this.oVER_LAP_PERC = oVER_LAP_PERC;
    }

    public int getbROKER_COMP() {
        return bROKER_COMP;
    }

    public void setbROKER_COMP(int bROKER_COMP) {
        this.bROKER_COMP = bROKER_COMP;
    }

    public int getcREATE_WH_FICHE() {
        return cREATE_WH_FICHE;
    }

    public void setcREATE_WH_FICHE(int cREATE_WH_FICHE) {
        this.cREATE_WH_FICHE = cREATE_WH_FICHE;
    }

    public int geteINV_CUSTOMS() {
        return eINV_CUSTOMS;
    }

    public void seteINV_CUSTOMS(int eINV_CUSTOMS) {
        this.eINV_CUSTOMS = eINV_CUSTOMS;
    }

    public int getsUB_CONT() {
        return sUB_CONT;
    }

    public void setsUB_CONT(int sUB_CONT) {
        this.sUB_CONT = sUB_CONT;
    }

    public int getaCCEPT_DESP() {
        return aCCEPT_DESP;
    }

    public void setaCCEPT_DESP(int aCCEPT_DESP) {
        this.aCCEPT_DESP = aCCEPT_DESP;
    }

    public int getpROFILEID_DESP() {
        return pROFILEID_DESP;
    }

    public void setpROFILEID_DESP(int pROFILEID_DESP) {
        this.pROFILEID_DESP = pROFILEID_DESP;
    }

    public int getlABEL_INFO_DESP() {
        return lABEL_INFO_DESP;
    }

    public void setlABEL_INFO_DESP(int lABEL_INFO_DESP) {
        this.lABEL_INFO_DESP = lABEL_INFO_DESP;
    }

    public String getpOST_LABEL_CODE_DESP() {
        return pOST_LABEL_CODE_DESP;
    }

    public void setpOST_LABEL_CODE_DESP(String pOST_LABEL_CODE_DESP) {
        this.pOST_LABEL_CODE_DESP = pOST_LABEL_CODE_DESP;
    }

    public String getsENDER_LABEL_CODE_DESP() {
        return sENDER_LABEL_CODE_DESP;
    }

    public void setsENDER_LABEL_CODE_DESP(String sENDER_LABEL_CODE_DESP) {
        this.sENDER_LABEL_CODE_DESP = sENDER_LABEL_CODE_DESP;
    }

    public int getaCCEPT_EINV_PUBLIC() {
        return aCCEPT_EINV_PUBLIC;
    }

    public void setaCCEPT_EINV_PUBLIC(int aCCEPT_EINV_PUBLIC) {
        this.aCCEPT_EINV_PUBLIC = aCCEPT_EINV_PUBLIC;
    }

    public int getpUBLICBNACCREF() {
        return pUBLICBNACCREF;
    }

    public void setpUBLICBNACCREF(int pUBLICBNACCREF) {
        this.pUBLICBNACCREF = pUBLICBNACCREF;
    }

    public String getpUBLIC_BNACC_CODE() {
        return pUBLIC_BNACC_CODE;
    }

    public void setpUBLIC_BNACC_CODE(String pUBLIC_BNACC_CODE) {
        this.pUBLIC_BNACC_CODE = pUBLIC_BNACC_CODE;
    }

    public String getpUBLIC_BNACC_IBAN() {
        return pUBLIC_BNACC_IBAN;
    }

    public void setpUBLIC_BNACC_IBAN(String pUBLIC_BNACC_IBAN) {
        this.pUBLIC_BNACC_IBAN = pUBLIC_BNACC_IBAN;
    }

    public int getpUBLIC_BNACC_CURRENCY() {
        return pUBLIC_BNACC_CURRENCY;
    }

    public void setpUBLIC_BNACC_CURRENCY(int pUBLIC_BNACC_CURRENCY) {
        this.pUBLIC_BNACC_CURRENCY = pUBLIC_BNACC_CURRENCY;
    }

    public int getkVKK_PERM_STATUS() {
        return kVKK_PERM_STATUS;
    }

    public void setkVKK_PERM_STATUS(int kVKK_PERM_STATUS) {
        this.kVKK_PERM_STATUS = kVKK_PERM_STATUS;
    }

    public Date getkVKK_BEGIN_DATE() {
        return kVKK_BEGIN_DATE;
    }

    public void setkVKK_BEGIN_DATE(Date kVKK_BEGIN_DATE) {
        this.kVKK_BEGIN_DATE = kVKK_BEGIN_DATE;
    }

    public Date getkVKK_END_DATE() {
        return kVKK_END_DATE;
    }

    public void setkVKK_END_DATE(Date kVKK_END_DATE) {
        this.kVKK_END_DATE = kVKK_END_DATE;
    }

    public Date getkVKK_CANCEL_DATE() {
        return kVKK_CANCEL_DATE;
    }

    public void setkVKK_CANCEL_DATE(Date kVKK_CANCEL_DATE) {
        this.kVKK_CANCEL_DATE = kVKK_CANCEL_DATE;
    }

    public int getkVKK_ANONYMIZE_STATUS() {
        return kVKK_ANONYMIZE_STATUS;
    }

    public void setkVKK_ANONYMIZE_STATUS(int kVKK_ANONYMIZE_STATUS) {
        this.kVKK_ANONYMIZE_STATUS = kVKK_ANONYMIZE_STATUS;
    }

    public Date getkVKK_ANONYMIZE_DATE() {
        return kVKK_ANONYMIZE_DATE;
    }

    public void setkVKK_ANONYMIZE_DATE(Date kVKK_ANONYMIZE_DATE) {
        this.kVKK_ANONYMIZE_DATE = kVKK_ANONYMIZE_DATE;
    }

    public int geteXIM_SEND_METHOD() {
        return eXIM_SEND_METHOD;
    }

    public void seteXIM_SEND_METHOD(int eXIM_SEND_METHOD) {
        this.eXIM_SEND_METHOD = eXIM_SEND_METHOD;
    }

    public String geteXIM_SEND_EMAILADR() {
        return eXIM_SEND_EMAILADR;
    }

    public void seteXIM_SEND_EMAILADR(String eXIM_SEND_EMAILADR) {
        this.eXIM_SEND_EMAILADR = eXIM_SEND_EMAILADR;
    }

    public int geteXIM_SEND_FORMAT() {
        return eXIM_SEND_FORMAT;
    }

    public void seteXIM_SEND_FORMAT(int eXIM_SEND_FORMAT) {
        this.eXIM_SEND_FORMAT = eXIM_SEND_FORMAT;
    }

    public String geteXIM_SEND_FAXNR() {
        return eXIM_SEND_FAXNR;
    }

    public void seteXIM_SEND_FAXNR(String eXIM_SEND_FAXNR) {
        this.eXIM_SEND_FAXNR = eXIM_SEND_FAXNR;
    }

    public int getcAN_DEDUCT() {
        return cAN_DEDUCT;
    }

    public void setcAN_DEDUCT(int cAN_DEDUCT) {
        this.cAN_DEDUCT = cAN_DEDUCT;
    }

    public int getdRIVERREF() {
        return dRIVERREF;
    }

    public void setdRIVERREF(int dRIVERREF) {
        this.dRIVERREF = dRIVERREF;
    }

    public int geteX_COUNTRY_TYPE() {
        return eX_COUNTRY_TYPE;
    }

    public void seteX_COUNTRY_TYPE(int eX_COUNTRY_TYPE) {
        this.eX_COUNTRY_TYPE = eX_COUNTRY_TYPE;
    }

    public int geteX_COUNTRYREF() {
        return eX_COUNTRYREF;
    }

    public void seteX_COUNTRYREF(int eX_COUNTRYREF) {
        this.eX_COUNTRYREF = eX_COUNTRYREF;
    }

    public String geteX_COUNTRY_CODE() {
        return eX_COUNTRY_CODE;
    }

    public void seteX_COUNTRY_CODE(String eX_COUNTRY_CODE) {
        this.eX_COUNTRY_CODE = eX_COUNTRY_CODE;
    }

    public String geteX_COUNTRY_NAME() {
        return eX_COUNTRY_NAME;
    }

    public void seteX_COUNTRY_NAME(String eX_COUNTRY_NAME) {
        this.eX_COUNTRY_NAME = eX_COUNTRY_NAME;
    }

    public int getiM_COUNTRY_TYPE() {
        return iM_COUNTRY_TYPE;
    }

    public void setiM_COUNTRY_TYPE(int iM_COUNTRY_TYPE) {
        this.iM_COUNTRY_TYPE = iM_COUNTRY_TYPE;
    }

    public int getiM_COUNTRYREF() {
        return iM_COUNTRYREF;
    }

    public void setiM_COUNTRYREF(int iM_COUNTRYREF) {
        this.iM_COUNTRYREF = iM_COUNTRYREF;
    }

    public String getiM_COUNTRY_CODE() {
        return iM_COUNTRY_CODE;
    }

    public void setiM_COUNTRY_CODE(String iM_COUNTRY_CODE) {
        this.iM_COUNTRY_CODE = iM_COUNTRY_CODE;
    }

    public String getiM_COUNTRY_NAME() {
        return iM_COUNTRY_NAME;
    }

    public void setiM_COUNTRY_NAME(String iM_COUNTRY_NAME) {
        this.iM_COUNTRY_NAME = iM_COUNTRY_NAME;
    }

    public int geteXIM_PAYTYPEREF() {
        return eXIM_PAYTYPEREF;
    }

    public void seteXIM_PAYTYPEREF(int eXIM_PAYTYPEREF) {
        this.eXIM_PAYTYPEREF = eXIM_PAYTYPEREF;
    }

    public String geteXIM_PAYTYPE_CODE() {
        return eXIM_PAYTYPE_CODE;
    }

    public void seteXIM_PAYTYPE_CODE(String eXIM_PAYTYPE_CODE) {
        this.eXIM_PAYTYPE_CODE = eXIM_PAYTYPE_CODE;
    }

    public int geteXIM_BRBANKREF() {
        return eXIM_BRBANKREF;
    }

    public void seteXIM_BRBANKREF(int eXIM_BRBANKREF) {
        this.eXIM_BRBANKREF = eXIM_BRBANKREF;
    }

    public String geteXIM_BRBANK_CODE() {
        return eXIM_BRBANK_CODE;
    }

    public void seteXIM_BRBANK_CODE(String eXIM_BRBANK_CODE) {
        this.eXIM_BRBANK_CODE = eXIM_BRBANK_CODE;
    }

    public int geteXIM_CUSTOMREF() {
        return eXIM_CUSTOMREF;
    }

    public void seteXIM_CUSTOMREF(int eXIM_CUSTOMREF) {
        this.eXIM_CUSTOMREF = eXIM_CUSTOMREF;
    }

    public String geteXIM_CUSTOM_CODE() {
        return eXIM_CUSTOM_CODE;
    }

    public void seteXIM_CUSTOM_CODE(String eXIM_CUSTOM_CODE) {
        this.eXIM_CUSTOM_CODE = eXIM_CUSTOM_CODE;
    }

    public int geteXIM_REGTYPEREF() {
        return eXIM_REGTYPEREF;
    }

    public void seteXIM_REGTYPEREF(int eXIM_REGTYPEREF) {
        this.eXIM_REGTYPEREF = eXIM_REGTYPEREF;
    }

    public String geteXIM_REGTYPE_CODE() {
        return eXIM_REGTYPE_CODE;
    }

    public void seteXIM_REGTYPE_CODE(String eXIM_REGTYPE_CODE) {
        this.eXIM_REGTYPE_CODE = eXIM_REGTYPE_CODE;
    }

    public int geteXIM_NOTIFYCLREF() {
        return eXIM_NOTIFYCLREF;
    }

    public void seteXIM_NOTIFYCLREF(int eXIM_NOTIFYCLREF) {
        this.eXIM_NOTIFYCLREF = eXIM_NOTIFYCLREF;
    }

    public String geteXIM_NOTIFY_ARPCODE() {
        return eXIM_NOTIFY_ARPCODE;
    }

    public void seteXIM_NOTIFY_ARPCODE(String eXIM_NOTIFY_ARPCODE) {
        this.eXIM_NOTIFY_ARPCODE = eXIM_NOTIFY_ARPCODE;
    }

    public int geteXIM_CONSULTCLREF() {
        return eXIM_CONSULTCLREF;
    }

    public void seteXIM_CONSULTCLREF(int eXIM_CONSULTCLREF) {
        this.eXIM_CONSULTCLREF = eXIM_CONSULTCLREF;
    }

    public String geteXIM_CONSULT_ARPCODE() {
        return eXIM_CONSULT_ARPCODE;
    }

    public void seteXIM_CONSULT_ARPCODE(String eXIM_CONSULT_ARPCODE) {
        this.eXIM_CONSULT_ARPCODE = eXIM_CONSULT_ARPCODE;
    }

    public int geteXIM_FREIGHTCLREF() {
        return eXIM_FREIGHTCLREF;
    }

    public void seteXIM_FREIGHTCLREF(int eXIM_FREIGHTCLREF) {
        this.eXIM_FREIGHTCLREF = eXIM_FREIGHTCLREF;
    }

    public String geteXIM_FREIGHT_ARPCODE() {
        return eXIM_FREIGHT_ARPCODE;
    }

    public void seteXIM_FREIGHT_ARPCODE(String eXIM_FREIGHT_ARPCODE) {
        this.eXIM_FREIGHT_ARPCODE = eXIM_FREIGHT_ARPCODE;
    }

    public int getdISP_PRINT_CNT() {
        return dISP_PRINT_CNT;
    }

    public void setdISP_PRINT_CNT(int dISP_PRINT_CNT) {
        this.dISP_PRINT_CNT = dISP_PRINT_CNT;
    }

    public int getoRD_PRINT_CNT() {
        return oRD_PRINT_CNT;
    }

    public void setoRD_PRINT_CNT(int oRD_PRINT_CNT) {
        this.oRD_PRINT_CNT = oRD_PRINT_CNT;
    }

    public String getgUID() {
        return gUID;
    }

    public void setgUID(String gUID) {
        this.gUID = gUID;
    }

    public int getcLPTYPEFORPPAYDT() {
        return cLPTYPEFORPPAYDT;
    }

    public void setcLPTYPEFORPPAYDT(int cLPTYPEFORPPAYDT) {
        this.cLPTYPEFORPPAYDT = cLPTYPEFORPPAYDT;
    }

    public int getcLSTYPEFORPPAYDT() {
        return cLSTYPEFORPPAYDT;
    }

    public void setcLSTYPEFORPPAYDT(int cLSTYPEFORPPAYDT) {
        this.cLSTYPEFORPPAYDT = cLSTYPEFORPPAYDT;
    }

    public String getmERSIS_NO() {
        return mERSIS_NO;
    }

    public void setmERSIS_NO(String mERSIS_NO) {
        this.mERSIS_NO = mERSIS_NO;
    }

    public String getcOMM_RECORD_NO() {
        return cOMM_RECORD_NO;
    }

    public void setcOMM_RECORD_NO(String cOMM_RECORD_NO) {
        this.cOMM_RECORD_NO = cOMM_RECORD_NO;
    }

    public int getcLIENTREF() {
        return cLIENTREF;
    }

    public void setcLIENTREF(int cLIENTREF) {
        this.cLIENTREF = cLIENTREF;
    }

    public int getlINENUM() {
        return lINENUM;
    }

    public void setlINENUM(int lINENUM) {
        this.lINENUM = lINENUM;
    }

    public String getlINE() {
        return lINE;
    }

    public void setlINE(String lINE) {
        this.lINE = lINE;
    }

    @JsonProperty("TITLE")
    public String tITLE;
    @JsonProperty("AUXIL_CODE")
    public String aUXIL_CODE;
    @JsonProperty("AUTH_CODE")
    public String aUTH_CODE;
    @JsonProperty("ADDRESS1")
    public String aDDRESS1;
    @JsonProperty("ADDRESS2")
    public String aDDRESS2;
    @JsonProperty("DISTRICT_CODE")
    public String dISTRICT_CODE;
    @JsonProperty("DISTRICT")
    public String dISTRICT;
    @JsonProperty("TOWN_CODE")
    public String tOWN_CODE;
    @JsonProperty("TOWN")
    public String tOWN;
    @JsonProperty("CITY_CODE")
    public String cITY_CODE;
    @JsonProperty("CITY")
    public String cITY;
    @JsonProperty("COUNTRY_CODE")
    public String cOUNTRY_CODE;
    @JsonProperty("COUNTRY")
    public String cOUNTRY;
    @JsonProperty("POSTAL_CODE")
    public String pOSTAL_CODE;
    @JsonProperty("TELEPHONE1")
    public String tELEPHONE1;
    @JsonProperty("TELEPHONE1_CODE")
    public String tELEPHONE1_CODE;
    @JsonProperty("TELEPHONE2")
    public String tELEPHONE2;
    @JsonProperty("TELEPHONE2_CODE")
    public String tELEPHONE2_CODE;
    @JsonProperty("FAX")
    public String fAX;
    @JsonProperty("FAX_CODE")
    public String fAX_CODE;
    @JsonProperty("TAX_ID")
    public String tAX_ID;
    @JsonProperty("TAX_OFFICE")
    public String tAX_OFFICE;
    @JsonProperty("TAX_OFFICE_CODE")
    public String tAX_OFFICE_CODE;
    @JsonProperty("CONTACT")
    public String cONTACT;
    @JsonProperty("DISCOUNT_RATE")
    public double dISCOUNT_RATE;
    @JsonProperty("EXTENREF")
    public int eXTENREF;
    @JsonProperty("PAYMENT_CODE")
    public String pAYMENT_CODE;
    @JsonProperty("PAYMENTREF")
    public int pAYMENTREF;
    @JsonProperty("E_MAIL")
    public String e_MAIL;
    @JsonProperty("WEB_URL")
    public String wEB_URL;
    @JsonProperty("FACEBOOK_URL")
    public String fACEBOOK_URL;
    @JsonProperty("TWITTER_URL")
    public String tWITTER_URL;
    @JsonProperty("APPLE_ID")
    public String aPPLE_ID;
    @JsonProperty("SKYPE_ID")
    public String sKYPE_ID;
    @JsonProperty("REMINDER_TYPE")
    public int rEMINDER_TYPE;
    @JsonProperty("REMINDER_EMAIL")
    public String rEMINDER_EMAIL;
    @JsonProperty("REMINDER_FAX")
    public String rEMINDER_FAX;
    @JsonProperty("CORRESP_LANG")
    public int cORRESP_LANG;
    @JsonProperty("VAT_ID")
    public String vAT_ID;
    @JsonProperty("BLOCKED")
    public int bLOCKED;
    @JsonProperty("BANK_ID1")
    public String bANK_ID1;
    @JsonProperty("BANK_ID2")
    public String bANK_ID2;
    @JsonProperty("BANK_ID3")
    public String bANK_ID3;
    @JsonProperty("BANK_ID4")
    public String bANK_ID4;
    @JsonProperty("BANK_ID5")
    public String bANK_ID5;
    @JsonProperty("BANK_ID6")
    public String bANK_ID6;
    @JsonProperty("BANK_ID7")
    public String bANK_ID7;
    @JsonProperty("BANK_NAME1")
    public String bANK_NAME1;
    @JsonProperty("BANK_NAME2")
    public String bANK_NAME2;
    @JsonProperty("BANK_NAME3")
    public String bANK_NAME3;
    @JsonProperty("BANK_NAME4")
    public String bANK_NAME4;
    @JsonProperty("BANK_NAME5")
    public String bANK_NAME5;
    @JsonProperty("BANK_NAME6")
    public String bANK_NAME6;
    @JsonProperty("BANK_NAME7")
    public String bANK_NAME7;
    @JsonProperty("BANK_ACCOUNT1")
    public String bANK_ACCOUNT1;
    @JsonProperty("BANK_ACCOUNT2")
    public String bANK_ACCOUNT2;
    @JsonProperty("BANK_ACCOUNT3")
    public String bANK_ACCOUNT3;
    @JsonProperty("BANK_ACCOUNT4")
    public String bANK_ACCOUNT4;
    @JsonProperty("BANK_ACCOUNT5")
    public String bANK_ACCOUNT5;
    @JsonProperty("BANK_ACCOUNT6")
    public String bANK_ACCOUNT6;
    @JsonProperty("BANK_ACCOUNT7")
    public String bANK_ACCOUNT7;
    @JsonProperty("DELIVERY_METHOD")
    public String dELIVERY_METHOD;
    @JsonProperty("SHIPMENT_AGENT")
    public String sHIPMENT_AGENT;
    @JsonProperty("CURRENCY")
    public int cURRENCY;
    @JsonProperty("TEXTINC")
    public int tEXTINC;
    @JsonProperty("DATA_SITEID")
    public int dATA_SITEID;
    @JsonProperty("DATA_REFERENCE")
    public int dATA_REFERENCE;
    @JsonProperty("E_COMM_ID")
    public String e_COMM_ID;
    @JsonProperty("TRADING_GRP")
    public String tRADING_GRP;
    @JsonProperty("CREATED_BY")
    public int cREATED_BY;
    @JsonProperty("DATE_CREATED")
    public Date dATE_CREATED;
    @JsonProperty("HOUR_CREATED")
    public int hOUR_CREATED;
    @JsonProperty("MIN_CREATED")
    public int mIN_CREATED;
    @JsonProperty("SEC_CREATED")
    public int sEC_CREATED;
    @JsonProperty("MODIFIED_BY")
    public int mODIFIED_BY;
    @JsonProperty("DATE_MODIFIED")
    public Date dATE_MODIFIED;
    @JsonProperty("HOUR_MODIFIED")
    public int hOUR_MODIFIED;
    @JsonProperty("MIN_MODIFIED")
    public int mIN_MODIFIED;
    @JsonProperty("SEC_MODIFIED")
    public int sEC_MODIFIED;
    @JsonProperty("DEBT_TRCK_TYPE")
    public int dEBT_TRCK_TYPE;
    @JsonProperty("XRTDIF_TYPE")
    public int xRTDIF_TYPE;
    @JsonProperty("NOTES")
    public NOTES nOTES;
    @JsonProperty("CREDIT_TYPE")
    public int cREDIT_TYPE;
    @JsonProperty("CREDIT_LIMIT")
    public double cREDIT_LIMIT;
    @JsonProperty("CREDIT_BALANCED")
    public double cREDIT_BALANCED;
    @JsonProperty("RISKFACT_CHQ")
    public double rISKFACT_CHQ;
    @JsonProperty("RISKFACT_PROMNT")
    public double rISKFACT_PROMNT;
    @JsonProperty("ACTION_CREDHOLD")
    public int aCTION_CREDHOLD;
    @JsonProperty("GL_CODE")
    public String gL_CODE;
    @JsonProperty("ACCOUNTREF")
    public int aCCOUNTREF;
    @JsonProperty("OHP_CODE")
    public String oHP_CODE;
    @JsonProperty("CENTERREF")
    public int cENTERREF;
    @JsonProperty("PROJECT_CODE")
    public String pROJECT_CODE;
    @JsonProperty("PROJECTREF")
    public int pROJECTREF;
    @JsonProperty("PP_GROUP_CODE")
    public String pP_GROUP_CODE;
    @JsonProperty("XML_ATTRIBUTE")
    public int xML_ATTRIBUTE;
    @JsonProperty("USE_REP_RISK")
    public int uSE_REP_RISK;
    @JsonProperty("RISK_LIMIT")
    public double rISK_LIMIT;
    @JsonProperty("RISK_BALANCED")
    public double rISK_BALANCED;
    @JsonProperty("ORD_SEND_METHOD")
    public int oRD_SEND_METHOD;
    @JsonProperty("ORD_SEND_EMAIL")
    public String oRD_SEND_EMAIL;
    @JsonProperty("ORD_SEND_FAX")
    public String oRD_SEND_FAX;
    @JsonProperty("DSP_SEND_METHOD")
    public int dSP_SEND_METHOD;
    @JsonProperty("DSP_SEND_EMAIL")
    public String dSP_SEND_EMAIL;
    @JsonProperty("DSP_SEND_FAX")
    public String dSP_SEND_FAX;
    @JsonProperty("INV_SEND_METHOD")
    public int iNV_SEND_METHOD;
    @JsonProperty("INV_SEND_EMAIL")
    public String iNV_SEND_EMAIL;
    @JsonProperty("INV_SEND_FAX")
    public String iNV_SEND_FAX;
    @JsonProperty("SUBSCRIBER_STATUS")
    public int sUBSCRIBER_STATUS;
    @JsonProperty("SUBSCRIBER_EXT")
    public String sUBSCRIBER_EXT;
    @JsonProperty("AUTO_PAID_BANK")
    public String aUTO_PAID_BANK;
    @JsonProperty("PAYMENT_TYPE")
    public int pAYMENT_TYPE;
    @JsonProperty("LAST_SEND_REM_LEV")
    public int lAST_SEND_REM_LEV;
    @JsonProperty("EXT_ACC_FLAGS")
    public int eXT_ACC_FLAGS;
    @JsonProperty("ORD_SEND_FORMAT")
    public int oRD_SEND_FORMAT;
    @JsonProperty("DSP_SEND_FORMAT")
    public int dSP_SEND_FORMAT;
    @JsonProperty("INV_SEND_FORMAT")
    public int iNV_SEND_FORMAT;
    @JsonProperty("REM_SEND_FORMAT")
    public int rEM_SEND_FORMAT;
    @JsonProperty("STORE_CREDIT_CARD_NO")
    public String sTORE_CREDIT_CARD_NO;
    @JsonProperty("CL_ORD_FREQ")
    public int cL_ORD_FREQ;
    @JsonProperty("ORD_DAY")
    public int oRD_DAY;
    @JsonProperty("LOGOID")
    public String lOGOID;
    @JsonProperty("LID_Confirmed")
    public int lID_Confirmed;
    @JsonProperty("E_BSNS_SEND_TYPE")
    public int e_BSNS_SEND_TYPE;
    @JsonProperty("LDX_DEF_ORDER_STAT")
    public int lDX_DEF_ORDER_STAT;
    @JsonProperty("LDX_DEF_ORDER_PRC")
    public int lDX_DEF_ORDER_PRC;
    @JsonProperty("ITR_SEND_METHOD")
    public int iTR_SEND_METHOD;
    @JsonProperty("ITR_SEND_MAIL_ADR")
    public String iTR_SEND_MAIL_ADR;
    @JsonProperty("ITR_SEND_FAX")
    public String iTR_SEND_FAX;
    @JsonProperty("ITR_SEND_FORMAT")
    public int iTR_SEND_FORMAT;
    @JsonProperty("IMG2INC")
    public int iMG2INC;
    @JsonProperty("INVOICE_PRNT_CNT")
    public int iNVOICE_PRNT_CNT;
    @JsonProperty("GENIUSFLDSLIST")
    public GENIUSFLDSLIST gENIUSFLDSLIST;
    @JsonProperty("DEFNFLDSLIST")
    public DEFNFLDSLIST dEFNFLDSLIST;
    @JsonProperty("WFLOWCARDREF")
    public int wFLOWCARDREF;
    @JsonProperty("PARENTCLCODE")
    public String pARENTCLCODE;
    @JsonProperty("PARENTCLREF")
    public int pARENTCLREF;
    @JsonProperty("CODE_CHANGED")
    public int cODE_CHANGED;
    @JsonProperty("COLLECTINV")
    public int cOLLECTINV;
    @JsonProperty("PIECEORDINFLICT")
    public int pIECEORDINFLICT;
    @JsonProperty("ORGLOGOID")
    public String oRGLOGOID;
    @JsonProperty("PURCHBRWS")
    public int pURCHBRWS;
    @JsonProperty("SALESBRWS")
    public int sALESBRWS;
    @JsonProperty("IMPBRWS")
    public int iMPBRWS;
    @JsonProperty("EXPBRWS")
    public int eXPBRWS;
    @JsonProperty("FINBRWS")
    public int fINBRWS;
    @JsonProperty("COLLATRLRISK_TYPE")
    public int cOLLATRLRISK_TYPE;
    @JsonProperty("COLLRISK_OVER")
    public int cOLLRISK_OVER;
    @JsonProperty("COLLRISK_ORD_RISK_OVER")
    public int cOLLRISK_ORD_RISK_OVER;
    @JsonProperty("COLLRISK_DESP_RISK_OVER")
    public int cOLLRISK_DESP_RISK_OVER;
    @JsonProperty("COLLRISK_USE_REP_RISK")
    public int cOLLRISK_USE_REP_RISK;
    @JsonProperty("COLLRISK_PCOLLATRL_TOTAL")
    public double cOLLRISK_PCOLLATRL_TOTAL;
    @JsonProperty("COLLRISK_REP_PCOLLATRL_TOT")
    public double cOLLRISK_REP_PCOLLATRL_TOT;
    @JsonProperty("COLLRISK_SCOLLATRL_TOTAL")
    public double cOLLRISK_SCOLLATRL_TOTAL;
    @JsonProperty("COLLRISK_TOTAL")
    public double cOLLRISK_TOTAL;
    @JsonProperty("COLLRISK_REP_RISK_TOTAL")
    public double cOLLRISK_REP_RISK_TOTAL;
    @JsonProperty("COLLRISK_DESP_TOTAL")
    public double cOLLRISK_DESP_TOTAL;
    @JsonProperty("COLLRISK_REP_DESP_RISK_TOT")
    public double cOLLRISK_REP_DESP_RISK_TOT;
    @JsonProperty("COLLRISK_LIMIT")
    public double cOLLRISK_LIMIT;
    @JsonProperty("COLLRISK_REP_LIMIT")
    public double cOLLRISK_REP_LIMIT;
    @JsonProperty("COLLRISK_BALANCED")
    public double cOLLRISK_BALANCED;
    @JsonProperty("COLLRISK_REP_BALANCED")
    public double cOLLRISK_REP_BALANCED;
    @JsonProperty("COLLRISK_ORD_RISK_TOTAL")
    public double cOLLRISK_ORD_RISK_TOTAL;
    @JsonProperty("COLLRISK_REP_ORD_RISK_TOT")
    public double cOLLRISK_REP_ORD_RISK_TOT;
    @JsonProperty("COLLRISK_ORD_RISK_TOT_SUGG")
    public double cOLLRISK_ORD_RISK_TOT_SUGG;
    @JsonProperty("COLLRISK_REP_ORD_RISK_TOT_SUG")
    public double cOLLRISK_REP_ORD_RISK_TOT_SUG;
    @JsonProperty("COLLRISK_SEP_CS_RISK_TOT")
    public int cOLLRISK_SEP_CS_RISK_TOT;
    @JsonProperty("COLLRISK_CS_RISK_OVER")
    public int cOLLRISK_CS_RISK_OVER;
    @JsonProperty("COLLRISK_CS_RISK_TOTAL")
    public double cOLLRISK_CS_RISK_TOTAL;
    @JsonProperty("COLLRISK_REP_CS_RISK_TOT")
    public double cOLLRISK_REP_CS_RISK_TOT;
    @JsonProperty("GRPFIRMNR")
    public int gRPFIRMNR;
    @JsonProperty("CONSCODEREF")
    public int cONSCODEREF;
    @JsonProperty("CONSCODE")
    public String cONSCODE;
    @JsonProperty("AUXIL_CODE2")
    public String aUXIL_CODE2;
    @JsonProperty("AUXIL_CODE3")
    public String aUXIL_CODE3;
    @JsonProperty("AUXIL_CODE4")
    public String aUXIL_CODE4;
    @JsonProperty("AUXIL_CODE5")
    public String aUXIL_CODE5;
    @JsonProperty("EBANKCODE")
    public int eBANKCODE;
    @JsonProperty("OFF_SEND_METHOD")
    public int oFF_SEND_METHOD;
    @JsonProperty("OFF_SEND_MAIL_ADDR")
    public String oFF_SEND_MAIL_ADDR;
    @JsonProperty("OFF_SEND_FAX")
    public String oFF_SEND_FAX;
    @JsonProperty("OFF_SEND_FORMAT")
    public int oFF_SEND_FORMAT;
    @JsonProperty("RISK_TYPE1")
    public int rISK_TYPE1;
    @JsonProperty("RISK_TYPE2")
    public int rISK_TYPE2;
    @JsonProperty("RISK_TYPE3")
    public int rISK_TYPE3;
    @JsonProperty("RISK_TYPE4")
    public int rISK_TYPE4;
    @JsonProperty("RISK_TYPE5")
    public int rISK_TYPE5;
    @JsonProperty("RISK_TYPE6")
    public int rISK_TYPE6;
    @JsonProperty("RISK_TYPE7")
    public int rISK_TYPE7;
    @JsonProperty("RISK_TYPE8")
    public int rISK_TYPE8;
    @JsonProperty("RISK_TYPE9")
    public int rISK_TYPE9;
    @JsonProperty("RISK_TYPE10")
    public int rISK_TYPE10;
    @JsonProperty("RISK_TYPE11")
    public int rISK_TYPE11;
    @JsonProperty("RISK_TYPE12")
    public int rISK_TYPE12;
    @JsonProperty("RISK_TYPE13")
    public int rISK_TYPE13;
    @JsonProperty("RISK_TYPE14")
    public int rISK_TYPE14;
    @JsonProperty("RISK_TYPE15")
    public int rISK_TYPE15;
    @JsonProperty("CST_CEK_RISK_FACTOR")
    public double cST_CEK_RISK_FACTOR;
    @JsonProperty("CST_SENET_RISK_FACTOR")
    public double cST_SENET_RISK_FACTOR;
    @JsonProperty("RISK_GRP_CONTROL")
    public int rISK_GRP_CONTROL;
    @JsonProperty("ACTION_CREDHOLD_ORD")
    public int aCTION_CREDHOLD_ORD;
    @JsonProperty("ACTION_CREDHOLD_DESP")
    public int aCTION_CREDHOLD_DESP;
    @JsonProperty("ACTION_CREDHOLD_ACC")
    public int aCTION_CREDHOLD_ACC;
    @JsonProperty("ACTION_CREDHOLD_CST_CS")
    public int aCTION_CREDHOLD_CST_CS;
    @JsonProperty("ACTION_CREDHOLD_MY_CS")
    public int aCTION_CREDHOLD_MY_CS;
    @JsonProperty("RISK_CTRL_TYPE")
    public int rISK_CTRL_TYPE;
    @JsonProperty("ACC_RISK_TOTAL")
    public double aCC_RISK_TOTAL;
    @JsonProperty("REP_ACC_RISK_TOTAL")
    public double rEP_ACC_RISK_TOTAL;
    @JsonProperty("CST_CS_RISK_TOTAL")
    public double cST_CS_RISK_TOTAL;
    @JsonProperty("REP_CST_CS_RISK_TOTAL")
    public double rEP_CST_CS_RISK_TOTAL;
    @JsonProperty("MY_CS_RISK_TOTAL")
    public double mY_CS_RISK_TOTAL;
    @JsonProperty("REP_MY_CS_RISK_TOTAL")
    public double rEP_MY_CS_RISK_TOTAL;
    @JsonProperty("ORD_RISK_TOTAL")
    public double oRD_RISK_TOTAL;
    @JsonProperty("REP_ORD_RISK_TOTAL")
    public double rEP_ORD_RISK_TOTAL;
    @JsonProperty("ORD_RISK_TOTAL_SUGG")
    public double oRD_RISK_TOTAL_SUGG;
    @JsonProperty("REP_ORD_RISK_TOTAL_SUGG")
    public double rEP_ORD_RISK_TOTAL_SUGG;
    @JsonProperty("DESP_RISK_TOTAL")
    public double dESP_RISK_TOTAL;
    @JsonProperty("REP_DESP_RISK_TOTAL")
    public double rEP_DESP_RISK_TOTAL;
    @JsonProperty("ACC_RISK_LIMIT")
    public double aCC_RISK_LIMIT;
    @JsonProperty("REP_ACC_RISK_LIMIT")
    public double rEP_ACC_RISK_LIMIT;
    @JsonProperty("CST_CS_RISK_LIMIT")
    public double cST_CS_RISK_LIMIT;
    @JsonProperty("REP_CST_CS_RISK_LIMIT")
    public double rEP_CST_CS_RISK_LIMIT;
    @JsonProperty("MY_CS_RISK_LIMIT")
    public double mY_CS_RISK_LIMIT;
    @JsonProperty("REP_MY_CS_RISK_LIMIT")
    public double rEP_MY_CS_RISK_LIMIT;
    @JsonProperty("DESP_RISK_LIMIT")
    public double dESP_RISK_LIMIT;
    @JsonProperty("REP_DESP_RISK_LIMIT")
    public double rEP_DESP_RISK_LIMIT;
    @JsonProperty("ORD_RISK_LIMIT")
    public double oRD_RISK_LIMIT;
    @JsonProperty("REP_ORD_RISK_LIMIT")
    public double rEP_ORD_RISK_LIMIT;
    @JsonProperty("ORD_RISK_LIMIT_SUGG")
    public double oRD_RISK_LIMIT_SUGG;
    @JsonProperty("REP_ORD_SIRK_LIMIT_SUGG")
    public double rEP_ORD_SIRK_LIMIT_SUGG;
    @JsonProperty("ACC_RISK_BALANCED")
    public double aCC_RISK_BALANCED;
    @JsonProperty("REP_ACC_RISK_BALANCED")
    public double rEP_ACC_RISK_BALANCED;
    @JsonProperty("CST_CS_RISK_BALANCED")
    public double cST_CS_RISK_BALANCED;
    @JsonProperty("REP_CST_CS_RISK_BALANCED")
    public double rEP_CST_CS_RISK_BALANCED;
    @JsonProperty("MY_CS_RISK_BALANCED")
    public double mY_CS_RISK_BALANCED;
    @JsonProperty("REP_MY_CS_RISK_BALANCED")
    public double rEP_MY_CS_RISK_BALANCED;
    @JsonProperty("DESP_RISK_BALANCED")
    public double dESP_RISK_BALANCED;
    @JsonProperty("REP_DESP_RISK_BALANCED")
    public double rEP_DESP_RISK_BALANCED;
    @JsonProperty("ORD_RISK_BALANCED")
    public double oRD_RISK_BALANCED;
    @JsonProperty("REP_ORD_RISK_BALANCED")
    public double rEP_ORD_RISK_BALANCED;
    @JsonProperty("ORD_RISK_BALANCED_SUGG")
    public double oRD_RISK_BALANCED_SUGG;
    @JsonProperty("REP_ORD_RISK_BALANCED_SUGG")
    public double rEP_ORD_RISK_BALANCED_SUGG;
    @JsonProperty("LOAN_GRP_CTRL")
    public int lOAN_GRP_CTRL;
    @JsonProperty("EBUS_DATA_SEND_TYPE")
    public int eBUS_DATA_SEND_TYPE;
    @JsonProperty("INI_STATUS_FLAGS")
    public int iNI_STATUS_FLAGS;
    @JsonProperty("SLS_ORDER_STATUS")
    public int sLS_ORDER_STATUS;
    @JsonProperty("SLS_ORDER_PRICE")
    public int sLS_ORDER_PRICE;
    @JsonProperty("SAME_ITEM_CODE_USE")
    public int sAME_ITEM_CODE_USE;
    @JsonProperty("IMAGE_SIZE")
    public int iMAGE_SIZE;
    @JsonProperty("MAP_ID")
    public String mAP_ID;
    @JsonProperty("LONGITUDE")
    public String lONGITUDE;
    @JsonProperty("LATITUDE")
    public String lATITUDE;
    @JsonProperty("CITY_ID")
    public String cITY_ID;
    @JsonProperty("TOWN_ID")
    public String tOWN_ID;
    @JsonProperty("BANK_IBAN1")
    public String bANK_IBAN1;
    @JsonProperty("BANK_IBAN2")
    public String bANK_IBAN2;
    @JsonProperty("BANK_IBAN3")
    public String bANK_IBAN3;
    @JsonProperty("BANK_IBAN4")
    public String bANK_IBAN4;
    @JsonProperty("BANK_IBAN5")
    public String bANK_IBAN5;
    @JsonProperty("BANK_IBAN6")
    public String bANK_IBAN6;
    @JsonProperty("BANK_IBAN7")
    public String bANK_IBAN7;
    @JsonProperty("BANK_BIC1")
    public String bANK_BIC1;
    @JsonProperty("BANK_BIC2")
    public String bANK_BIC2;
    @JsonProperty("BANK_BIC3")
    public String bANK_BIC3;
    @JsonProperty("BANK_BIC4")
    public String bANK_BIC4;
    @JsonProperty("BANK_BIC5")
    public String bANK_BIC5;
    @JsonProperty("BANK_BIC6")
    public String bANK_BIC6;
    @JsonProperty("BANK_BIC7")
    public String bANK_BIC7;
    @JsonProperty("PERSCOMPANY")
    public int pERSCOMPANY;
    @JsonProperty("TCKNO")
    public String tCKNO;
    @JsonProperty("EXT_SEND_METHOD")
    public int eXT_SEND_METHOD;
    @JsonProperty("EXT_SEND_EMAIL")
    public String eXT_SEND_EMAIL;
    @JsonProperty("EXT_SEND_FAX")
    public String eXT_SEND_FAX;
    @JsonProperty("EXT_SEND_FORMAT")
    public int eXT_SEND_FORMAT;
    @JsonProperty("ADDTOREFLIST")
    public int aDDTOREFLIST;
    @JsonProperty("ORD_RISK_OVER_SUGG")
    public int oRD_RISK_OVER_SUGG;
    @JsonProperty("CASH_CODE")
    public String cASH_CODE;
    @JsonProperty("CASHREF")
    public int cASHREF;
    @JsonProperty("USED_IN_PERIODS")
    public int uSED_IN_PERIODS;
    @JsonProperty("CONTACT2")
    public String cONTACT2;
    @JsonProperty("CONTACT3")
    public String cONTACT3;
    @JsonProperty("E_MAIL2")
    public String e_MAIL2;
    @JsonProperty("E_MAIL3")
    public String e_MAIL3;
    @JsonProperty("CONTACT1_TEL_CODE")
    public String cONTACT1_TEL_CODE;
    @JsonProperty("CONTACT2_TEL_CODE")
    public String cONTACT2_TEL_CODE;
    @JsonProperty("CONTACT3_TEL_CODE")
    public String cONTACT3_TEL_CODE;
    @JsonProperty("CONTACT1_TEL")
    public String cONTACT1_TEL;
    @JsonProperty("CONTACT2_TEL")
    public String cONTACT2_TEL;
    @JsonProperty("CONTACT3_TEL")
    public String cONTACT3_TEL;
    @JsonProperty("CONTACT1_TEL_EXT")
    public String cONTACT1_TEL_EXT;
    @JsonProperty("CONTACT2_TEL_EXT")
    public String cONTACT2_TEL_EXT;
    @JsonProperty("CONTACT3_TEL_EXT")
    public String cONTACT3_TEL_EXT;
    @JsonProperty("RSKLIM_CNTRL")
    public int rSKLIM_CNTRL;
    @JsonProperty("DUEDATE_CNTRL")
    public int dUEDATE_CNTRL;
    @JsonProperty("AGING_CNTRL")
    public int aGING_CNTRL;
    @JsonProperty("AGING_DAY")
    public int aGING_DAY;
    @JsonProperty("ORD_PRIORITY")
    public int oRD_PRIORITY;
    @JsonProperty("ACCEPT_EINV")
    public int aCCEPT_EINV;
    @JsonProperty("EIVOICEID")
    public String eIVOICEID;
    @JsonProperty("PROFILE_ID")
    public int pROFILE_ID;
    @JsonProperty("PURC_ORDER_STATUS")
    public int pURC_ORDER_STATUS;
    @JsonProperty("PURC_ORDER_PRICE")
    public int pURC_ORDER_PRICE;
    @JsonProperty("BANK_CURR1")
    public String bANK_CURR1;
    @JsonProperty("BANK_CURR2")
    public String bANK_CURR2;
    @JsonProperty("BANK_CURR3")
    public String bANK_CURR3;
    @JsonProperty("BANK_CURR4")
    public String bANK_CURR4;
    @JsonProperty("BANK_CURR5")
    public String bANK_CURR5;
    @JsonProperty("BANK_CURR6")
    public String bANK_CURR6;
    @JsonProperty("BANK_CURR7")
    public String bANK_CURR7;
    @JsonProperty("CS_DOWNS_RISK")
    public int cS_DOWNS_RISK;
    @JsonProperty("CST_CS_CIRO_RISK_OVER")
    public int cST_CS_CIRO_RISK_OVER;
    @JsonProperty("CST_CIRO_CEK_RISK_FAC")
    public double cST_CIRO_CEK_RISK_FAC;
    @JsonProperty("CST_CIRO_SENET_RISK_FAC")
    public double cST_CIRO_SENET_RISK_FAC;
    @JsonProperty("CS_CIRO_DOWNS_RISK")
    public int cS_CIRO_DOWNS_RISK;
    @JsonProperty("CST_CS_CIRO_RISK_LIMIT")
    public double cST_CS_CIRO_RISK_LIMIT;
    @JsonProperty("REP_CST_CS_CIRO_RISK_LIMIT")
    public double rEP_CST_CS_CIRO_RISK_LIMIT;
    @JsonProperty("CST_CS_CIRO_RISK_BALANCED")
    public double cST_CS_CIRO_RISK_BALANCED;
    @JsonProperty("REP_CST_CS_CIRO_RISK_BALANCED")
    public double rEP_CST_CS_CIRO_RISK_BALANCED;
    @JsonProperty("CST_CS_OWN_RISK_TOTAL")
    public double cST_CS_OWN_RISK_TOTAL;
    @JsonProperty("REP_CST_CS_OWN_RISK_TOTAL")
    public double rEP_CST_CS_OWN_RISK_TOTAL;
    @JsonProperty("CST_CS_CIRO_RISK_TOTAL")
    public double cST_CS_CIRO_RISK_TOTAL;
    @JsonProperty("REP_CST_CS_CIRO_RISK_TOTAL")
    public double rEP_CST_CS_CIRO_RISK_TOTAL;
    @JsonProperty("DESP_RISK_OVER_SUGG")
    public int dESP_RISK_OVER_SUGG;
    @JsonProperty("DESP_RISK_LIMIT_SUGG")
    public double dESP_RISK_LIMIT_SUGG;
    @JsonProperty("REP_DESP_RISK_LIMIT_SUGG")
    public double rEP_DESP_RISK_LIMIT_SUGG;
    @JsonProperty("DESP_RISK_TOTAL_SUGG")
    public double dESP_RISK_TOTAL_SUGG;
    @JsonProperty("REP_DESP_RISK_TOTAL_SUGG")
    public double rEP_DESP_RISK_TOTAL_SUGG;
    @JsonProperty("DESP_RISK_BALANCED_SUGG")
    public double dESP_RISK_BALANCED_SUGG;
    @JsonProperty("REP_DESP_RISK_BALANCED_SUGG")
    public double rEP_DESP_RISK_BALANCED_SUGG;
    @JsonProperty("DBS_LIMIT1")
    public double dBS_LIMIT1;
    @JsonProperty("DBS_LIMIT2")
    public double dBS_LIMIT2;
    @JsonProperty("DBS_LIMIT3")
    public double dBS_LIMIT3;
    @JsonProperty("DBS_LIMIT4")
    public double dBS_LIMIT4;
    @JsonProperty("DBS_LIMIT5")
    public double dBS_LIMIT5;
    @JsonProperty("DBS_LIMIT6")
    public double dBS_LIMIT6;
    @JsonProperty("DBS_LIMIT7")
    public double dBS_LIMIT7;
    @JsonProperty("DBS_TOTAL1")
    public double dBS_TOTAL1;
    @JsonProperty("DBS_TOTAL2")
    public double dBS_TOTAL2;
    @JsonProperty("DBS_TOTAL3")
    public double dBS_TOTAL3;
    @JsonProperty("DBS_TOTAL4")
    public double dBS_TOTAL4;
    @JsonProperty("DBS_TOTAL5")
    public double dBS_TOTAL5;
    @JsonProperty("DBS_TOTAL6")
    public double dBS_TOTAL6;
    @JsonProperty("DBS_TOTAL7")
    public double dBS_TOTAL7;
    @JsonProperty("DBS_BANKNO1")
    public int dBS_BANKNO1;
    @JsonProperty("DBS_BANKNO2")
    public int dBS_BANKNO2;
    @JsonProperty("DBS_BANKNO3")
    public int dBS_BANKNO3;
    @JsonProperty("DBS_BANKNO4")
    public int dBS_BANKNO4;
    @JsonProperty("DBS_BANKNO5")
    public int dBS_BANKNO5;
    @JsonProperty("DBS_BANKNO6")
    public int dBS_BANKNO6;
    @JsonProperty("DBS_BANKNO7")
    public int dBS_BANKNO7;
    @JsonProperty("DBS_RSKCTRL1")
    public int dBS_RSKCTRL1;
    @JsonProperty("DBS_RSKCTRL2")
    public int dBS_RSKCTRL2;
    @JsonProperty("DBS_RSKCTRL3")
    public int dBS_RSKCTRL3;
    @JsonProperty("DBS_RSKCTRL4")
    public int dBS_RSKCTRL4;
    @JsonProperty("DBS_RSKCTRL5")
    public int dBS_RSKCTRL5;
    @JsonProperty("DBS_RSKCTRL6")
    public int dBS_RSKCTRL6;
    @JsonProperty("DBS_RSKCTRL7")
    public int dBS_RSKCTRL7;
    @JsonProperty("DBS_CURR1")
    public int dBS_CURR1;
    @JsonProperty("DBS_CURR2")
    public int dBS_CURR2;
    @JsonProperty("DBS_CURR3")
    public int dBS_CURR3;
    @JsonProperty("DBS_CURR4")
    public int dBS_CURR4;
    @JsonProperty("DBS_CURR5")
    public int dBS_CURR5;
    @JsonProperty("DBS_CURR6")
    public int dBS_CURR6;
    @JsonProperty("DBS_CURR7")
    public int dBS_CURR7;
    @JsonProperty("BANK_CORRP_ACC1")
    public String bANK_CORRP_ACC1;
    @JsonProperty("BANK_CORRP_ACC2")
    public String bANK_CORRP_ACC2;
    @JsonProperty("BANK_CORRP_ACC3")
    public String bANK_CORRP_ACC3;
    @JsonProperty("BANK_CORRP_ACC4")
    public String bANK_CORRP_ACC4;
    @JsonProperty("BANK_CORRP_ACC5")
    public String bANK_CORRP_ACC5;
    @JsonProperty("BANK_CORRP_ACC6")
    public String bANK_CORRP_ACC6;
    @JsonProperty("BANK_CORRP_ACC7")
    public String bANK_CORRP_ACC7;
    @JsonProperty("BANK_VOEN1")
    public String bANK_VOEN1;
    @JsonProperty("BANK_VOEN2")
    public String bANK_VOEN2;
    @JsonProperty("BANK_VOEN3")
    public String bANK_VOEN3;
    @JsonProperty("BANK_VOEN4")
    public String bANK_VOEN4;
    @JsonProperty("BANK_VOEN5")
    public String bANK_VOEN5;
    @JsonProperty("BANK_VOEN6")
    public String bANK_VOEN6;
    @JsonProperty("BANK_VOEN7")
    public String bANK_VOEN7;
    @JsonProperty("EINVOICE_TYPE")
    public int eINVOICE_TYPE;
    @JsonProperty("EARCHIVE_SEND_MODE")
    public int eARCHIVE_SEND_MODE;
    @JsonProperty("EARCHIVE_IS_RETAIL_AR_AP")
    public int eARCHIVE_IS_RETAIL_AR_AP;
    @JsonProperty("TITLE2")
    public String tITLE2;
    @JsonProperty("TELEPHONE_EXTENSION1")
    public String tELEPHONE_EXTENSION1;
    @JsonProperty("TELEPHONE_EXTENSION2")
    public String tELEPHONE_EXTENSION2;
    @JsonProperty("FAX_EXTENSION")
    public String fAX_EXTENSION;
    @JsonProperty("GLOBAL_ID")
    public String gLOBAL_ID;
    @JsonProperty("ISFOREIGN")
    public int iSFOREIGN;
    @JsonProperty("POST_LABEL")
    public String pOST_LABEL;
    @JsonProperty("SENDER_LABEL")
    public String sENDER_LABEL;
    @JsonProperty("DEG_ACTIVE")
    public int dEG_ACTIVE;
    @JsonProperty("DEG_CURR")
    public int dEG_CURR;
    @JsonProperty("NAME")
    public String nAME;
    @JsonProperty("SURNAME")
    public String sURNAME;
    @JsonProperty("LABEL_INFO")
    public int lABEL_INFO;
    @JsonProperty("DUE_DATE_CONTOL1")
    public int dUE_DATE_CONTOL1;
    @JsonProperty("DUE_DATE_CONTOL2")
    public int dUE_DATE_CONTOL2;
    @JsonProperty("DUE_DATE_CONTOL3")
    public int dUE_DATE_CONTOL3;
    @JsonProperty("DUE_DATE_CONTOL4")
    public int dUE_DATE_CONTOL4;
    @JsonProperty("DUE_DATE_CONTOL5")
    public int dUE_DATE_CONTOL5;
    @JsonProperty("DUE_DATE_CONTOL6")
    public int dUE_DATE_CONTOL6;
    @JsonProperty("DUE_DATE_CONTOL7")
    public int dUE_DATE_CONTOL7;
    @JsonProperty("DUE_DATE_CONTOL8")
    public int dUE_DATE_CONTOL8;
    @JsonProperty("DUE_DATE_CONTOL9")
    public int dUE_DATE_CONTOL9;
    @JsonProperty("DUE_DATE_CONTOL10")
    public int dUE_DATE_CONTOL10;
    @JsonProperty("DUE_DATE_CONTOL11")
    public int dUE_DATE_CONTOL11;
    @JsonProperty("DUE_DATE_CONTOL12")
    public int dUE_DATE_CONTOL12;
    @JsonProperty("DUE_DATE_CONTOL13")
    public int dUE_DATE_CONTOL13;
    @JsonProperty("DUE_DATE_CONTOL14")
    public int dUE_DATE_CONTOL14;
    @JsonProperty("DUE_DATE_CONTOL15")
    public int dUE_DATE_CONTOL15;
    @JsonProperty("DUE_DATE_COUNT")
    public int dUE_DATE_COUNT;
    @JsonProperty("DUE_DATE_LIMIT")
    public double dUE_DATE_LIMIT;
    @JsonProperty("DUE_DATE_TRACK")
    public int dUE_DATE_TRACK;
    @JsonProperty("CLOSE_DATE_COUNT")
    public int cLOSE_DATE_COUNT;
    @JsonProperty("CLOSE_DATE_TRACK")
    public int cLOSE_DATE_TRACK;
    @JsonProperty("DEFBNACCREF")
    public int dEFBNACCREF;
    @JsonProperty("DEFAULT_BANKACC_CODE")
    public String dEFAULT_BANKACC_CODE;
    @JsonProperty("CURR_RATE_TYPE")
    public int cURR_RATE_TYPE;
    @JsonProperty("INSTEAD_OF_DISPATCH")
    public int iNSTEAD_OF_DISPATCH;
    @JsonProperty("EINV_EARC_TYPE")
    public int eINV_EARC_TYPE;
    @JsonProperty("ADDRESS_NO")
    public String aDDRESS_NO;
    @JsonProperty("FBS_SEND_METHOD")
    public int fBS_SEND_METHOD;
    @JsonProperty("FBS_SEND_EMAILADDR")
    public String fBS_SEND_EMAILADDR;
    @JsonProperty("FBS_SEND_FORMAT")
    public int fBS_SEND_FORMAT;
    @JsonProperty("FBS_SEND_FAXNR")
    public String fBS_SEND_FAXNR;
    @JsonProperty("FBA_SEND_METHOD")
    public int fBA_SEND_METHOD;
    @JsonProperty("FBA_SEND_EMAILADDR")
    public String fBA_SEND_EMAILADDR;
    @JsonProperty("FBA_SEND_FORMAT")
    public int fBA_SEND_FORMAT;
    @JsonProperty("FBA_SEND_FAXNR")
    public String fBA_SEND_FAXNR;
    @JsonProperty("SECTOR_MAIN_REF")
    public int sECTOR_MAIN_REF;
    @JsonProperty("SECTOR_MAIN_CODE")
    public String sECTOR_MAIN_CODE;
    @JsonProperty("SECTOR_SUB_REF")
    public int sECTOR_SUB_REF;
    @JsonProperty("SECTOR_SUB_CODE")
    public String sECTOR_SUB_CODE;
    @JsonProperty("PERSONEL_COSTS")
    public int pERSONEL_COSTS;
    @JsonProperty("EARC_EMAIL_ADDRESS1")
    public String eARC_EMAIL_ADDRESS1;
    @JsonProperty("EARC_EMAIL_ADDRESS2")
    public String eARC_EMAIL_ADDRESS2;
    @JsonProperty("EARC_EMAIL_ADDRESS3")
    public String eARC_EMAIL_ADDRESS3;
    @JsonProperty("FACTORY_DIV_NR")
    public int fACTORY_DIV_NR;
    @JsonProperty("FACTORY_NR")
    public int fACTORY_NR;
    @JsonProperty("IN_INVEN_NR")
    public int iN_INVEN_NR;
    @JsonProperty("OUT_INVEN_NR")
    public int oUT_INVEN_NR;
    @JsonProperty("QTY_DEP_DURATION")
    public double qTY_DEP_DURATION;
    @JsonProperty("QTY_IN_DEP_DURATION")
    public double qTY_IN_DEP_DURATION;
    @JsonProperty("OVER_LAP_TYPE")
    public int oVER_LAP_TYPE;
    @JsonProperty("OVER_LAP_AMOUNT")
    public double oVER_LAP_AMOUNT;
    @JsonProperty("OVER_LAP_PERC")
    public double oVER_LAP_PERC;
    @JsonProperty("BROKER_COMP")
    public int bROKER_COMP;
    @JsonProperty("CREATE_WH_FICHE")
    public int cREATE_WH_FICHE;
    @JsonProperty("EINV_CUSTOMS")
    public int eINV_CUSTOMS;
    @JsonProperty("SUB_CONT")
    public int sUB_CONT;
    @JsonProperty("ACCEPT_DESP")
    public int aCCEPT_DESP;
    @JsonProperty("PROFILEID_DESP")
    public int pROFILEID_DESP;
    @JsonProperty("LABEL_INFO_DESP")
    public int lABEL_INFO_DESP;
    @JsonProperty("POST_LABEL_CODE_DESP")
    public String pOST_LABEL_CODE_DESP;
    @JsonProperty("SENDER_LABEL_CODE_DESP")
    public String sENDER_LABEL_CODE_DESP;
    @JsonProperty("ACCEPT_EINV_PUBLIC")
    public int aCCEPT_EINV_PUBLIC;
    @JsonProperty("PUBLICBNACCREF")
    public int pUBLICBNACCREF;
    @JsonProperty("PUBLIC_BNACC_CODE")
    public String pUBLIC_BNACC_CODE;
    @JsonProperty("PUBLIC_BNACC_IBAN")
    public String pUBLIC_BNACC_IBAN;
    @JsonProperty("PUBLIC_BNACC_CURRENCY")
    public int pUBLIC_BNACC_CURRENCY;
    @JsonProperty("KVKK_PERM_STATUS")
    public int kVKK_PERM_STATUS;
    @JsonProperty("KVKK_BEGIN_DATE")
    public Date kVKK_BEGIN_DATE;
    @JsonProperty("KVKK_END_DATE")
    public Date kVKK_END_DATE;
    @JsonProperty("KVKK_CANCEL_DATE")
    public Date kVKK_CANCEL_DATE;
    @JsonProperty("KVKK_ANONYMIZE_STATUS")
    public int kVKK_ANONYMIZE_STATUS;
    @JsonProperty("KVKK_ANONYMIZE_DATE")
    public Date kVKK_ANONYMIZE_DATE;
    @JsonProperty("EXIM_SEND_METHOD")
    public int eXIM_SEND_METHOD;
    @JsonProperty("EXIM_SEND_EMAILADR")
    public String eXIM_SEND_EMAILADR;
    @JsonProperty("EXIM_SEND_FORMAT")
    public int eXIM_SEND_FORMAT;
    @JsonProperty("EXIM_SEND_FAXNR")
    public String eXIM_SEND_FAXNR;
    @JsonProperty("CAN_DEDUCT")
    public int cAN_DEDUCT;
    @JsonProperty("DRIVERREF")
    public int dRIVERREF;
    @JsonProperty("EX_COUNTRY_TYPE")
    public int eX_COUNTRY_TYPE;
    @JsonProperty("EX_COUNTRYREF")
    public int eX_COUNTRYREF;
    @JsonProperty("EX_COUNTRY_CODE")
    public String eX_COUNTRY_CODE;
    @JsonProperty("EX_COUNTRY_NAME")
    public String eX_COUNTRY_NAME;
    @JsonProperty("IM_COUNTRY_TYPE")
    public int iM_COUNTRY_TYPE;
    @JsonProperty("IM_COUNTRYREF")
    public int iM_COUNTRYREF;
    @JsonProperty("IM_COUNTRY_CODE")
    public String iM_COUNTRY_CODE;
    @JsonProperty("IM_COUNTRY_NAME")
    public String iM_COUNTRY_NAME;
    @JsonProperty("EXIM_PAYTYPEREF")
    public int eXIM_PAYTYPEREF;
    @JsonProperty("EXIM_PAYTYPE_CODE")
    public String eXIM_PAYTYPE_CODE;
    @JsonProperty("EXIM_BRBANKREF")
    public int eXIM_BRBANKREF;
    @JsonProperty("EXIM_BRBANK_CODE")
    public String eXIM_BRBANK_CODE;
    @JsonProperty("EXIM_CUSTOMREF")
    public int eXIM_CUSTOMREF;
    @JsonProperty("EXIM_CUSTOM_CODE")
    public String eXIM_CUSTOM_CODE;
    @JsonProperty("EXIM_REGTYPEREF")
    public int eXIM_REGTYPEREF;
    @JsonProperty("EXIM_REGTYPE_CODE")
    public String eXIM_REGTYPE_CODE;
    @JsonProperty("EXIM_NOTIFYCLREF")
    public int eXIM_NOTIFYCLREF;
    @JsonProperty("EXIM_NOTIFY_ARPCODE")
    public String eXIM_NOTIFY_ARPCODE;
    @JsonProperty("EXIM_CONSULTCLREF")
    public int eXIM_CONSULTCLREF;
    @JsonProperty("EXIM_CONSULT_ARPCODE")
    public String eXIM_CONSULT_ARPCODE;
    @JsonProperty("EXIM_FREIGHTCLREF")
    public int eXIM_FREIGHTCLREF;
    @JsonProperty("EXIM_FREIGHT_ARPCODE")
    public String eXIM_FREIGHT_ARPCODE;
    @JsonProperty("DISP_PRINT_CNT")
    public int dISP_PRINT_CNT;
    @JsonProperty("ORD_PRINT_CNT")
    public int oRD_PRINT_CNT;
    @JsonProperty("GUID")
    public String gUID;
    @JsonProperty("CLPTYPEFORPPAYDT")
    public int cLPTYPEFORPPAYDT;
    @JsonProperty("CLSTYPEFORPPAYDT")
    public int cLSTYPEFORPPAYDT;
    @JsonProperty("MERSIS_NO")
    public String mERSIS_NO;
    @JsonProperty("COMM_RECORD_NO")
    public String cOMM_RECORD_NO;
    @JsonProperty("CLIENTREF")
    public int cLIENTREF;
    @JsonProperty("LINENUM")
    public int lINENUM;
    @JsonProperty("LINE")
    public String lINE;
}



