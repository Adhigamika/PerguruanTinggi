package com.adhigamika.perguruantinggi;

import android.os.Parcel;
import android.os.Parcelable;

public class Univ implements Parcelable {
    private String name;
    private String detail;
    private int photo;

    public Univ(){

    }
    protected Univ(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Univ> CREATOR = new Creator<Univ>() {
        @Override
        public Univ createFromParcel(Parcel in) {
            return new Univ(in);
        }

        @Override
        public Univ[] newArray(int size) {
            return new Univ[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    }
}
