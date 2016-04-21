package pl.dzmitrow.training.lab05.exchange;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "tabela_kursow")
public class RateList {

    @XmlElement(name="numer_tabeli")
    private String tableNumber;

    @XmlElement(name="data_publikacji")
    private String publishDate;

    @XmlElement(type = Rate.class,name = "pozycja")
    private List<Rate> rates;

    public RateList(String tableNumber, String publishDate, List<Rate> rates) {
        this.tableNumber = tableNumber;
        this.publishDate = publishDate;
        this.rates = rates;
    }

    public RateList() {
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RateList rateList = (RateList) o;

        if (tableNumber != null ? !tableNumber.equals(rateList.tableNumber) : rateList.tableNumber != null)
            return false;
        if (publishDate != null ? !publishDate.equals(rateList.publishDate) : rateList.publishDate != null)
            return false;
        return rates != null ? rates.equals(rateList.rates) : rateList.rates == null;

    }

    @Override
    public int hashCode() {
        int result = tableNumber != null ? tableNumber.hashCode() : 0;
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        result = 31 * result + (rates != null ? rates.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RateList{" +
                "tableNumber='" + tableNumber + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", rates=" + rates +
                '}';
    }
}
