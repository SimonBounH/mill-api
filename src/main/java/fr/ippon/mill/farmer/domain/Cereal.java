package fr.ippon.mill.farmer.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Cereal {
    private final CerealType typeOfCereal;

    private final int farmerId;

    private final BigDecimal quantity;

    private final Date date;

    public static Cereal add(CerealType typeOfCereal, int farmerId, BigDecimal quantity, Date date) {
        return new Cereal(typeOfCereal, farmerId, quantity, date);
    }

    public Cereal(CerealType typeOfCereal, int farmerId, BigDecimal quantity, Date date) {
        this.typeOfCereal = typeOfCereal;
        this.farmerId = farmerId;
        this.quantity = quantity;
        this.date = date;
    }

    public CerealType getTypeOfCereal() {
        return typeOfCereal;
    }

    public int getFarmerId() {
        return farmerId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }
}
