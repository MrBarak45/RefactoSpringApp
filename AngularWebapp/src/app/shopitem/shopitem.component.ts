import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClientService } from '../service/http-client.service';
import { Item } from '../model/Item';

@Component({
  selector: 'app-shopitem',
  templateUrl: './shopitem.component.html',
  styleUrls: ['./shopitem.component.css']
})
export class ShopitemComponent implements OnInit {

  items: Array<Item>;
  itemsRecieved: Array<Item>;

  cartItems: any;
  constructor(private router: Router, private httpClientService: HttpClientService) { }


  ngOnInit() {
    this.httpClientService.getItems().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
    //from localstorage retrieve the cart item
    let data = localStorage.getItem('cart');
    //if this is not null convert it to JSON else initialize it as empty
    if (data !== null) {
      this.cartItems = JSON.parse(data);
    } else {
      this.cartItems = [];
    }
  }

  // we will be taking the items response returned from the database
  // and we will be adding the retrieved   
  handleSuccessfulResponse(response) {
    this.items = new Array<Item>();
    //get items returned by the api call
    this.itemsRecieved = response;
    for (const item of this.itemsRecieved) {

      const itemwithRetrievedImageField = new Item();
      itemwithRetrievedImageField.id = item.id;
      itemwithRetrievedImageField.name = item.name;
      //populate retrieved image field so that item image can be displayed
      itemwithRetrievedImageField.retrievedImage = 'data:image/jpeg;base64,' + item.picByte;
      itemwithRetrievedImageField.artist = item.artist;
      itemwithRetrievedImageField.price = item.price;
      itemwithRetrievedImageField.picByte = item.picByte;
      this.items.push(itemwithRetrievedImageField);
    }
  }

  addToCart(itemId) {
    //retrieve item from items array using the item id
    let item = this.items.find(item => {
      return item.id === +itemId;
    });
    let cartData = [];
    //retrieve cart data from localstorage
    let data = localStorage.getItem('cart');
    //prse it to json 
    if (data !== null) {
      cartData = JSON.parse(data);
    }
    // add the selected item to cart data
    cartData.push(item);
    //updated the cartItems
    this.updateCartData(cartData);
    //save the updated cart data in localstorage
    localStorage.setItem('cart', JSON.stringify(cartData));
    //make the isAdded field of the item added to cart as true
    item.isAdded = true;
  }

  updateCartData(cartData) {
    this.cartItems = cartData;
  }

  goToCart() {
    this.router.navigate(['/cart']);
  }

  emptyCart() {
    this.cartItems = [];
    localStorage.clear();
  }

}