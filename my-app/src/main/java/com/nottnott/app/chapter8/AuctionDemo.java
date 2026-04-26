package com.nottnott.app.chapter8;

abstract class Listing {
  protected String title;
  protected double basePrice;

  public Listing(String title, double basePrice) {
    this.title = title;
    this.basePrice = basePrice;
  }

  abstract void displayDetail();
}

interface Biddable {
  void placeBid(double amount);
}

interface Purchasable {
  void buyNow();
}

class StandardProduct extends Listing implements Purchasable {
  StandardProduct(String title, double basePrice) {
    super(title, basePrice);
  }

  @Override
  void displayDetail() {
    System.out.println("[Fixed Price] " + title + " - $" + basePrice);
  }

  @Override
  public void buyNow() {
    System.out.println("Item added to cart!");
  }
}

class AuctionItem extends Listing implements Biddable {
  AuctionItem(String title, double basePrice) {
    super(title, basePrice);
  }

  @Override
  void displayDetail() {
    System.out.println("[Auction] " + title + " - Starting at $" + basePrice);
  }

  @Override
  public void placeBid(double amount) {
    System.out.println("Bid of $" + amount + " placed on " + title);
  }
}

public class AuctionDemo {
  public static void main(String[] args) {
    StandardProduct item = new StandardProduct("Wireless Mouse", 25.6);
    item.displayDetail();
    item.buyNow();

    AuctionItem item2 = new AuctionItem("Vintage Watch", 20.6);
    item2.displayDetail();
    item2.placeBid(50.2);
  }
}
