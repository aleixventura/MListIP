/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movistarlistip;

/**
 *
 * @author Aleix
 */
public class Canal {

    int id;
    String nom;
    String url;
    boolean hd;
    String gc;
    String logo;

    public Canal(int id, String nom, String url) {
        this.id = id;
        this.nom = nom;
        this.url = url;
    }

    public Canal(int id, String nom, String url, boolean hd, String gc, String logo) {
        this.id = id;
        this.nom = nom;
        this.url = url;
        this.hd = hd;
        this.gc = gc;
        this.logo = logo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isHd() {
        return hd;
    }

    public void setHd(boolean hd) {
        this.hd = hd;
    }

    public String getGc() {
        return gc;
    }

    public void setGc(String gc) {
        this.gc = gc;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Canal{" + "id=" + id + ", nom=" + nom + ", url=" + url + ", hd=" + hd + ", gc=" + gc + ", logo=" + logo + '}';
    }

    public String tsurl() {
        return url;
    }

    public String tsurlrtp() {
        return "rtp://@" + url;
    }

    public String lc() {
        
        return "#EXTINF:-1 type=mpeg dlna_extras=mpeg_ps_pal logo=" + logo + ",[" + n() + "]-" + nom + "\n";

    }
    public String n(){
        String num;
        if (id < 0) {
            num = "00" + id;
        } else {
            if (id < 100) {
                num = "0" + id;
            } else {
                num = Integer.toString(id);
            }

        }
        return num;
    }
}
