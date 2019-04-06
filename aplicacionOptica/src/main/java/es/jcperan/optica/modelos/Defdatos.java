/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.jcperan.optica.modelos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcperan
 */
@Entity
@Table(name = "DEFDATOS")
@NamedQueries({
    @NamedQuery(name = "Defdatos.findAll", query = "SELECT d FROM Defdatos d")})
public class Defdatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DefdatosPK defdatosPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "CAMPO_01")
    private String campo01;
    @Size(max = 80)
    @Column(name = "CAMPO_02")
    private String campo02;
    @Size(max = 80)
    @Column(name = "CAMPO_03")
    private String campo03;
    @Size(max = 80)
    @Column(name = "CAMPO_04")
    private String campo04;
    @Size(max = 80)
    @Column(name = "CAMPO_05")
    private String campo05;
    @Size(max = 80)
    @Column(name = "CAMPO_06")
    private String campo06;
    @Size(max = 80)
    @Column(name = "CAMPO_07")
    private String campo07;
    @Size(max = 80)
    @Column(name = "CAMPO_08")
    private String campo08;
    @Size(max = 80)
    @Column(name = "CAMPO_09")
    private String campo09;
    @Size(max = 80)
    @Column(name = "CAMPO_10")
    private String campo10;
    @Size(max = 80)
    @Column(name = "CAMPO_11")
    private String campo11;
    @Size(max = 80)
    @Column(name = "CAMPO_12")
    private String campo12;
    @Size(max = 80)
    @Column(name = "CAMPO_13")
    private String campo13;
    @Size(max = 80)
    @Column(name = "CAMPO_14")
    private String campo14;
    @Size(max = 80)
    @Column(name = "CAMPO_15")
    private String campo15;
    @Size(max = 80)
    @Column(name = "CAMPO_16")
    private String campo16;
    @Size(max = 80)
    @Column(name = "CAMPO_17")
    private String campo17;
    @Size(max = 80)
    @Column(name = "CAMPO_18")
    private String campo18;
    @Size(max = 80)
    @Column(name = "CAMPO_19")
    private String campo19;
    @Size(max = 80)
    @Column(name = "CAMPO_20")
    private String campo20;
    @Size(max = 80)
    @Column(name = "CAMPO_21")
    private String campo21;
    @Size(max = 80)
    @Column(name = "CAMPO_22")
    private String campo22;
    @Size(max = 80)
    @Column(name = "CAMPO_23")
    private String campo23;
    @Size(max = 80)
    @Column(name = "CAMPO_24")
    private String campo24;
    @Size(max = 80)
    @Column(name = "CAMPO_25")
    private String campo25;
    @Size(max = 80)
    @Column(name = "CAMPO_26")
    private String campo26;
    @Size(max = 50)
    @Column(name = "CAMPO_27")
    private String campo27;
    @Size(max = 50)
    @Column(name = "CAMPO_28")
    private String campo28;
    @Size(max = 50)
    @Column(name = "CAMPO_29")
    private String campo29;
    @Size(max = 50)
    @Column(name = "CAMPO_30")
    private String campo30;
    @Size(max = 50)
    @Column(name = "CAMPO_31")
    private String campo31;
    @Size(max = 50)
    @Column(name = "CAMPO_32")
    private String campo32;
    @Size(max = 50)
    @Column(name = "CAMPO_33")
    private String campo33;
    @Size(max = 50)
    @Column(name = "CAMPO_34")
    private String campo34;
    @Size(max = 50)
    @Column(name = "CAMPO_35")
    private String campo35;
    @Size(max = 50)
    @Column(name = "CAMPO_36")
    private String campo36;
    @Size(max = 50)
    @Column(name = "CAMPO_37")
    private String campo37;
    @Size(max = 50)
    @Column(name = "CAMPO_38")
    private String campo38;
    @Size(max = 50)
    @Column(name = "CAMPO_39")
    private String campo39;
    @Size(max = 50)
    @Column(name = "CAMPO_40")
    private String campo40;
    @Size(max = 50)
    @Column(name = "CAMPO_41")
    private String campo41;
    @Size(max = 50)
    @Column(name = "CAMPO_42")
    private String campo42;
    @Size(max = 50)
    @Column(name = "CAMPO_43")
    private String campo43;
    @Size(max = 50)
    @Column(name = "CAMPO_44")
    private String campo44;
    @Size(max = 50)
    @Column(name = "CAMPO_45")
    private String campo45;
    @Size(max = 50)
    @Column(name = "CAMPO_46")
    private String campo46;
    @Size(max = 50)
    @Column(name = "CAMPO_47")
    private String campo47;
    @Size(max = 50)
    @Column(name = "CAMPO_48")
    private String campo48;
    @Size(max = 50)
    @Column(name = "CAMPO_49")
    private String campo49;
    @Size(max = 50)
    @Column(name = "CAMPO_50")
    private String campo50;
    @Size(max = 50)
    @Column(name = "CAMPO_51")
    private String campo51;
    @Size(max = 50)
    @Column(name = "CAMPO_52")
    private String campo52;
    @Size(max = 50)
    @Column(name = "CAMPO_53")
    private String campo53;
    @Size(max = 50)
    @Column(name = "CAMPO_54")
    private String campo54;
    @Size(max = 50)
    @Column(name = "CAMPO_55")
    private String campo55;
    @Size(max = 50)
    @Column(name = "CAMPO_56")
    private String campo56;
    @Size(max = 50)
    @Column(name = "CAMPO_57")
    private String campo57;
    @Size(max = 50)
    @Column(name = "CAMPO_58")
    private String campo58;
    @Size(max = 50)
    @Column(name = "CAMPO_59")
    private String campo59;
    @Size(max = 50)
    @Column(name = "CAMPO_60")
    private String campo60;
    @Size(max = 50)
    @Column(name = "CAMPO_61")
    private String campo61;
    @Size(max = 50)
    @Column(name = "CAMPO_62")
    private String campo62;
    @Size(max = 50)
    @Column(name = "CAMPO_63")
    private String campo63;
    @Size(max = 50)
    @Column(name = "CAMPO_64")
    private String campo64;
    @Size(max = 50)
    @Column(name = "CAMPO_65")
    private String campo65;
    @Size(max = 50)
    @Column(name = "CAMPO_66")
    private String campo66;
    @Size(max = 50)
    @Column(name = "CAMPO_67")
    private String campo67;
    @Size(max = 50)
    @Column(name = "CAMPO_68")
    private String campo68;
    @Size(max = 50)
    @Column(name = "CAMPO_69")
    private String campo69;
    @Size(max = 50)
    @Column(name = "CAMPO_70")
    private String campo70;
    @Size(max = 50)
    @Column(name = "CAMPO_71")
    private String campo71;
    @Size(max = 50)
    @Column(name = "CAMPO_72")
    private String campo72;
    @Size(max = 50)
    @Column(name = "CAMPO_73")
    private String campo73;
    @Size(max = 50)
    @Column(name = "CAMPO_74")
    private String campo74;
    @Size(max = 50)
    @Column(name = "CAMPO_75")
    private String campo75;
    @Size(max = 50)
    @Column(name = "CAMPO_76")
    private String campo76;
    @Size(max = 50)
    @Column(name = "CAMPO_77")
    private String campo77;
    @Size(max = 50)
    @Column(name = "CAMPO_78")
    private String campo78;
    @Size(max = 50)
    @Column(name = "CAMPO_79")
    private String campo79;
    @Size(max = 50)
    @Column(name = "CAMPO_80")
    private String campo80;
    @Size(max = 50)
    @Column(name = "CAMPO_81")
    private String campo81;
    @Size(max = 50)
    @Column(name = "CAMPO_82")
    private String campo82;
    @Size(max = 50)
    @Column(name = "CAMPO_83")
    private String campo83;
    @Size(max = 50)
    @Column(name = "CAMPO_84")
    private String campo84;
    @Size(max = 50)
    @Column(name = "CAMPO_85")
    private String campo85;
    @Size(max = 50)
    @Column(name = "CAMPO_86")
    private String campo86;
    @Size(max = 50)
    @Column(name = "CAMPO_87")
    private String campo87;
    @Size(max = 50)
    @Column(name = "CAMPO_88")
    private String campo88;
    @Size(max = 50)
    @Column(name = "CAMPO_89")
    private String campo89;
    @Size(max = 50)
    @Column(name = "CAMPO_90")
    private String campo90;
    @Size(max = 50)
    @Column(name = "CAMPO_91")
    private String campo91;
    @Size(max = 50)
    @Column(name = "CAMPO_92")
    private String campo92;
    @Size(max = 50)
    @Column(name = "CAMPO_93")
    private String campo93;
    @Size(max = 50)
    @Column(name = "CAMPO_94")
    private String campo94;
    @Size(max = 50)
    @Column(name = "CAMPO_95")
    private String campo95;
    @Size(max = 50)
    @Column(name = "CAMPO_96")
    private String campo96;
    @Size(max = 50)
    @Column(name = "CAMPO_97")
    private String campo97;
    @Size(max = 50)
    @Column(name = "CAMPO_98")
    private String campo98;
    @Size(max = 50)
    @Column(name = "CAMPO_99")
    private String campo99;

    public Defdatos() {
    }

    public Defdatos(DefdatosPK defdatosPK) {
        this.defdatosPK = defdatosPK;
    }

    public Defdatos(DefdatosPK defdatosPK, String campo01) {
        this.defdatosPK = defdatosPK;
        this.campo01 = campo01;
    }

    public Defdatos(String codigoPrograma, String codigoFicha, String codigoDato, double codigoLinea) {
        this.defdatosPK = new DefdatosPK(codigoPrograma, codigoFicha, codigoDato, codigoLinea);
    }

    public DefdatosPK getDefdatosPK() {
        return defdatosPK;
    }

    public void setDefdatosPK(DefdatosPK defdatosPK) {
        this.defdatosPK = defdatosPK;
    }

    public String getCampo01() {
        return campo01;
    }

    public void setCampo01(String campo01) {
        this.campo01 = campo01;
    }

    public String getCampo02() {
        return campo02;
    }

    public void setCampo02(String campo02) {
        this.campo02 = campo02;
    }

    public String getCampo03() {
        return campo03;
    }

    public void setCampo03(String campo03) {
        this.campo03 = campo03;
    }

    public String getCampo04() {
        return campo04;
    }

    public void setCampo04(String campo04) {
        this.campo04 = campo04;
    }

    public String getCampo05() {
        return campo05;
    }

    public void setCampo05(String campo05) {
        this.campo05 = campo05;
    }

    public String getCampo06() {
        return campo06;
    }

    public void setCampo06(String campo06) {
        this.campo06 = campo06;
    }

    public String getCampo07() {
        return campo07;
    }

    public void setCampo07(String campo07) {
        this.campo07 = campo07;
    }

    public String getCampo08() {
        return campo08;
    }

    public void setCampo08(String campo08) {
        this.campo08 = campo08;
    }

    public String getCampo09() {
        return campo09;
    }

    public void setCampo09(String campo09) {
        this.campo09 = campo09;
    }

    public String getCampo10() {
        return campo10;
    }

    public void setCampo10(String campo10) {
        this.campo10 = campo10;
    }

    public String getCampo11() {
        return campo11;
    }

    public void setCampo11(String campo11) {
        this.campo11 = campo11;
    }

    public String getCampo12() {
        return campo12;
    }

    public void setCampo12(String campo12) {
        this.campo12 = campo12;
    }

    public String getCampo13() {
        return campo13;
    }

    public void setCampo13(String campo13) {
        this.campo13 = campo13;
    }

    public String getCampo14() {
        return campo14;
    }

    public void setCampo14(String campo14) {
        this.campo14 = campo14;
    }

    public String getCampo15() {
        return campo15;
    }

    public void setCampo15(String campo15) {
        this.campo15 = campo15;
    }

    public String getCampo16() {
        return campo16;
    }

    public void setCampo16(String campo16) {
        this.campo16 = campo16;
    }

    public String getCampo17() {
        return campo17;
    }

    public void setCampo17(String campo17) {
        this.campo17 = campo17;
    }

    public String getCampo18() {
        return campo18;
    }

    public void setCampo18(String campo18) {
        this.campo18 = campo18;
    }

    public String getCampo19() {
        return campo19;
    }

    public void setCampo19(String campo19) {
        this.campo19 = campo19;
    }

    public String getCampo20() {
        return campo20;
    }

    public void setCampo20(String campo20) {
        this.campo20 = campo20;
    }

    public String getCampo21() {
        return campo21;
    }

    public void setCampo21(String campo21) {
        this.campo21 = campo21;
    }

    public String getCampo22() {
        return campo22;
    }

    public void setCampo22(String campo22) {
        this.campo22 = campo22;
    }

    public String getCampo23() {
        return campo23;
    }

    public void setCampo23(String campo23) {
        this.campo23 = campo23;
    }

    public String getCampo24() {
        return campo24;
    }

    public void setCampo24(String campo24) {
        this.campo24 = campo24;
    }

    public String getCampo25() {
        return campo25;
    }

    public void setCampo25(String campo25) {
        this.campo25 = campo25;
    }

    public String getCampo26() {
        return campo26;
    }

    public void setCampo26(String campo26) {
        this.campo26 = campo26;
    }

    public String getCampo27() {
        return campo27;
    }

    public void setCampo27(String campo27) {
        this.campo27 = campo27;
    }

    public String getCampo28() {
        return campo28;
    }

    public void setCampo28(String campo28) {
        this.campo28 = campo28;
    }

    public String getCampo29() {
        return campo29;
    }

    public void setCampo29(String campo29) {
        this.campo29 = campo29;
    }

    public String getCampo30() {
        return campo30;
    }

    public void setCampo30(String campo30) {
        this.campo30 = campo30;
    }

    public String getCampo31() {
        return campo31;
    }

    public void setCampo31(String campo31) {
        this.campo31 = campo31;
    }

    public String getCampo32() {
        return campo32;
    }

    public void setCampo32(String campo32) {
        this.campo32 = campo32;
    }

    public String getCampo33() {
        return campo33;
    }

    public void setCampo33(String campo33) {
        this.campo33 = campo33;
    }

    public String getCampo34() {
        return campo34;
    }

    public void setCampo34(String campo34) {
        this.campo34 = campo34;
    }

    public String getCampo35() {
        return campo35;
    }

    public void setCampo35(String campo35) {
        this.campo35 = campo35;
    }

    public String getCampo36() {
        return campo36;
    }

    public void setCampo36(String campo36) {
        this.campo36 = campo36;
    }

    public String getCampo37() {
        return campo37;
    }

    public void setCampo37(String campo37) {
        this.campo37 = campo37;
    }

    public String getCampo38() {
        return campo38;
    }

    public void setCampo38(String campo38) {
        this.campo38 = campo38;
    }

    public String getCampo39() {
        return campo39;
    }

    public void setCampo39(String campo39) {
        this.campo39 = campo39;
    }

    public String getCampo40() {
        return campo40;
    }

    public void setCampo40(String campo40) {
        this.campo40 = campo40;
    }

    public String getCampo41() {
        return campo41;
    }

    public void setCampo41(String campo41) {
        this.campo41 = campo41;
    }

    public String getCampo42() {
        return campo42;
    }

    public void setCampo42(String campo42) {
        this.campo42 = campo42;
    }

    public String getCampo43() {
        return campo43;
    }

    public void setCampo43(String campo43) {
        this.campo43 = campo43;
    }

    public String getCampo44() {
        return campo44;
    }

    public void setCampo44(String campo44) {
        this.campo44 = campo44;
    }

    public String getCampo45() {
        return campo45;
    }

    public void setCampo45(String campo45) {
        this.campo45 = campo45;
    }

    public String getCampo46() {
        return campo46;
    }

    public void setCampo46(String campo46) {
        this.campo46 = campo46;
    }

    public String getCampo47() {
        return campo47;
    }

    public void setCampo47(String campo47) {
        this.campo47 = campo47;
    }

    public String getCampo48() {
        return campo48;
    }

    public void setCampo48(String campo48) {
        this.campo48 = campo48;
    }

    public String getCampo49() {
        return campo49;
    }

    public void setCampo49(String campo49) {
        this.campo49 = campo49;
    }

    public String getCampo50() {
        return campo50;
    }

    public void setCampo50(String campo50) {
        this.campo50 = campo50;
    }

    public String getCampo51() {
        return campo51;
    }

    public void setCampo51(String campo51) {
        this.campo51 = campo51;
    }

    public String getCampo52() {
        return campo52;
    }

    public void setCampo52(String campo52) {
        this.campo52 = campo52;
    }

    public String getCampo53() {
        return campo53;
    }

    public void setCampo53(String campo53) {
        this.campo53 = campo53;
    }

    public String getCampo54() {
        return campo54;
    }

    public void setCampo54(String campo54) {
        this.campo54 = campo54;
    }

    public String getCampo55() {
        return campo55;
    }

    public void setCampo55(String campo55) {
        this.campo55 = campo55;
    }

    public String getCampo56() {
        return campo56;
    }

    public void setCampo56(String campo56) {
        this.campo56 = campo56;
    }

    public String getCampo57() {
        return campo57;
    }

    public void setCampo57(String campo57) {
        this.campo57 = campo57;
    }

    public String getCampo58() {
        return campo58;
    }

    public void setCampo58(String campo58) {
        this.campo58 = campo58;
    }

    public String getCampo59() {
        return campo59;
    }

    public void setCampo59(String campo59) {
        this.campo59 = campo59;
    }

    public String getCampo60() {
        return campo60;
    }

    public void setCampo60(String campo60) {
        this.campo60 = campo60;
    }

    public String getCampo61() {
        return campo61;
    }

    public void setCampo61(String campo61) {
        this.campo61 = campo61;
    }

    public String getCampo62() {
        return campo62;
    }

    public void setCampo62(String campo62) {
        this.campo62 = campo62;
    }

    public String getCampo63() {
        return campo63;
    }

    public void setCampo63(String campo63) {
        this.campo63 = campo63;
    }

    public String getCampo64() {
        return campo64;
    }

    public void setCampo64(String campo64) {
        this.campo64 = campo64;
    }

    public String getCampo65() {
        return campo65;
    }

    public void setCampo65(String campo65) {
        this.campo65 = campo65;
    }

    public String getCampo66() {
        return campo66;
    }

    public void setCampo66(String campo66) {
        this.campo66 = campo66;
    }

    public String getCampo67() {
        return campo67;
    }

    public void setCampo67(String campo67) {
        this.campo67 = campo67;
    }

    public String getCampo68() {
        return campo68;
    }

    public void setCampo68(String campo68) {
        this.campo68 = campo68;
    }

    public String getCampo69() {
        return campo69;
    }

    public void setCampo69(String campo69) {
        this.campo69 = campo69;
    }

    public String getCampo70() {
        return campo70;
    }

    public void setCampo70(String campo70) {
        this.campo70 = campo70;
    }

    public String getCampo71() {
        return campo71;
    }

    public void setCampo71(String campo71) {
        this.campo71 = campo71;
    }

    public String getCampo72() {
        return campo72;
    }

    public void setCampo72(String campo72) {
        this.campo72 = campo72;
    }

    public String getCampo73() {
        return campo73;
    }

    public void setCampo73(String campo73) {
        this.campo73 = campo73;
    }

    public String getCampo74() {
        return campo74;
    }

    public void setCampo74(String campo74) {
        this.campo74 = campo74;
    }

    public String getCampo75() {
        return campo75;
    }

    public void setCampo75(String campo75) {
        this.campo75 = campo75;
    }

    public String getCampo76() {
        return campo76;
    }

    public void setCampo76(String campo76) {
        this.campo76 = campo76;
    }

    public String getCampo77() {
        return campo77;
    }

    public void setCampo77(String campo77) {
        this.campo77 = campo77;
    }

    public String getCampo78() {
        return campo78;
    }

    public void setCampo78(String campo78) {
        this.campo78 = campo78;
    }

    public String getCampo79() {
        return campo79;
    }

    public void setCampo79(String campo79) {
        this.campo79 = campo79;
    }

    public String getCampo80() {
        return campo80;
    }

    public void setCampo80(String campo80) {
        this.campo80 = campo80;
    }

    public String getCampo81() {
        return campo81;
    }

    public void setCampo81(String campo81) {
        this.campo81 = campo81;
    }

    public String getCampo82() {
        return campo82;
    }

    public void setCampo82(String campo82) {
        this.campo82 = campo82;
    }

    public String getCampo83() {
        return campo83;
    }

    public void setCampo83(String campo83) {
        this.campo83 = campo83;
    }

    public String getCampo84() {
        return campo84;
    }

    public void setCampo84(String campo84) {
        this.campo84 = campo84;
    }

    public String getCampo85() {
        return campo85;
    }

    public void setCampo85(String campo85) {
        this.campo85 = campo85;
    }

    public String getCampo86() {
        return campo86;
    }

    public void setCampo86(String campo86) {
        this.campo86 = campo86;
    }

    public String getCampo87() {
        return campo87;
    }

    public void setCampo87(String campo87) {
        this.campo87 = campo87;
    }

    public String getCampo88() {
        return campo88;
    }

    public void setCampo88(String campo88) {
        this.campo88 = campo88;
    }

    public String getCampo89() {
        return campo89;
    }

    public void setCampo89(String campo89) {
        this.campo89 = campo89;
    }

    public String getCampo90() {
        return campo90;
    }

    public void setCampo90(String campo90) {
        this.campo90 = campo90;
    }

    public String getCampo91() {
        return campo91;
    }

    public void setCampo91(String campo91) {
        this.campo91 = campo91;
    }

    public String getCampo92() {
        return campo92;
    }

    public void setCampo92(String campo92) {
        this.campo92 = campo92;
    }

    public String getCampo93() {
        return campo93;
    }

    public void setCampo93(String campo93) {
        this.campo93 = campo93;
    }

    public String getCampo94() {
        return campo94;
    }

    public void setCampo94(String campo94) {
        this.campo94 = campo94;
    }

    public String getCampo95() {
        return campo95;
    }

    public void setCampo95(String campo95) {
        this.campo95 = campo95;
    }

    public String getCampo96() {
        return campo96;
    }

    public void setCampo96(String campo96) {
        this.campo96 = campo96;
    }

    public String getCampo97() {
        return campo97;
    }

    public void setCampo97(String campo97) {
        this.campo97 = campo97;
    }

    public String getCampo98() {
        return campo98;
    }

    public void setCampo98(String campo98) {
        this.campo98 = campo98;
    }

    public String getCampo99() {
        return campo99;
    }

    public void setCampo99(String campo99) {
        this.campo99 = campo99;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (defdatosPK != null ? defdatosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Defdatos)) {
            return false;
        }
        Defdatos other = (Defdatos) object;
        if ((this.defdatosPK == null && other.defdatosPK != null) || (this.defdatosPK != null && !this.defdatosPK.equals(other.defdatosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.acisa.aplicacionoptica.modelos.Defdatos[ defdatosPK=" + defdatosPK + " ]";
    }
    
}
