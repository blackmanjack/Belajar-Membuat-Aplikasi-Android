package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Hp implements Parcelable {
    private String name;
    private String detail;
    private String price;
    private int photo;

    public Hp() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
        parcel.writeString(price);
    }

    protected Hp (Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
        price = in.readString();
    }

    public static final Creator<Hp> CREATOR = new Creator<Hp>() {
        @Override
        public Hp createFromParcel(Parcel in) {
            return new Hp(in);
        }

        @Override
        public Hp[] newArray(int size) {
            return new Hp[size];
        }
    };
}
