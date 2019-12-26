/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_req", catalog = "projectf1", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblReq.findAll", query = "SELECT t FROM TblReq t")
    , @NamedQuery(name = "TblReq.findByIdReq", query = "SELECT t FROM TblReq t WHERE t.idReq = :idReq")
    , @NamedQuery(name = "TblReq.findByTicketWin", query = "SELECT t FROM TblReq t WHERE t.ticketWin = :ticketWin")
    , @NamedQuery(name = "TblReq.findByTeam", query = "SELECT t FROM TblReq t WHERE t.team = :team")
    , @NamedQuery(name = "TblReq.findByTires", query = "SELECT t FROM TblReq t WHERE t.tires = :tires")
    , @NamedQuery(name = "TblReq.findByCircuit", query = "SELECT t FROM TblReq t WHERE t.circuit = :circuit")
    , @NamedQuery(name = "TblReq.findByDriver", query = "SELECT t FROM TblReq t WHERE t.driver = :driver")})
public class TblReq implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_req")
    private Integer idReq;
    @Basic(optional = false)
    @Column(name = "ticket_win")
    private String ticketWin;
    @Basic(optional = false)
    @Column(name = "team")
    private String team;
    @Basic(optional = false)
    @Lob
    @Column(name = "laps")
    private String laps;
    @Basic(optional = false)
    @Column(name = "tires")
    private String tires;
    @Basic(optional = false)
    @Column(name = "circuit")
    private String circuit;
    @Basic(optional = false)
    @Column(name = "driver")
    private String driver;

    public TblReq() {
    }

    public TblReq(Integer idReq) {
        this.idReq = idReq;
    }

    public TblReq(Integer idReq, String ticketWin, String team, String laps, String tires, String circuit, String driver) {
        this.idReq = idReq;
        this.ticketWin = ticketWin;
        this.team = team;
        this.laps = laps;
        this.tires = tires;
        this.circuit = circuit;
        this.driver = driver;
    }

    public Integer getIdReq() {
        return idReq;
    }

    public void setIdReq(Integer idReq) {
        Integer oldIdReq = this.idReq;
        this.idReq = idReq;
        changeSupport.firePropertyChange("idReq", oldIdReq, idReq);
    }

    public String getTicketWin() {
        return ticketWin;
    }

    public void setTicketWin(String ticketWin) {
        String oldTicketWin = this.ticketWin;
        this.ticketWin = ticketWin;
        changeSupport.firePropertyChange("ticketWin", oldTicketWin, ticketWin);
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        String oldTeam = this.team;
        this.team = team;
        changeSupport.firePropertyChange("team", oldTeam, team);
    }

    public String getLaps() {
        return laps;
    }

    public void setLaps(String laps) {
        String oldLaps = this.laps;
        this.laps = laps;
        changeSupport.firePropertyChange("laps", oldLaps, laps);
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        String oldTires = this.tires;
        this.tires = tires;
        changeSupport.firePropertyChange("tires", oldTires, tires);
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        String oldCircuit = this.circuit;
        this.circuit = circuit;
        changeSupport.firePropertyChange("circuit", oldCircuit, circuit);
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        String oldDriver = this.driver;
        this.driver = driver;
        changeSupport.firePropertyChange("driver", oldDriver, driver);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReq != null ? idReq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblReq)) {
            return false;
        }
        TblReq other = (TblReq) object;
        if ((this.idReq == null && other.idReq != null) || (this.idReq != null && !this.idReq.equals(other.idReq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formula.TblReq[ idReq=" + idReq + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
