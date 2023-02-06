//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.17 at 01:51:16 AM CET 
//


package vaccineisemployee.obrazac_saglasnosti_bridge.model;

import zajednicko.model.CTadresa;
import zajednicko.model.CTkontakt;
import zajednicko.model.CTlicniPodaci;
import zajednicko.model.STtipVakcine;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CTpacijentSaglasnost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTpacijentSaglasnost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/zajednicka}CTlicniPodaci"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeRoditelja" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="podaciMjesta"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mjestoRodjenja" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/zajednicka}CTadresa"/&gt;
 *                   &lt;element name="mjestoNaselje" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="opstinaGrad" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="kontaktPodaci" type="{http://www.ftn.uns.ac.rs/zajednicka}CTkontakt"/&gt;
 *         &lt;element name="radniStatus" type="{http://www.ftn.uns.ac.rs/obrazac-saglasnosti}STradniStatus"/&gt;
 *         &lt;element name="zanimanjeZaposlenog" type="{http://www.ftn.uns.ac.rs/obrazac-saglasnosti}STzanimanje"/&gt;
 *         &lt;element name="socijalnaZastita"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="korisnikSocijalnog" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                     &lt;element name="nazivUstanove" type="{http://www.ftn.uns.ac.rs/zajednicka}STnazivZdravstveneUstanove"/&gt;
 *                     &lt;element name="sjedisteUstanove" type="{http://www.ftn.uns.ac.rs/zajednicka}STlokacija"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="nijeKorisnikSocijalnog" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="izjavaSaglasnosti"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="saglasan" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                     &lt;element name="imeLijeka" type="{http://www.ftn.uns.ac.rs/zajednicka}STtipVakcine"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="nesaglasan" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="datumSaglasnosti" type="{http://www.ftn.uns.ac.rs/zajednicka}STdatum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTpacijentSaglasnost", propOrder = {
    "imeRoditelja",
    "podaciMjesta",
    "kontaktPodaci",
    "radniStatus",
    "zanimanjeZaposlenog",
    "socijalnaZastita",
    "izjavaSaglasnosti",
    "datumSaglasnosti"
})
public class CTpacijentSaglasnost
    extends CTlicniPodaci
{

    @XmlElement(required = true)
    protected Object imeRoditelja;
    @XmlElement(required = true)
    protected PodaciMjesta podaciMjesta;
    @XmlElement(required = true)
    protected CTkontakt kontaktPodaci;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected STradniStatus radniStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected STzanimanje zanimanjeZaposlenog;
    @XmlElement(required = true)
    protected SocijalnaZastita socijalnaZastita;
    @XmlElement(required = true)
    protected IzjavaSaglasnosti izjavaSaglasnosti;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumSaglasnosti;

    /**
     * Gets the value of the imeRoditelja property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getImeRoditelja() {
        return imeRoditelja;
    }

    /**
     * Sets the value of the imeRoditelja property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setImeRoditelja(Object value) {
        this.imeRoditelja = value;
    }

    /**
     * Gets the value of the podaciMjesta property.
     * 
     * @return
     *     possible object is
     *     {@link PodaciMjesta }
     *     
     */
    public PodaciMjesta getPodaciMjesta() {
        return podaciMjesta;
    }

    /**
     * Sets the value of the podaciMjesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodaciMjesta }
     *     
     */
    public void setPodaciMjesta(PodaciMjesta value) {
        this.podaciMjesta = value;
    }

    /**
     * Gets the value of the kontaktPodaci property.
     * 
     * @return
     *     possible object is
     *     {@link CTkontakt }
     *     
     */
    public CTkontakt getKontaktPodaci() {
        return kontaktPodaci;
    }

    /**
     * Sets the value of the kontaktPodaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTkontakt }
     *     
     */
    public void setKontaktPodaci(CTkontakt value) {
        this.kontaktPodaci = value;
    }

    /**
     * Gets the value of the radniStatus property.
     * 
     * @return
     *     possible object is
     *     {@link STradniStatus }
     *     
     */
    public STradniStatus getRadniStatus() {
        return radniStatus;
    }

    /**
     * Sets the value of the radniStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link STradniStatus }
     *     
     */
    public void setRadniStatus(STradniStatus value) {
        this.radniStatus = value;
    }

    /**
     * Gets the value of the zanimanjeZaposlenog property.
     * 
     * @return
     *     possible object is
     *     {@link STzanimanje }
     *     
     */
    public STzanimanje getZanimanjeZaposlenog() {
        return zanimanjeZaposlenog;
    }

    /**
     * Sets the value of the zanimanjeZaposlenog property.
     * 
     * @param value
     *     allowed object is
     *     {@link STzanimanje }
     *     
     */
    public void setZanimanjeZaposlenog(STzanimanje value) {
        this.zanimanjeZaposlenog = value;
    }

    /**
     * Gets the value of the socijalnaZastita property.
     * 
     * @return
     *     possible object is
     *     {@link SocijalnaZastita }
     *     
     */
    public SocijalnaZastita getSocijalnaZastita() {
        return socijalnaZastita;
    }

    /**
     * Sets the value of the socijalnaZastita property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocijalnaZastita }
     *     
     */
    public void setSocijalnaZastita(SocijalnaZastita value) {
        this.socijalnaZastita = value;
    }

    /**
     * Gets the value of the izjavaSaglasnosti property.
     * 
     * @return
     *     possible object is
     *     {@link IzjavaSaglasnosti }
     *     
     */
    public IzjavaSaglasnosti getIzjavaSaglasnosti() {
        return izjavaSaglasnosti;
    }

    /**
     * Sets the value of the izjavaSaglasnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link IzjavaSaglasnosti }
     *     
     */
    public void setIzjavaSaglasnosti(IzjavaSaglasnosti value) {
        this.izjavaSaglasnosti = value;
    }

    /**
     * Gets the value of the datumSaglasnosti property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumSaglasnosti() {
        return datumSaglasnosti;
    }

    /**
     * Sets the value of the datumSaglasnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumSaglasnosti(XMLGregorianCalendar value) {
        this.datumSaglasnosti = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="saglasan" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *           &lt;element name="imeLijeka" type="{http://www.ftn.uns.ac.rs/zajednicka}STtipVakcine"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="nesaglasan" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "saglasan",
        "imeLijeka",
        "nesaglasan"
    })
    public static class IzjavaSaglasnosti {

        protected Object saglasan;
        @XmlSchemaType(name = "string")
        protected STtipVakcine imeLijeka;
        protected Object nesaglasan;

        /**
         * Gets the value of the saglasan property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSaglasan() {
            return saglasan;
        }

        /**
         * Sets the value of the saglasan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSaglasan(Object value) {
            this.saglasan = value;
        }

        /**
         * Gets the value of the imeLijeka property.
         * 
         * @return
         *     possible object is
         *     {@link STtipVakcine }
         *     
         */
        public STtipVakcine getImeLijeka() {
            return imeLijeka;
        }

        /**
         * Sets the value of the imeLijeka property.
         * 
         * @param value
         *     allowed object is
         *     {@link STtipVakcine }
         *     
         */
        public void setImeLijeka(STtipVakcine value) {
            this.imeLijeka = value;
        }

        /**
         * Gets the value of the nesaglasan property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNesaglasan() {
            return nesaglasan;
        }

        /**
         * Sets the value of the nesaglasan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNesaglasan(Object value) {
            this.nesaglasan = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="mjestoRodjenja" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="adresa" type="{http://www.ftn.uns.ac.rs/zajednicka}CTadresa"/&gt;
     *         &lt;element name="mjestoNaselje" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="opstinaGrad" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mjestoRodjenja",
        "adresa",
        "mjestoNaselje",
        "opstinaGrad"
    })
    public static class PodaciMjesta {

        @XmlElement(required = true)
        protected Object mjestoRodjenja;
        @XmlElement(required = true)
        protected CTadresa adresa;
        @XmlElement(required = true)
        protected Object mjestoNaselje;
        @XmlElement(required = true)
        protected Object opstinaGrad;

        /**
         * Gets the value of the mjestoRodjenja property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMjestoRodjenja() {
            return mjestoRodjenja;
        }

        /**
         * Sets the value of the mjestoRodjenja property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMjestoRodjenja(Object value) {
            this.mjestoRodjenja = value;
        }

        /**
         * Gets the value of the adresa property.
         * 
         * @return
         *     possible object is
         *     {@link CTadresa }
         *     
         */
        public CTadresa getAdresa() {
            return adresa;
        }

        /**
         * Sets the value of the adresa property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTadresa }
         *     
         */
        public void setAdresa(CTadresa value) {
            this.adresa = value;
        }

        /**
         * Gets the value of the mjestoNaselje property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMjestoNaselje() {
            return mjestoNaselje;
        }

        /**
         * Sets the value of the mjestoNaselje property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMjestoNaselje(Object value) {
            this.mjestoNaselje = value;
        }

        /**
         * Gets the value of the opstinaGrad property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOpstinaGrad() {
            return opstinaGrad;
        }

        /**
         * Sets the value of the opstinaGrad property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOpstinaGrad(Object value) {
            this.opstinaGrad = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="korisnikSocijalnog" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *           &lt;element name="nazivUstanove" type="{http://www.ftn.uns.ac.rs/zajednicka}STnazivZdravstveneUstanove"/&gt;
     *           &lt;element name="sjedisteUstanove" type="{http://www.ftn.uns.ac.rs/zajednicka}STlokacija"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="nijeKorisnikSocijalnog" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "korisnikSocijalnog",
        "nazivUstanove",
        "sjedisteUstanove",
        "nijeKorisnikSocijalnog"
    })
    public static class SocijalnaZastita {

        protected Object korisnikSocijalnog;
        protected String nazivUstanove;
        protected String sjedisteUstanove;
        protected Object nijeKorisnikSocijalnog;

        /**
         * Gets the value of the korisnikSocijalnog property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getKorisnikSocijalnog() {
            return korisnikSocijalnog;
        }

        /**
         * Sets the value of the korisnikSocijalnog property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setKorisnikSocijalnog(Object value) {
            this.korisnikSocijalnog = value;
        }

        /**
         * Gets the value of the nazivUstanove property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNazivUstanove() {
            return nazivUstanove;
        }

        /**
         * Sets the value of the nazivUstanove property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNazivUstanove(String value) {
            this.nazivUstanove = value;
        }

        /**
         * Gets the value of the sjedisteUstanove property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSjedisteUstanove() {
            return sjedisteUstanove;
        }

        /**
         * Sets the value of the sjedisteUstanove property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSjedisteUstanove(String value) {
            this.sjedisteUstanove = value;
        }

        /**
         * Gets the value of the nijeKorisnikSocijalnog property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNijeKorisnikSocijalnog() {
            return nijeKorisnikSocijalnog;
        }

        /**
         * Sets the value of the nijeKorisnikSocijalnog property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNijeKorisnikSocijalnog(Object value) {
            this.nijeKorisnikSocijalnog = value;
        }

    }

}
