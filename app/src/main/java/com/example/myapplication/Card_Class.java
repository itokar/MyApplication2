package com.example.myapplication;

public class Card_Class {

    private int ImageView_Card ;
    private String TextView_Name;
    private int    TextView_price;

    public Card_Class(int imageView_Card, String textView_Name, int textView_price) {
        ImageView_Card = imageView_Card;
        TextView_Name = textView_Name;
        TextView_price = textView_price;
    }

    public int getImageView_Card() {
        return ImageView_Card;
    }

    public void setImageView_Card(int imageView_Card) {
        ImageView_Card = imageView_Card;
    }

    public String getTextView_Name() {
        return TextView_Name;
    }

    public void setTextView_Name(String textView_Name) {
        TextView_Name = textView_Name;
    }

    public int getTextView_price() {
        return TextView_price;
    }

    public void setTextView_price(int textView_price) {
        TextView_price = textView_price;
    }
}
