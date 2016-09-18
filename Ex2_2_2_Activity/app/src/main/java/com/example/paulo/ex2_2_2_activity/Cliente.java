package com.example.paulo.ex2_2_2_activity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Paulo on 18/09/2016.
 */


public class Cliente implements Parcelable {
    public int codigo;
    public String nome;

    public Cliente(int codigo,String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    private Cliente(Parcel from){
        codigo = from.readInt();
        nome = from.readString();
    }

    public static final Parcelable.Creator<Cliente> CREATOR = new Parcelable.Creator<Cliente>(){
        public Cliente createFromParcel(Parcel in){
            return new Cliente(in);
        }
        public Cliente[] newArray(int size){
            return new Cliente[size];
        }
    };

    public int describeContents(){
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags){
        dest.writeInt(codigo);
        dest.writeString(nome);
    }
}
