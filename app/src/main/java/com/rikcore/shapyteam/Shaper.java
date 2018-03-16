package com.rikcore.shapyteam;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by rikcore on 13/03/2018.
 */

public class Shaper implements Parcelable {
    String firstName;
    String lastName;
    String job;
    String email;

    public Shaper (String firstName, String lastName, String job, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(job);
    }

    protected Shaper(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        job = in.readString();
    }

    public static final Creator<Shaper> CREATOR = new Creator<Shaper>() {
        @Override
        public Shaper createFromParcel(Parcel in) {
            return new Shaper(in);
        }

        @Override
        public Shaper[] newArray(int size) {
            return new Shaper[size];
        }
    };
}
