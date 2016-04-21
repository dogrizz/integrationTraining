package pl.dzmitrow.training.lab05.exchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pozycja")
public class Rate {
    @XmlElement(name = "nazwa_waluty")
    private String name;
    @XmlElement(name = "kod_waluty")
    private String code;
    @XmlElement(name = "kurs_sredni")
    private double rate;
    @XmlElement(name = "przelicznik")
    private int multiplier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rate rate1 = (Rate) o;

        if (Double.compare(rate1.rate, rate) != 0) return false;
        if (multiplier != rate1.multiplier) return false;
        if (name != null ? !name.equals(rate1.name) : rate1.name != null) return false;
        return code != null ? code.equals(rate1.code) : rate1.code == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + multiplier;
        return result;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", rate=" + rate +
                ", multiplier=" + multiplier +
                '}';
    }
}
