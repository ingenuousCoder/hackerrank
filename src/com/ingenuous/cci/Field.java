package com.ingenuous.cci;

/**
 * Created by Alpeshk on 6/14/2017.
 */
public class Field {
    String id;
    String type;
    String scale;
    String precision;
    String format;
    String length;

    public Field(String id, String type, String scale, String precision, String format, String length) {
        this.id = id;
        this.type = type;
        this.scale = scale;
        this.precision = precision;
        this.format = format;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Field)) return false;

        Field field = (Field) o;

        if (id != null ? !id.equals(field.id) : field.id != null) return false;
        if (type != null ? !type.equals(field.type) : field.type != null) return false;
        if (scale != null ? !scale.equals(field.scale) : field.scale != null) return false;
        if (precision != null ? !precision.equals(field.precision) : field.precision != null) return false;
        if (format != null ? !format.equals(field.format) : field.format != null) return false;
        return length != null ? length.equals(field.length) : field.length == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (scale != null ? scale.hashCode() : 0);
        result = 31 * result + (precision != null ? precision.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Field{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", scale='" + scale + '\'' +
                ", precision='" + precision + '\'' +
                ", format='" + format + '\'' +
                ", length='" + length + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
