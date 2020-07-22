import { Component, OnInit } from '@angular/core';
import { Item } from 'src/app/model/Item';
import { HttpClientService } from 'src/app/service/http-client.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-items',
  templateUrl: './items.component.html',
  styleUrls: ['./items.component.css']
})
export class ItemsComponent implements OnInit {

  items: Array<Item>;
  action: string;
  selectedItem: Item;
  itemsRecieved: Array<Item>;
  
  constructor(private httpClientService: HttpClientService,
    private activedRoute: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
    this.refreshData();
   }
  
   refreshData(){
    this.httpClientService.getItems().subscribe(
      response => this.handleSuccessfulResponse(response)
    );
    this.activedRoute.queryParams.subscribe(
      (params) => {
        // get the url parameter named action. this can either be add or view.
        this.action = params['action'];
	      // get the parameter id. this will be the id of the item whose details 
	      // are to be displayed when action is view.
	      const id = params['id'];
	      // if id exists, convert it to integer and then retrive the item from
	      // the items array
        if (id) {
          this.selectedItem = this.items.find(item => {
            return item.id === +id;
          });
        }
      }
    );
   }
  
   addItem() {
    this.selectedItem = new Item();
    this.router.navigate(['admin', 'items'], { queryParams: { action: 'add' } });
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
      itemwithRetrievedImageField.picByte=item.picByte;
      this.items.push(itemwithRetrievedImageField);
    }
  }
   viewItem(id: number) {
    this.router.navigate(['admin', 'items'], { queryParams: { id, action: 'view' } });
  }

}
