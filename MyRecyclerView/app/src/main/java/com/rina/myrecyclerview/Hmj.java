package com.rina.myrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Hmj implements Parcelable {
    private String name;
    private String description;
    private String photo;

    protected Hmj(Parcel in) {
        name = in.readString();
        description = in.readString();
        photo = in.readString();
    }

    public static final Creator<Hmj> CREATOR = new Creator<Hmj>() {
        @Override
        public Hmj createFromParcel(Parcel in) {
            return new Hmj(in);
        }

        @Override
        public Hmj[] newArray(int size) {
            return new Hmj[size];
        }
    };

    public Hmj() {
        
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getPhoto(){
        return photo;
    }

    public void setPhoto(String photo){
        this.photo=photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeString(photo);
    }
}
